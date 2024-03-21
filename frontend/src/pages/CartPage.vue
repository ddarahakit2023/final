<template>
    <main id="main" class="pg___cartv2 cartv2 is_logged_in is-student-user show-channel-io-in-mobile">
        <section>
            <div class="container">
                <h1 class="container__header">
                    <button class="e-go-back header__go-back">
                        <svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path fill-rule="evenodd" clip-rule="evenodd"
                                d="M14.6705 19.1704C14.2312 19.6098 13.5188 19.6098 13.0795 19.1704L6.7045 12.7955C6.26517 12.3562 6.26517 11.6438 6.7045 11.2045L13.0795 4.8295C13.5188 4.39017 14.2312 4.39017 14.6705 4.8295C15.1098 5.26884 15.1098 5.98116 14.6705 6.42049L9.09099 12L14.6705 17.5795C15.1098 18.0189 15.1098 18.7311 14.6705 19.1704Z"
                                fill="#3E4042"></path>
                        </svg>
                    </button>
                    수강바구니
                </h1>
                <section class="section-cart">
                    <h1 class="section-cart__header">수강바구니</h1>
                    <section class="section-cart__body-wrapper">
                        <section>
                            <h2 class="visually-hidden">강의 리스트</h2>
                            <div class="section-cart__control">


                            </div>
                            <div class="section-cart__card-list">

                                <article class="cart-course-card  bootstrap-components">

                                    <div class="cart-course-card__image for-pc">
                                        <a :href="'/course/' + cartStore.course.id" target="_blank">
                                            <figure class="cart-course-card__thumbnail is_thumbnail">
                                                <img :src="cartStore.course.image" :alt="cartStore.course.name">
                                            </figure>
                                        </a>
                                    </div>


                                    <div class="cart-course-card__info">
                                        <div class="cart-course-card__discount-info">
                                        </div>
                                        <div class="cart-course-card__image for-mobile">
                                            <a :href="'/course/' + cartStore.course.id" target="_blank">
                                                <figure class="cart-course-card__thumbnail is_thumbnail">
                                                    <img :src="cartStore.course.image" :alt="cartStore.course.name">
                                                </figure>
                                            </a>
                                        </div>
                                        <section class="cart-course-card__center for-mobile">
                                            <div>
                                                <h3 class="cart-course-card__title">
                                                    <a :href="'/course/' + cartStore.course.id" target="_blank">
                                                        {{ cartStore.course.name }}
                                                    </a>
                                                </h3>
                                                <div class="cart-course-cart__extra-info">
                                                    <span class="cart-course-card__instructor">
                                                        김영한
                                                    </span>

                                                    <div data-bs-toggle="tooltip" data-bs-placement="auto" title=""
                                                        class="cart-course-card__duration-tooltip"
                                                        data-bs-original-title="유료 수강기간 1개월, 이후 복습 및 질문답변 무제한 가능">
                                                        <span class="cart-course-card__duration">무제한 수강</span>
                                                    </div>

                                                </div>
                                            </div>
                                        </section>
                                        <h3 class="cart-course-card__title for-pc">
                                            <a :href="'/course/' + cartStore.course.id" target="_blank" rel="noopener">
                                                {{ cartStore.course.name }}
                                            </a>
                                        </h3>
                                        <div class="cart-course-cart__extra-info for-pc">
                                            <span class="cart-course-card__instructor">
                                                김영한
                                            </span>

                                            <div data-bs-toggle="tooltip" data-bs-placement="auto" title=""
                                                class="cart-course-card__duration-tooltip"
                                                data-bs-original-title="유료 수강기간 1개월, 이후 복습 및 질문답변 무제한 가능">
                                                <span class="cart-course-card__duration">무제한 수강</span>
                                            </div>

                                        </div>
                                    </div>
                                    <div class="close"></div>
                                    <div class="cart-course-card__payment">
                                        <span class="cart-course-card__price-pay">
                                            <strong>{{ currency(cartStore.course.price) }}</strong>원
                                        </span>
                                    </div>

                                </article>

                            </div>
                        </section>
                        <section>
                            <h2 class="visually-hidden">패키지 리스트</h2>
                        </section>
                    </section>
                </section>

                <aside class="aside-cart">
                    <h2 class="visually-hidden">수강바구니 정보</h2>
                    <section class="section-buyer-info">
                        <h3 class="visually-hidden">구매자정보</h3>


                        <div class="buyer-info">

                            <div class="buyer-info__header">
                                <span class="buyer-info__title">
                                    <label>구매자정보</label>
                                    <button type="button" class="button-question e-open-buyer-guide-modal"
                                        aria-label="구매자정보 안내">
                                    </button>
                                </span>
                            </div>
                            <dl class="buyer-info__list">
                                <div>
                                    <dt>이름</dt>
                                    <dd>{{ member.name }}</dd>
                                </div>
                                <div>
                                    <dt>이메일</dt>
                                    <dd>{{ member.email }}</dd>
                                </div>
                            </dl>

                        </div>
                    </section>
                    <section class="section-voucher-info bootstrap-components section-voucher-info--sticky">
                        <div class="voucher-info-sticker">
                            <h3 class="visually-hidden">주문정보</h3>

                            <div class="voucher-info">
                                <div class="coupon-selection">
                                    <div class="coupon-selection__label">
                                        <label>쿠폰</label>
                                        <button type="button" class="button-question e-open-coupon-guide"
                                            aria-label="쿠폰 이용안내">
                                            <svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                                                viewBox="0 0 512 512"><!--! Font Awesome Pro 6.1.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. -->
                                                <path fill="#abb0b5"
                                                    d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 464c-114.7 0-208-93.31-208-208S141.3 48 256 48s208 93.31 208 208S370.7 464 256 464zM256 336c-18 0-32 14-32 32s13.1 32 32 32c17.1 0 32-14 32-32S273.1 336 256 336zM289.1 128h-51.1C199 128 168 159 168 198c0 13 11 24 24 24s24-11 24-24C216 186 225.1 176 237.1 176h51.1C301.1 176 312 186 312 198c0 8-4 14.1-11 18.1L244 251C236 256 232 264 232 272V288c0 13 11 24 24 24S280 301 280 288V286l45.1-28c21-13 34-36 34-60C360 159 329 128 289.1 128z">
                                                </path>
                                            </svg>
                                        </button>
                                        <!--<span class="coupon-selection__status">최대 할인 적용중</span>-->
                                        <span class="coupon-selection__usable-sentence">사용가능</span>
                                        <span class="cart-tmpl-number-unit coupon-selection__number-of-usable-coupons">
                                            0
                                        </span>
                                    </div>
                                    <div class="coupon-selection__interactions">
                                        <label for="coupon" class="visually-hidden">쿠폰 할인 금액</label>

                                        <div class="ac-input-with-item coupon-selection__input disabled">

                                            <input value="0" disabled="" type="text" spellcheck="false" id="coupon"
                                                placeholder="0">

                                        </div>


                                        <button
                                            class="ac-button is-md is-outlined is-gray coupon-selection__button e-select-coupon "
                                            type="button">쿠폰선택</button>
                                    </div>
                                </div>

                                <div class="price-regular">
                                    <span>선택상품 금액</span>

                                    <div class="cart-tmpl-number-unit ">
                                        <span class="cart-tmpl-number-unit__number">{{ currency(cartStore.course.price)
                                            }}</span>
                                        <span class="cart-tmpl-number-unit__unit">원</span>
                                    </div>

                                </div>

                                <div class="price-discount">
                                    <div class="price-discount__summary">
                                        <button type="button"
                                            class="price-discount__button-folding e-fold-discount-detail">
                                            <span>할인금액</span>
                                            <svg width="16" height="16" viewBox="0 0 16 16"
                                                xmlns="http://www.w3.org/2000/svg">
                                                <path fill="#abb0b5" fill-rule="evenodd" clip-rule="evenodd"
                                                    d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                                                </path>
                                            </svg>
                                        </button>

                                        <div class="cart-tmpl-number-unit ">
                                            <span class="cart-tmpl-number-unit__number">0</span>
                                            <span class="cart-tmpl-number-unit__unit">원</span>
                                        </div>

                                    </div>
                                    <div class="price-discount__detail">
                                        <dl>
                                            <div>
                                                <dt>- 즉시할인</dt>
                                                <dd>
                                                    <div class="cart-tmpl-number-unit price-discount__discount">
                                                        <span class="cart-tmpl-number-unit__number">0</span>
                                                        <span class="cart-tmpl-number-unit__unit">원</span>
                                                    </div>
                                                </dd>
                                            </div>
                                            <div>
                                                <dt>- 쿠폰할인</dt>
                                                <dd>
                                                    <div class="cart-tmpl-number-unit price-discount__coupon">
                                                        <span class="cart-tmpl-number-unit__number">0</span>
                                                        <span class="cart-tmpl-number-unit__unit">원</span>
                                                    </div>
                                                </dd>
                                            </div>
                                            <div>
                                                <dt>- 포인트사용</dt>
                                                <dd>
                                                    <div class="cart-tmpl-number-unit price-discount__point">
                                                        <span class="cart-tmpl-number-unit__number">0</span>
                                                        <span class="cart-tmpl-number-unit__unit">잎</span>
                                                    </div>
                                                </dd>
                                            </div>
                                        </dl>
                                    </div>
                                </div>

                                <div class="price-pay">
                                    <span>총 결제금액</span>

                                    <div class="cart-tmpl-number-unit ">
                                        <span class="cart-tmpl-number-unit__number">{{ currency(cartStore.course.price)
                                            }}</span>
                                        <span class="cart-tmpl-number-unit__unit">원</span>
                                    </div>

                                </div>

                                <button @click="order" type="button"
                                    class="btn btn-primary button-pay w-full e-payment">
                                    <span class="payment-button__text">결제하기</span>
                                    <span class="spinner-border spinner-border-sm payment-button__spinner" role="status"
                                        aria-hidden="true"></span>
                                </button>

                            </div>
                            <div class="terms-agreement">
                                <div>
                                    <label for="terms_agreement" class="terms-agreement__text-agreement">회원 본인은 주문내용을
                                        확인했으며, <span class="e-open-terms" type="button">구매조건 및 개인정보처리방침</span>과 결제에
                                        동의합니다.</label>
                                </div>
                            </div>
                        </div>

                        <div class="has-questions">
                            <button type="button" class="e-make-question">
                                <i class="far fa-comment-alt-dots"></i>
                                <span>문의 바로가기</span>
                            </button>
                        </div>

                        <footer class="bottom-fixed">
                            <div class="bottom-fixed__price">
                                <span class="bottom-fixed__price--origin visually-hidden">
                                    <span class="visually-hidden">정가</span>
                                    <span class="cart-tmpl-number-unit__number">{{ currency(cartStore.course.price)
                                        }}</span>원
                                </span>
                                <span class="bottom-fixed__price--discount">
                                    <span class="visually-hidden">결제금액</span>
                                    <strong class="bottom-fixed__pay-price cart-tmpl-number-unit__number">{{
                                            currency(cartStore.course.price) }}</strong>원
                                </span>
                            </div>

                            <button type="button" class="btn btn-primary button-pay w-full e-payment">


                                <span class="payment-button__text">결제하기</span>
                                <span class="spinner-border spinner-border-sm payment-button__spinner" role="status"
                                    aria-hidden="true"></span>

                            </button>

                        </footer>
                    </section>
                </aside>
            </div>
        </section>
    </main>
</template>

<script>
import { mapStores } from 'pinia'
import { useMemberStore } from '@/stores/useMemberStore';
import { useCartStore } from '@/stores/useCartStore';
import { jwtDecode } from "jwt-decode";
import VueCookies from 'vue-cookies';
import axios from "axios";

export default {
    name: 'CartPage',
    data() {
        return { member: { email: '', name: '' } }
    },
    computed: {
        ...mapStores(useMemberStore, useCartStore)
    },
    mounted() {
        let token = jwtDecode(VueCookies.get('token'));
        this.member.name = token.name;
        this.member.email = token.email;
        const script = document.createElement('script');
        script.src = 'https://cdn.iamport.kr/v1/iamport.js';
        script.async = true;

        document.head.appendChild(script);
    },
    methods: {
        currency(value) {
            return value.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",");
        },
        async order() {
            var today = new Date();
            var hours = today.getHours(); // 시
            var minutes = today.getMinutes();  // 분
            var seconds = today.getSeconds();  // 초
            var milliseconds = today.getMilliseconds();
            var makeMerchantUid = "" + hours + "" + minutes + "" + seconds + "" + milliseconds + "_" + this.member.email;
            var IMP = window.IMP;
            // -------------------------------------------------
            IMP.init("imp37768455");
            // -------------------------------------------------
            IMP.request_pay({
                pg: 'kakaopay.TC0ONETIME',
                pay_method: 'card',
                merchant_uid: "IMP_" + this.cartStore.course.id + "_" + makeMerchantUid,
                name: this.cartStore.course.name,
                amount: this.cartStore.course.price,
                buyer_email: this.member.email,
                buyer_name: this.member.name
            }, async function (rsp) { // callback
                if (rsp.success) {
                    const backend = "http://localhost:8080";
                    let response = await axios.get(backend + "/orders/validation", {
                        params: { impUid: rsp.imp_uid },
                        headers: {
                            Authorization: 'Bearer ' + VueCookies.get('token'),
                        },
                    });
                    console.log(response);
                    const data = response.data;
                    console.log(data);
                    if (data.isSuccess && data.code == 1000) {
                        alert('구매 완료!!');
                        window.location.href = "/course/" + data.result.courseId;
                    } else {
                        alert('구매가 취소되었습니다.');
                    }
                } else {
                    alert('구매가 취소되었습니다.');
                }
            });

        }
    }
}
</script>

<style scoped>
.space-inset-2 {
    padding: 4px
}

.space-inset-4 {
    padding: 8px
}

.space-inset-6 {
    padding: 12px
}

.space-inset-8 {
    padding: 16px
}

.space-inset-10 {
    padding: 20px
}

.space-inset-12 {
    padding: 24px
}

.space-inset-stretch-2 {
    padding: 4px 8px
}

.space-inset-stretch-4 {
    padding: 8px 12px
}

.space-inset-stretch-5 {
    padding: 10px 16px
}

.space-inset-stretch-6 {
    padding: 12px 16px
}

.space-inset-stretch-8,
.space-inset-stretch-12 {
    padding: 16px 24px
}

