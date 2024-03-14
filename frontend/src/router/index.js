import { createRouter, createWebHistory } from "vue-router";
import CourseList from "@/components/course/CourseList.vue"
import CourseDetail from "@/components/course/CourseDetail.vue"
import CoursePage from "@/pages/CoursePage.vue";
import SignupPage from "@/pages/SignupPage.vue";
import CartPage from "@/pages/CartPage.vue";
import LecturePage from "@/pages/LecturePage.vue";

const routes = [
  {
    path: "/course",
    component: CoursePage,
    children: [
      { path: "list", component: CourseList },
      { path: ":id", component: CourseDetail }
    ],
  },
  {
    path: "/member/signup",
    component: SignupPage,
  },
  {
    path: "/cart",
    component: CartPage,
  },
  {
    path: "/lecture",
    component: LecturePage,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes: routes,
});

export default router;
