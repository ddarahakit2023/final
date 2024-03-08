import { defineStore } from "pinia";
import axios from 'axios';
import { toRaw } from "vue";

const backend = "http://localhost:8080";


export const useMemberStore = defineStore('member', {
  actions: {
    async signup(member) {
        let response = await axios.post(
            backend + "/member/signup",
            toRaw(member)
          );
          if (response.status === 200 && response.data.isSuccess === true) {
            return true;
          }
      return this.courseList;
    },
    
  },
})