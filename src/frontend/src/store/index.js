import Vue from 'vue'
import Vuex from 'vuex'
import retriever from './retriever'


Vue.use(Vuex)

export default new Vuex.Store({
  modules:{
    retriever
  }
})
