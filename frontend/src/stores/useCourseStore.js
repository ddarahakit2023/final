import { defineStore } from "pinia";
import axios from "axios";
import VueCookies from "vue-cookies";

const backend = "http://localhost:8080";

export const useCourseStore = defineStore("course", {
  state: () => ({
    course: {
      id: 0,
      name: "",
      ordered: false,
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
    lecture: {
      id: 0,
      courseName: "",
      lectureName: "",
      totalPlayTime: 0,
      totalLectureCount: 0,
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
      if (VueCookies.get("token") != null) {
        let response = await axios.get(backend + "/course/" + id, {
          headers: {
            Authorization: "Bearer " + VueCookies.get("token"),
          },
        });

        this.course = response.data.result;

        return this.course;
      } else {
        let response = await axios.get(backend + "/course/" + id);

        this.course = response.data.result;

        return this.course;
      }
    },

    async getLectureDetail(courseId, lectureId) {
      if (VueCookies.get("token") != null) {
        let response = await axios.get(
          backend + "/lecture/" + courseId + "/" + lectureId,
          {
            headers: {
              Authorization: "Bearer " + VueCookies.get("token"),
            },
          }
        );

        this.lecture = response.data.result;

        return this.lecture;
      }
    },
  },
});
