import { defineStore } from "pinia";
import axios from "axios";

const backend = "http://localhost:8080";

export const useCourseStore = defineStore("course", {
  state: () => ({
    course: {
      id: 0,
      name: "",
      description: "",
      sections: [
        {
          id: 0,
          name: "",
          lectures: [{ id: 0, name: "", playTime: 0, videoUrl: "" }],
        },
      ],
      price: 0,
    },
    courseList: [],
  }),

  actions: {
    async getCourseList() {
      let response = await axios.get(backend + "/course/list");

      this.courseList = response.data.result;

      return this.courseList;
    },
    async getCourseDetail(id) {
      let response = await axios.get(backend + "/course/" + id);

      this.course = response.data.result;

      return this.course;
    },
  },
});
