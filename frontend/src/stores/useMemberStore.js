import { defineStore } from "pinia";
import axios from "axios";
import { toRaw } from "vue";
import VueCookies from "vue-cookies";

const backend = "http://localhost:8080";

export const useMemberStore = defineStore("member", {
  state: () => ({ isLogin: false, accessToken: "" }),
  persist: true,
  actions: {
    async signup(member) {
      let response = await axios.post(
        backend + "/member/signup",
        toRaw(member)
      );
      if (response.status === 200 && response.data.isSuccess === true) {
        return true;
      } else {
        return false;
      }
    },

    async login(member) {
      let response = await axios.post(backend + "/member/login", toRaw(member));
      if (response.status === 200 && response.data.isSuccess === true) {
        console.log(response.data.result.accessToken);
        this.accessToken = response.data.result.accessToken;
        this.isLogin = true;
        return true;
      } else {
        return false;
      }
    },
    logout() {
      this.isLogin = false;
      VueCookies.remove("token");
      this.accessToken = "";
    },
  }
});
