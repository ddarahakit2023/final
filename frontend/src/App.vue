<template>

  <HeaderComponent />
  <router-view></router-view>
  <FooterComponent />
  <LoginModalComponent v-if="loginModalActiveStore.isActive"/>
</template>

<script>
import HeaderComponent from '@/components/HeaderComponent.vue'
import FooterComponent from '@/components/FooterComponent.vue'
import LoginModalComponent from '@/components/LoginModalComponent.vue'
import { mapStores } from 'pinia'
import { useLoginModalActiveStore } from '@/stores/useLoginModalActiveStore';

export default {
  name: 'App',
  components: {
    HeaderComponent,
    FooterComponent,
    LoginModalComponent
  },
  computed: {
    ...mapStores(useLoginModalActiveStore),
  },
}
</script>

<style></style>
