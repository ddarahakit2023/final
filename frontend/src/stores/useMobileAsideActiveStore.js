import { defineStore } from "pinia";


export const useMobileAsideActiveStore = defineStore('mobileAsideActive', {
  state: () => ({ isActive: false }),

  actions: {
    toggleAside() {
        this.isActive = !this.isActive;
    },
  },
})