.space-inline-right-1 {
    padding-right: 2px
}

.space-inline-right-2 {
    padding-right: 4px
}

.space-inline-right-4 {
    padding-right: 8px
}

.space-inline-right-6 {
    padding-right: 12px
}

.space-inline-right-8 {
    padding-right: 16px
}

.space-inline-right-13 {
    padding-right: 36px
}

.space-inline-left-1 {
    padding-left: 2px
}

.space-inline-left-2 {
    padding-left: 4px
}

.space-inline-left-4 {
    padding-left: 8px
}

.space-inline-left-6 {
    padding-left: 12px
}

.space-inline-left-8 {
    padding-left: 8px
}

.space-inline-left-13 {
    padding-left: 36px
}

.space-stack-1 {
    margin-bottom: 2px
}

.space-stack-2 {
    margin-bottom: 4px
}

.space-stack-4 {
    margin-bottom: 8px
}

.space-stack-6 {
    margin-bottom: 12px
}

.space-stack-8 {
    margin-bottom: 16px
}

.space-stack-10 {
    margin-bottom: 20px
}

.space-stack-12 {
    margin-bottom: 24px
}

.space-stack-16 {
    margin-bottom: 32px
}

.space-stack-18 {
    margin-bottom: 36px
}

.space-stack-24 {
    margin-bottom: 48px
}

.space-stack-28 {
    margin-bottom: 56px
}

.space-stack-32 {
    margin-bottom: 64px
}

.space-stack-40 {
    margin-bottom: 80px
}

.container {
    flex-grow: 1;
    margin: 0 auto;
    position: relative;
    width: auto
}

.container.is-fluid {
    max-width: none;
    padding-left: 10px;
    padding-right: 10px;
    width: 100%
}

@media screen and (min-width:1200px) {
    .container {
        max-width: 1180px
    }
}

.button .icon {
    width: 1rem;
    height: 1rem
}

.button .icon:first-child:last-child {
    margin-left: unset;
    margin-right: unset
}

.button .icon:last-child:not(:first-child) {
    margin-left: .25rem;
    margin-right: unset
}

.button.is-brand {
    background: #00c471;
    color: #fff
}

.input {
    height: auto
}

.icon {
    box-sizing: content-box;
    font-size: inherit;
    width: 1rem;
    height: 1rem;
    line-height: 1
}

.icon.circle {
    border-radius: 50%
}

.box {
    background-color: #fff;
    border-radius: 4px;
    color: #333
}

.title {
    line-height: 1.5;
    color: #333
}

@media screen and (max-width:768px) {
    .title.is-2 {
        font-size: 1.5rem
    }

    .title.is-1 {
        font-size: 2rem
    }

    .title.is-4 {
        font-size: 1.25rem
    }

    .title.is-5 {
        font-size: 1.375rem
    }

    .title.is-6 {
        font-size: 1.125rem
    }

    .title.is-7 {
        font-size: 1rem
    }
}

.title.is-1 {
    line-height: 1.318
}

.title.is-2 {
    line-height: 1.33
}

.subtitle {
    line-height: 1.5;
    color: #333
}

.subtitle.is-1 {
    line-height: 1.318
}

.subtitle.is-2 {
    line-height: 1.33
}

.text.is-1 {
    font-size: 1rem
}

.text.is-2 {
    font-size: .9375rem
}

.text.is-3 {
    font-size: .875rem
}

.text.is-4 {
    font-size: .8125rem
}

.text.is-5 {
    font-size: .75rem
}

@media screen and (max-width:768px) {
    .text.is-1 {
        font-size: .9375rem
    }

    .text.is-3 {
        font-size: .875rem
    }

    .text.is-4 {
        font-size: .8125rem
    }

    .text.is-5 {
        font-size: .75rem
    }
}

.subtext.is-1 {
    font-size: 1rem
}

.subtext.is-2 {
    font-size: .9375rem
}

.subtext.is-3 {
    font-size: .875rem
}

.subtext.is-4 {
    font-size: .8125rem
}

.subtext.is-5 {
    font-size: .75rem
}

.content--no-list-style li+li {
    margin-top: unset
}

.content--no-list-style ul {
    list-style: none;
    margin-left: unset;
    margin-top: unset
}

.content--no-list-style ul ul {
    list-style-type: none;
    margin-top: unset
}

.content--no-list-style ul ul ul {
    list-style-type: none
}

.ac-fwb {
    font-weight: 700
}

.ac-fwm {
    font-weight: 500
}

.ac-fwr {
    font-weight: 400
}

.ac-fwl {
    font-weight: 300
}

.ac-display-30 {
    line-height: 1.2;
    font-size: 30px
}

.ac-display-30,
.ac-header-24 {
    font-weight: 700;
    letter-spacing: -.3px
}

.ac-header-24 {
    line-height: 1.25;
    font-size: 24px
}

.ac-header-22 {
    font-weight: 700;
    line-height: 1.45;
    letter-spacing: -.3px;
    font-size: 22px
}

.ac-header-20 {
    font-weight: 400;
    line-height: 1.4;
    letter-spacing: -.3px;
    font-size: 20px
}

.ac-header-20.ac-fwb {
    font-weight: 700
}

.ac-header-20.ac-fwm {
    font-weight: 500
}

.ac-body-16,
.ac-header-20.ac-fwr {
    font-weight: 400
}

.ac-body-16 {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px
}

.ac-body-16.ac-fwb {
    font-weight: 700
}

.ac-body-16.ac-fwm {
    font-weight: 500
}

.ac-body-15,
.ac-body-16.ac-fwr {
    font-weight: 400
}

.ac-body-15 {
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px
}

.ac-body-15.ac-fwb {
    font-weight: 700
}

.ac-body-15.ac-fwm {
    font-weight: 500
}

.ac-body-14,
.ac-body-15.ac-fwr {
    font-weight: 400
}

.ac-body-14 {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px
}

.ac-body-14.ac-fwb {
    font-weight: 700
}

.ac-body-14.ac-fwm {
    font-weight: 500
}

.ac-body-14.ac-fwr,
.ac-small-13 {
    font-weight: 400
}

.ac-small-13 {
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px
}

.ac-small-13.ac-fwb {
    font-weight: 700
}

.ac-small-13.ac-fwm {
    font-weight: 500
}

.ac-small-12,
.ac-small-13.ac-fwr {
    font-weight: 400
}

.ac-small-12 {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px
}

.ac-small-12.ac-fwb {
    font-weight: 700
}

.ac-small-12.ac-fwm {
    font-weight: 500
}

.ac-caption,
.ac-small-12.ac-fwr {
    font-weight: 400
}

.ac-caption {
    line-height: 1.45;
    letter-spacing: -.3px;
    font-size: 11px
}

.ellipsis {
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-line-clamp: 1;
    -webkit-box-orient: vertical;
    white-space: nowrap
}

.ac-container {
    margin: 0 auto;
    padding: 0 20px;
    max-width: 1200px
}

.ac-container,
.ac-r {
    box-sizing: border-box
}

.ac-r {
    display: flex;
    flex: 0 1 auto;
    flex-direction: row;
    flex-wrap: wrap;
    margin: 0 -8px
}

.ac-r.reverse {
    flex-direction: row-reverse
}

.ac-cd,
.ac-cd-1,
.ac-cd-2,
.ac-cd-3,
.ac-cd-4,
.ac-cd-5,
.ac-cd-6,
.ac-cd-7,
.ac-cd-8,
.ac-cd-9,
.ac-cd-10,
.ac-cd-11,
.ac-cd-12,
.ac-cd-offset-0,
.ac-cd-offset-1,
.ac-cd-offset-2,
.ac-cd-offset-3,
.ac-cd-offset-4,
.ac-cd-offset-5,
.ac-cd-offset-6,
.ac-cd-offset-7,
.ac-cd-offset-8,
.ac-cd-offset-9,
.ac-cd-offset-10,
.ac-cd-offset-11,
.ac-cd-offset-12 {
    box-sizing: border-box;
    flex: 0 0 auto;
    padding-left: 8px;
    padding-right: 8px
}

.ac-cd {
    flex-grow: 1;
    flex-basis: 0;
    max-width: 100%
}

.ac-cd-1 {
    flex-basis: 8.33333333%;
    max-width: 8.33333333%
}

.ac-cd-2 {
    flex-basis: 16.66666667%;
    max-width: 16.66666667%
}

.ac-cd-3 {
    flex-basis: 25%;
    max-width: 25%
}

.ac-cd-4 {
    flex-basis: 33.33333333%;
    max-width: 33.33333333%
}

.ac-cd-5 {
    flex-basis: 41.66666667%;
    max-width: 41.66666667%
}

.ac-cd-6 {
    flex-basis: 50%;
    max-width: 50%
}

.ac-cd-7 {
    flex-basis: 58.33333333%;
    max-width: 58.33333333%
}

.ac-cd-8 {
    flex-basis: 66.66666667%;
    max-width: 66.66666667%
}

.ac-cd-9 {
    flex-basis: 75%;
    max-width: 75%
}

.ac-cd-10 {
    flex-basis: 83.33333333%;
    max-width: 83.33333333%
}

.ac-cd-11 {
    flex-basis: 91.66666667%;
    max-width: 91.66666667%
}

.ac-cd-12 {
    flex-basis: 100%;
    max-width: 100%
}

.ac-cd-offset-auto {
    margin-left: auto;
    margin-right: auto
}

.ac-cd-offset-0 {
    margin-left: 0
}

.ac-cd-offset-1 {
    margin-left: 8.33333333%
}

.ac-cd-offset-2 {
    margin-left: 16.6666666%
}

.ac-cd-offset-3 {
    margin-left: 25%
}

.ac-cd-offset-4 {
    margin-left: 33.33333333%
}

.ac-cd-offset-5 {
    margin-left: 41.66666667%
}

.ac-cd-offset-6 {
    margin-left: 50%
}

.ac-cd-offset-7 {
    margin-left: 58.33333333%
}

.ac-cd-offset-8 {
    margin-left: 66.66666667%
}

.ac-cd-offset-9 {
    margin-left: 75%
}

.ac-cd-offset-10 {
    margin-left: 83.33333333%
}

.ac-cd-offset-11 {
    margin-left: 91.66666667%
}

.start-cd {
    justify-content: flex-start;
    text-align: start
}

.center-cd {
    justify-content: center;
    text-align: center
}

.end-cd {
    justify-content: flex-end;
    text-align: end
}

.top-cd {
    align-items: flex-start
}

.middle-cd {
    align-items: center
}

.bottom-cd {
    align-items: flex-end
}

.around-cd {
    justify-content: space-around
}

.between-cd {
    justify-content: space-between
}

@media screen and (max-width:1024px) {
    .ac-container {
        padding: 0 24px;
        max-width: 1024px
    }

    .ac-ct,
    .ac-ct-1,
    .ac-ct-2,
    .ac-ct-3,
    .ac-ct-4,
    .ac-ct-5,
    .ac-ct-6,
    .ac-ct-7,
    .ac-ct-8,
    .ac-ct-9,
    .ac-ct-10,
    .ac-ct-11,
    .ac-ct-12,
    .ac-ct-offset-0,
    .ac-ct-offset-1,
    .ac-ct-offset-2,
    .ac-ct-offset-3,
    .ac-ct-offset-4,
    .ac-ct-offset-5,
    .ac-ct-offset-6,
    .ac-ct-offset-7,
    .ac-ct-offset-8,
    .ac-ct-offset-9,
    .ac-ct-offset-10,
    .ac-ct-offset-11,
    .ac-ct-offset-12,
    .ac-ct-unit,
    .ac-ct-unit-1,
    .ac-ct-unit-2,
    .ac-ct-unit-3,
    .ac-ct-unit-4,
    .ac-ct-unit-5,
    .ac-ct-unit-6,
    .ac-ct-unit-7,
    .ac-ct-unit-8,
    .ac-ct-unit-offset-0,
    .ac-ct-unit-offset-1,
    .ac-ct-unit-offset-2,
    .ac-ct-unit-offset-3,
    .ac-ct-unit-offset-4,
    .ac-ct-unit-offset-5,
    .ac-ct-unit-offset-6,
    .ac-ct-unit-offset-7 {
        box-sizing: border-box;
        flex: 0 0 auto;
        padding-left: 8px;
        padding-right: 8px
    }

    .ac-ct {
        flex-grow: 1;
        flex-basis: 0;
        max-width: 100%
    }

    .ac-ct-1 {
        flex-basis: 8.33333333%;
        max-width: 8.33333333%
    }

    .ac-ct-2 {
        flex-basis: 16.66666667%;
        max-width: 16.66666667%
    }

    .ac-ct-3 {
        flex-basis: 25%;
        max-width: 25%
    }

    .ac-ct-4 {
        flex-basis: 33.33333333%;
        max-width: 33.33333333%
    }

    .ac-ct-5 {
        flex-basis: 41.66666667%;
        max-width: 41.66666667%
    }

    .ac-ct-6 {
        flex-basis: 50%;
        max-width: 50%
    }

    .ac-ct-7 {
        flex-basis: 58.33333333%;
        max-width: 58.33333333%
    }

    .ac-ct-8 {
        flex-basis: 66.66666667%;
        max-width: 66.66666667%
    }

    .ac-ct-9 {
        flex-basis: 75%;
        max-width: 75%
    }

    .ac-ct-10 {
        flex-basis: 83.33333333%;
        max-width: 83.33333333%
    }

    .ac-ct-11 {
        flex-basis: 91.66666667%;
        max-width: 91.66666667%
    }

    .ac-ct-12 {
        flex-basis: 100%;
        max-width: 100%
    }

    .ac-ct-offset-auto {
        margin-left: auto;
        margin-right: auto
    }

    .ac-ct-offset-0 {
        margin-left: 0
    }

    .ac-ct-offset-1 {
        margin-left: 8.33333333%
    }

    .ac-ct-offset-2 {
        margin-left: 16.6666666%
    }

    .ac-ct-offset-3 {
        margin-left: 25%
    }

    .ac-ct-offset-4 {
        margin-left: 33.33333333%
    }

    .ac-ct-offset-5 {
        margin-left: 41.66666667%
    }

    .ac-ct-offset-6 {
        margin-left: 50%
    }

    .ac-ct-offset-7 {
        margin-left: 58.33333333%
    }

    .ac-ct-offset-8 {
        margin-left: 66.66666667%
    }

    .ac-ct-offset-9 {
        margin-left: 75%
    }

    .ac-ct-offset-10 {
        margin-left: 83.33333333%
    }

    .ac-ct-offset-11 {
        margin-left: 91.66666667%
    }

    .ac-ct-unit {
        flex-grow: 1;
        flex-basis: 0;
        max-width: 100%
    }

    .ac-ct-unit-1 {
        flex-basis: 12.5%;
        max-width: 12.5%
    }

    .ac-ct-unit-2 {
        flex-basis: 25%;
        max-width: 25%
    }

    .ac-ct-unit-3 {
        flex-basis: 37.5%;
        max-width: 37.5%
    }

    .ac-ct-unit-4 {
        flex-basis: 50%;
        max-width: 50%
    }

    .ac-ct-unit-5 {
        flex-basis: 62.5%;
        max-width: 62.5%
    }

    .ac-ct-unit-6 {
        flex-basis: 75%;
        max-width: 75%
    }

    .ac-ct-unit-7 {
        flex-basis: 87.5%;
        max-width: 87.5%
    }

    .ac-ct-unit-8 {
        flex-basis: 100%;
        max-width: 100%
    }

    .ac-ct-unit-offset-auto {
        margin-left: auto;
        margin-right: auto
    }

    .ac-ct-unit-offset-0 {
        margin-left: 0
    }

    .ac-ct-unit-offset-1 {
        margin-left: 12.5%
    }

    .ac-ct-unit-offset-2 {
        margin-left: 25%
    }

    .ac-ct-unit-offset-3 {
        margin-left: 37.5%
    }

    .ac-ct-unit-offset-4 {
        margin-left: 50%
    }

    .ac-ct-unit-offset-5 {
        margin-left: 62.5%
    }

    .ac-ct-unit-offset-6 {
        margin-left: 75%
    }

    .ac-ct-unit-offset-7 {
        margin-left: 82.5%
    }

    .start-ct {
        text-align: start
    }

    .center-ct,
    .start-ct {
        justify-content: flex-start
    }

    .center-ct {
        text-align: center
    }

    .end-ct {
        justify-content: flex-end;
        text-align: end
    }

    .top-ct {
        align-items: flex-start
    }

    .middle-ct {
        align-items: center
    }

    .bottom-ct {
        align-items: flex-end
    }

    .around-ct {
        justify-content: space-around
    }

    .between-ct {
        justify-content: space-between
    }
}

