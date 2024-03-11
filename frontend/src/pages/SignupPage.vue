<template>
    <main id="main" class="signup-page pg___signup is_logged_out is-student-user">

        <section class="signup">

            <h2 class="signup__title">회원가입</h2>
            <aside class="signup__messages">
                <h3 class="visually-hidden">회원가입 메세지</h3>
                <div class="signup__messages-slider">
                    <p class="signup__message">인프런에서 다양한 성장의 기회를 얻으세요</p>
                    <p class="signup__message">나의 성장을 돕는 IT 실무 지식 플랫폼</p>
                </div>
            </aside>
            <div class="signup__main" @submit.prevent>
                <form class="signup__form">
                    <div class="form__input-block">
                        <label for="email" class="form__label">이메일</label>
                        <input v-model="member.email" id="email" data-kv="email" type="email"
                            class="form__input--email ac-input--large form__input e-sign-up-input e-email"
                            placeholder="example@inflab.com" />
                        <span class="form__error form__error--email form__error--hide"></span>
                    </div>
                    
                    <div class="form__input-block">
                        <label for="name" class="form__label">이름</label>

                        <div
                            class="ac-input-with-item--large password-input form__input--password form__input e-password-confirm ">

                            <input v-model="member.name" class="e-sign-up-input" value="" data-kv="name" type="text"
                                spellcheck="false" id="name" placeholder="이름" />
                            <span class="e-toggle-password form__toggle-password form__toggle-password--hidden"><svg
                                    width="16" height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                    <path fill="#212529"
                                        d="M10.333 8c0 1.289-1.044 2.333-2.333 2.333C6.71 10.333 5.667 9.29 5.667 8 5.667 6.711 6.71 5.667 8 5.667c1.289 0 2.333 1.044 2.333 2.333z" />
                                    <path fill="#212529" fill-rule="evenodd"
                                        d="M8 2.333c-2.288 0-4.083 1.023-5.37 2.16C1.348 5.63.544 6.902.22 7.469.03 7.8.03 8.2.22 8.533c.323.566 1.127 1.838 2.41 2.973 1.287 1.138 3.082 2.16 5.37 2.16 2.288 0 4.083-1.022 5.37-2.16 1.283-1.135 2.087-2.407 2.41-2.973.19-.333.19-.733 0-1.065-.323-.567-1.127-1.839-2.41-2.974-1.287-1.138-3.082-2.16-5.37-2.16zm-6.912 5.63c.295-.516 1.035-1.685 2.205-2.72C4.461 4.21 6.03 3.333 8 3.333c1.97 0 3.54.877 4.707 1.91 1.17 1.035 1.91 2.204 2.205 2.72.008.015.01.028.01.037 0 .01-.002.022-.01.037-.295.516-1.035 1.685-2.205 2.72-1.168 1.033-2.737 1.91-4.707 1.91-1.97 0-3.54-.877-4.707-1.91-1.17-1.035-1.91-2.204-2.205-2.72-.008-.015-.01-.028-.01-.037 0-.01.002-.022.01-.037z"
                                        clip-rule="evenodd" />
                                </svg></span>
                        </div>

                        <span class="form__error form__error--name form__error--hide"></span>
                    </div>
                    <div class="form__input-block">
                        <label for="password" class="form__label">비밀번호</label>

                        <div
                            class="ac-input-with-item--large password-input form__input--password form__input e-password ">

                            <input v-model="member.password" class="e-sign-up-input--password" value=""
                                data-kv="password" type="password" spellcheck="false" id="password"
                                placeholder="******" />
                            <span class="e-toggle-password form__toggle-password form__toggle-password--hidden"><svg
                                    width="16" height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                    <path fill="#212529"
                                        d="M10.333 8c0 1.289-1.044 2.333-2.333 2.333C6.71 10.333 5.667 9.29 5.667 8 5.667 6.711 6.71 5.667 8 5.667c1.289 0 2.333 1.044 2.333 2.333z" />
                                    <path fill="#212529" fill-rule="evenodd"
                                        d="M8 2.333c-2.288 0-4.083 1.023-5.37 2.16C1.348 5.63.544 6.902.22 7.469.03 7.8.03 8.2.22 8.533c.323.566 1.127 1.838 2.41 2.973 1.287 1.138 3.082 2.16 5.37 2.16 2.288 0 4.083-1.022 5.37-2.16 1.283-1.135 2.087-2.407 2.41-2.973.19-.333.19-.733 0-1.065-.323-.567-1.127-1.839-2.41-2.974-1.287-1.138-3.082-2.16-5.37-2.16zm-6.912 5.63c.295-.516 1.035-1.685 2.205-2.72C4.461 4.21 6.03 3.333 8 3.333c1.97 0 3.54.877 4.707 1.91 1.17 1.035 1.91 2.204 2.205 2.72.008.015.01.028.01.037 0 .01-.002.022-.01.037-.295.516-1.035 1.685-2.205 2.72-1.168 1.033-2.737 1.91-4.707 1.91-1.97 0-3.54-.877-4.707-1.91-1.17-1.035-1.91-2.204-2.205-2.72-.008-.015-.01-.028-.01-.037 0-.01.002-.022.01-.037z"
                                        clip-rule="evenodd" />
                                </svg></span>
                        </div>

                        <p
                            class="form__password-guide-area form__password-guide-area--hide form__password-guide-area--default">
                            <span class="form__password-guide-line form__password-guide-line--default">영문/숫자/특수문자 2가지 이상
                                포함</span>
                            <span class="form__password-guide-line form__password-guide-line--default">8자 이상 32자 이하 입력
                                (공백 제외)</span>
                            <span class="form__password-guide-line form__password-guide-line--default">연속 3자 이상 동일한
                                문자/숫자 제외</span>
                            <span class="form__password-guide-line form__password-guide-line--un-acceptable">비밀번호에 사용할 수
                                없는 문자가 포함되어 있습니다.</span>
                        </p>
                    </div>
                    <button @click="signup()" class="ac-button is-lg is-solid is-primary e-sign-up-button form__button ">가입하기</button>
                    <div class="form__footer">
                        <span class="footer__policy">
                            가입 시, 통합 계정으로 인프랩이 제공하는 서비스를 모두 이용하실 수 있습니다.
                            <a class="policy__link" href="https://www.inflearn.com/policy">통합 계정</a>
                            및 서비스 이용약관 (
                            <a class="policy__link" href="https://www.inflearn.com/policy/terms-of-service">인프런</a> /
                            <a class="policy__link" href="https://www.rallit.com/terms-of-service">랠릿</a>
                            ),
                            <a class="policy__link" href="https://www.inflearn.com/policy/privacy">개인정보처리방침</a>에 동의합니다.
                        </span>
                        <p class="footer__allow-marketing">
                            <label for="allow-marketing" class="allow-marketing__label">통합회원 할인 혜택 및 유용한 채용 소식을
                                받아볼래요.</label>
                            <input id="allow-marketing" type="checkbox" checked data-kv="allowMarketing" />
                        </p>
                    </div>
                </form>
                <div class="signup__social">
                    <hr class="social__line" />
                    <span class="social__title">간편 회원가입</span>
                    <div class="social__signup-buttons">

                        <div class="social__button__wrapper">

                            <div role="tooltip" class="social__button__tooltip" aria-describedby="Kakao-로그인-버튼">
                                최근 로그인
                            </div>

                            <button id="Kakao-로그인-버튼" class="social__button social__button--Kakao e-social-sign-up"
                                data-provider="Kakao"
                                data-link="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=0de1184063abadc9cef9dbf417c567a5&redirect_uri=https%3A%2F%2Fwww.inflearn.com%2Fauth%2Fkakao&scope=profile%2Caccount_email%2Cbirthday%2Cbirthyear%2Cphone_number%2Cage_range%2Cgender&state=%7B%22prev_url%22%3A%22https%3A%2F%2Fwww.inflearn.com%2Fuser%2Fsignin%22%7D"
                                aria-label="카카오로 로그인">

                            </button>
                        </div>


                        <div class="social__button__wrapper">

                            <div role="tooltip" class="social__button__tooltip" aria-describedby="Google-로그인-버튼">
                                최근 로그인
                            </div>

                            <button id="Google-로그인-버튼" class="social__button social__button--Google e-social-sign-up"
                                data-provider="Google"
                                data-link="https://accounts.google.com/o/oauth2/v2/auth?access_type=offline&prompt=consent&scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile&response_type=code&client_id=887875630717-ror9t8ig4obhvokdij07eoochpqbu5kf.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fwww.inflearn.com%2Fauth%2Fgoogle&state=%7B%22prev_url%22%3A%22https%3A%2F%2Fwww.inflearn.com%2Fuser%2Fsignin%22%7D"
                                aria-label="구글로 로그인">
                                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="none"
                                    viewBox="0 0 18 18">
                                    <path fill="#4285F4"
                                        d="M17.785 9.169c0-.738-.06-1.276-.189-1.834h-8.42v3.328h4.942c-.1.828-.638 2.073-1.834 2.91l-.016.112 2.662 2.063.185.018c1.694-1.565 2.67-3.867 2.67-6.597z" />
                                    <path fill="#34A853"
                                        d="M9.175 17.938c2.422 0 4.455-.797 5.94-2.172l-2.83-2.193c-.758.528-1.774.897-3.11.897-2.372 0-4.385-1.564-5.102-3.727l-.105.01-2.769 2.142-.036.1c1.475 2.93 4.504 4.943 8.012 4.943z" />
                                    <path fill="#FBBC05"
                                        d="M4.073 10.743c-.19-.558-.3-1.156-.3-1.774 0-.618.11-1.216.29-1.774l-.005-.119L1.254 4.9l-.091.044C.555 6.159.206 7.524.206 8.969c0 1.445.349 2.81.957 4.026l2.91-2.252z" />
                                    <path fill="#EB4335"
                                        d="M9.175 3.468c1.684 0 2.82.728 3.468 1.335l2.531-2.471C13.62.887 11.598 0 9.175 0 5.667 0 2.638 2.013 1.163 4.943l2.9 2.252c.727-2.162 2.74-3.727 5.112-3.727z" />
                                </svg>
                            </button>
                        </div>


                    </div>
                    <hr class="social__line social__line--mobile" />
                </div>
            </div>
        </section>
    </main>
