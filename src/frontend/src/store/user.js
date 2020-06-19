import axios from 'axios'

const state = {
    context: 'http://localhost:5000',
    name:'null',
    userid:'null',
    passwd:'null',
    email:'null',
    phoneNumber:'null'
}
const actions = {
    async join({commit},payload){
        axios.post(state.context + '/member', state.userid, {
            authorization: "JWT fefege..",
            Accept: "application/json",
            "Content-Type": "application/json"
        })
            .then(({data})=>{
                commit("JOIN",data)
            })
            .catch(()=>{
                alert('회원가입 실패')
            })
    }
}
const mutations = {

}
const getters = {

}
export default {
    name: 'user',
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}