@media screen and (max-width:768px) {
    .ac-container {
        padding: 0 24px;
        max-width: 768px
    }

    .ac-cm,
    .ac-cm-1,
    .ac-cm-2,
    .ac-cm-3,
    .ac-cm-4,
    .ac-cm-5,
    .ac-cm-6,
    .ac-cm-7,
    .ac-cm-8,
    .ac-cm-9,
    .ac-cm-10,
    .ac-cm-11,
    .ac-cm-12,
    .ac-cm-offset-0,
    .ac-cm-offset-1,
    .ac-cm-offset-2,
    .ac-cm-offset-3,
    .ac-cm-offset-4,
    .ac-cm-offset-5,
    .ac-cm-offset-6,
    .ac-cm-offset-7,
    .ac-cm-offset-8,
    .ac-cm-offset-9,
    .ac-cm-offset-10,
    .ac-cm-offset-11,
    .ac-cm-offset-12 {
        box-sizing: border-box;
        flex: 0 0 auto;
        padding-left: 8px;
        padding-right: 8px
    }

    .ac-cm {
        flex-grow: 1;
        flex-basis: 0;
        max-width: 100%
    }

    .ac-cm-1 {
        flex-basis: 8.33333333%;
        max-width: 8.33333333%
    }

    .ac-cm-2 {
        flex-basis: 16.66666667%;
        max-width: 16.66666667%
    }

    .ac-cm-3 {
        flex-basis: 25%;
        max-width: 25%
    }

    .ac-cm-4 {
        flex-basis: 33.33333333%;
        max-width: 33.33333333%
    }

    .ac-cm-5 {
        flex-basis: 41.66666667%;
        max-width: 41.66666667%
    }

    .ac-cm-6 {
        flex-basis: 50%;
        max-width: 50%
    }

    .ac-cm-7 {
        flex-basis: 58.33333333%;
        max-width: 58.33333333%
    }

    .ac-cm-8 {
        flex-basis: 66.66666667%;
        max-width: 66.66666667%
    }

    .ac-cm-9 {
        flex-basis: 75%;
        max-width: 75%
    }

    .ac-cm-10 {
        flex-basis: 83.33333333%;
        max-width: 83.33333333%
    }

    .ac-cm-11 {
        flex-basis: 91.66666667%;
        max-width: 91.66666667%
    }

    .ac-cm-12 {
        flex-basis: 100%;
        max-width: 100%
    }

    .ac-cm-offset-auto {
        margin-left: auto;
        margin-right: auto
    }

    .ac-cm-offset-0 {
        margin-left: 0
    }

    .ac-cm-offset-1 {
        margin-left: 8.33333333%
    }

    .ac-cm-offset-2 {
        margin-left: 16.6666666%
    }

    .ac-cm-offset-3 {
        margin-left: 25%
    }

    .ac-cm-offset-4 {
        margin-left: 33.33333333%
    }

    .ac-cm-offset-5 {
        margin-left: 41.66666667%
    }

    .ac-cm-offset-6 {
        margin-left: 50%
    }

    .ac-cm-offset-7 {
        margin-left: 58.33333333%
    }

    .ac-cm-offset-8 {
        margin-left: 66.66666667%
    }

    .ac-cm-offset-9 {
        margin-left: 75%
    }

    .ac-cm-offset-10 {
        margin-left: 83.33333333%
    }

    .ac-cm-offset-11 {
        margin-left: 91.66666667%
    }

    .ac-cm-unit {
        flex-grow: 1;
        flex-basis: 0;
        max-width: 100%
    }

    .ac-cm-unit-1 {
        flex-basis: 25%;
        max-width: 25%
    }

    .ac-cm-unit-2 {
        flex-basis: 50%;
        max-width: 50%
    }

    .ac-cm-unit-3 {
        flex-basis: 75%;
        max-width: 75%
    }

    .ac-cm-unit-4 {
        flex-basis: 100%;
        max-width: 100%
    }

    .ac-cm-unit-offset-auto {
        margin-left: auto;
        margin-right: auto
    }

    .ac-cm-unit-offset-0 {
        margin-left: 0
    }

    .ac-cm-unit-offset-1 {
        margin-left: 25%
    }

    .ac-cm-unit-offset-2 {
        margin-left: 50%
    }

    .ac-cm-unit-offset-3 {
        margin-left: 75%
    }

    .start-cm {
        text-align: start
    }

    .center-cm,
    .start-cm {
        justify-content: flex-start
    }

    .center-cm {
        text-align: center
    }

    .end-cm {
        justify-content: flex-end;
        text-align: end
    }

    .top-cm {
        align-items: flex-start
    }

    .middle-cm {
        align-items: center
    }

    .bottom-cm {
        align-items: flex-end
    }

    .around-cm {
        justify-content: space-around
    }

    .between-cm {
        justify-content: space-between
    }
}

.infd-columns {
    display: flex
}

.infd-columns .infd-column.is-12 {
    width: 100%
}

.infd-columns .infd-column.is-8 {
    width: 66.667%;
    flex: 0 0 auto
}

.infd-columns .infd-column.is-4 {
    width: 33.333%;
    flex: 0 0 auto
}

.infd-icon {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    transition: background-color .15s ease
}

.infd-icon.circle {
    border-radius: 9999px
}

.infd-icon path {
    transition: background-color .15s ease
}

.infd-icon.mr-4 {
    margin-right: 4px
}

.infd-icon.mr-6 {
    margin-right: 6px
}

.infd-icon.mr-8 {
    margin-right: 8px
}

.infd-icon.ml-4 {
    margin-left: 4px
}

.infd-icon.ml-6 {
    margin-left: 6px
}

.infd-icon.ml-8 {
    margin-left: 8px
}

.visually-hidden {
    position: absolute;
    overflow: hidden;
    width: 1px;
    height: 1px;
    clip: rect(1px, 1px, 1px, 1px);
    white-space: nowrap
}

.infd-modal-cover {
    display: flex !important
}

.infd-modal {
    position: absolute;
    border-radius: 4px;
    background-color: #fff;
    padding: 16px
}

.infd-modal .infd-modal-header {
    display: flex;
    align-items: center;
    margin-bottom: 24px
}

.infd-modal .infd-modal-header .modal-title {
    font-size: 16px;
    font-weight: 700;
    color: #212529
}

.infd-modal .infd-modal-header .infd-icon {
    margin-left: auto;
    width: 20px;
    height: 20px;
    cursor: pointer
}

.infd-modal .infd-modal-bottom {
    display: flex;
    align-items: center;
    justify-content: flex-end
}

.infd-modal .infd-modal-bottom .infd-button+.infd-button {
    margin-left: 12px
}

.infd-modal .infd-modal-bottom.center {
    justify-content: center
}

.infd-modal .infd-modal-bottom.right {
    justify-content: flex-start
}

.infd-modal .infd-modal-bottom.stretch .infd-button {
    flex: 1
}

.small-modal {
    padding: 38px 64px;
    width: calc(100% - 40px);
    max-width: 416px;
    min-width: 320px
}

.small-modal .small-modal-content {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin-bottom: 28px
}

.small-modal .small-modal-content .title {
    font-size: 22px;
    font-weight: 500;
    margin-bottom: 6px;
    color: #212529;
    word-break: keep-all;
    text-align: center
}

.small-modal .small-modal-content .description {
    font-size: 16px;
    color: #343a40;
    text-align: center;
    word-break: break-word
}

.small-modal .small-modal-content .caption {
    margin-top: 6px;
    color: #007644;
    line-height: 1.43;
    font-size: 14px;
    text-align: center;
    word-break: keep-all
}

.small-modal .small-modal-content .infd-icon {
    width: 56px;
    height: 56px;
    margin-bottom: 20px
}

.middle-modal {
    padding: 44px 70px;
    width: calc(100% - 40px);
    max-width: 480px;
    min-width: 320px
}

.middle-modal .middle-modal-content {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin-bottom: 28px
}

.middle-modal .middle-modal-content .title {
    font-size: 22px;
    font-weight: 500;
    margin-bottom: 6px;
    color: #212529;
    word-break: keep-all;
    text-align: center
}

.middle-modal .middle-modal-content .description {
    font-size: 16px;
    color: #343a40;
    text-align: center;
    word-break: break-word
}

.middle-modal .middle-modal-content .caption {
    margin-top: 6px;
    color: #007644;
    line-height: 1.43;
    font-size: 14px;
    text-align: center;
    word-break: keep-all
}

.middle-modal .middle-modal-content .infd-icon {
    width: 56px;
    height: 52px;
    margin-bottom: 20px
}

.ac-modal {
    position: relative;
    display: flex;
    flex-direction: column;
    padding: 28px;
    min-width: min(390px, calc(100% - 36px));
    max-width: 390px;
    min-height: 250px;
    max-height: 90%;
    background-color: #fff;
    border-radius: 4px
}

.ac-modal__title {
    flex-shrink: 0;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-start;
    margin-bottom: 16px
}

.ac-modal__title>h1 {
    color: #343a40;
    font-size: 18px;
    font-weight: 700;
    line-height: 1.39;
    letter-spacing: -.3px;
    word-break: break-all
}

.ac-modal__title>button {
    display: flex;
    flex-shrink: 0;
    align-content: center;
    justify-content: center;
    align-items: center;
    margin-left: 5px;
    width: 24px;
    height: 24px;
    color: #adb5bd;
    border: 0;
    background: none;
    cursor: pointer
}

.ac-modal__title>button>svg {
    min-width: 24px
}

.ac-modal__description {
    flex: 1 1 auto;
    overflow-x: hidden;
    overflow-y: auto;
    padding-bottom: 24px;
    width: 100%;
    height: 100%;
    color: #616568;
    white-space: pre-wrap;
    word-break: break-word;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px
}

.ac-modal__description.ac-fwb {
    font-weight: 700
}

.ac-modal__description.ac-fwm {
    font-weight: 500
}

.ac-modal__description.ac-fwr {
    font-weight: 400
}

.ac-modal__description:empty {
    display: none
}

.ac-modal__caption {
    color: #dee2e6;
    flex-shrink: 0;
    font-size: 14px;
    color: #868e96;
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px
}

.ac-modal__caption.ac-fwb {
    font-weight: 700
}

.ac-modal__caption.ac-fwm {
    font-weight: 500
}

.ac-modal__caption.ac-fwr {
    font-weight: 400
}

.ac-modal__caption:empty {
    display: none
}

.ac-modal__label {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700
}

.ac-modal__label.ac-fwb {
    font-weight: 700
}

.ac-modal__label.ac-fwm {
    font-weight: 500
}

.ac-modal__label.ac-fwr {
    font-weight: 400
}

.ac-modal__input {
    margin-top: 8px;
    flex-shrink: 0;
    width: 100%
}

.ac-modal__input-error {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    color: #e50000;
    height: 18px;
    padding-top: 4px
}

.ac-modal__input-error.ac-fwb {
    font-weight: 700
}

.ac-modal__input-error.ac-fwm {
    font-weight: 500
}

.ac-modal__input-error.ac-fwr {
    font-weight: 400
}

.ac-modal__buttons {
    flex-shrink: 0;
    display: flex;
    flex-wrap: wrap;
    margin-bottom: -8px;
    padding-top: 24px
}

.ac-modal__buttons>button {
    margin-bottom: 8px
}

.ac-modal__buttons.ac-modal__buttons--no-padding {
    margin-top: 10px;
    padding-top: 0
}

.ac-modal__buttons.ac-modal__buttons--confirm {
    justify-content: flex-end
}

.ac-modal__buttons.ac-modal__buttons--emphasis {
    flex-direction: column;
    align-items: center
}

.ac-modal__buttons.ac-modal__buttons--emphasis>button {
    margin-bottom: 0
}

.ac-modal__buttons.ac-modal__buttons--emphasis>button:nth-child(n+2) {
    margin-top: 12px;
    font-size: 13px;
    font-weight: 500;
    line-height: 1.38;
    letter-spacing: -.3px;
    text-decoration: underline;
    text-align: center;
    color: #868e96
}

.ac-modal__buttons .ac-modal__button--block {
    margin: 0;
    width: 100%
}

