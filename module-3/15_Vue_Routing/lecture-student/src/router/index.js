import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/components/ProductsList.vue'
import ProductDetail from '@src/views/ProductDetail.vue'


Vue.use(VueRouter)

const routes = [
  {
    path: '/' ,
    name: 'products',
    component: Products
  },
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetail
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
