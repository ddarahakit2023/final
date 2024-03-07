import { defineStore } from "pinia";
import axios from 'axios';

const backend = "http://localhost:8080";


export const useCourseStore = defineStore('course', {
  state: () => ({ courseList: [] }),

  actions: {
    async getCourseList() {
      let response = await axios.get(backend+"/course/list");

      this.courseList = response.data.result;
      
      return this.courseList;
    },
    async getCourseDetail() {
      let response = await axios.get(backend+"/course/list");

      this.courseList = response.data.result;
      
      return this.courseList;
    },
  },
})