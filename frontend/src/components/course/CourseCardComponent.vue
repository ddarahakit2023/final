<template>
    <div class="column is-3-fullhd is-3-widescreen is-3-desktop is-4-tablet is-6-mobile ">
        <div class="card course course_card_item" data-productid="324145"
            fxd-data='{"courseId":324145,"regPrice":33000,"isInCart":false}'>

            <a class="course_card_front e_course_click" :href="'/course/'+course.id">
                <div class="card-image">
                    <figure class="image is_thumbnail">

                        <img loading="lazy"
                            :src="course.image"
                            class="swiper-lazy">
                        <div class="onload_placeholder"></div>
                        <div class="swiper-lazy-preloader"></div>

                    </figure>

                    <div class="course_card_ribbon">
                        <i class="fas fa-badge-percent"></i>
                        100% 할인

                    </div>
                    <span class="course_card_ribbon is-shown-admin student_cnt">25,962</span>

                </div>
                <div class="card-content">
                    <div class="course_title">{{ course.name }}</div>

                    <div class="rating">
                        <div class='rating_star'>
                            <div class='star_solid' style="width: 94%">
                                <i class="fa-solid fa-star fa-xs"></i>
                                <i class="fa-solid fa-star fa-xs"></i>
                                <i class="fa-solid fa-star fa-xs"></i>
                                <i class="fa-solid fa-star fa-xs"></i>
                                <i class="fa-solid fa-star fa-xs"></i>
                            </div>
                            <i class="fa-regular fa-star fa-xs"></i>
                            <i class="fa-regular fa-star fa-xs"></i>
                            <i class="fa-regular fa-star fa-xs"></i>
                            <i class="fa-regular fa-star fa-xs"></i>
                            <i class="fa-regular fa-star fa-xs"></i>
                            

                        </div>
                        <span class="review_cnt">(834)</span>
                    </div>

                    <div class="price"><del>{{ currency(course.price) }}</del><br><span class="pay_price">₩0</span>
                    </div>

                    <div class="tags">
                        <span class="tag " style="background-color: hsl(321,63%,90%)">+25,900명</span>
                        <span class="tag is-hidden-student" style="background-color: hsl(155,40%,87%)">독점</span>


                        <span class="tag " style="background-color: hsl(1,100%,89%)">할인중</span>
                    </div>

                </div>
                <div class="course-data"
                    fxd-data='{"course_identification":324145,"course_title":"프로그래밍 시작하기 : 파이썬 입문 (Inflearn Original)","course_level":"입문","first_category":"개발 · 프로그래밍,인공지능","second_category":"프로그래밍 언어,딥러닝 · 머신러닝","skill_tag":"Python","seq0_instructor_id":17,"seq0_instructor_name":"인프런","student_count":25962,"star_rate":4.738609112709832,"review_count":834,"is_new_course":false,"reg_price":30000,"reg_vat_price":33000,"selling_price":0,"is_discount":true,"discount_id":null,"discount_title":"새학기 무료 이벤트","discount_rate":100,"course_last_updated_date":"2023-04-01T00:00:00.000Z","course_published_date":"2019-06-01T15:00:00.000Z","installment_price":null,"installment_month":null}'
                    style="display: none;" aria-hidden="true"></div>
            </a>
            <div class="course_card_back">
                <a class="e_course_click"
                    :href="'/course/'+course.id">
                    <p class="course_title">프로그래밍 시작하기 : 파이썬 입문 (Inflearn Original)</p>
                    <p class="course_description">이미 2만명 이상이 학습하고 만족한 최고의 프로그래밍 입문 강의.
                        인프런이 비전공자 위치에서 직접 기획하고 준비한 프로그래밍 입문 강의로, 프로그래밍을 전혀 접해보지 못한 사람부터 실제 활용 가능한 프로그래밍 능력까지 갈 수 있도록
                        도와주는 강의입니다.</p>
                    <div class="back_course_metas">
                        <div class="course_level">
                            <span><svg width="16" aria-hidden="true" data-prefix="fal" data-icon="signal-alt"
                                    class="svg-inline--fa fa-signal-alt fa-w-20" role="img"
                                    xmlns="http://www.w3.org/2000/svg" viewbox="0 0 640 512">
                                    <path fill="currentColor"
                                        d="M576 32v448h-32V32h32M416 160v320h-32V160h32M256 288v192h-32V288h32M96 416v64H64v-64h32M576 0h-32c-17.67 0-32 14.33-32 32v448c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V32c0-17.67-14.33-32-32-32zM416 128h-32c-17.67 0-32 14.33-32 32v320c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V160c0-17.67-14.33-32-32-32zM256 256h-32c-17.67 0-32 14.33-32 32v192c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V288c0-17.67-14.33-32-32-32zM96 384H64c-17.67 0-32 14.33-32 32v64c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32v-64c0-17.67-14.33-32-32-32z">
                                    </path>
                                </svg>입문</span>
                        </div>
                        <div class="course_categories">
                            <span>
                                <svg width="16" aria-hidden="true" focusable="false" data-prefix="fal"
                                    data-icon="folder-tree" class="svg-inline--fa fa-folder-tree fa-w-18" role="img"
                                    xmlns="http://www.w3.org/2000/svg" viewbox="0 0 576 512">
                                    <path fill="currentColor"
                                        d="M288 224h224a32 32 0 0 0 32-32V64a32 32 0 0 0-32-32H400L368 0h-80a32 32 0 0 0-32 32v64H64V8a8 8 0 0 0-8-8H40a8 8 0 0 0-8 8v392a16 16 0 0 0 16 16h208v64a32 32 0 0 0 32 32h224a32 32 0 0 0 32-32V352a32 32 0 0 0-32-32H400l-32-32h-80a32 32 0 0 0-32 32v64H64V128h192v64a32 32 0 0 0 32 32zm0 96h66.74l32 32H512v128H288zm0-288h66.74l32 32H512v128H288z">
                                    </path>
                                </svg>
                                프로그래밍 언어, 딥러닝 · 머신러닝
                            </span>
                        </div>
                        <div class="course_skills">
                            <span>
                                <svg width="16" aria-hidden="true" focusable="false" data-prefix="far" data-icon="cubes"
                                    class="svg-inline--fa fa-cubes fa-w-16" role="img"
                                    xmlns="http://www.w3.org/2000/svg" viewbox="0 0 512 512">
                                    <path fill="currentColor"
                                        d="M384 215.1V102.5c0-15-9.3-28.4-23.4-33.7l-92-34.5c-8.1-3.1-17.1-3.1-25.3 0l-92 34.5c-14.1 5.3-23.4 18.7-23.4 33.7v112.6L23.4 254.4C9.3 259.6 0 273.1 0 288.1v106.6c0 13.6 7.7 26.1 19.9 32.2l98.6 49.3c10.1 5.1 22.1 5.1 32.2 0L256 423.6l105.3 52.6c10.1 5.1 22.1 5.1 32.2 0l98.6-49.3c12.2-6.1 19.9-18.6 19.9-32.2V288.1c0-15-9.3-28.4-23.4-33.7L384 215.1zm-116 34.8V152l92-31.7v97.6l-92 32zM152 94.2l104-39 104 39v.2L256 131 152 94.3v-.1zm0 26.1l92 31.7v97.9l-92-32v-97.6zm-30 329.4l-96.8-48.4V308l96.8 39.3v102.4zM25.2 280.8v-.2l109.4-41 108.1 40.5v1.2l-108.1 43.9-109.4-44.4zm122 66.5l95.5-38.8V402l-95.5 47.8V347.3zm217.6 102.4L269.3 402v-93.4l95.5 38.8v102.3zm122-48.4L390 449.7V347.3l96.8-39.3v93.3zm0-120.5l-109.4 44.4-108.1-43.9v-1.2l108.1-40.5 109.4 41v.2z">
                                    </path>
                                </svg>
                                Python
                            </span>
                        </div>
                    </div>
                </a>
                <div class="course_card_control active_btn">

                    <div class="tooltip is-tooltip-warning is-tooltip-left course-card__button-cart add_cart e_cart_action"
                        fxd-data='{"type":"cart"}' data-tooltip="수강바구니에 추가">
                        <i class="far fa-cart-plus fa-lg"></i>
                    </div>


                    <div class="tooltip is-tooltip-warning is-tooltip-left course-card__button-like add_cart e-like"
                        data-tooltip="좋아요에 추가">
                        <i class="far fa-heart fa-lg"></i>
                    </div>

                    <div class="tooltip is-tooltip-warning is-tooltip-left e-add-mylist" data-tooltip="내 폴더에 추가">
                        <i class="far fa-plus fa-lg"></i>
                    </div>

                </div>
            </div>
        </div>
    </div>
</template>

<script>


export default {
    name: 'CourseCardComponent',
    props: ["course"],
    methods: {
        currency(value) {
            return '₩' + value.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",");
        }
    }
}
</script>

<style scoped></style>