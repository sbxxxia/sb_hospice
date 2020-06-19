<template>
    <v-container>
        <v-simple-table fixed-header height="300px">
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">기관명</th>
                    <th class="text-left">기관종류</th>
                    <th class="text-left">지역</th>
                    <th class="text-left">우편번호</th>
                    <th class="text-left">주소</th>
                    <th class="text-left">상세주소</th>
                    <th class="text-left">문의전화</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item in facilities" :key="item.seq">
                    <td>{{ item.name }}</td>
                    <td>{{ item.type }}</td>
                    <td>{{ item.region }}</td>
                    <td>{{ item.postalcode }}</td>
                    <td>{{ item.address }}</td>
                    <td>{{ item.detailedAddress }}</td>
                    <td>{{ item.phoneNumber }}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center">
            <div style="margin: 0 auto; width: 500px; height: 100px">
                <span @click="transferPage(pager.prevBlock)" v-if ='pager.existPrev' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">이전</span>
                <span @click="transferPage(i-1)" v-for='i of pages' :key="i" style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">{{i}}</span>
                <span @click="transferPage(pager.nextBlock)" v-if ='pager.existNext' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">다음</span>
            </div>
        </div>
    </v-container>
</template>

<script>
    import { mapState } from "vuex";
    import {proxy} from "./mixins/proxy";

    export default {
        mixins: [proxy],
        created() {
            console.log('페이징 가기 전: ')
            let json = proxy.methods.paging(`${this.$store.state.retriever.context}/facility/search/0/null`)
            this.$store.state.retriever.list = json.facility
            this.$store.state.retriever.pages = json.pages
            this.$store.state.retriever.pager = json.temp
            console.log('페이징 다녀온 다음 : '+json.temp.pageSize)
        },
        computed: {
            ...mapState({
                list: state => state.retriever.list,
                pages: state => state.search.pages,
                pager: state => state.search.pager
            })
        },
        methods: {
            transferPage(d) {
                proxy.methods.tester(d)
                this.$store.dispatch('retriever/transferPage',{cate:'facility' ,
                    searchWord:'null',
                    pageNumber: d})
            },
            retrieve(){
                let searchWord = document.getElementById('searchWord').value
                if(searchWord === '') searchWord = 'null'
                this.$store.dispatch('retriever/transferPage',{cate:'facility' ,
                    searchWord:searchWord,
                    pageNumber: 0})
            },
            retrieveOne(facilitySeq){
                this.$store.dispatch('retriever/transferPage',{cate:'facility' ,
                    searchWord:facilitySeq})
            }
        }
    }
</script>
