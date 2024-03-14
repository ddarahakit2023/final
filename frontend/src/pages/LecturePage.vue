<template>
    <main id="main" class="pg___course-slug pg___course-description is_logged_out is-student-user">
        <!-- ======= Sidebar ======= -->
        <aside id="sidebar" :class="{ 'sidebar': true, 'toggle': isActive }">
            <div class="sidebar-container">
                <div class="aside_title">
                    <h2>목차</h2>
                    <button @click="asideToggle()" type="button" class="aside_close_button" id="aside_close_button">
                        <svg width="15" aria-hidden="true" focusable="false" data-prefix="fal" data-icon="times"
                            role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512">
                            <title>TimesIcon</title>
                            <path fill="#212529"
                                d="M193.94 256L296.5 153.44l21.15-21.15c3.12-3.12 3.12-8.19 0-11.31l-22.63-22.63c-3.12-3.12-8.19-3.12-11.31 0L160 222.06 36.29 98.34c-3.12-3.12-8.19-3.12-11.31 0L2.34 120.97c-3.12 3.12-3.12 8.19 0 11.31L126.06 256 2.34 379.71c-3.12 3.12-3.12 8.19 0 11.31l22.63 22.63c3.12 3.12 8.19 3.12 11.31 0L160 289.94 262.56 392.5l21.15 21.15c3.12 3.12 8.19 3.12 11.31 0l22.63-22.63c3.12-3.12 3.12-8.19 0-11.31L193.94 256z">
                            </path>
                        </svg>
                    </button>
                </div>
                <div class="aside_lecture_container">
                    <div class="aside_lecture_info">
                        <div>
                            <p class="aside_lecture_title">{{ courseStore.lecture.courseName }}</p>
                            <p class="aside_lecture_complete">진도율 : 0강 / {{ courseStore.lecture.totalLectureCount }}강 (0.00%)</p>
                            <p class="aside_lecture_complete">시간: 0분 / {{ courseStore.lecture.totalPlayTime }}분</p>
                        </div>
                    </div>
                    <progress value="7.14" max="100" class="aside_lecture_complete_progress"></progress>
                </div>
                <ul class="sidebar-nav" id="sidebar-nav">

                    <li v-for="section in courseStore.lecture.sections" :key="section.id" class="nav-item">
                        <a class="nav-link">
                            <span>{{ section.name }}</span>
                        </a>

                        <ul id="section-1-nav" class="nav-content collapse show" data-bs-parent="#sidebar-nav">

                            <li v-for="lecture in section.lectures" :key="lecture.id">
                                <a :href="'/lecture/' + courseStore.lecture.id + '/' + lecture.id"
                                    :class="{ 'active': lecture.id == $route.params.lectureId }">
                                    <i class="bi bi-check-circle"></i>
                                    <span>{{ lecture.name }}</span>
                                    <span class="play-time ms-auto">

                                        {{ lecture.playTime }}분

                                    </span>
                                </a>
                            </li>

                        </ul>
                    </li><!-- End Components Nav -->


                </ul>
            </div>
        </aside><!-- End Sidebar-->


        <!-- Home -->
        <div class="home toggle">
            <div class="breadcrumbs_container">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="breadcrumbs">
                                <ul>
                                    <li><a href="/">Home</a></li>
                                    <li><a href="/전체강의/">전체 강의</a></li>
                                    <li><a href="/%EA%B0%9C%EB%B0%9C/">개발</a>
                                    </li>
                                    <li>{{ courseStore.lecture.courseName }}</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Home -->
        <div class="lecture-home toggle">
            <div class="breadcrumbs_container">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="breadcrumbs">
                                <ul>
                                    <li @click="asideToggle()" id="aside_open_button"><i class="fa fa-bars menu_mm"
                                            aria-hidden="true"></i> 목차</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Blog -->

        <div id="courses_section" class="blog toggle">
            <div class="container">
                <div class="row">

                    <!-- Blog Content -->
                    <div class="col-lg-12">
                        <div class="blog_content">
                            <div class="blog_title">{{ courseStore.lecture.lectureName }}</div>

                            <div class="blog_post_video_container">
                                <iframe width="560" height="315"
                                    :src="courseStore.lecture.videoUrl"
                                    title="YouTube video player" frameborder="0"
                                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                                    allowfullscreen></iframe>
                            </div>

                        </div>
                        <div
                            class="blog_extra d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-start">
                            <div class="blog_tags">
                                <span>Tags: </span>
                                <ul>
                                    <li><a href="#">Education</a>,</li>
                                    <li><a href="#">Math</a>,</li>
                                    <li><a href="#">Food</a>,</li>
                                    <li><a href="#">Schools</a>,</li>
                                    <li><a href="#">Religion</a>,</li>
                                </ul>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>
    </main>

</template>

<script>
import { mapStores } from 'pinia'
import { useCourseStore } from '@/stores/useCourseStore';

export default {
    name: 'LecturePage',
    data() {
        return {
            isActive: false
        }
    },
    computed: {
        ...mapStores(useCourseStore),
    },
    mounted() {
        this.courseStore.getLectureDetail(this.$route.params.courseId, this.$route.params.lectureId);
    },
    methods: {
        asideToggle() {
            this.isActive = !this.isActive;
        },
    }
}
</script>

<style scoped>
@charset "utf-8";
/* CSS Document */

/******************************

[Table of Contents]

1. Fonts
2. Body and some general stuff
3. Header
	3.1 Top Bar
	3.2 Header Content
	3.3 Logo
	3.4 Main Nav
	3.5 Hamburger
4. Menu
5. Section
6. Home
7. Features
8. Courses
9. Counter
10. Events
11. Team
12. News
13. Newsletter
14. Footer



******************************/

/***********
1. Fonts
***********/

@import url('https://fonts.googleapis.com/css?family=Roboto+Slab:400,700|Roboto:300,400,500,700,900');

/*********************************
2. Body and some general stuff
*********************************/
.container {
    max-width: 1200px;
    margin-right: auto;
    margin-left: auto;
}

* {
    margin: 0;
    padding: 0;
    -webkit-font-smoothing: antialiased;
    -webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
    text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
}

iframe {
    width: 100%;
    border: 0;
    aspect-ratio: 16 / 9;
}

body {

    font-size: 14px;
    font-weight: 400;
    background: #FFFFFF;
    color: #a5a5a5;
}