.ac-modal__button-confirm-alert {
    width: 100%
}

.ac-modal__button-confirm {
    margin-left: 8px
}

.ac-modal__button-main {
    width: 100%
}

.agree-required-modal,
.buyer-form-guide-modal,
.coupon-guide-modal,
.force-refresh-modal,
.payment-fail-modal,
.payment-method-modal,
.point-guide-modal {
    min-width: min(400px, calc(100% - 48px));
    max-width: 400px;
    min-height: unset
}

.agree-required-modal .ac-modal__title,
.buyer-form-guide-modal .ac-modal__title,
.coupon-guide-modal .ac-modal__title,
.force-refresh-modal .ac-modal__title,
.payment-fail-modal .ac-modal__title,
.payment-method-modal .ac-modal__title,
.point-guide-modal .ac-modal__title {
    margin-bottom: 20px
}

.agree-required-modal,
.buyer-form-guide-modal,
.force-refresh-modal {
    margin-bottom: 16px
}

.agree-required-modal .ac-modal__buttons,
.buyer-form-guide-modal .ac-modal__buttons,
.coupon-guide-modal .ac-modal__buttons,
.force-refresh-modal .ac-modal__buttons,
.payment-fail-modal .ac-modal__buttons,
.payment-method-modal .ac-modal__buttons,
.point-guide-modal .ac-modal__buttons {
    position: absolute;
    bottom: 0;
    width: 100%;
    margin-bottom: 0;
    padding: 0 28px 28px;
    box-shadow: 0 -12px 16px 0 #fff
}

@media screen and (max-width:768px) {

    .agree-required-modal .ac-modal__buttons,
    .buyer-form-guide-modal .ac-modal__buttons,
    .coupon-guide-modal .ac-modal__buttons,
    .force-refresh-modal .ac-modal__buttons,
    .payment-fail-modal .ac-modal__buttons,
    .payment-method-modal .ac-modal__buttons,
    .point-guide-modal .ac-modal__buttons {
        padding: 0 20px 20px
    }
}

.agree-required-modal .coupon-guide-modal__header,
.agree-required-modal .point-guide-modal__header,
.buyer-form-guide-modal .coupon-guide-modal__header,
.buyer-form-guide-modal .point-guide-modal__header,
.coupon-guide-modal .coupon-guide-modal__header,
.coupon-guide-modal .point-guide-modal__header,
.force-refresh-modal .coupon-guide-modal__header,
.force-refresh-modal .point-guide-modal__header,
.payment-fail-modal .coupon-guide-modal__header,
.payment-fail-modal .point-guide-modal__header,
.payment-method-modal .coupon-guide-modal__header,
.payment-method-modal .point-guide-modal__header,
.point-guide-modal .coupon-guide-modal__header,
.point-guide-modal .point-guide-modal__header {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 700;
    padding: 20px 0 4px;
    color: #1b1c1d
}

.agree-required-modal .coupon-guide-modal__header.ac-fwb,
.agree-required-modal .point-guide-modal__header.ac-fwb,
.buyer-form-guide-modal .coupon-guide-modal__header.ac-fwb,
.buyer-form-guide-modal .point-guide-modal__header.ac-fwb,
.coupon-guide-modal .coupon-guide-modal__header.ac-fwb,
.coupon-guide-modal .point-guide-modal__header.ac-fwb,
.force-refresh-modal .coupon-guide-modal__header.ac-fwb,
.force-refresh-modal .point-guide-modal__header.ac-fwb,
.payment-fail-modal .coupon-guide-modal__header.ac-fwb,
.payment-fail-modal .point-guide-modal__header.ac-fwb,
.payment-method-modal .coupon-guide-modal__header.ac-fwb,
.payment-method-modal .point-guide-modal__header.ac-fwb,
.point-guide-modal .coupon-guide-modal__header.ac-fwb,
.point-guide-modal .point-guide-modal__header.ac-fwb {
    font-weight: 700
}

.agree-required-modal .coupon-guide-modal__header.ac-fwm,
.agree-required-modal .point-guide-modal__header.ac-fwm,
.buyer-form-guide-modal .coupon-guide-modal__header.ac-fwm,
.buyer-form-guide-modal .point-guide-modal__header.ac-fwm,
.coupon-guide-modal .coupon-guide-modal__header.ac-fwm,
.coupon-guide-modal .point-guide-modal__header.ac-fwm,
.force-refresh-modal .coupon-guide-modal__header.ac-fwm,
.force-refresh-modal .point-guide-modal__header.ac-fwm,
.payment-fail-modal .coupon-guide-modal__header.ac-fwm,
.payment-fail-modal .point-guide-modal__header.ac-fwm,
.payment-method-modal .coupon-guide-modal__header.ac-fwm,
.payment-method-modal .point-guide-modal__header.ac-fwm,
.point-guide-modal .coupon-guide-modal__header.ac-fwm,
.point-guide-modal .point-guide-modal__header.ac-fwm {
    font-weight: 500
}

.agree-required-modal .coupon-guide-modal__header.ac-fwr,
.agree-required-modal .point-guide-modal__header.ac-fwr,
.buyer-form-guide-modal .coupon-guide-modal__header.ac-fwr,
.buyer-form-guide-modal .point-guide-modal__header.ac-fwr,
.coupon-guide-modal .coupon-guide-modal__header.ac-fwr,
.coupon-guide-modal .point-guide-modal__header.ac-fwr,
.force-refresh-modal .coupon-guide-modal__header.ac-fwr,
.force-refresh-modal .point-guide-modal__header.ac-fwr,
.payment-fail-modal .coupon-guide-modal__header.ac-fwr,
.payment-fail-modal .point-guide-modal__header.ac-fwr,
.payment-method-modal .coupon-guide-modal__header.ac-fwr,
.payment-method-modal .point-guide-modal__header.ac-fwr,
.point-guide-modal .coupon-guide-modal__header.ac-fwr,
.point-guide-modal .point-guide-modal__header.ac-fwr {
    font-weight: 400
}

.agree-required-modal .coupon-guide-modal__header+p,
.agree-required-modal .point-guide-modal__header+p,
.buyer-form-guide-modal .coupon-guide-modal__header+p,
.buyer-form-guide-modal .point-guide-modal__header+p,
.coupon-guide-modal .coupon-guide-modal__header+p,
.coupon-guide-modal .point-guide-modal__header+p,
.force-refresh-modal .coupon-guide-modal__header+p,
.force-refresh-modal .point-guide-modal__header+p,
.payment-fail-modal .coupon-guide-modal__header+p,
.payment-fail-modal .point-guide-modal__header+p,
.payment-method-modal .coupon-guide-modal__header+p,
.payment-method-modal .point-guide-modal__header+p,
.point-guide-modal .coupon-guide-modal__header+p,
.point-guide-modal .point-guide-modal__header+p {
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 400;
    color: #3e4042
}

.agree-required-modal .coupon-guide-modal__header+p.ac-fwb,
.agree-required-modal .point-guide-modal__header+p.ac-fwb,
.buyer-form-guide-modal .coupon-guide-modal__header+p.ac-fwb,
.buyer-form-guide-modal .point-guide-modal__header+p.ac-fwb,
.coupon-guide-modal .coupon-guide-modal__header+p.ac-fwb,
.coupon-guide-modal .point-guide-modal__header+p.ac-fwb,
.force-refresh-modal .coupon-guide-modal__header+p.ac-fwb,
.force-refresh-modal .point-guide-modal__header+p.ac-fwb,
.payment-fail-modal .coupon-guide-modal__header+p.ac-fwb,
.payment-fail-modal .point-guide-modal__header+p.ac-fwb,
.payment-method-modal .coupon-guide-modal__header+p.ac-fwb,
.payment-method-modal .point-guide-modal__header+p.ac-fwb,
.point-guide-modal .coupon-guide-modal__header+p.ac-fwb,
.point-guide-modal .point-guide-modal__header+p.ac-fwb {
    font-weight: 700
}

.agree-required-modal .coupon-guide-modal__header+p.ac-fwm,
.agree-required-modal .point-guide-modal__header+p.ac-fwm,
.buyer-form-guide-modal .coupon-guide-modal__header+p.ac-fwm,
.buyer-form-guide-modal .point-guide-modal__header+p.ac-fwm,
.coupon-guide-modal .coupon-guide-modal__header+p.ac-fwm,
.coupon-guide-modal .point-guide-modal__header+p.ac-fwm,
.force-refresh-modal .coupon-guide-modal__header+p.ac-fwm,
.force-refresh-modal .point-guide-modal__header+p.ac-fwm,
.payment-fail-modal .coupon-guide-modal__header+p.ac-fwm,
.payment-fail-modal .point-guide-modal__header+p.ac-fwm,
.payment-method-modal .coupon-guide-modal__header+p.ac-fwm,
.payment-method-modal .point-guide-modal__header+p.ac-fwm,
.point-guide-modal .coupon-guide-modal__header+p.ac-fwm,
.point-guide-modal .point-guide-modal__header+p.ac-fwm {
    font-weight: 500
}

.agree-required-modal .coupon-guide-modal__header+p.ac-fwr,
.agree-required-modal .point-guide-modal__header+p.ac-fwr,
.buyer-form-guide-modal .coupon-guide-modal__header+p.ac-fwr,
.buyer-form-guide-modal .point-guide-modal__header+p.ac-fwr,
.coupon-guide-modal .coupon-guide-modal__header+p.ac-fwr,
.coupon-guide-modal .point-guide-modal__header+p.ac-fwr,
.force-refresh-modal .coupon-guide-modal__header+p.ac-fwr,
.force-refresh-modal .point-guide-modal__header+p.ac-fwr,
.payment-fail-modal .coupon-guide-modal__header+p.ac-fwr,
.payment-fail-modal .point-guide-modal__header+p.ac-fwr,
.payment-method-modal .coupon-guide-modal__header+p.ac-fwr,
.payment-method-modal .point-guide-modal__header+p.ac-fwr,
.point-guide-modal .coupon-guide-modal__header+p.ac-fwr,
.point-guide-modal .point-guide-modal__header+p.ac-fwr {
    font-weight: 400
}

.agree-required-modal li:first-child h2,
.buyer-form-guide-modal li:first-child h2,
.coupon-guide-modal li:first-child h2,
.force-refresh-modal li:first-child h2,
.payment-fail-modal li:first-child h2,
.payment-method-modal li:first-child h2,
.point-guide-modal li:first-child h2 {
    padding-top: 0
}

.agree-required-modal,
.buyer-form-guide-modal,
.coupon-guide-modal,
.force-refresh-modal,
.payment-fail-modal,
.payment-method-modal,
.point-guide-modal,
.terms-modal {
    max-height: calc(100vh - 240px);
    display: grid;
    position: relative;
    grid-template-rows: auto minmax(0, -webkit-max-content) minmax(0, -webkit-max-content) 48px;
    grid-template-rows: auto minmax(0, max-content) minmax(0, max-content) 48px;
    padding: 28px
}

@media screen and (max-width:768px) {

    .agree-required-modal,
    .buyer-form-guide-modal,
    .coupon-guide-modal,
    .force-refresh-modal,
    .payment-fail-modal,
    .payment-method-modal,
    .point-guide-modal,
    .terms-modal {
        padding: 20px;
        max-height: calc(100vh - 80px);
        max-width: min(400px, calc(100% - 40px))
    }
}

.agree-required-modal .ac-modal__caption,
.buyer-form-guide-modal .ac-modal__caption,
.coupon-guide-modal .ac-modal__caption,
.force-refresh-modal .ac-modal__caption,
.payment-fail-modal .ac-modal__caption,
.payment-method-modal .ac-modal__caption,
.point-guide-modal .ac-modal__caption,
.terms-modal .ac-modal__caption {
    overflow: auto;
    height: 100%;
    padding-bottom: 20px
}

.agree-required-modal,
.buyer-form-guide-modal,
.force-refresh-modal,
.payment-fail-modal,
.terms-modal {
    overflow: hidden
}

.coupon-guide-modal,
.payment-method-modal,
.point-guide-modal {
    overflow: auto
}

.terms-modal {
    max-width: min(600px, calc(100% - 56px));
    grid-template-rows: auto minmax(0, -webkit-max-content) minmax(0, -webkit-max-content);
    grid-template-rows: auto minmax(0, max-content) minmax(0, max-content)
}

.terms-modal .ac-modal__caption {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    max-height: 100%;
    color: #1b1c1d
}

.terms-modal .ac-modal__caption.ac-fwb {
    font-weight: 700
}

.terms-modal .ac-modal__caption.ac-fwm {
    font-weight: 500
}

.terms-modal .ac-modal__caption.ac-fwr {
    font-weight: 400
}

.buyer-form-guide-modal .force-refresh-modal .ac-modal__description,
.payment-fail-modal .ac-modal__description {
    padding-bottom: 20px
}

.point-guide-modal .point-guide-modal__header .point-guide-modal__point-number {
    padding-left: 4px;
    color: #00c471
}

@media screen and (max-width:768px) {

    .coupon-guide-modal,
    .point-guide-modal,
    .terms-modal {
        margin: 40px 0
    }
}

.payment-method-modal:not(.payment-method-modal--life-edu) {
    grid-template-rows: auto minmax(0, -webkit-max-content) minmax(0, -webkit-max-content);
    grid-template-rows: auto minmax(0, max-content) minmax(0, max-content)
}

.payment-method-modal:not(.payment-method-modal--life-edu) .ac-modal__buttons {
    display: none
}

.payment-method-modal .payment-method-modal-content__notice-list {
    margin-bottom: 16px
}

.payment-method-modal .payment-method-modal-content__notice-list-el {
    line-height: 1.5;
    font-size: 16px;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    display: flex;
    align-items: flex-start;
    font-weight: 500;
    color: #3e4042
}

.payment-method-modal .payment-method-modal-content__notice-list-el.ac-fwb {
    font-weight: 700
}

.payment-method-modal .payment-method-modal-content__notice-list-el.ac-fwm {
    font-weight: 500
}

.payment-method-modal .payment-method-modal-content__notice-list-el.ac-fwr {
    font-weight: 400
}

.payment-method-modal .payment-method-modal-content__notice-list-el+.payment-method-modal-content__notice-list-el {
    margin-top: 12px
}

.payment-method-modal .payment-method-modal-content__notice-list-el .infd-icon {
    margin-top: 6px;
    margin-right: 8px
}

