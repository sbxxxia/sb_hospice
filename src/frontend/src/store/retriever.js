import axios from 'axios'
import router from "../router";

const state = {
    context: 'http://localhost:5000',
    searchWord: 'null',
    pageNumber: 0,
    list: [],
    pages: [],
    page: {},
    item: {}
}
const actions = {
    async search({commit},payload){
        axios.get(`${state.context}/${payload.cate}/${payload.searchWord}/${payload.pageNumber}`)
            .then(({data}) => {
                commit("SEARCH", data)
                router.push('/retrieve')
            })
            .catch()
    },
    async transferPage({commit},payload) {
        axios.get(`${state.context}/${payload.cate}/${payload.searchWord}/${payload.pageNumber}`)
            .then(({data}) => {
                commit("TRANSFER", data)
            })
            .catch()
    }
    // async retrieveOne({commit}, payload){
    //     axios.
    //     get(`${state.context}/${payload.cate}/${payload.searchWord}`)
    //         .then(({data})=>{
    //             commit("DETAIL",data)
    //             router.push('/movieDetail')
    //         })
    //         .catch()
    // }

}
const mutations = {
    SEARCH(state, data){
        state.facility = []
        data.list.forEach(item => {
            state.facility.push({
                seq: item.facilitySeq,
                name: item.fName,
                type: item.fType,
                region: item.fRegion,
                postalcode: item.fPostalCode,
                address: item.fAddress,
                detailedAddress: item.fDetailedAddress,
                phoneNumber: item.fPhoneNumber
            })
        })
    }
}
const getters = {
    facility: state => state.facility
}
export default {
    name: 'retriever',
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}