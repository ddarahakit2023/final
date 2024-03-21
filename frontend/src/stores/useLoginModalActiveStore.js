import { defineStore } from "pinia";


export const useLoginModalActiveStore = defineStore('loginModalActive', {
  state: () => ({ isActive: false }),

  actions: {
    toggleLogin() {
        this.isActive = !this.isActive;
    },
  },
})