.payment-method-modal .payment-method-modal-content__notice-list-el .infd-icon path {
    fill: #3e4042
}

.payment-method-modal .payment-method-modal-content__notice-list-el-message {
    word-break: keep-all
}

.payment-method-modal .payment-method-modal-content__notice-list-el--primary {
    color: #00c471
}

.payment-method-modal .payment-method-modal-content__notice-list-el--primary .infd-icon path {
    fill: #00c471
}

.payment-method-modal .payment-method-modal-content__banner {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-bottom: 20px;
    padding: 16px;
    background-color: #f1f3f5;
    border-radius: 8px;
    color: #858a8d
}

.payment-method-modal .payment-method-modal-content__banner.ac-fwb {
    font-weight: 700
}

.payment-method-modal .payment-method-modal-content__banner.ac-fwm {
    font-weight: 500
}

.payment-method-modal .payment-method-modal-content__banner.ac-fwr {
    font-weight: 400
}

.payment-method-modal .payment-method-modal-content__banner a {
    font-weight: 500;
    text-decoration: underline;
    color: #1163de
}

.payment-method-modal .ac-modal__caption {
    display: flex;
    flex-direction: column;
    padding-bottom: 0
}

.payment-method-modal .pg-container {
    display: flex;
    flex-direction: column
}

.payment-method-modal .pg-container .ac-button {
    font-weight: 400
}

.payment-method-modal .pg-container .ac-button:not(:last-child) {
    margin-bottom: 8px
}

.payment-method-modal .pg-container:not(.disabled) .ac-button.selected {
    font-weight: 700;
    border-color: #1b1c1d;
    box-shadow: none
}

.payment-method-modal .pg-container .ac-button .icon {
    margin-left: 0;
    margin-right: 8px
}

.payment-method-modal .pg-container.disabled .ac-button {
    pointer-events: none;
    color: #d5dbe2;
    border-color: #e9ebee
}

.payment-method-modal .pg-container.disabled .icon,
.payment-method-modal .pg-container .icon--disabled {
    display: none
}

.payment-method-modal .pg-container.disabled .icon.icon--disabled {
    display: inline-block
}

.payment-method-modal .payment-method-modal__content-pg-button {
    height: 45px
}

.payment-method-modal .payment-method-modal__content-pg-button p {
    font-size: 11px
}

.payment-method-modal .payment-method-modal__content-pg-button-text {
    display: flex;
    justify-content: center;
    align-items: center
}

.payment-method-modal .payment-method-modal__content-pg-button--offline {
    border: 1px solid #d5dbe2;
    background: #fff;
    cursor: default;
    opacity: .4
}

.payment-method-modal .payment-method-modal__content-pg-button--offline .payment-method-modal__offline-warning-text {
    font-weight: 400;
    font-size: 11px;
    line-height: 150%
}

.toss-widget-modal.hidden {
    display: none
}

@media screen and (max-width:1024px) {

    .pg___cartv2 .InfD__BottomNavigation,
    .pg___cartv2 footer.footer,
    .pg___cartv2 header#header {
        display: none
    }
}

@media screen and (max-width:1024px) {
    .pg___cartv2 {
        padding-bottom: 66px
    }

    .pg___cartv2>footer.footer {
        display: none
    }
}

.pg___cartv2 .ac-button {
    font-weight: 700
}

.pg___cartv2 .ac-input-with-item {
    padding: 0 12px
}

.pg___cartv2 input:disabled {
    opacity: 1
}

.pg___cartv2 .icon-check {
    border-width: 2px;
    border-color: #e9ebee
}

.pg___cartv2 .ac-button.is-outlined.is-gray:disabled,
.pg___cartv2 .ac-button.is-outlined.is-gray:not(.is-error),
.pg___cartv2 .ac-input-with-item:disabled,
.pg___cartv2 .ac-input-with-item:not(.ac-input-with-item--error) {
    border-color: #d5dbe2
}

.pg___cartv2 .input-cart__error {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    display: none;
    margin-top: 4px;
    color: #e5503c
}

.pg___cartv2 .input-cart__error.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .input-cart__error.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .input-cart__error.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .input-cart__error.input-cart__error--show {
    display: block
}

.pg___cartv2 .container {
    padding: 0;
    display: flex
}

@media(min-width:1200px) {
    .pg___cartv2 .container {
        max-width: 1160px
    }
}

@media screen and (min-width:1366px) {
    .pg___cartv2 .container {
        width: 1160px
    }
}

.pg___cartv2 .container .my-carts--empty {
    margin-top: 114px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .container .my-carts--empty {
        margin-bottom: 120px
    }
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .container {
        flex-direction: column
    }
}

@media(min-width:1025px)and (max-width:1200px) {
    .pg___cartv2 .container {
        padding: 0 24px
    }
}

.pg___cartv2 .container .container__header {
    display: none;
    color: #1b1c1d
}

.pg___cartv2 .container .container__header .header__go-back {
    position: absolute;
    top: 5px;
    left: 5px;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 40px;
    height: 40px;
    border: none;
    background-color: #fff
}

.pg___cartv2 .container .container__header .header__go-back>svg {
    min-width: 40px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .container .container__header {
        font-weight: 400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 18px;
        font-weight: 700;
        position: -webkit-sticky;
        position: sticky;
        display: block;
        z-index: 10;
        top: 0;
        left: 0;
        padding: 12px 0;
        width: 100vw;
        height: 50px;
        background: #fff;
        box-shadow: 0 2px 8px 0 rgba(0, 0, 0, .08);
        text-align: center
    }

    .pg___cartv2 .container .container__header.ac-fwb {
        font-weight: 700
    }

    .pg___cartv2 .container .container__header.ac-fwm {
        font-weight: 500
    }

    .pg___cartv2 .container .container__header.ac-fwr {
        font-weight: 400
    }

    #main.sticky {
        margin-top: 0
    }

    #main.sticky .container:not(.empty) {
        padding-top: 50px
    }

    #main.sticky .container:not(.empty) .container__header {
        position: fixed
    }
}

.pg___cartv2 .container .section-cart__header {
    font-weight: 700;
    color: #1b1c1d;
    padding-top: 32px;
    padding-bottom: 16px;
    font-size: 24px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .container .section-cart__header {
        display: none
    }
}

.pg___cartv2 .section-cart {
    width: 100%;
    margin-right: 32px;
    margin-bottom: 120px
}

@media screen and (min-width:1366px) {
    .pg___cartv2 .section-cart {
        max-width: 828px
    }
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .section-cart {
        margin-bottom: 0;
        padding: 24px 24px 0
    }
}

@media screen and (max-width:768px) {
    .pg___cartv2 .section-cart {
        padding: 16px 16px 0
    }
}

.pg___cartv2 .section-cart .section-cart__control {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    border-bottom: 1px solid #1b1c1d;
    padding-bottom: 12px
}

.pg___cartv2 .section-cart .section-cart__control.section-cart__control--sticky {
    position: -webkit-sticky;
    position: sticky;
    top: 63px;
    z-index: 1;
    margin-top: -32px;
    padding-top: 32px;
    background: #fff
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .section-cart .section-cart__control.section-cart__control--sticky {
        position: fixed;
        left: 0;
        top: 49px;
        width: 100%;
        padding-top: 16px;
        margin-top: 0;
        margin-left: 16px;
        margin-right: 16px;
        max-width: calc(100% - 32px)
    }

    .pg___cartv2 .section-cart .section-cart__control.section-cart__control--sticky+.section-cart__card-list {
        padding-top: 53px
    }
}

.pg___cartv2 .section-cart .section-cart__card-list {
    min-height: 465px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .section-cart .section-cart__card-list {
        min-height: unset
    }
}

.pg___cartv2 .section-cart .section-cart__control-label {
    height: 22px;
    color: #1b1c1d
}

.pg___cartv2 .section-cart .section-cart__control--select-all {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 500
}

.pg___cartv2 .section-cart .section-cart__control--select-all.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .section-cart .section-cart__control--select-all.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .section-cart .section-cart__control--select-all.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .section-cart .section-cart__control--select-all .icon-check {
    cursor: pointer
}

.pg___cartv2 .section-cart .section-cart__control--delete-all {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 700
}

.pg___cartv2 .section-cart .section-cart__control--delete-all.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .section-cart .section-cart__control--delete-all.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .section-cart .section-cart__control--delete-all.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .section-cart .section-cart__control--delete-all svg {
    margin-left: 2px
}

.pg___cartv2 .section-cart .section-cart__list-summary {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700;
    color: #1b1c1d;
    padding: 16px 0;
    border-bottom: 1px solid #f1f3f5
}

.pg___cartv2 .section-cart .section-cart__list-summary.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .section-cart .section-cart__list-summary.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .section-cart .section-cart__list-summary.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .section-cart .list-summary__count {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 400;
    padding-left: 4px;
    height: 25px;
    color: #858a8d
}

.pg___cartv2 .section-cart .list-summary__count.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .section-cart .list-summary__count.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .section-cart .list-summary__count.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .section-cart .list-summary__count--selected {
    color: #00c471
}

.pg___cartv2 .my-carts--empty {
    text-align: center
}

.pg___cartv2 .my-carts--empty__description {
    color: #3e4042;
    padding-bottom: 20px
}

.pg___cartv2 .my-carts--empty__description-sub {
    padding-top: 4px;
    color: #858a8d
}

.pg___cartv2 .cart-course-card {
    display: flex;
    padding: 16px 0;
    align-items: stretch;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    border-bottom: 1px solid #f1f3f5
}

.pg___cartv2 .cart-course-card.cart-course-card--unchecked .cart-course-card__image,
.pg___cartv2 .cart-course-card.cart-course-card--unchecked .cart-course-card__info,
.pg___cartv2 .cart-course-card.cart-course-card--unchecked .cart-course-card__payment {
    opacity: .5
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .cart-course-card:last-child {
        border-bottom-width: 0
    }
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card {
        flex-wrap: wrap
    }
}

.pg___cartv2 .cart-course-card__checkbox {
    align-items: flex-start
}

.pg___cartv2 .cart-course-card__checkbox .left {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-left: -10px;
    margin-top: -10px;
    width: 40px;
    height: 40px;
    cursor: pointer
}

.pg___cartv2 .cart-course-card__checkbox .icon-check {
    margin-right: 0
}

.pg___cartv2 .cart-course-card__image {
    margin-right: 16px;
    width: 100%;
    max-width: 120px;
    min-width: 120px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card__image {
        margin-right: 8px;
        max-width: 60px;
        min-width: 60px
    }
}

.pg___cartv2 .cart-course-card__thumbnail {
    overflow: hidden;
    border: 1px solid #f1f3f5;
    box-sizing: border-box;
    border-radius: 4px
}

.pg___cartv2 .cart-course-card__info {
    display: flex;
    flex-direction: column;
    width: 100%
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card__info {
        flex-direction: row;
        max-width: calc(100% - 58px);
        flex-wrap: wrap
    }
}

.pg___cartv2 .cart-course-card__discount-info--coupon,
.pg___cartv2 .cart-course-card__discount-info--direct {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 400;
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    padding: 1px 6px 2px;
    margin-bottom: 2px;
    max-width: 441px;
    width: -webkit-min-content;
    width: -moz-min-content;
    width: min-content;
    border-radius: 4px
}

.pg___cartv2 .cart-course-card__discount-info--coupon.ac-fwb,
.pg___cartv2 .cart-course-card__discount-info--direct.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__discount-info--coupon.ac-fwm,
.pg___cartv2 .cart-course-card__discount-info--direct.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__discount-info--coupon.ac-fwr,
.pg___cartv2 .cart-course-card__discount-info--direct.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {

    .pg___cartv2 .cart-course-card__discount-info--coupon,
    .pg___cartv2 .cart-course-card__discount-info--direct {
        max-width: 100%;
        margin-bottom: 8px
    }
}

.pg___cartv2 .cart-course-card__discount-info--coupon {
    color: #008686;
    background: #ebf5f5
}

.pg___cartv2 .cart-course-card__discount-info--direct {
    color: #175cbe;
    background: #ecf2fa
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card__discount-info {
        width: 100%
    }
}

.pg___cartv2 .cart-course-card__discount-title {
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-line-clamp: 1;
    -webkit-box-orient: vertical;
    white-space: nowrap
}

.pg___cartv2 .cart-course-card__discount-duration {
    white-space: nowrap
}

.pg___cartv2 .cart-course-card__discount-duration:before {
    content: "ㅣ"
}

.pg___cartv2 .cart-course-card__duration-tooltip {
    display: inline-block
}

.pg___cartv2 .cart-course-card .tooltip-inner {
    max-width: none
}

.pg___cartv2 .cart-course-card__discount-info--coupon .cart-course-card__discount-duration:before {
    color: #b3dbdb
}

.pg___cartv2 .cart-course-card__discount-info--direct .cart-course-card__discount-duration:before {
    color: #b9ceeb
}

.pg___cartv2 .cart-course-card__title {
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-line-clamp: 1;
    white-space: nowrap;
    white-space: normal;
    line-height: 1.5;
    max-height: 3rem;
    text-align: left;
    word-break: break-all;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-bottom: 0;
    padding-bottom: 2px;
    color: #1b1c1d
}

.pg___cartv2 .cart-course-card__title.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__title.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__title.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-course-card__title a {
    font-weight: 500;
    color: currentColor !important;
    text-decoration: none
}

.pg___cartv2 .cart-course-cart__extra-info {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px
}

.pg___cartv2 .cart-course-cart__extra-info.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-cart__extra-info.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-cart__extra-info.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-course-card__instructor {
    color: #858a8d
}

.pg___cartv2 .cart-course-card__duration {
    color: #00c471
}

.pg___cartv2 .cart-course-card__duration:before {
    content: "ㅣ";
    color: #d5dbe2
}

.pg___cartv2 .cart-course-card__duration-detail {
    color: #858a8d
}

.pg___cartv2 .close {
    padding: 4px 16px 16px;
    border-right: 1px solid #f1f3f5
}

@media screen and (max-width:768px) {
    .pg___cartv2 .close {
        padding: 0;
        border-right: none
    }
}

.pg___cartv2 .close-btn {
    padding: 0;
    width: 24px;
    height: 24px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .close-btn {
        padding: 0 0 20px 5px;
        width: 28px;
        height: -webkit-max-content;
        height: -moz-max-content;
        height: max-content
    }
}

.pg___cartv2 .cart-course-card__payment {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    min-width: 150px;
    text-align: right
}

