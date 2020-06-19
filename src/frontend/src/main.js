import Vue from 'vue'
import App from './App.vue'
import router from './router'
import { store } from './store'
import vuetify from './plugins/vuetify';
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/default.css'
import VuePageTransition from 'vue-page-transition'

Vue.use(VuePageTransition)
Vue.use(VueMaterial)
Vue.use(vuetify)
Vue.config.productionTip = false

new Vue({
  router,
  store,
  vuetify,
  VueMaterial,
  render: h => h(App)
}).$mount('#app')