</template>

<script>
import { mapStores } from 'pinia'
import { useMemberStore } from '@/stores/useMemberStore';

export default {
    name: 'SignupPage',
    data() {
        return { member: { email: '', name:'', password: '' } }
    },
    computed: {
        ...mapStores(useMemberStore)
    },
    methods: {
        async signup() {
            // 로그인 로직 구현
            let result = await this.memberStore.signup(this.member)
            if (result) {
                window.location.href = "/course/list";
            } else {
                alert("로그인 실패");
                this.member = {
                    email: '', password: ''
                }
            }

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

.pg___signup .social__button__wrapper {
    position: relative
}

.pg___signup .social__button {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 44px;
    height: 44px;
    border: 0;
    border-radius: 4px;
    box-shadow: 0 1px 2px 0 rgba(0, 0, 0, .2);
    cursor: pointer
}

.pg___signup .social__button--Kakao {
    background-color: #fae500
}

.pg___signup .social__button--Google {
    background-color: #f8f8f8
}

.pg___signup .social__button--Github {
    background-color: #3c4043
}

.pg___signup .social__button--Apple {
    background-color: #fff
}

.pg___signup .social__button__tooltip {
    display: none;
    position: absolute;
    background-color: #495057;
    color: #fff;
    padding: 5px 10px;
    border-radius: 8px;
    top: -40px;
    width: 84px;
    text-align: center;
    font-size: 14px;
    font-weight: 700;
    line-height: 1.5;
    left: 50%;
    transform: translateX(-50%);
    z-index: 1
}

.pg___signup .social__button__tooltip:after {
    content: "";
    position: absolute;
    bottom: -4px;
    left: 50%;
    transform: translateX(-50%);
    width: 0;
    height: 0;
    border-left: 4px solid transparent;
    border-right: 4px solid transparent;
    border-top: 4px solid #495057
}

.pg___signup .social__button__tooltip--show {
    display: block
}

.pg___signup .form__input-block {
    margin-bottom: 16px
}

.pg___signup .form__label {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 400;
    color: #3e4042
}

.pg___signup .form__label.ac-fwb {
    font-weight: 700
}

.pg___signup .form__label.ac-fwm {
    font-weight: 500
}

.pg___signup .form__label.ac-fwr {
    font-weight: 400
}

.pg___signup .form__input-box:focus-within {
    border-color: #00c471
}

.pg___signup .form__input {
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    margin-top: 4px;
    width: 320px
}

.pg___signup .form__input--password input {
    margin-right: 12px
}

.pg___signup .form__toggle-password {
    cursor: pointer
}

.pg___signup .form__error {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 400;
    margin-top: 4px;
    color: #e5503c
}

.pg___signup .form__error.ac-fwb {
    font-weight: 700
}

.pg___signup .form__error.ac-fwm {
    font-weight: 500
}

.pg___signup .form__error.ac-fwr {
    font-weight: 400
}

.pg___signup .form__password-guide-area {
    display: flex;
    flex-direction: column
}

.pg___signup .form__password-guide-area--hide,
.pg___signup .form__password-guide-area.form__password-guide-area--default .form__password-guide-line--un-acceptable,
.pg___signup .form__password-guide-area:not(.form__password-guide-area--default) .form__password-guide-line--default {
    display: none
}

.pg___signup .form__password-guide-line {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    color: #abb0b5
}

.pg___signup .form__password-guide-line.ac-fwb {
    font-weight: 700
}

.pg___signup .form__password-guide-line.ac-fwm {
    font-weight: 500
}

.pg___signup .form__password-guide-line.ac-fwr {
    font-weight: 400
}

.pg___signup .form__password-guide-line--error {
    color: #e5503c
}

.pg___signup .form__password-guide-line--success {
    color: #00c471
}

.pg___signup .form__password-guide-line--un-acceptable {
    color: #e5503c
}

.pg___signup .form__error--hide {
    display: none
}

.pg___signup .sign-up-modal {
    position: absolute;
    margin: auto;
    border-radius: 3px;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    padding: 5rem 0;
    background: #fff;
    display: flex;
    height: 100%;
    flex-direction: column;
    align-items: center
}

@media screen and (max-width:768px) {
    .pg___signup .sign-up-modal {
        padding: 3rem 1rem;
        width: 100%;
        height: auto
    }
}

.pg___signup .sign-up-modal .sign-up-modal__content {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    max-width: 500px
}

.pg___signup .sign-up-modal .content__title {
    color: #454545;
    font-weight: 400
}

.pg___signup .sign-up-modal .title__verifying-mail {
    font-weight: 800
}

.pg___signup .sign-up-modal .content__body {
    margin-top: 8px;
    white-space: pre-line;
    font-size: .875rem;
    line-height: 30px;
    color: #595959
}

@media screen and (max-width:768px) {
    .pg___signup .sign-up-modal .content__body {
        line-height: 25px;
        word-wrap: break-word;
        word-break: keep-all
    }
}

.pg___signup .sign-up-modal .body__one-step {
    display: inline-block;
    margin-top: 4px;
    letter-spacing: -.6px;
    font-size: .75rem
}

.pg___signup .sign-up-modal .sign-up-modal__go-back {
    width: 290px;
    height: 45px;
    border: none;
    background: #1dc078;
    margin-top: 64px;
    cursor: pointer;
    font-size: .875rem;
    color: #fff
}

.pg___signup .sign-up-modal.sign-up-modal--rallit {
    text-align: center
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__title {
    font-weight: 700;
    line-height: 1.2;
    letter-spacing: -.3px;
    font-size: 30px;
    font-size: 32px;
    margin-top: 30px;
    width: 100%
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__body {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__body.ac-fwb {
    font-weight: 700
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__body.ac-fwm {
    font-weight: 500
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__body.ac-fwr {
    font-weight: 400
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .content__body strong {
    color: #00c471
}

.pg___signup .sign-up-modal.sign-up-modal--rallit .sign-up-modal__go-back {
    margin-top: 32px
}

.pg___signup .signup {
    margin: 64px auto auto;
    width: 320px;
    height: 676px
}

@media screen and (max-width:768px) {
    .pg___signup .signup {
        margin: 24px auto
    }
}

.pg___signup .signup .inflearn-and-rallit-logo {
    margin-bottom: 32px
}

.pg___signup .signup__title {
    text-align: center;
    font-weight: 500;
    font-size: 26px
}

@media screen and (max-width:768px) {
    .pg___signup .signup__title {
        margin-bottom: 16px;
        font-size: 20px
    }
}

.pg___signup .signup__messages {
    text-align: center;
    overflow: hidden;
    margin-bottom: 24px
}

.pg___signup .signup__messages-slider {
    display: flex;
    min-width: 100%;
    max-width: 100%;
    word-break: keep-all
}

.pg___signup .signup__message {
    flex-shrink: 0;
    min-width: 100%;
    max-width: 100%
}

@media screen and (max-width:768px) {
    .pg___signup .signup__main {
        display: flex;
        flex-direction: column-reverse
    }
}

.pg___signup .signup__form {
    display: flex;
    flex-direction: column
}

.pg___signup .form__button {
    margin-top: 16px;
    margin-bottom: 12px
}

.pg___signup .form__footer {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    margin-bottom: 32px
}

.pg___signup .footer__policy {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 400;
    margin-bottom: 6px;
    color: #858a8d
}

.pg___signup .footer__policy.ac-fwb {
    font-weight: 700
}

.pg___signup .footer__policy.ac-fwm {
    font-weight: 500
}

.pg___signup .footer__policy.ac-fwr {
    font-weight: 400
}

.pg___signup .policy__link {
    color: #1964d5
}

.pg___signup .footer__allow-marketing {
    display: flex;
    flex-direction: row-reverse;
    align-items: center
}

.pg___signup .allow-marketing__label {
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 400;
    margin-left: 4px;
    color: #858a8d
}

.pg___signup .allow-marketing__label.ac-fwb {
    font-weight: 700
}

.pg___signup .allow-marketing__label.ac-fwm {
    font-weight: 500
}

.pg___signup .allow-marketing__label.ac-fwr {
    font-weight: 400
}

.pg___signup .signup__social {
    display: flex;
    flex-direction: column;
    align-items: center
}

@media screen and (max-width:768px) {
    .pg___signup .signup__social {
        margin-bottom: 24px
    }
}

.pg___signup .social__line {
    margin: 0 !important;
    width: 100%;
    height: 1px;
    background-color: #f1f3f5
}

.pg___signup .social__line:not(.social__line--mobile) {
    position: relative;
    top: 7.5px
}

@media screen and (max-width:768px) {
    .pg___signup .social__line:not(.social__line--mobile) {
        display: none
    }
}

.pg___signup .social__line.social__line--mobile {
    display: none
}

@media screen and (max-width:768px) {
    .pg___signup .social__line.social__line--mobile {
        display: block
    }
}

.pg___signup .social__title {
    font-weight: 400;
    margin-bottom: 16px;
    padding: 0 8px;
    font-size: 11px;
    line-height: 16px;
    letter-spacing: -.3px;
    color: #abb0b5;
    z-index: 1;
    background: #fff
}

@media screen and (max-width:768px) {
    .pg___signup .social__title {
        margin-bottom: 12px
    }
}

.pg___signup .social__signup-buttons {
    display: flex;
    margin: auto;
    gap: 12px
}

@media screen and (max-width:768px) {
    .pg___signup .social__signup-buttons {
        margin-bottom: 24px
    }
}

.pg___signup .apply_section {
    display: none !important
}

.pg___signup.pg___signup--mobile-rallit #main {
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
    padding: 62px 0;
    min-height: calc(100vh - 62px)
}

.pg___signup.pg___signup--mobile-rallit .signup {
    margin: 0
}
</style>