.pg___cartv2 .cart-course-card__payment.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__payment.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__payment.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card__payment {
        display: flex;
        align-items: center;
        padding-left: 98px;
        padding-top: 2px;
        min-width: unset
    }

    .pg___cartv2 .cart-course-card__payment .cart-course-card__payment-price-origin {
        padding-right: 4px
    }
}

.pg___cartv2 .cart-course-card__payment-discount-percent {
    font-weight: 500;
    padding-right: 4px;
    font-weight: 700;
    color: #e5503c
}

.pg___cartv2 .cart-course-card__payment-price-origin {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 400;
    text-decoration: line-through;
    color: #abb0b5
}

.pg___cartv2 .cart-course-card__payment-price-origin.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__payment-price-origin.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__payment-price-origin.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-course-card__price-pay {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 400;
    color: #1b1c1d
}

.pg___cartv2 .cart-course-card__price-pay.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__price-pay.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__price-pay.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-course-card__price-pay strong {
    font-weight: 400;
    line-height: 1.4;
    letter-spacing: -.3px;
    font-size: 18px;
    font-weight: 700
}

.pg___cartv2 .cart-course-card__price-pay strong.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-course-card__price-pay strong.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-course-card__price-pay strong.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {
    .pg___cartv2 .cart-course-card__price-pay {
        line-height: 1.43;
        letter-spacing: -.3px;
        font-size: 14px;
        font-weight: 400
    }

    .pg___cartv2 .cart-course-card__price-pay.ac-fwb {
        font-weight: 700
    }

    .pg___cartv2 .cart-course-card__price-pay.ac-fwm {
        font-weight: 500
    }

    .pg___cartv2 .cart-course-card__price-pay.ac-fwr {
        font-weight: 400
    }

    .pg___cartv2 .cart-course-card__price-pay strong {
        font-weight: 400;
        line-height: 1.47;
        letter-spacing: -.3px;
        font-size: 15px;
        font-weight: 700
    }

    .pg___cartv2 .cart-course-card__price-pay strong.ac-fwb {
        font-weight: 700
    }

    .pg___cartv2 .cart-course-card__price-pay strong.ac-fwm {
        font-weight: 500
    }

    .pg___cartv2 .cart-course-card__price-pay strong.ac-fwr {
        font-weight: 400
    }
}

.pg___cartv2 .cart-course-card__discount-info {
    width: 100%
}

.pg___cartv2 section.cart-course-card__center {
    max-width: calc(100% - 68px)
}

.pg___cartv2 .for-mobile {
    display: none
}

@media screen and (max-width:768px) {
    .pg___cartv2 .for-mobile {
        display: unset
    }

    .pg___cartv2 .for-pc {
        display: none
    }
}

.pg___cartv2 .aside-cart {
    position: relative;
    padding-top: 32px;
    width: 300px;
    min-width: 300px;
    max-width: 300px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .aside-cart {
        padding: 24px;
        min-width: 100%;
        width: 100%;
        max-width: 100%;
        background: #f8f9fa
    }
}

@media screen and (max-width:768px) {
    .pg___cartv2 .aside-cart {
        padding: 16px
    }
}

.pg___cartv2 .aside-cart .ac-input-with-item.disabled {
    background: #f8f9fa;
    border: 1px solid #d5dbe2
}

.pg___cartv2 .aside-cart .ac-input-with-item>input:disabled {
    color: #abb0b5;
    background: #f8f9fa
}

.pg___cartv2 .buyer-info,
.pg___cartv2 .voucher-info {
    width: 300px;
    border: 1px solid #e6e6e6;
    border-radius: 8px;
    background: #fff
}

@media screen and (max-width:1024px) {

    .pg___cartv2 .buyer-info,
    .pg___cartv2 .voucher-info {
        padding: 24px;
        width: 100%
    }
}

@media screen and (max-width:1024px) {

    .pg___cartv2 .buyer-info .ac-input-with-item,
    .pg___cartv2 .voucher-info .ac-input-with-item {
        width: 100%
    }
}

.pg___cartv2 .buyer-info {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-bottom: 4px;
    padding: 16px 20px
}

.pg___cartv2 .buyer-info.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .buyer-info.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .buyer-info.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .buyer-info {
        padding: 20px
    }
}

.pg___cartv2 .buyer-info>.buyer-info__inner-wrapper:first-child {
    margin-top: 8px
}

.pg___cartv2 .buyer-info>.buyer-info__inner-wrapper:nth-child(n+2) {
    margin-top: 10px
}

.pg___cartv2 .buyer-info .ac-button:disabled {
    background-color: #fff !important;
    color: #d5dbe2 !important
}

.pg___cartv2 .buyer-info .certificate-phone__item {
    margin-bottom: 0
}

.pg___cartv2 .buyer-info .certificate-phone__item.item-code {
    margin-top: 8px
}

.pg___cartv2 .buyer-info .certificate-phone__item button.certificate-phone__re-request:disabled,
.pg___cartv2 .buyer-info .certificate-phone__item button.certificate-phone__request:disabled {
    border-color: #d5dbe2 !important
}

.pg___cartv2 .buyer-info .certificate-phone.certificate-phone--certificated .ac-input-with-item {
    padding: 0 12px;
    color: #abb0b5;
    border: 1px solid #d5dbe2;
    background: #f8f9fa;
    cursor: default
}

.pg___cartv2 .buyer-info .certificate-phone.certificate-phone--certificated .ac-input-with-item path {
    fill: #abb0b5
}

.pg___cartv2 .buyer-info .certificate-phone.certificate-phone--certificated .ac-input-with-item .display__selected-option {
    background: #f8f9fa
}

.pg___cartv2 .buyer-info .certificate-phone.certificate-phone--certificated .ac-input-with-item input {
    color: #abb0b5
}

.pg___cartv2 .buyer-info .certificate-phone.certificate-phone--certificated .display__selected-option {
    height: 100%
}

.pg___cartv2 .buyer-info .select-country {
    flex: 0 0 50px
}

.pg___cartv2 .buyer-info .select-country:after {
    display: none
}

.pg___cartv2 .buyer-info .ac-select__display {
    padding: 0
}

.pg___cartv2 .voucher-info {
    padding: 20px 20px 0;
    border-bottom-width: 0;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .voucher-info {
        padding-bottom: 20px;
        border-bottom-width: 1px;
        border-bottom-right-radius: 8px;
        border-bottom-left-radius: 8px
    }
}

.pg___cartv2 .buyer-info__header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-bottom: 8px;
    margin-bottom: 8px;
    border-bottom: 1px solid #f1f3f5
}

.pg___cartv2 .buyer-info__title {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 700;
    display: flex;
    color: #1b1c1d
}

.pg___cartv2 .buyer-info__title.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .buyer-info__title.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .buyer-info__title.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .buyer-info__title label {
    margin-right: 4px
}

.pg___cartv2 .buyer-info__button {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 700;
    padding: 0;
    text-decoration: underline;
    cursor: pointer;
    border: 0;
    background: none
}

.pg___cartv2 .buyer-info__button.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .buyer-info__button.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .buyer-info__button.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .buyer-info__button--edit {
    color: #858a8d
}

.pg___cartv2 .buyer-info__button--save {
    color: #00c471
}

.pg___cartv2 .buyer-info__button--save:disabled {
    color: #b3edd4;
    cursor: unset
}

.pg___cartv2 .buyer-info__list>div {
    display: flex
}

.pg___cartv2 .buyer-info__list dt {
    min-width: 80px;
    color: #abb0b5
}

.pg___cartv2 .buyer-info__list dd {
    max-width: calc(100% - 80px);
    color: #858a8d;
    word-break: break-all
}

.pg___cartv2 .buyer-info__input {
    width: 100%
}

.pg___cartv2 .section-voucher-info.section-voucher-info--sticky {
    position: -webkit-sticky;
    position: sticky;
    top: 96px;
    margin-bottom: 16px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .section-voucher-info.section-voucher-info--sticky {
        position: static
    }
}

.pg___cartv2 .section-voucher-info.section-voucher-info--sticky .voucher-info-sticker {
    box-shadow: 0 4px 10px 0 rgba(0, 0, 0, .08)
}

.pg___cartv2 .voucher-info-sticker {
    overflow: hidden;
    border-radius: 8px;
    transition: box-shadow .3s ease
}

.pg___cartv2 .voucher-info hr {
    margin: 9px 0;
    width: 100%;
    height: 1px;
    background: #f1f3f5
}

.pg___cartv2 .voucher-info .coupon-selection__number-of-usable-coupons {
    color: #00c471
}

.pg___cartv2 .coupon-selection,
.pg___cartv2 .point-using {
    margin-bottom: 16px
}

.pg___cartv2 .coupon-selection__label,
.pg___cartv2 .point-using__label {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: flex;
    align-items: center;
    margin-bottom: 4px;
    color: #abb0b5
}

.pg___cartv2 .coupon-selection__label.ac-fwb,
.pg___cartv2 .point-using__label.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .coupon-selection__label.ac-fwm,
.pg___cartv2 .point-using__label.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .coupon-selection__label.ac-fwr,
.pg___cartv2 .point-using__label.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .coupon-selection__label>label,
.pg___cartv2 .point-using__label>label {
    font-weight: 700;
    color: #1b1c1d
}

.pg___cartv2 .coupon-selection__label>.button-question,
.pg___cartv2 .coupon-selection__label>:not(.button-question, .coupon-selection__status, div, .cart-tmpl-number-unit),
.pg___cartv2 .point-using__label>:not(.button-question, .coupon-selection__status, div, .cart-tmpl-number-unit) {
    margin-right: 4px
}

.pg___cartv2 .coupon-selection__label>.coupon-selection__status {
    margin-right: auto
}

.pg___cartv2 .coupon-selection__label>.coupon-selection__usable-sentence {
    margin-left: auto
}

.pg___cartv2 .point-using__label .cart-tmpl-number-unit__number {
    color: #00c471
}

.pg___cartv2 .point-using__label>.button-question {
    margin-right: auto
}

.pg___cartv2 .button-question {
    display: flex;
    align-items: center;
    margin: 0;
    padding: 0;
    border: 0;
    background: none
}

.pg___cartv2 .button-question:hover {
    cursor: pointer
}

.pg___cartv2 .coupon-selection__status {
    color: #00c471
}

