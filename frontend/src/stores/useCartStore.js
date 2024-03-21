import { defineStore } from "pinia";

export const useCartStore = defineStore("cart", {
  state: () => ({
    course: {
      id: 0,
      name: "",
      description: "",
      price: 0,
    },
  }),
  persist: true,
  actions: {
    addCart(course) {
      this.course = course;
    },

    removeCart() {
      this.course = {
        id: 0,
        name: "",
        description: "",
        price: 0,
      };
    },
  },
});