div {
    display: block;
    position: relative;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
}

ul {
    list-style: none;
    margin-bottom: 0px;
}

p {

    font-size: 14px;
    line-height: 1.85;
    font-weight: 400;
    color: #76777a;
    -webkit-font-smoothing: antialiased;
    -webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
    text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
}

p a {
    display: inline;
    position: relative;
    color: inherit;
    border-bottom: solid 1px #ffa07f;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

p:last-of-type {
    margin-bottom: 0;
}

a,
a:hover,
a:visited,
a:active,
a:link {
    text-decoration: none;
    -webkit-font-smoothing: antialiased;
    -webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
    text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
}

p a:active {
    position: relative;
    color: #FF6347;
}

p a:hover {
    color: #FFFFFF;
    background: #ffa07f;
}

p a:hover::after {
    opacity: 0.2;
}

::selection {}

p::selection {}

h1 {
    font-size: 48px;
}

h2 {
    font-size: 36px;
}

h3 {
    font-size: 24px;
}

h4 {
    font-size: 18px;
}

h5 {
    font-size: 14px;
}

h1,
h2,
h3,
h4,
h5,
h6 {

    font-weight: 700;
    -webkit-font-smoothing: antialiased;
    -webkit-text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
    text-shadow: rgba(0, 0, 0, .01) 0 0 1px;
    color: #384158;
    margin-bottom: 0;
}

h1::selection,
h2::selection,
h3::selection,
h4::selection,
h5::selection,
h6::selection {}

.form-control {
    color: #db5246;
}

section {
    display: block;
    position: relative;
    box-sizing: border-box;
}

.clear {
    clear: both;
}

.clearfix::before,
.clearfix::after {
    content: "";
    display: table;
}

.clearfix::after {
    clear: both;
}

.clearfix {
    zoom: 1;
}

.float_left {
    float: left;
}

.float_right {
    float: right;
}

.trans_200 {
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.trans_300 {
    -webkit-transition: all 300ms ease;
    -moz-transition: all 300ms ease;
    -ms-transition: all 300ms ease;
    -o-transition: all 300ms ease;
    transition: all 300ms ease;
}

.trans_400 {
    -webkit-transition: all 400ms ease;
    -moz-transition: all 400ms ease;
    -ms-transition: all 400ms ease;
    -o-transition: all 400ms ease;
    transition: all 400ms ease;
}

.trans_500 {
    -webkit-transition: all 500ms ease;
    -moz-transition: all 500ms ease;
    -ms-transition: all 500ms ease;
    -o-transition: all 500ms ease;
    transition: all 500ms ease;
}

.fill_height {
    height: 100%;
}

.super_container {
    width: 100%;
    overflow: hidden;
}

.prlx_parent {
    overflow: hidden;
}

.prlx {
    height: 130% !important;
}

.parallax-window {
    min-height: 400px;
    background: transparent;
}

.nopadding {
    padding: 0px !important;
}

/*********************************
3. Header
*********************************/

.header {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    z-index: 1000;
    box-shadow: 0px 5px 20px rgba(0, 0, 0, 0.05);
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.header.scrolled {
    top: -40px;
}

/*********************************
3.1 Top Bar
*********************************/

.top_bar {
    width: 100%;
    background: #14bdee;
}

.header.scrolled .top_bar {}

.top_bar_container {
    width: 100%;
    height: 100%;
}

.top_bar_content {
    width: 100%;
    height: 40px;
}

.top_bar_contact_list li {
    display: inline-block;
}

.question {

    font-size: 14px;
    color: #FFFFFF;
    margin-left: 0px;
}

.top_bar_contact_list li i,
.top_bar_contact_list li>div {
    display: inline-block;
    font-size: 14px;
    color: #FFFFFF;
}

.top_bar_contact_list li>div {
    margin-left: 1px;
}

.top_bar_contact_list li:not(:last-child) {
    margin-right: 21px;
}

.top_bar_login {
    height: 100%;
}

.login_button {
    width: 160px;
    height: 100%;
    background: #f3f3f3;
    text-align: center;
}

.login_button a {
    display: block;
    font-size: 14px;
    font-weight: 500;
    line-height: 40px;
    color: #384158;
}

/*********************************
3.2 Header Content
*********************************/

.header_container {
    width: 100%;
    background: #FFFFFF;
}

.header_content {
    height: 80px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.header.scrolled .header_content {
    height: 80px;
}

/*********************************
3.3 Logo
*********************************/

.logo,
.logo_text {
    display: inline-block;
}

.logo {
    width: 60px;
    height: 60px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.logo img {
    max-width: 100%;
}

.logo_text {
    font-size: 36px;
    font-weight: 700;
    line-height: 0.75;
    color: #384158;
    vertical-align: middle;
    margin-right: 50px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.logo_text span {
    color: #14bdee;
}

.header.scrolled .logo {
    width: 40px;
    height: 40px;
}

.header.scrolled .logo_text {
    font-size: 24px;
}

/*********************************
3.4 Main Nav
*********************************/

.main_nav_contaner {}

.main_nav,
.search_button,
.shopping_cart {
    display: inline-block;
}

.main_nav li {
    display: inline-block;
    position: relative;
}

.main_nav li:not(:last-child) {
    margin-right: 20px;
}

.main_nav li a {
    font-size: 18px;
    font-weight: 500;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.main_nav li a:hover,
.main_nav li.active a {
    color: #14bdee;
}

.main_nav li.active::after {
    display: block;
    position: absolute;
    bottom: -2px;
    left: 0;
    width: 100%;
    height: 2px;
    background: #14bdee;
    content: '';
}

.search_button {
    margin-left: 46px;
    cursor: pointer;
}

.shopping_cart {
    margin-left: 23px;
    cursor: pointer;
}

.search_button i,
.shopping_cart i {
    font-size: 18px;
    color: #181818;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.search_button:hover i,
.shopping_cart:hover i {
    color: #14bdee;
}

.header_search_form {
    display: block;
    position: relative;
    width: 40%;
}

.header_search_container {
    position: absolute;
    bottom: 0px;
    left: 0px;
    width: 100%;
    background: #14bdee;
    z-index: -1;
    opacity: 0;
    -webkit-transition: all 400ms ease;
    -moz-transition: all 400ms ease;
    -ms-transition: all 400ms ease;
    -o-transition: all 400ms ease;
    transition: all 400ms ease;
}

.header_search_container.active {
    bottom: -73px;
    opacity: 1;
}

.header_search_content {
    width: 100%;
    height: 73px;
}

.search_input {
    width: 100%;
    height: 40px;
    border: none;
    outline: none;
    padding-left: 20px;
}

.header_search_button {
    position: absolute;
    top: 0;
    right: 0;
    width: 40px;
    height: 100%;
    border: none;
    outline: none;
    cursor: pointer;
}

/*********************************
3.5 Hamburger
*********************************/

.hamburger_container {}

.hamburger {
    display: none;
    cursor: pointer;
}

.hamburger i {
    font-size: 20px;
    color: #353535;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.hamburger:hover i {
    color: #14bdee;
}

/*********************************
4. Menu
*********************************/

.menu {
    position: fixed;
    top: 0;
    right: -400px;
    width: 400px;
    height: 100vh;
    background: #FFFFFF;
    z-index: 101;
    padding-right: 60px;
    padding-top: 87px;
    padding-left: 50px;
}

.menu .logo a {
    color: #000000;
}

.menu.active {
    right: 0;
}

.menu_close_container {
    position: absolute;
    top: 30px;
    right: 60px;
    width: 18px;
    height: 18px;
    transform-origin: center center;
    -webkit-transform: rotate(45deg);
    -moz-transform: rotate(45deg);
    -ms-transform: rotate(45deg);
    -o-transform: rotate(45deg);
    transform: rotate(45deg);
    cursor: pointer;
}

.menu_close {
    width: 100%;
    height: 100%;
    transform-style: preserve-3D;
}

.menu_close div {
    width: 100%;
    height: 2px;
    background: #232323;
    top: 8px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.menu_close div:last-of-type {
    -webkit-transform: rotate(90deg) translateX(-2px);
    -moz-transform: rotate(90deg) translateX(-2px);
    -ms-transform: rotate(90deg) translateX(-2px);
    -o-transform: rotate(90deg) translateX(-2px);
    transform: rotate(90deg) translateX(-2px);
    transform-origin: center;
}

.menu_close:hover div {
    background: #937c6f;
}

.menu .logo {
    margin-bottom: 60px;
}

.menu_nav ul li {
    margin-bottom: 9px;
}

.menu_nav ul li a {

    font-size: 14px;
    text-transform: uppercase;
    color: rgba(0, 0, 0, 1);
    font-weight: 700;
    letter-spacing: 0.1em;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.menu_nav ul li a:hover {
    color: #14bdee;
}

.menu .search {
    width: 100%;
    margin-bottom: 67px;
}

.search {
    display: inline-block;
    width: 400px;
    -webkit-transform: translateY(2px);
    -moz-transform: translateY(2px);
    -ms-transform: translateY(2px);
    -o-transform: translateY(2px);
    transform: translateY(2px);
}

.menu .header_search_form {
    width: 100%;
}

.search form {
    position: relative;
}

.menu .search_input {
    width: 100%;
    height: 40px;
    background: rgba(0, 0, 0, 0.1);
    border-radius: 3px;
    border: none;
    outline: none;
    padding-left: 15px;
    color: rgba(0, 0, 0, 0.5);
}

.menu .search_input::-webkit-input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.menu .search_input:-moz-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.menu .search_input::-moz-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.menu .search_input:-ms-input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.menu .search_input::input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

/*********************************
5. Section
*********************************/

.section_title_container {
    max-width: 600px;
    margin: 0 auto;
}

.section_title {
    line-height: 1.2;
}

.section_subtitle {
    line-height: 1.85;
    margin-top: 14px;
}

.section_background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}

/*********************************
6. Home
*********************************/

.home {
    width: 100%;
    height: 50px;
    background: #f2f4f5;
    border-bottom: solid 1px #edeff0;
}

.breadcrumbs_container {
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    padding-bottom: 13px;
    padding-left: 3px;
}

.breadcrumbs ul li {
    display: inline-block;
    position: relative;
}

.breadcrumbs ul li:not(:last-child)::after {
    display: inline-block;
    font-family: 'FontAwesome';
    content: '\f105';
    margin-left: 7px;
    margin-right: 4px;
    color: #384158;
}

.breadcrumbs ul li a {
    font-size: 14px;
    font-weight: 400;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.breadcrumbs ul li a:hover {
    color: #14bdee;
}

/*********************************
7. Features
*********************************/

.features {
    width: 100%;
    background: #FFFFFF;
    padding-top: 93px;
    padding-bottom: 103px;
}

.features_row {
    margin-top: 55px;
}

.feature {
    width: 100%;
    padding-left: 15px;
    padding-right: 15px;
    background: #FFFFFF;
}

.feature_icon {
    height: 55px;
}

.feature_icon img {
    max-width: 100%;
}

.feature_title {
    position: relative;
    font-size: 20px;
}

/*********************************
8. Courses
*********************************/

.courses {
    width: 100%;
    padding-top: 93px;
    padding-bottom: 100px;
}

.courses_row {
    margin-top: 45px;
}

.course {
    width: 100%;
    border-radius: 6px;
    background: #FFFFFF;
    box-shadow: 0px 1px 10px rgba(29, 34, 47, 0.1);
}

.course_image {
    width: 100%;
    border-top-left-radius: 6px;
    border-top-right-radius: 6px;
    overflow: hidden;
}

.course_image img {
    max-width: 100%;
}

.course_body {
    padding-top: 22px;
    padding-left: 30px;
    padding-right: 30px;
    padding-bottom: 23px;
}

.course_title a {

    font-size: 20px;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.course_title a:hover {
    color: #14bdee;
}

.course_teacher {
    font-size: 15px;
    font-weight: 400;
    color: #384158;
    margin-top: 6px;
}

.course_text {
    margin-top: 13px;
}

.course_footer {
    padding-left: 30px;
    padding-right: 30px;
}

.course_footer_content {
    width: 100%;
    border-top: solid 1px #e5e5e5;
    padding-top: 9px;
    padding-bottom: 11px;
}

.course_info {
    display: inline-block;
    font-size: 14px;
    font-weight: 400;
    color: #55555a;
}

.course_info:first-child {
    margin-right: 18px;
}

.course_info i {
    color: #ffc80a;
}

.course_price {

    font-size: 20px;
    font-weight: 700;
    color: #14bdee;
}

.course_price span {

    font-size: 14px;
    font-weight: 400;
    text-decoration: line-through;
    color: #b5b8be;
    margin-right: 10px;
}

.courses_button {
    width: 210px;
    height: 46px;
    border-radius: 3px;
    background: #14bdee;
    text-align: center;
    margin: 0 auto;
    margin-top: 41px;
    box-shadow: 0px 5px 40px rgba(29, 34, 47, 0.15);
}

.courses_button:hover {
    box-shadow: 0px 5px 40px rgba(29, 34, 47, 0.45);
}

.courses_button a {
    display: block;
    font-size: 14px;
    font-weight: 500;
    text-transform: uppercase;
    line-height: 46px;
    color: #FFFFFF;
}

/*********************************
9. Counter
*********************************/

.counter {
    width: 100%;
    background: #FFFFFF;
    z-index: 2;
}

.counter_background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center center;
}

.counter_content {
    padding-top: 119px;
    padding-bottom: 125px;
}

.counter_title {

    color: #FFFFFF;
    font-weight: 700;
}

.counter_text {
    margin-top: 19px;
}

.counter_text p {
    color: #FFFFFF;
}

.milestones {
    margin-top: 39px;
}

.milestone {
    text-align: center;
}

.milestone:not(:last-child)::after {
    display: block;
    position: absolute;
    top: 0;
    right: -45px;
    width: 1px;
    height: 70px;
    background: rgba(255, 255, 255, 0.2);
    content: '';
    -webkit-transform: rotate(30deg);
    -moz-transform: rotate(30deg);
    -ms-transform: rotate(30deg);
    -o-transform: rotate(30deg);
    transform: rotate(30deg);

}

.milestone_counter {
    font-size: 42px;
    font-weight: 700;
    line-height: 0.75;
    color: #14bdee;
}

.milestone_text {
    font-size: 16px;
    font-weight: 400;
    color: #FFFFFF;
    text-transform: uppercase;
    margin-top: 14px;
}

.counter_form {
    position: absolute;
    top: 0;
    right: 30px;
    width: 380px;
    height: 100%;
    background: #FFFFFF;
    padding-left: 40px;
    padding-right: 40px;
    box-shadow: 0px 5px 40px rgba(29, 34, 47, 0.15);
}

.counter_form_content {
    display: block;
    position: relative;
    width: 100%;
    height: 100%;
}

.counter_form_title {

    font-size: 24px;
    font-weight: 700;
    color: #384158;
    text-transform: uppercase;
    line-height: 0.75;
    margin-bottom: 41px;
}

.counter_input {
    width: 100%;
    height: 46px;
    border: solid 1px #e5e5e5;
    border-radius: 3px;
    padding-left: 20px;
    outline: none;
    color: #384158;
    font-size: 14px;
}

.counter_input:not(:last-child) {
    margin-bottom: 10px;
}

.counter_text_input {
    height: 90px;
    padding-top: 10px;
}

.counter_input::-webkit-input-placeholder,
.counter_text_input::-webkit-input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #b5b8be !important;
}

.counter_input:-moz-placeholder,
.counter_text_input:-moz-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #b5b8be !important;
}

.counter_input::-moz-placeholder,
.counter_text_input::-moz-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #b5b8be !important;
}

.counter_input:-ms-input-placeholder,
.counter_text_input:-ms-input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #b5b8be !important;
}

.counter_input::input-placeholder,
.counter_text_input::input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #b5b8be !important;
}

.counter_form_button {
    width: 100%;
    height: 46px;
    color: #FFFFFF;
    font-size: 14px;
    font-weight: 500;
    text-transform: uppercase;
    border: none;
    outline: none;
    background: #14bdee;
    cursor: pointer;
    margin-top: 30px;
    box-shadow: 0px 5px 40px rgba(29, 34, 47, 0.15);
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.counter_form_button:hover {
    box-shadow: 0px 5px 40px rgba(29, 34, 47, 0.45);
}

/*********************************
10. Events
*********************************/

.events {
    width: 100%;
    padding-top: 93px;
    padding-bottom: 70px;
    background: #FFFFFF;
}

.events_row {
    margin-top: 47px;
}

.event_left {
    padding-right: 20px;
}

.event_mid {
    padding-left: 10px;
    padding-right: 10px;
}

.event_right {
    padding-left: 20px;
}

.event_image {
    width: 100%;
    border-radius: 5px;
    overflow: hidden;
}

.event_image img {
    max-width: 100%;
}

.event_body {
    padding-top: 30px;
    padding-bottom: 30px;
}

.event_date {
    box-shadow: 0px 1px 10px rgba(29, 34, 47, 0.1);
}

.event_date>div {
    width: 60px;
    height: 60px;
}

.event_day {

    font-size: 24px;
    color: #14bdee;
    font-weight: 700;
    line-height: 0.75;
}

.event_month {

    font-size: 14px;
    color: #14bdee;
    font-weight: 400;
    line-height: 0.75;
    margin-top: 9px;
}

.event:hover .event_date>div {
    background: #14bdee;
}

.event:hover .event_day,
.event:hover .event_month {
    color: #FFFFFF;
}

.event_content {
    padding-left: 20px;
}

.event_title a {

    font-size: 20px;
    font-weight: 700;
    line-height: 1.4;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.event_title a:hover {
    color: #14bdee;
}

.event_info_container {
    margin-top: 11px;
}

.event_info {
    display: inline-block;
    color: #b5b8be;
    font-size: 14px;
}

.event_info:not(:last-child) {
    margin-right: 17px;
}

.event_info span {
    margin-left: 4px;
}

.event_text {
    margin-top: 12px;
}


/*********************************
12. News
*********************************/

.news {
    width: 100%;
    padding-top: 93px;
    padding-bottom: 100px;
    background: #FFFFFF;
}

.news_row {
    margin-top: 55px;
}

.news_post_large_container {
    padding-right: 30px;
}

.news_post_large {
    width: 100%;
}

.news_post_image {
    width: 100%;
    border-radius: 6px;
    overflow: hidden;
}

.news_post_image img {
    max-width: 100%;
}

.news_post_large_title {
    margin-top: 23px;
}

.news_post_large_title a {

    font-size: 20px;
    font-weight: 700;
    color: #384158;
    line-height: 1.4;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.news_post_large_title a:hover {
    color: #14bdee;
}

.news_post_meta {
    margin-top: 11px;
}

.news_post_meta ul li {
    display: inline-block;
    position: relative;
}

.news_post_meta ul li:not(:last-of-type)::after {
    display: inline-block;
    position: relative;
    content: '|';
    margin-left: 14px;
    margin-right: 11px;
}

.news_post_meta ul li a {
    font-size: 14px;
    font-weight: 400;
    color: #b5b8be;
    text-transform: uppercase;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.news_post_meta ul li a:hover {
    color: #14bdee;
}

.news_post_text {
    margin-top: 13px;
}

.news_post_link {
    margin-top: 19px;
}

.news_post_link a {
    font-size: 14px;
    font-weight: 400;
    text-transform: uppercase;
    color: #384158;
    text-decoration: underline;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.news_post_link a:hover {
    color: #14bdee;
}

.news_posts_small {
    margin-top: -6px;
}

.news_post_small:not(:last-child) {
    padding-bottom: 31px;
    border-bottom: solid 1px #e5e5e5;
}

.news_post_small:not(:first-child) {
    padding-top: 29px;
}

.news_post_small_title a {

    font-size: 18px;
    font-weight: 700;
    line-height: 1.55;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.news_post_small_title a:hover {
    color: #14bdee;
}

/*********************************
13. Newsletter
*********************************/

.newsletter {
    width: 100%;
}

.newsletter_background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
}

.newsletter_container {
    width: 100%;
    height: 120px;
}

.newsletter_title {

    font-size: 20px;
    font-weight: 700;
    text-transform: uppercase;
    color: #FFFFFF;
}

.newsletter_subtitle {
    font-size: 14px;
    font-weight: 400;
    color: #FFFFFF;
    margin-top: 6px;
}

.newsletter_form_container {
    width: 450px;
    padding-left: 20px;
}

.newsletter_form {
    display: block;
    position: relative;
    width: 100%;
}

.newsletter_input {
    width: calc(100% - 136px);
    height: 40px;
    background: rgba(255, 255, 255, 0.4);
    border: none;
    outline: none;
    padding-left: 20px;
    color: #FFFFFF;
    border-top-left-radius: 3px;
    border-bottom-left-radius: 3px;
}

.newsletter_input::-webkit-input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #FFFFFF !important;
}

.newsletter_input:-moz-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #FFFFFF !important;
}

.newsletter_input::-moz-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #FFFFFF !important;
}

.newsletter_input:-ms-input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #FFFFFF !important;
}

.newsletter_input::input-placeholder {
    font-size: 14px !important;
    font-weight: 400 !important;
    color: #FFFFFF !important;
}

.newsletter_button {
    width: 136px;
    height: 40px;
    background: #FFFFFF;
    border-radius: 3px;
    border: none;
    outline: none;
    cursor: pointer;
    font-size: 14px;
    text-transform: uppercase;
    color: #14bdee;
    font-weight: 500;
    letter-spacing: 0.1em;
}

/*********************************
14. Footer
*********************************/

.footer {
    display: block;
    position: relative;
    width: 100%;
    background: #1e2434;
    padding-top: 94px;
}

.footer_background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center center;
}

.footer_content {
    padding-bottom: 53px;
}

.footer_logo_text {

    font-size: 36px;
    font-weight: 700;
    line-height: 0.75;
    color: #FFFFFF;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.footer_logo_text span {
    color: #14bdee;
}

.footer_title {

    font-size: 18px;
    font-weight: 700;
    color: #FFFFFF;
    line-height: 0.75;
}

.footer_logo_container {
    margin-top: -14px;
}

.footer_about_text {
    margin-top: 31px;
}

.footer_about_text p {
    color: #FFFFFF;
}

.footer_social {
    margin-top: 23px;
}

.footer_social ul li {
    display: inline-block;
    width: 45px;
    height: 45px;
    background: #4b505d;
    border-radius: 50%;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.footer_social ul li:not(:last-child) {
    margin-right: 6px;
}

.footer_social ul li a {
    display: block;
    position: relative;
    text-align: center;
}

.footer_social ul li a i {
    color: #FFFFFF;
    line-height: 45px;
}

.footer_social ul li:hover {
    background: #14bdee;
}

.footer_contact {
    padding-left: 36px;
}

.footer_contact_info {
    margin-top: 33px;
}

.footer_contact_info ul li {
    font-size: 14px;
    font-weight: 400;
    color: #b5b8be;
}

.footer_contact_info ul li:not(:last-child) {
    margin-bottom: 15px;
}

.footer_links {
    padding-left: 80px;
}

.footer_links_container ul {
    columns: 2;
    -webkit-columns: 2;
    -moz-columns: 2;
}

.footer_links_container {
    margin-top: 33px;
}

.footer_links_container ul li a {
    font-size: 14px;
    color: #b5b8be;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.footer_links_container ul li:not(:last-child) {
    margin-bottom: 15px;
}

.footer_links_container ul li a:hover {
    color: #14bdee;
}

.footer_mobile {
    display: inline-block;
    float: right;
}

.footer_mobile_content {
    padding-top: 35px;
}

.footer_image:not(:last-child) {
    margin-bottom: 10px;
}

.copyright {
    height: 54px;
    border-top: solid 1px #353a49;
}

.cr_list li {
    display: inline-block;
}

.copyright div {
    font-size: 14px;
    color: #b5b8be;
}

.cr_text a {
    color: #FFFFFF;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.cr_text a:hover {
    color: #14bdee;
}

.cr_list li:not(:last-child) {
    margin-right: 50px;
}

.cr_list li a {
    font-size: 14px;
    color: #b5b8be;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.cr_list li a:hover {
    color: #14bdee;
}

/*********************************
7. Blog
*********************************/

.blog {
    width: 100%;
    background: #FFFFFF;
    padding-top: 15px;
    padding-bottom: 100px;
}

.blog_content {
    width: 100%;
}

.blog_title {
    font-size: 30px;
    font-weight: 700;
    line-height: 1.2;
    color: #384158;
    margin-bottom: 14px;
}

.blog_meta {
    margin-top: 14px;
}

.blog_meta ul li {
    display: inline-block;
    position: relative;
    font-size: 14px;
    color: #b5b8be;
}

.blog_meta ul li a {
    font-size: 14px;
    color: #b5b8be;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.blog_meta ul li a:hover {
    color: #14bdee;
}

.blog_meta ul li:not(:last-child)::after {
    display: inline-block;
    content: '|';
    margin-left: 14px;
    margin-right: 14px;
}

.blog_image {
    width: 100%;
    margin-top: 18px;
}

.blog_image img {
    max-width: 100%;
}

.blog_content p {
    font-size: 16px;
    line-height: 1.75;
    color: #76777a;
    margin-top: 29px;
    margin-bottom: 0;
}

.blog_quote {
    margin-top: 24px;
    margin-bottom: -2px;
}

.blog_quote i {
    font-size: 30px;
    color: #14bdee;
}

.blog_quote div {
    font-size: 18px;
    font-style: italic;
    line-height: 1.66;
    color: #384158;
    padding-left: 36px;
}

.blog_subtitle {
    font-size: 24px;
    color: #384158;
    line-height: 1.2;
    margin-top: 48px;
}

.blog_images {
    margin-top: 31px;
    margin-bottom: 35px;
}

.blog_image_small {
    width: 100%;
}

.blog_image_small img {
    max-width: 100%;
}

.blog_extra {
    margin-top: 39px;
    padding-bottom: 18px;
}

.blog_tags span {
    color: #384158;
}

.blog_tags ul {
    display: inline-block;
    margin-left: 3px;
}

.blog_tags ul li {
    display: inline-block;
}

.blog_tags ul li a {
    font-size: 14px;
    color: #b5b8be;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.blog_tags ul li a:hover {
    color: #14bdee;
}

.blog_social span {
    font-size: 14px;
    color: #384158;
}

.blog_social ul {
    display: inline-block;
    margin-left: 21px;
}

.blog_social ul li {
    display: inline-block;
}

.blog_social ul li:not(:last-child) {
    margin-right: 18px;
}

.blog_social ul li i {
    font-size: 14px;
    color: #b5b8be;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.blog_social ul li:hover i {
    color: #14bdee;
}

.comments_container {
    margin-top: 51px;
}

.comments_title {

    font-size: 24px;
    font-weight: 700;
    color: #2c3145;
}

.comments_list li:not(:last-child) .comment_item {
    border-bottom: solid 1px #e5e5e5;
}

.comment_item {
    padding-top: 31px;
    padding-bottom: 16px;
}

.comment_image div {
    width: 80px;
    height: 80px;
    border-radius: 50%;
    overflow: hidden;
}

.comment_image div img {
    max-width: 100%;
}

.comment_content {
    width: 100%;
    padding-left: 20px;
    margin-top: -7px;
}

.comment_author::after {
    display: inline-block;
    content: '-';
    margin-left: 6px;
}

.comment_author a {

    font-size: 18px;
    font-weight: 700;
    color: #384158;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.comment_author a:hover {
    color: #14bdee;
}

.comments_container .rating_r {
    margin-top: 3px;
    margin-left: 5px;
}

.comments_container .rating_r i::before {
    color: #ffc80a;
}

.comment_text {
    margin-top: 12px;
}

.comment_extras {
    margin-top: 13px;
}

.comment_likes::after {
    display: inline-block;
    content: '|';
    margin-left: 15px;
    margin-right: 15px;
}

.comment_reply {}

.comment_extra a {
    font-size: 12px;
    font-weight: 400;
    color: #5e6271;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.comment_extra a:hover {
    color: #14bdee;
}

.comment_extra a span {
    margin-left: 3px;
}

.comments_list li ul {
    padding-left: 99px;
}

.add_comment_container {
    margin-top: 31px;
}

.add_comment_title {

    font-size: 24px;
    font-weight: 700;
    color: #384158;
}

.add_comment_text {
    margin-top: 14px;
}

.comment_form {
    margin-top: 35px;
}

.comment_input {
    width: 100%;
    height: 46px;
    border: solid 1px #d9d9d9;
    border-radius: 3px;
    padding-left: 19px;
    font-size: 16px;
    font-weight: 400;
    color: #2c3145;
}

.comment_input:focus {
    border: solid 1px #14bdee;
    outline: none;
}

.comment_textarea {
    width: 100%;
    height: 150px;
    margin-bottom: 18px;
    padding-top: 15px;
}

.form_title {
    font-size: 16px;
    font-weight: 400;
    color: #384158;
    margin-bottom: 12px;
}

.comment_notify {
    margin-top: 29px;
}

.regular_checkbox {
    display: none;
}

.regular_checkbox+label {
    position: relative;
    -webkit-appearance: none;
    -moz-appearance: none;
    -ms-appearance: none;
    -o-appearance: none;
    appearance: none;
    width: 14px;
    height: 14px;
    background: #14bdee;
    border-radius: 3px;
    cursor: pointer;
    vertical-align: middle;
    margin-bottom: 0;
    margin-top: -2px;
}

.regular_checkbox+label i {
    position: absolute;
    top: 50%;
    left: 50%;
    -webkit-transform: translate(-50%, -50%);
    -moz-transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    -o-transform: translate(-50%, -50%);
    transform: translate(-50%, -50%);
    color: #FFFFFF;
    font-size: 10px;
}

.regular_checkbox+label i {
    display: none;
}

.regular_checkbox:checked+label i {
    display: block;
}

.comment_notify span {
    font-size: 16px;
    font-weight: 400;
    color: #2c3145;
    vertical-align: middle;
    margin-left: 3px;
}

.comment_button {
    width: 150px;
    height: 46px;
    background: #14bdee;
    text-transform: uppercase;
    font-size: 14px;
    font-weight: 500;
    color: #FFFFFF;
    cursor: pointer;
    border: none;
    outline: none;
    border-radius: 3px;
    margin-top: 34px;
}

.comment_button:hover {
    box-shadow: 0px 5px 40px rgba(0, 0, 0, 0.25);
}

/*********************************
8. Sidebar
*********************************/

.sidebar {
    width: 100%;
    padding-left: 40px;
}

.sidebar_section:not(:last-child) {
    margin-bottom: 60px;
}

.sidebar_section_title {

    font-size: 24px;
    font-weight: 700;
    color: #384158;
    line-height: 0.75;
}

.sidebar_categories {
    margin-top: 16px;
}

.sidebar_categories ul li {
    position: relative;
    width: 100%;
    height: 51px;
}

.sidebar_categories ul li:not(:last-of-type) {
    border-bottom: solid 1px #e5e5e5;
}

.sidebar_categories ul li a {
    display: block;
    position: relative;
    font-size: 14px;
    color: #b5b8be;
    line-height: 51px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.sidebar_categories ul li:hover a,
.sidebar_categories ul li:hover a::before {
    color: #14bdee;
}

.categories_list li a span {
    float: right;
}

.sidebar_latest {
    margin-top: 31px;
}

.latest:not(:last-child) {
    margin-bottom: 20px;
}

.latest_image div {
    width: 90px;
    height: 74px;
    border-radius: 3px;
    overflow: hidden;
}

.latest_image div img {
    max-width: 100%;
}

.latest_content {
    padding-left: 21px;
    margin-top: -4px;
}

.latest_title a {

    font-size: 16px;
    font-weight: 700;
    color: #383749;
    line-height: 1.625;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.latest_title a:hover {
    color: #14bdee;
}

.latest_date {
    font-size: 14px;
    color: #b5b8be;
    margin-top: 10px;
    text-transform: uppercase;
}

.sidebar_gallery {
    margin-top: 34px;
}

.gallery_item {
    position: relative;
    width: calc((100% - 36px) / 3);
    margin-bottom: 18px;
    cursor: pointer;
}

.gallery_item img {
    width: 100%;
}

.gallery_item_overlay {
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(20, 189, 238, 0.7);
    opacity: 0;
    pointer-events: none;
    font-size: 33px;
    font-weight: 300;
    color: #FFFFFF;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.gallery_item:hover .gallery_item_overlay {
    opacity: 1;
}

.colorbox {
    outline: none;
}

.sidebar_tags {
    margin-top: 40px;
}

.tags_list li {
    display: inline-block;
    padding-left: 19px;
    padding-right: 18px;
    background: #f2f4f5;
    border-radius: 3px;
    margin-bottom: 10px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.tags_list li:not(:last-child) {
    margin-right: 5px;
}

.tags_list li:hover {
    background: #14bdee;
}

.tags_list li:hover a {
    color: #FFFFFF;
}

.tags_list li a {
    display: block;
    font-size: 12px;
    color: #76777a;
    text-transform: uppercase;
    line-height: 30px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.sidebar_banner {
    width: 100%;
    height: 213px;
}

.sidebar_banner_background {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center center;
}

.sidebar_banner_overlay {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: #14bdee;
    opacity: 0.7;
}

.banner_title {

    font-size: 20px;
    font-weight: 700;
    color: #FFFFFF;
    line-height: 0.75;
}

.banner_button {
    width: 200px;
    height: 46px;
    background: #FFFFFF;
    border-radius: 3px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.banner_button a {
    display: block;
    color: #14bdee;
    font-size: 14px;
    font-weight: 400;
    letter-spacing: 0.1em;
    margin-left: -0.1em;
    text-transform: uppercase;
    line-height: 46px;
    margin-top: 21px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.banner_button:hover {
    background: #14bdee;
}

.banner_button:hover a {
    color: #FFFFFF;
}

/*********************************
Aside
*********************************/

.sidebar.toggle {
    left: 0px;
}

.sidebar {
    position: fixed;
    top: 0px;
    left: -350px;
    bottom: 0;
    width: 350px;
    z-index: 996;
    transition: all 0.3s;
    padding: 20px 0px 0px 0px;
    scrollbar-width: thin;
    scrollbar-color: #aab7cf transparent;
    box-shadow: 0px 0px 20px rgba(1, 41, 112, 0.1);
    background-color: #fff;
}

.sidebar-nav .nav-link {
    display: flex;
    align-items: center;
    font-size: 20px;
    font-weight: 600;
    color: #14bdee;
    transition: 0.3;
    background: #f6f9ff;
    padding: 10px 15px;
    border-radius: 4px;
    margin-left: 10px;
}

.sidebar-nav .nav-content {
    padding: 5px 0 0 0;
    margin: 0;
    list-style: none;
}

.sidebar-nav li {
    padding: 0;
    margin: 0;
    list-style: none;
}

.sidebar-nav .nav-content a:hover,
.sidebar-nav .nav-content a.active {
    color: #14bdee;
}

.sidebar-nav .nav-content a {
    display: flex;
    align-items: center;
    font-size: 18px;
    font-weight: 600;
    color: #012970;
    transition: 0.3;
    padding: 10px 0 10px 40px;
    transition: 0.3s;
}

.sidebar-nav .nav-content a i {
    font-size: 20px;
    margin-right: 10px;
    line-height: 0;
    border-radius: 50%;
}

.sidebar-nav .nav-content a .play-time {
    margin: 2px;
    font-size: 14px;
    padding-right: 20px;
}

.ms-auto {
    margin-left: auto !important;
}

.aside {
    position: fixed;
    top: 0;
    left: -400px;
    width: 400px;
    height: 100vh;
    background: #FFFFFF;
    z-index: 101;
    padding-top: 50px;

}

.aside .logo a {
    color: #000000;
}

.aside.active {
    left: 0;
}

.aside_close_container {
    position: absolute;
    top: 30px;
    right: 60px;
    width: 18px;
    height: 18px;
    transform-origin: center center;
    -webkit-transform: rotate(45deg);
    -moz-transform: rotate(45deg);
    -ms-transform: rotate(45deg);
    -o-transform: rotate(45deg);
    transform: rotate(45deg);
    cursor: pointer;
}

.aside_close {
    width: 100%;
    height: 100%;
    transform-style: preserve-3D;
}

.aside_close div {
    width: 100%;
    height: 2px;
    background: #232323;
    top: 8px;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.aside_close div:last-of-type {
    -webkit-transform: rotate(90deg) translateX(-2px);
    -moz-transform: rotate(90deg) translateX(-2px);
    -ms-transform: rotate(90deg) translateX(-2px);
    -o-transform: rotate(90deg) translateX(-2px);
    transform: rotate(90deg) translateX(-2px);
    transform-origin: center;
}

.aside_close:hover div {
    background: #937c6f;
}

.aside .logo {
    margin-bottom: 60px;
}

.aside_nav ul li {
    margin-bottom: 9px;
}

.aside_nav ul li a {

    font-size: 14px;
    text-transform: uppercase;
    color: rgba(0, 0, 0, 1);
    font-weight: 700;
    letter-spacing: 0.1em;
    -webkit-transition: all 200ms ease;
    -moz-transition: all 200ms ease;
    -ms-transition: all 200ms ease;
    -o-transition: all 200ms ease;
    transition: all 200ms ease;
}

.aside_nav ul li a:hover {
    color: #14bdee;
}

.aside .search {
    width: 100%;
    margin-bottom: 67px;
}

.search {
    display: inline-block;
    width: 400px;
    -webkit-transform: translateY(2px);
    -moz-transform: translateY(2px);
    -ms-transform: translateY(2px);
    -o-transform: translateY(2px);
    transform: translateY(2px);
}

.aside .header_search_form {
    width: 100%;
}

.search form {
    position: relative;
}

.aside .search_input {
    width: 100%;
    height: 40px;
    background: rgba(0, 0, 0, 0.1);
    border-radius: 3px;
    border: none;
    outline: none;
    padding-left: 15px;
    color: rgba(0, 0, 0, 0.5);
}

.aside .search_input::-webkit-input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.aside .search_input:-moz-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.aside .search_input::-moz-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.aside .search_input:-ms-input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}

.aside .search_input::input-placeholder {

    font-size: 14px !important;
    font-weight: 400 !important;
    color: rgba(0, 0, 0, 0.4) !important;
}


.b-example-divider {
    flex-shrink: 0;
    width: 1.5rem;
    height: 100vh;
    background-color: rgba(0, 0, 0, .1);
    border: solid rgba(0, 0, 0, .15);
    border-width: 1px 0;
    box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
}

.bi {
    vertical-align: -.125em;
    pointer-events: none;
    fill: currentColor;
}

#courses_section {
    border-bottom: solid 1px #ebebeb;

}

#hideshow_course_pursue_panel {
    left: -100px;
    top: 187px;
    cursor: pointer;
    border-radius: 5px;
    border-radius: 5px;
    border-radius: 5px;
    position: fixed;
    height: 48px;
    width: 48px;
    z-index: 999;
    background: rgba(0, 0, 0, .05);
    transition: transform .5s, -webkit-transform .5s;
}

#hideshow_course_pursue_panel span {
    height: 2px;
    width: 24px;
    background: #444;
    position: relative;
    margin-top: 14px;
    transition: all .6s;
}

#hideshow_course_pursue_panel:after {
    content: '';
    height: 4px;
    width: 24px;
    border-radius: 2px;
    position: absolute;
    left: 11px;
    top: 22px;
    display: block;
    background: #b4b4b4;
}

#hideshow_course_pursue_panel span:after,
#hideshow_course_pursue_panel span:before {
    top: 6px;
    transition: all .2s ease-in;
    transform: translateY(12px) rotate(-45deg);
    content: '';
    border-radius: 2px;
    position: absolute;
    left: 9px;
    width: 16px;
    height: 4px;
    background: #b4b4b4;
}

#hideshow_course_pursue_panel span:after {
    top: 22.6px;
    transform: translateY(4px) rotate(45deg);
}

#hideshow_course_pursue_panel.hide {
    position: absolute;
    left: 10px;
    top: 187px;
    transition: none;
}

#hideshow_course_pursue_panel.hide span {
    opacity: 1;
    transition: 1s ease-in-out;
}

#hideshow_course_pursue_panel.hide:after {
    position: absolute;
    content: '';
    width: 24px;
    height: 3.8px;
    left: 13px;
    top: 23px;
    background: #b4b4b4;
}

#hideshow_course_pursue_panel.hide span:after,
#hideshow_course_pursue_panel.hide span:before {
    top: 14px;
    -webkit-transform: translateY(4px) rotate(45deg);
    transform: translateY(4px) rotate(45deg);
    left: 22px;
}

#hideshow_course_pursue_panel.hide span:after {
    top: 24px;
    transform: translateY(4px) rotate(-45deg);
    left: 22px;
}


.aside_title {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: justify;
    justify-content: space-between;
    width: 100%;
    padding: 16px 20px;
    color: rgb(27, 28, 29);
    font-size: 22px;
    font-weight: 700;
    line-height: 1.5;
}


.aside_close_button {
    all: unset;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    cursor: pointer;
    margin-left: auto;
}

.aside_lecture_container {
    padding: 0px 20px 22px;
}

.aside_lecture_info {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    -webkit-box-align: center;
    align-items: center;
}

.aside_lecture_title {
    margin-bottom: 12px;
    font-size: 25px;
    font-weight: 500;
    color: rgb(51, 51, 51);
    line-height: 1.5;
    letter-spacing: -0.3px;
}

.aside_lecture_complete {
    margin-bottom: 10px;
    font-size: 15px;
    line-height: 1.47;
    letter-spacing: -0.3px;
}


.aside_lecture_complete_progress {
    display: inline-block;
    margin-top: 12px;
    width: 100%;
    height: 5px;
}

.aside_lecture_list {
    flex: 1 1 0%;
    overflow-y: auto;
    width: 100%;
}

.aside_section_list_item:not(:last-of-type) {
    margin-bottom: 8px;
}

.aside_section_item_title {
    padding: 16px 32px;
    background-color: rgb(241, 243, 245);
    font-size: 16px;
    line-height: 1.5;
    letter-spacing: -0.3px;
    color: rgb(33, 37, 41);
    border-top: 1px solid rgb(222, 226, 230);
    border-bottom: 1px solid rgb(222, 226, 230);
}

.aside_lecture_item_title:first-of-type {
    margin-top: 8px;
}

.aside_lecture_item_container {
    display: flex;
    align-items: flex-start;
    padding: 8px 32px;
    cursor: pointer;
    background-color: rgb(255, 255, 255);
    border-left: none;
}

.aside_lecture_item_container.current {
    background-color: rgb(238, 248, 249);
    border-left: 6px solid #14bdee
}

.lecture_complete_icon {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    width: 24px;
    height: 24px;
    border-radius: 50%;
    background-color: rgb(206, 212, 218);
    transition: background-color 0.15s ease 0s;
}

.aside_lecture_item_title {
    flex: 1 1 0%;
    padding: 0px 20px 0px 12px;
}

.lecture-home {
    width: 100%;
    height: 47px;
    border-bottom: solid 1px #edeff0;
    color: #000000;
}

#aside_open_button {
    cursor: pointer;
}
</style>