.pg___cartv2 .coupon-selection__interactions,
.pg___cartv2 .point-using__interactions {
    display: flex
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item,
.pg___cartv2 .point-using__interactions .ac-input-with-item {
    display: flex;
    align-items: center;
    margin-right: 8px
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item>span,
.pg___cartv2 .point-using__interactions .ac-input-with-item>span {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 500;
    margin-left: 8px;
    color: #616568
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item>span.ac-fwb,
.pg___cartv2 .point-using__interactions .ac-input-with-item>span.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item>span.ac-fwm,
.pg___cartv2 .point-using__interactions .ac-input-with-item>span.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item>span.ac-fwr,
.pg___cartv2 .point-using__interactions .ac-input-with-item>span.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .coupon-selection__interactions .ac-input-with-item input,
.pg___cartv2 .point-using__interactions .ac-input-with-item input {
    text-align: right
}

.pg___cartv2 .coupon-selection__interactions .ac-button,
.pg___cartv2 .point-using__interactions .ac-button {
    flex-shrink: 0
}

.pg___cartv2 .price-regular {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: flex;
    justify-content: space-between;
    color: #858a8d
}

.pg___cartv2 .price-regular.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-regular.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-regular.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .price-discount {
    margin-top: 4px
}

.pg___cartv2 .price-discount.price-discount--unfolded .price-discount__summary svg {
    transform: rotate(180deg)
}

.pg___cartv2 .price-discount.price-discount--unfolded .price-discount__detail {
    display: block
}

.pg___cartv2 .price-discount__summary {
    display: flex;
    justify-content: space-between
}

.pg___cartv2 .price-discount__summary .cart-tmpl-number-unit {
    font-weight: 500;
    color: #e5503c
}

.pg___cartv2 .price-discount__button-folding {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    flex-shrink: 0;
    display: flex;
    align-items: center;
    padding: 0;
    color: #e5503c;
    border: 0;
    background: none;
    cursor: pointer
}

.pg___cartv2 .price-discount__button-folding.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-discount__button-folding.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-discount__button-folding.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .price-discount__button-folding>span {
    margin-right: 4px
}

.pg___cartv2 .price-discount__detail {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: none;
    padding-top: 7px;
    color: #abb0b5
}

.pg___cartv2 .price-discount__detail.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-discount__detail.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-discount__detail.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .price-discount__detail dl>div {
    display: flex;
    justify-content: space-between;
    margin-bottom: 2px
}

.pg___cartv2 .price-discount__detail dl>div:last-child {
    margin-bottom: 4px
}

.pg___cartv2 .price-discount__detail .cart-tmpl-number-unit {
    font-weight: 500
}

.pg___cartv2 .price-pay {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 700;
    display: flex;
    justify-content: space-between;
    align-items: flex-end;
    margin-top: 4px;
    color: #1b1c1d
}

.pg___cartv2 .price-pay.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-pay.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-pay.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .price-pay+button {
    margin-top: 16px
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit__number {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit__number.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit__number.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit__number.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit {
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 400;
    display: flex;
    align-items: flex-end;
    color: #1b1c1d
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .price-pay .cart-tmpl-number-unit.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .payment-button__spinner {
    display: none
}

.pg___cartv2 .is-paying .payment-button__spinner {
    display: inline-block
}

.pg___cartv2 .is-paying .payment-button__text {
    display: none
}

.pg___cartv2 .terms-agreement {
    display: flex;
    align-items: flex-start;
    justify-content: space-between;
    padding: 8px 20px 20px;
    border-radius: 8px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
    border: 1px solid #e6e6e6;
    border-top: 0 solid #e6e6e6;
    background-color: #fff
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .terms-agreement {
        margin-top: 4px;
        padding: 12px 20px;
        border-top-left-radius: 8px;
        border-top-right-radius: 8px;
        border-top-width: 1px
    }
}

.pg___cartv2 .terms-agreement>div {
    display: flex;
    align-items: flex-start
}

.pg___cartv2 .terms-agreement #terms_agreement.icon-check {
    flex-shrink: 0;
    margin-right: 8px
}

.pg___cartv2 .terms-agreement__text-agreement {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 400;
    color: #abb0b5
}

.pg___cartv2 .terms-agreement__text-agreement.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .terms-agreement__text-agreement.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .terms-agreement__text-agreement.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .terms-agreement__text-agreement>span {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 500;
    padding: 0;
    color: #abb0b5;
    text-decoration: underline;
    border: 0;
    background: none;
    cursor: pointer
}

.pg___cartv2 .terms-agreement__text-agreement>span.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .terms-agreement__text-agreement>span.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .terms-agreement__text-agreement>span.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .has-questions {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 16px
}

.pg___cartv2 .has-questions button {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 500;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-left: 4px;
    color: #858a8d;
    border: 0;
    background: none;
    cursor: pointer
}

.pg___cartv2 .has-questions button.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .has-questions button.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .has-questions button.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .has-questions button i {
    margin-right: 4px;
    font-size: 16px
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .has-questions {
        margin-bottom: 8px
    }
}

.pg___cartv2 .buttons__verifying-email {
    transform: translateZ(-1px);
    background-color: #3e4042;
    color: #fff;
    border: none
}

.pg___cartv2 .buttons__verifying-email+button {
    margin-top: 8px
}

.pg___cartv2 .buttons__verifying-email i {
    width: 16px;
    height: 16px
}

.pg___cartv2 .buttons__verifying-email .buttons__verifying-email-percent {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 700;
    padding-left: 4px;
    padding-right: 2px;
    color: #4dd69c
}

.pg___cartv2 .buttons__verifying-email .buttons__verifying-email-percent.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .buttons__verifying-email .buttons__verifying-email-percent.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .buttons__verifying-email .buttons__verifying-email-percent.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .button-pay {
    width: 100%
}

.pg___cartv2 .bottom-fixed {
    display: none;
    position: fixed;
    z-index: 10;
    bottom: 0;
    left: 0;
    align-items: center;
    padding: 10px 16px;
    width: 100%;
    height: 68px;
    background-color: #fff;
    box-shadow: 0 -4px 10px 0 rgba(0, 0, 0, .06)
}

@media screen and (max-width:1024px) {
    .pg___cartv2 .bottom-fixed {
        display: flex
    }

    .voucher-info .button-pay {
        display: none
    }
}

.pg___cartv2 .bottom-fixed__price {
    display: flex;
    flex-direction: column;
    margin-right: 16px;
    min-width: 109px;
    max-width: 109px
}

.pg___cartv2 .bottom-fixed__price--origin {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 400;
    text-decoration: line-through;
    color: #abb0b5
}

.pg___cartv2 .bottom-fixed__price--origin.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .bottom-fixed__price--origin.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .bottom-fixed__price--origin.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .bottom-fixed__price--discount {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 400;
    white-space: nowrap
}

.pg___cartv2 .bottom-fixed__price--discount.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .bottom-fixed__price--discount.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .bottom-fixed__price--discount.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .bottom-fixed__price--discount .bottom-fixed__pay-price {
    font-weight: 400;
    line-height: 1.4;
    letter-spacing: -.3px;
    font-size: 18px;
    font-weight: 700;
    color: #1b1c1d
}

.pg___cartv2 .bottom-fixed__price--discount .bottom-fixed__pay-price.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .bottom-fixed__price--discount .bottom-fixed__pay-price.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .bottom-fixed__price--discount .bottom-fixed__pay-price.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-tmpl-label {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: inline-block;
    margin-bottom: 4px;
    color: #858a8d
}

.pg___cartv2 .cart-tmpl-label.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-tmpl-label.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-tmpl-label.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .cart-tmpl-label__required-sign {
    color: #e5503c
}

.pg___cartv2 .cart-tmpl-number-unit {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: flex;
    flex-shrink: 0;
    color: #858a8d
}

.pg___cartv2 .cart-tmpl-number-unit.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .cart-tmpl-number-unit.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .cart-tmpl-number-unit.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon section {
    position: relative;
    width: 100%;
    left: unset;
    right: unset;
    margin: unset
}

.pg___cartv2 dialog.modal-selecting-coupon__container {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    position: relative;
    overflow: hidden;
    margin: 40px 0;
    padding: 0;
    width: 600px;
    height: 840px;
    background: #fff;
    border: none;
    border-radius: 8px;
    z-index: 1
}

.pg___cartv2 dialog.modal-selecting-coupon__container.ac-fwb {
    font-weight: 700
}

.pg___cartv2 dialog.modal-selecting-coupon__container.ac-fwm {
    font-weight: 500
}

.pg___cartv2 dialog.modal-selecting-coupon__container.ac-fwr {
    font-weight: 400
}

.pg___cartv2 dialog.modal-selecting-coupon__container p {
    font-size: 14px;
    line-height: 1.43;
    letter-spacing: -.3px
}

@media screen and (max-width:768px) {
    .pg___cartv2 dialog.modal-selecting-coupon__container {
        max-width: calc(100% - 48px);
        height: 680px
    }
}

.pg___cartv2 .modal-selecting-coupon__wrapper-appliable-courses,
.pg___cartv2 .modal-selecting-coupon__wrapper-selecting {
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100%;
    background: #fff
}

.pg___cartv2 .modal .modal-selecting-coupon__container .modal-selecting-coupon__wrapper-appliable-courses {
    position: absolute;
    top: 0;
    left: 100%;
    z-index: 2
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses,
.pg___cartv2 .modal-selecting-coupon__header-selecting {
    position: relative;
    display: flex;
    align-items: center;
    margin: 28px 28px 20px;
    color: #3e4042
}

@media screen and (max-width:768px) {

    .pg___cartv2 .modal-selecting-coupon__header-appliable-courses,
    .pg___cartv2 .modal-selecting-coupon__header-selecting {
        margin: 20px
    }
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses>h1,
.pg___cartv2 .modal-selecting-coupon__header-selecting>h1 {
    font-weight: 400;
    line-height: 1.4;
    letter-spacing: -.3px;
    font-size: 18px;
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses>h1.ac-fwb,
.pg___cartv2 .modal-selecting-coupon__header-selecting>h1.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses>h1.ac-fwm,
.pg___cartv2 .modal-selecting-coupon__header-selecting>h1.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses>h1.ac-fwr,
.pg___cartv2 .modal-selecting-coupon__header-selecting>h1.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__header-selecting {
    justify-content: flex-start
}

.pg___cartv2 .modal-selecting-coupon__header-appliable-courses {
    justify-content: center
}

.pg___cartv2 .modal-selecting-coupon__contents {
    overflow-x: hidden;
    overflow-y: auto;
    height: 100%;
    max-height: 100%;
    padding: 0 28px 20px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__contents {
        padding: 0 20px 20px
    }
}

.pg___cartv2 .modal-selecting-coupon__footer {
    padding: 0 28px 28px;
    box-shadow: 0 -12px 16px 0 #fff;
    z-index: 1
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__footer {
        padding: 0 20px 20px
    }
}

.pg___cartv2 .modal-selecting-coupon__footer>p {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 700;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-top: 13px;
    color: #1b1c1d;
    border-top: 1px solid #616568
}

.pg___cartv2 .modal-selecting-coupon__footer>p.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__footer>p.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__footer>p.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__button-back {
    position: absolute;
    left: 0;
    top: 0;
    bottom: 0;
    display: flex;
    align-items: center;
    padding: 0;
    background: none;
    border: 0;
    cursor: pointer
}

.pg___cartv2 .modal-selecting-coupon__label-register {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: inline-block;
    margin-bottom: 4px;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__label-register.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__label-register.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__label-register.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__wrapper-register {
    display: flex
}

.pg___cartv2 .modal-selecting-coupon__wrapper-register>.ac-input-with-item {
    width: 100%
}

.pg___cartv2 .modal-selecting-coupon__wrapper-register>.ac-button {
    flex-shrink: 0;
    margin-left: 4px;
    width: 75px
}

.pg___cartv2 .modal-selecting-coupon__form-register--error .ac-input-with-item {
    border-color: #e5503c
}

.pg___cartv2 .modal-selecting-coupon__form-register--error .modal-selecting-coupon__error-message-register {
    display: inline-block
}

.pg___cartv2 .modal-selecting-coupon__error-message-register {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    display: none;
    color: #e5503c
}

.pg___cartv2 .modal-selecting-coupon__error-message-register.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__error-message-register.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__error-message-register.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon .modal-selecting-coupon__form-register,
.pg___cartv2 .modal-selecting-coupon .modal-selecting-coupon__section-usable-coupons {
    margin-bottom: 20px
}

.pg___cartv2 .modal-selecting-coupon__header-usable-coupons {
    position: -webkit-sticky;
    position: sticky;
    top: 0;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding-bottom: 8px;
    background: #fff;
    z-index: 1
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    position: relative;
    display: flex;
    align-items: center;
    padding: 4px 6px 4px 7px;
    color: #fff;
    background: #3e4042;
    border-radius: 4px
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon:before {
    content: "";
    position: absolute;
    top: 9px;
    left: -4px;
    width: 8px;
    height: 8px;
    border-color: #3e4042 transparent transparent #3e4042;
    border-style: solid;
    border-width: 5px;
    border-radius: 2px;
    transform: rotate(-45deg)
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon path:first-of-type {
    fill: #3e4042
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon path:last-of-type {
    fill: none
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon .modal-selecting-coupon__discount-coupon-label {
    padding-right: 4px;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon svg {
    position: relative;
    top: 2px;
    margin-right: 3px;
    border-radius: 100px;
    background: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon--selected .modal-selecting-coupon__discount-coupon-label {
    color: #00c471
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon--selected svg {
    background: #00c471
}

.pg___cartv2 .modal-selecting-coupon__discount-coupon-amount {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__title-unusable-coupons,
.pg___cartv2 .modal-selecting-coupon__title-usable-coupons {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__title-unusable-coupons.ac-fwb,
.pg___cartv2 .modal-selecting-coupon__title-usable-coupons.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__title-unusable-coupons.ac-fwm,
.pg___cartv2 .modal-selecting-coupon__title-usable-coupons.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__title-unusable-coupons.ac-fwr,
.pg___cartv2 .modal-selecting-coupon__title-usable-coupons.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__title-unusable-coupons {
    margin-bottom: 8px
}

.pg___cartv2 .modal-selecting-coupon__count-unusable-coupons,
.pg___cartv2 .modal-selecting-coupon__count-usable-coupons {
    margin-left: 4px;
    color: #00c471
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 40px 0
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:first-of-type {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700;
    color: #3e4042;
    display: inline-block;
    margin-bottom: 4px
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:first-of-type.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:first-of-type.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:first-of-type.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:nth-of-type(n+2) {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:nth-of-type(n+2).ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:nth-of-type(n+2).ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__empty-usable-coupon>span:nth-of-type(n+2).ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__coupon {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: flex;
    align-items: flex-start;
    padding: 10px 12px;
    color: #616568;
    background: #fff;
    border: 1px solid #e9ebee;
    border-radius: 4px;
    cursor: pointer
}

.pg___cartv2 .modal-selecting-coupon__coupon.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__coupon.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__coupon.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__coupon .radio-coupon {
    margin-right: 8px
}

.pg___cartv2 .modal-selecting-coupon__coupon-none {
    margin-bottom: 4px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__coupon-none {
        margin-bottom: 8px
    }
}

.pg___cartv2 .modal-selecting-coupon__coupon--selected {
    background: #e5f9f1;
    border-color: #00c471
}

.pg___cartv2 .modal-selecting-coupon__coupon--disabled {
    background: #f8f9fa;
    border-color: #e9ebee
}

.pg___cartv2 .modal-selecting-coupon__wrapper-row-to-column {
    display: flex;
    align-items: flex-start;
    width: 100%
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__wrapper-row-to-column {
        flex-direction: column
    }
}

.pg___cartv2 .modal-selecting-coupon__wrapper-row {
    flex-shrink: 0;
    display: flex;
    align-items: flex-start
}

.pg___cartv2 .modal-selecting-coupon__coupon-list>li:nth-of-type(n+2) {
    margin-top: 4px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__coupon-list>li:nth-of-type(n+2) {
        margin-top: 8px
    }
}

.pg___cartv2 .modal-selecting-coupon__discount-value {
    font-weight: 700;
    flex-shrink: 0;
    color: #3e4042
}

.pg___cartv2 .modal-selecting-coupon__discount-value.modal-selecting-coupon__discount-value--unusable {
    color: #abb0b5
}

.pg___cartv2 .modal-selecting-coupon__remain {
    position: relative;
    display: block;
    padding-left: 6px;
    margin-left: 6px;
    flex-shrink: 0;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__remain:before {
    content: "";
    position: absolute;
    left: 0;
    top: 4px;
    width: 1px;
    height: 14px;
    background: #e9ebee
}

.pg___cartv2 .modal-selecting-coupon__remain.modal-selecting-coupon__remain--highlight {
    color: #e5503c
}

.pg___cartv2 .modal-selecting-coupon__remain.modal-selecting-coupon__remain--unusable {
    color: #abb0b5
}

.pg___cartv2 .modal-selecting-coupon__coupon-name {
    position: relative;
    display: block;
    padding-left: 6px;
    margin-left: 6px;
    display: flex;
    flex-wrap: wrap;
    margin-right: auto;
    word-break: break-all;
    color: #616568
}

.pg___cartv2 .modal-selecting-coupon__coupon-name:before {
    content: "";
    position: absolute;
    left: 0;
    top: 4px;
    width: 1px;
    height: 14px;
    background: #e9ebee
}

.pg___cartv2 .modal-selecting-coupon__coupon-name.modal-selecting-coupon__coupon-name--unusable {
    color: #abb0b5
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__coupon-name {
        margin-left: 0;
        padding-left: 0
    }

    .pg___cartv2 .modal-selecting-coupon__coupon-name:before {
        display: none
    }
}

.pg___cartv2 .modal-selecting-coupon__button-show-list,
.pg___cartv2 .modal-selecting-coupon__button-unusable {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 500;
    flex-shrink: 0;
    margin-left: 32px;
    padding: 0;
    color: #616568;
    background: none;
    border: 0;
    cursor: pointer
}

.pg___cartv2 .modal-selecting-coupon__button-show-list.ac-fwb,
.pg___cartv2 .modal-selecting-coupon__button-unusable.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__button-show-list.ac-fwm,
.pg___cartv2 .modal-selecting-coupon__button-unusable.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__button-show-list.ac-fwr,
.pg___cartv2 .modal-selecting-coupon__button-unusable.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__button-show-list>span,
.pg___cartv2 .modal-selecting-coupon__button-unusable>span {
    padding-right: 4px
}

.pg___cartv2 .modal-selecting-coupon__button-show-list path,
.pg___cartv2 .modal-selecting-coupon__button-unusable path {
    fill: #616568
}

@media screen and (max-width:768px) {

    .pg___cartv2 .modal-selecting-coupon__button-show-list,
    .pg___cartv2 .modal-selecting-coupon__button-unusable {
        margin-left: 0;
        margin-top: 6px
    }
}

.pg___cartv2 .modal-selecting-coupon__button-unusable.modal-selecting-coupon__button-unusable--can-resurrect>span:first-of-type {
    padding-right: 1px
}

.pg___cartv2 .modal-selecting-coupon__button-unusable.modal-selecting-coupon__button-unusable--can-resurrect>span:last-of-type {
    text-decoration: underline;
    color: #175cbe
}

.pg___cartv2 .modal-selecting-coupon__contents-appliable-courses {
    overflow: hidden;
    display: flex;
    flex-direction: column;
    padding: 0 28px;
    height: 100%;
    max-height: 100%
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-selecting-coupon__contents-appliable-courses {
        padding: 0 20px
    }
}

.pg___cartv2 .modal-coupon-summary__introduction-for-roadmap {
    line-height: 1.38 !important;
    letter-spacing: -.3px !important;
    font-size: 13px !important;
    color: #858a8d
}

.pg___cartv2 .modal-coupon-summary__introduction-for-roadmap.modal-coupon-summary__introduction-for-roadmap--warning {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: inline-block;
    margin-bottom: 12px;
    color: #e5503c;
    font-style: normal
}

.pg___cartv2 .modal-coupon-summary__introduction-for-roadmap.modal-coupon-summary__introduction-for-roadmap--warning.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-coupon-summary__introduction-for-roadmap.modal-coupon-summary__introduction-for-roadmap--warning.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-coupon-summary__introduction-for-roadmap.modal-coupon-summary__introduction-for-roadmap--warning.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-coupon-summary {
    flex-shrink: 0;
    display: flex;
    padding: 10px 12px;
    background: #fff;
    border: 1px solid #e9ebee;
    border-radius: 4px
}

.pg___cartv2 .modal-coupon-summary>div {
    margin-right: 8px
}

.pg___cartv2 .modal-coupon-summary .radio-coupon__radio+span {
    background: #f1f3f5;
    border: 1px solid #e9ebee
}

.pg___cartv2 .modal-coupon-summary .radio-coupon__radio:checked+span {
    background: transparent;
    border: 6px solid #d5dbe2
}

.pg___cartv2 .modal-coupon-summary.modal-coupon-summary--not-usable {
    background: #f8f9fa
}

.pg___cartv2 .modal-coupon-summary.modal-coupon-summary--selected {
    background: #e5f9f1;
    border: 1px solid #00c471
}

.pg___cartv2 .modal-coupon-summary>dl {
    display: flex
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-summary>dl {
        flex-direction: column
    }
}

.pg___cartv2 .modal-coupon-summary__wrapper-row {
    flex-shrink: 0;
    display: flex
}

.pg___cartv2 .modal-coupon-summary__discount-value {
    font-weight: 500;
    flex-shrink: 0;
    color: #1b1c1d
}

.pg___cartv2 .modal-coupon-summary__ended-at {
    position: relative;
    display: block;
    padding-left: 6px;
    margin-left: 6px;
    flex-shrink: 0
}

.pg___cartv2 .modal-coupon-summary__ended-at:before {
    content: "";
    position: absolute;
    left: 0;
    top: 4px;
    width: 1px;
    height: 14px;
    background: #e9ebee
}

.pg___cartv2 .modal-coupon-summary__ended-at .modal-selecting-coupon__remain {
    margin: 0;
    padding: 0
}

.pg___cartv2 .modal-coupon-summary__ended-at .modal-selecting-coupon__remain:before {
    content: none
}

.pg___cartv2 .modal-coupon-summary__title {
    position: relative;
    display: block;
    padding-left: 6px;
    margin-left: 6px;
    overflow: hidden;
    color: #616568
}

.pg___cartv2 .modal-coupon-summary__title:before {
    content: "";
    position: absolute;
    left: 0;
    top: 4px;
    width: 1px;
    height: 14px;
    background: #e9ebee
}

.pg___cartv2 .modal-coupon-summary__title dd {
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-summary__title {
        margin-left: 0;
        padding-left: 0
    }

    .pg___cartv2 .modal-coupon-summary__title:before {
        display: none
    }

    .pg___cartv2 .modal-coupon-summary__title dd {
        white-space: unset
    }
}

.pg___cartv2 .modal-selecting-coupon__appliable-scroll-section {
    overflow-x: hidden;
    overflow-y: auto;
    height: 100%;
    margin-top: 12px
}

.pg___cartv2 .modal-selecting-coupon__appliable-scroll-section.modal-selecting-coupon__appliable-scroll-section--for-roadmap .modal-coupon-summary__introduction-for-roadmap--intro {
    margin-bottom: 12px
}

.pg___cartv2 .modal-selecting-coupon__appliable-scroll-section.modal-selecting-coupon__appliable-scroll-section--for-b2b .modal-coupon-summary__introduction-for-roadmap--intro {
    margin-bottom: 0
}

.pg___cartv2 .modal-selecting-coupon__appliable-scroll-section.modal-selecting-coupon__appliable-scroll-section--for-b2b .modal-coupon-summary__introduction-for-roadmap--warning {
    margin-bottom: 12px
}

.pg___cartv2 .modal-selecting-coupon__input-search-courses {
    flex-shrink: 0;
    margin-bottom: 12px;
    width: 100%
}

.pg___cartv2 .modal-coupon-search-result {
    flex-shrink: 1;
    overflow: hidden;
    display: flex;
    flex-direction: column
}

.pg___cartv2 .modal-coupon-search-result__list {
    display: block
}

.pg___cartv2 .modal-coupon-search-result__list>.modal-coupon-search-result__list-item:first-of-type {
    border-top: 1px solid #f1f3f5
}

.pg___cartv2 .modal-coupon-search-result__list-item {
    display: flex;
    padding: 12px 0;
    border-bottom: 1px solid #f1f3f5
}

.pg___cartv2 .modal-coupon-search-result__list-item>a {
    flex-shrink: 0;
    display: block;
    margin-right: 12px
}

.pg___cartv2 .modal-coupon-search-result__list-item>div {
    display: flex;
    justify-content: space-between;
    width: 100%
}

.pg___cartv2 .modal-coupon-search-result__list-item img {
    width: 65px;
    height: 42px;
    border: 1px solid #f1f3f5;
    border-radius: 4px
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-search-result__list-item>a {
        display: block;
        margin-right: 8px
    }

    .pg___cartv2 .modal-coupon-search-result__list-item img {
        width: 60px;
        height: 39px
    }
}

.pg___cartv2 .modal-coupon-search-result__info {
    width: 100%
}

.pg___cartv2 .modal-coupon-search-result__course-title {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-line-clamp: 1;
    white-space: nowrap;
    white-space: normal;
    line-height: 1.5;
    max-height: 3rem;
    text-align: left;
    word-break: break-all;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    font-weight: 500;
    color: #1b1c1d
}

.pg___cartv2 .modal-coupon-search-result__course-title.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-coupon-search-result__course-title.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-coupon-search-result__course-title.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-search-result__course-title {
        font-weight: 400;
        line-height: 1.38;
        letter-spacing: -.3px;
        font-size: 13px;
        font-weight: 500
    }

    .pg___cartv2 .modal-coupon-search-result__course-title.ac-fwb {
        font-weight: 700
    }

    .pg___cartv2 .modal-coupon-search-result__course-title.ac-fwm {
        font-weight: 500
    }

    .pg___cartv2 .modal-coupon-search-result__course-title.ac-fwr {
        font-weight: 400
    }
}

.pg___cartv2 .modal-coupon-search-result__instructor-name {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    white-space: normal;
    line-height: 1.5;
    max-height: 1.5rem;
    text-align: left;
    word-break: break-all;
    display: -webkit-box;
    -webkit-line-clamp: 1;
    -webkit-box-orient: vertical;
    width: 100%;
    color: #858a8d
}

.pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-search-result__instructor-name {
        font-weight: 400;
        line-height: 1.38;
        letter-spacing: -.3px;
        font-size: 13px
    }

    .pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwb {
        font-weight: 700
    }

    .pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwm {
        font-weight: 500
    }

    .pg___cartv2 .modal-coupon-search-result__instructor-name.ac-fwr {
        font-weight: 400
    }
}

.pg___cartv2 .modal-coupon-search-result__button-cart-wrapper {
    flex-shrink: 0;
    display: flex;
    align-items: flex-start;
    margin-left: 30px;
    height: 100%
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-coupon-search-result__button-cart-wrapper {
        margin-left: 10px
    }
}

.pg___cartv2 .modal-coupon-search-result__button-cart {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 0;
    width: 40px;
    height: 46px;
    background: none;
    border: 0;
    cursor: pointer
}

.pg___cartv2 .modal-coupon-search-result__button-cart.e-add-cart {
    color: #858a8d
}

.pg___cartv2 .modal-coupon-search-result__button-cart.e-remove-cart {
    color: #3e4042
}

.pg___cartv2 .modal-selecting-coupon__empty-message {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 120px
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p {
    text-align: center
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:first-of-type {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700;
    margin-bottom: 4px;
    color: #3e4042
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:first-of-type.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:first-of-type.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:first-of-type.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:last-of-type {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #858a8d
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:last-of-type.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:last-of-type.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .modal-selecting-coupon__empty-message>p:last-of-type.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .modal-selecting-coupon__button-add-all-to-cart,
.pg___cartv2 .modal-selecting-coupon__button-confirm {
    width: 100%;
    height: 48px
}

.pg___cartv2 .modal-selecting-coupon__button-confirm {
    color: #3e4042;
    border-color: #d5dbe2 !important;
    background-color: #fff !important
}

.pg___cartv2 .modal-coupon-search-result__target-bar {
    width: 100%;
    height: 1px
}

.pg___cartv2 .radio-coupon {
    flex-shrink: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 20px;
    height: 20px
}

.pg___cartv2 .radio-coupon__radio+span {
    display: block;
    width: 100%;
    height: 100%;
    background: #fff;
    border: 2px solid #e9ebee;
    border-radius: 100%
}

.pg___cartv2 .radio-coupon__radio:checked+span {
    border: 6px solid #00c471
}

.pg___cartv2 .radio-coupon__radio:disabled+span {
    background: #f1f3f5
}

.pg___cartv2 .radio-coupon__radio:disabled:checked+span {
    background: #fff;
    border: 6px solid #e9ebee
}

.pg___cartv2 .carts-snackbar {
    background-color: #616568
}

@media screen and (max-width:768px) {
    .pg___cartv2 .carts-snackbar {
        width: calc(100vw - 32px)
    }
}

.pg___cartv2 .carts-snackbar-content {
    display: flex;
    align-items: center
}

@media screen and (max-width:768px) {
    .pg___cartv2 .carts-snackbar-content {
        flex: 1 1 auto;
        width: 0
    }
}

.pg___cartv2 .carts-snackbar-content__msg {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #fff;
    min-width: 254px;
    margin-right: 20px
}

.pg___cartv2 .carts-snackbar-content__msg.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .carts-snackbar-content__msg.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .carts-snackbar-content__msg.ac-fwr {
    font-weight: 400
}

@media screen and (max-width:768px) {
    .pg___cartv2 .carts-snackbar-content__msg {
        min-width: unset
    }
}

.pg___cartv2 .carts-snackbar-content__undo-button {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 700;
    margin-left: auto;
    color: #4dd69c;
    cursor: pointer
}

.pg___cartv2 .carts-snackbar-content__undo-button.ac-fwb {
    font-weight: 700
}

.pg___cartv2 .carts-snackbar-content__undo-button.ac-fwm {
    font-weight: 500
}

.pg___cartv2 .carts-snackbar-content__undo-button.ac-fwr {
    font-weight: 400
}

.pg___cartv2 .carts-snackbar-content__undo-button .infd-icon {
    width: 16px;
    height: 16px
}

.pg___cartv2 .carts-snackbar-content__undo-button .infd-icon path {
    fill: #4dd69c
}

.pg___cartv2 .carts-snackbar-content__divider {
    margin: 0 16px;
    width: 1px;
    height: 10px;
    background-color: #858a8d
}

@media screen and (max-width:768px) {
    .pg___cartv2 .carts-snackbar-content__divider {
        display: none
    }
}

.pg___cartv2 .ac-snackbar__btn {
    display: inline-flex;
    cursor: pointer
}

@media screen and (max-width:768px) {
    .pg___cartv2 .ac-snackbar__btn {
        margin-left: 16px
    }
}

.pg___cartv2 .ac-snackbar__btn .infd-icon {
    width: 16px;
    height: 16px
}

.pg___cartv2 .ac-snackbar__btn .infd-icon path {
    fill: #d5dbe2
}

@-webkit-keyframes fa-flip {
    50% {
        transform: rotateY(-180deg)
    }
}

@keyframes fa-flip {
    50% {
        transform: rotateY(-180deg)
    }
}

.pg___cartv2 .fa-flip {
    -webkit-animation-name: fa-flip;
    animation-name: fa-flip;
    -webkit-animation-direction: normal;
    animation-direction: normal;
    -webkit-animation-duration: 2s;
    animation-duration: 2s;
    -webkit-animation-iteration-count: infinite;
    animation-iteration-count: infinite;
    -webkit-animation-timing-function: ease-in-out;
    animation-timing-function: ease-in-out
}

.pg___cartv2 .close-btn--hidden .ac-tooltip__close {
    display: none
}

.pg___cartv2 .modal-fail-payment {
    min-height: 0
}

.pg___cartv2 .modal-fail-payment .ac-modal__description {
    color: #343a40;
    font-weight: 400;
    font-size: 14px;
    line-height: 150%
}

.pg___cartv2 .modal-fail-payment .ac-modal__buttons {
    justify-content: flex-end
}

@media screen and (max-width:768px) {
    .pg___cartv2 .modal-fail-payment .ac-button {
        margin: 0;
        width: 100%
    }
}

.pg___cartv2 .modal-fail-payment .ac-modal__title h1 {
    font-size: 16px;
    font-weight: 500;
    line-height: 19px
}
</style>