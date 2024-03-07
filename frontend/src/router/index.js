import { createRouter, createWebHistory } from "vue-router";
import CourseList from "@/components/course/CourseList.vue"
import CourseDetail from "@/components/course/CourseDetail.vue"
import CoursePage from "@/pages/CoursePage.vue";

const routes = [
  {
    path: "/course",
    component: CoursePage,
    children: [
      { path: "list", component: CourseList },
      { path: ":id", component: CourseDetail }
    ],
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes: routes,
});

export default router;
