<template>
  <MobileAsideComponent />
  <main id="main" class="pg___course-slug pg___course-description is_logged_out is-student-user">
    <section class="pg___course-description-section">

      <div class="cd-sticky-wrapper">
        <div class="cd-header
      
      cd-header__not-owned-course
    ">
          <div class="ac-container">
            <div class="ac-r">
              <div class="cd-header__left ac-cd-5 ac-ct-12">
                <div class="cd-header__thumbnail-cover">
                  <div class="cd-header__thumbnail cd-header__thumbnail--discount">
                    <img :src="courseStore.course.image"
                      alt="Thumbnail">
                    <div class="thumbnail-button-cover thumbnail-bottom-button-cover e-preview e-course-preview">
                      <button class="thumbnail-bottom-button">
                        <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                            viewBox="0 0 16 16">
                            <path fill="#ffffff"
                              d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                            </path>
                            <path fill="#ffffff" fill-rule="evenodd"
                              d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                              clip-rule="evenodd"></path>
                          </svg></span>
                        <span class="thumbnail-bottom-button__highlight">10개</span>
                        무료 보기
                      </button>
                    </div>
                  </div>

                  <div class="cd__discount-banner cd-header__discount-banner">얼리버드 할인 중(<span>8</span>시간 남음)</div>
                </div>
              </div>
              <div class="cd-header__right ac-cd-7 ac-ct-12">
                <div class="cd-header__breadcrumb ">
                  <div class="cd-header__breadcrumb-label-wrapper bootstrap-components">

                  </div>

                  <span class="cd-header__breadcrumb-el">개발 · 프로그래밍</span>
                  <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                      xmlns="http://www.w3.org/2000/svg">
                      <path fill="#212529" clip-rule="evenodd"
                        d="m6.22 3.22c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06l-4.25 4.25c-.293.293-.767.293-1.06 0s-.293-.767 0-1.06l3.72-3.72-3.72-3.72c-.293-.293-.293-.767 0-1.06z"
                        fill-rule="evenodd"></path>
                    </svg></span>
                  <span class="cd-header__breadcrumb-el">프론트엔드</span>

                </div>
                <div class="cd-header__title-container ">
                  <h1 class="cd-header__title">
                    {{ courseStore.course.name }} <span class="visually_hidden">대시보드</span>
                  </h1>

                </div>
                <div class="cd-header__info-cover">
                  <span class="cd-header__info--star">
                    <div class="decimal-star " style="width: 70px;">
                      <div class="decimal-star__empty-cover">
                        <span class="infd-icon decimal-star__el " data-id="1" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#dee2e6" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="2" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#dee2e6" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="3" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#dee2e6" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="4" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#dee2e6" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="5" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#dee2e6" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span>
                      </div>
                      <div class="decimal-star__fill-cover" style="width:70px;">
                        <span class="infd-icon decimal-star__el " data-id="1" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#ffc807" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="2" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#ffc807" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="3" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#ffc807" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="4" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#ffc807" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span><span class="infd-icon decimal-star__el " data-id="5" style="width:14px;height:14px;">
                          <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                            <path fill="#ffc807" fill-rule="evenodd"
                              d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                              clip-rule="evenodd"></path>
                          </svg>
                        </span>
                      </div>
                    </div>
                    <strong>(5)</strong>
                  </span>
                  <a
                    href="vue-%EB%81%9D%ED%8C%90%EC%99%95-nuxt3-%EC%99%84%EB%B2%BD%EB%A7%88%EC%8A%A4%ED%84%B0-1.html#reviews">11개의
                    수강평</a>&nbsp;∙&nbsp;
                  <span> <strong>91명</strong>의 수강생 </span>
                </div>
                <div class="cd-header__instructors cd-header__sub-row ">
                  <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                      viewBox="0 0 16 16">
                      <path fill="#ffffff" fill-rule="evenodd"
                        d="M8 1.667c-2.025 0-3.667 1.641-3.667 3.666 0 1.26.636 2.371 1.603 3.031-2.243.822-3.859 2.945-3.933 5.454-.009.277.209.507.485.515.276.008.506-.209.514-.485C3.082 11.158 5.29 9 8 9c2.71 0 4.918 2.157 4.998 4.848.008.276.238.493.514.485.276-.008.493-.239.485-.514-.074-2.51-1.69-4.633-3.933-5.455.967-.66 1.603-1.771 1.603-3.03 0-2.026-1.642-3.667-3.667-3.667zM5.333 5.333c0-1.472 1.194-2.666 2.667-2.666 1.473 0 2.667 1.194 2.667 2.666C10.667 6.806 9.473 8 8 8 6.527 8 5.333 6.806 5.333 5.333z"
                        clip-rule="evenodd"></path>
                    </svg></span>

                  <a href="/users/432199/@gymcoding" target="_blank" class="cd-header__instructors--main">
                    짐코딩 <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="12"
                        viewBox="0 0 16 12">
                        <path fill="#ffffff"
                          d="M13.2 10.5H2.8c-.22 0-.4.169-.4.375v.75c0 .206.18.375.4.375h10.4c.22 0 .4-.169.4-.375v-.75c0-.206-.18-.375-.4-.375zM14.8 3c-.663 0-1.2.504-1.2 1.125 0 .166.04.321.11.464L11.9 5.606c-.385.216-.883.094-1.105-.272L8.758 1.992c.267-.206.442-.515.442-.867C9.2.504 8.663 0 8 0c-.662 0-1.2.504-1.2 1.125 0 .352.175.66.442.867L5.205 5.334c-.223.366-.723.488-1.105.272L2.293 4.59c.067-.14.11-.298.11-.464 0-.621-.538-1.125-1.2-1.125C.54 3 0 3.504 0 4.125S.537 5.25 1.2 5.25c.065 0 .13-.01.193-.019L3.2 9.75h9.6l1.807-4.519c.063.01.128.019.193.019.662 0 1.2-.504 1.2-1.125S15.463 3 14.8 3z">
                        </path>
                      </svg></span>
                  </a>
                </div>

                <div class="cd-header__tags cd-header__sub-row  ">
                  <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                      viewBox="0 0 16 16">
                      <path fill="#ffffff" fill-rule="evenodd"
                        d="M5.773 1.455c-.283 0-.518.216-.542.498L5 4.727H2.545c-.3 0-.545.244-.545.546 0 .301.244.545.545.545H4.91l-.364 4.364h-2c-.3 0-.545.244-.545.545 0 .301.244.546.545.546h1.91l-.224 2.684c-.027.317.224.588.542.588.282 0 .518-.216.541-.498l.231-2.774H9.91l-.224 2.684c-.026.317.224.588.542.588.283 0 .518-.216.542-.498L11 11.273h2.454c.302 0 .546-.245.546-.546 0-.301-.244-.545-.546-.545h-2.363l.364-4.364h2c.3 0 .545-.244.545-.545 0-.302-.244-.546-.546-.546h-1.909l.224-2.684c.027-.317-.224-.588-.542-.588-.282 0-.518.216-.541.498l-.232 2.774H6.091l.224-2.684c.026-.317-.224-.588-.542-.588zM6 5.818l-.364 4.364H10l.364-4.364H6z"
                        clip-rule="evenodd"></path>
                    </svg></span>
                  <a href="/tag-curation/skill/vuejs" target="_blank" class="cd-header__tag">Vue.js</a> <a
                    href="/tag-curation/skill/nuxtjs" target="_blank" class="cd-header__tag">Nuxt.js</a> <a
                    href="/tag-curation/skill/pinia" target="_blank" class="cd-header__tag">pinia</a> <a
                    href="/tag-curation/skill/vue3" target="_blank" class="cd-header__tag">Vue 3</a>
                </div>
              </div>
            </div>
          </div>

        </div>
        <div class="cd-mb-information e-cd-mb-information">

          <div class="cd-floating__price cd-floating__price--dis-installment">
            <div class="cd-floating__price--top">
              <span class="cd-price__discount-rate">25%</span>
              <del class="cd-price__reg-price">{{ courseStore.course.price }}원</del>
              <span class="cd-price__pay-price">123,750원</span>
            </div>
            <div class="cd-floating__price--bottom">
              <p>월 24,750원</p>
              <span class="cd-price__ment">5개월 할부 시</span>
            </div>
          </div>

          <div class="cd-floating__info--wrapper">
            <div class="cd-floating__info bootstrap-components">
              <div class="cd-floating__info-row">
                <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 16 16">
                    <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z"></path>
                  </svg></span>지식공유자:&nbsp;<a href="/users/432199/@gymcoding">짐코딩</a>
              </div>

              <div class="cd-floating__info-row">
                <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 16 16">
                    <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z"></path>
                  </svg></span>
                총 60개 수업 (10시간 59분)
              </div>

              <div class="cd-floating__info-row cd-floating__info-row--duration">
                <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 16 16">
                    <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z"></path>
                  </svg></span>
                수강기한:&nbsp;
                <div data-bs-toggle="tooltip" data-bs-placement="auto" title="유료 수강기간 1개월, 이후 복습 및 질문답변 무제한 가능"
                  class="cd-floating__info-tooltip">
                  <span class="course-duration">무제한</span>
                </div>
              </div>

              <div class="cd-floating__info-row">
                <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 16 16">
                    <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z"></path>
                  </svg></span>수료증: 발급
              </div>

              <div class="cd-floating__info-row cd-floating__info-row--levels">
                <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 16 16">
                    <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z"></path>
                  </svg></span>
                <div>
                  난이도:&nbsp;
                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="누구나 들을 수 있는"
                    class="cd-floating__info-tooltip cd-floating__info--gray">
                    <span>입문</span>
                  </div><span class="infd-icon infd-icon--no-margin">-</span>
                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="선수 지식이 필요한"
                    class="cd-floating__info-tooltip cd-floating__info--gray">
                    <span>초급</span>
                  </div><span class="infd-icon infd-icon--no-margin">-</span>
                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="전문성을 높이는"
                    class="cd-floating__info-tooltip ">
                    <span>중급이상</span>
                  </div>
                </div>
              </div>

              <div class="cd-floating__info-row cd-floating__info-row--whetherAnswer__true">
                <div>지식공유자 답변이 제공되는 강의입니다</div>
              </div>
            </div>
          </div>

          <div class="cd-floating__sub-buttons">
            <span class="cd-floating__sub-button e-add-playlist">
              <span class="infd-icon"><svg xmlns="http://www.w3.org/2000/svg" width="17" height="17"
                  viewBox="0 0 16 16">
                  <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                    d="M2.5 2.5A.5.5 0 0 0 2 3v10a.5.5 0 0 0 .5.5h12a.5.5 0 0 0 .5-.5V4.5a.5.5 0 0 0-.5-.5H7.035a1.5 1.5 0 0 1-1.248-.668l-.406-.61a.5.5 0 0 0-.416-.222H2.5zM1 3a1.5 1.5 0 0 1 1.5-1.5h2.465c.501 0 .97.25 1.248.668l.406.61A.5.5 0 0 0 7.035 3H14.5A1.5 1.5 0 0 1 16 4.5V13a1.5 1.5 0 0 1-1.5 1.5h-12A1.5 1.5 0 0 1 1 13V3z">
                  </path>
                  <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                    d="M8.5 5.5A.5.5 0 0 1 9 6v5a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5z"></path>
                  <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                    d="M11.5 8.5a.5.5 0 0 1-.5.5H6a.5.5 0 0 1 0-1h5a.5.5 0 0 1 .5.5z"></path>
                </svg></span>
              폴더에 추가
            </span>

            <span class="cd-floating__sub-button like-button e-like " data-cnt="22" data-target="PC">
              <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                  xmlns="http://www.w3.org/2000/svg">
                  <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                    d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                  </path>
                </svg></span>
              <span class="infd-icon is-like"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                  viewBox="0 0 16 16">
                  <path fill="#e5503c"
                    d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                  </path>
                </svg></span>
              <span class="cd-floating__sub-button--cnt">22</span>
            </span>
            <span class="cd-floating__sub-button e-share">
              <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                  xmlns="http://www.w3.org/2000/svg">
                  <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                    d="M13.3334 3.66666C13.3334 4.95533 12.2887 6 11 6C10.3257 6 9.7181 5.7139 9.29211 5.25646L5.88379 7.27067C5.95923 7.50012 6.00004 7.74529 6.00004 8C6.00004 8.25469 5.95923 8.49986 5.8838 8.72932L9.29224 10.7434C9.71822 10.286 10.3257 10 11 10C12.2887 10 13.3334 11.0447 13.3334 12.3333C13.3334 13.622 12.2887 14.6667 11 14.6667C9.71138 14.6667 8.66671 13.622 8.66671 12.3333C8.66671 12.0786 8.70752 11.8335 8.78296 11.604L5.37452 9.58992C4.94854 10.0473 4.34103 10.3333 3.66671 10.3333C2.37804 10.3333 1.33337 9.28866 1.33337 8C1.33337 6.71133 2.37804 5.66666 3.66671 5.66666C4.34102 5.66666 4.94853 5.9527 5.37452 6.41007L8.78295 4.39599L8.78321 4.39678C8.70761 4.1671 8.66671 3.92166 8.66671 3.66666C8.66671 2.378 9.71138 1.33333 11 1.33333C12.2887 1.33333 13.3334 2.378 13.3334 3.66666ZM12.3334 3.66666C12.3334 4.40304 11.7364 4.99999 11 4.99999C10.2637 4.99999 9.66671 4.40304 9.66671 3.66666C9.66671 2.93028 10.2637 2.33333 11 2.33333C11.7364 2.33333 12.3334 2.93028 12.3334 3.66666ZM3.66671 9.33333C4.40309 9.33333 5.00004 8.73637 5.00004 8C5.00004 7.26362 4.40309 6.66666 3.66671 6.66666C2.93033 6.66666 2.33337 7.26362 2.33337 8C2.33337 8.73637 2.93033 9.33333 3.66671 9.33333ZM12.3334 12.3333C12.3334 13.0697 11.7364 13.6667 11 13.6667C10.2637 13.6667 9.66671 13.0697 9.66671 12.3333C9.66671 11.5969 10.2637 11 11 11C11.7364 11 12.3334 11.5969 12.3334 12.3333Z">
                  </path>
                </svg></span>
              공유
            </span>
          </div>
        </div>
      </div>

      <div class="cd-menu">
        <div class="ac-container cd-menu__container">
          <span class="cd-menu__el description ">
            <a href="vue-%EB%81%9D%ED%8C%90%EC%99%95-nuxt3-%EC%99%84%EB%B2%BD%EB%A7%88%EC%8A%A4%ED%84%B0-1.html#"
              class="e-cd-menu__link" data-replace="true">
              강의소개
            </a>
          </span>
          <span class="cd-menu__el curriculum ">
            <a href="vue-%EB%81%9D%ED%8C%90%EC%99%95-nuxt3-%EC%99%84%EB%B2%BD%EB%A7%88%EC%8A%A4%ED%84%B0-1.html#curriculum"
              class="e-cd-menu__link" data-replace="true">
              커리큘럼
            </a>
          </span>
          <span class="cd-menu__el reviews ">
            <a href="vue-%EB%81%9D%ED%8C%90%EC%99%95-nuxt3-%EC%99%84%EB%B2%BD%EB%A7%88%EC%8A%A4%ED%84%B0-1.html#reviews"
              class="e-cd-menu__link" data-replace="true">
              수강평<span class="cd-menu__count">11</span>
            </a>
          </span>
          <span class="cd-menu__el questions ">
            <a href="/course/vue-끝판왕-nuxt3-완벽마스터/community" class="e-cd-menu__link" data-replace="true">
              커뮤니티
            </a>
          </span>
          <span class="cd-menu__el news ">
            <a href="/course/vue-끝판왕-nuxt3-완벽마스터/news" class="e-cd-menu__link" data-replace="true">
              새소식
            </a>
          </span>
        </div>
      </div>
      <div class="cd-content">

        <div class="ac-container ac-container-top">
          <div class="ac-r course-description-wrapper">
            <div class="ac-cd-8 ac-ct-12 ac-left-wrapper">
              <div class="ac-left-container">
                <section class="cd-body" id="description">

                  <h2 class="cd-body__title cd-body__intro-title">
                    <strong>중급자</strong>를 위해 준비한<br>
                    <strong>[프론트엔드, Nuxt.js] 강의입니다.</strong>
                  </h2>
                  <p class="cd-body__description">Vue 기반으로 성능이 뛰어난 웹을 빠르게 만들 수 있도록 도와주는 Nuxt 프레임워크 강의입니다. 현업에서 Vue를 사용하고
                    계신 분들이라면 꼭 보셔야하는 강의라고 자신있게 말씀드릴 수 있을 거 같아요~!</p>

                  <section class="cd-fixed-body">
                    <div class="cd-fixed-body__title">
                      ✍️<br>이런 걸<br>배워요!
                    </div>
                    <div class="cd-fixed-body__list-content">

                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Nuxt 파일 기반 라우팅을 활용한 빠른 프론트 구축
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Nuxt 서버 라우트를 활용한 백엔드 API 개발
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>SSR, CSR, SPA, Universal Rendering, Hydration 등 주요 개념
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>SEO 및 Netlify 배포
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Nuxt &amp; App Configuration (환경 변수 설정)
                      </div>
                    </div>
                  </section>

                  <description-builder-result></description-builder-result>



                  <h2 class="cd-recommend-title">
                    <span>이런 분들께</span>
                    <span>추천드려요!</span>
                  </h2>

                  <section class="cd-fixed-body">
                    <div class="cd-fixed-body__title">
                      🎓<br>학습 대상은<br>누구일까요?
                    </div>
                    <div class="cd-fixed-body__list-content">

                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Vue를 사용하여 웹 애플리케이션을 만들고자 하는 분!
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>하나의 소스코드로 완전한 웹을 만들고자 하는 팀!
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Nuxt를 제대로 학습하고 싶으신 분!
                      </div>
                    </div>
                  </section>

                  <section class="cd-fixed-body">
                    <div class="cd-fixed-body__title">
                      📚<br>선수 지식,<br>필요할까요?
                    </div>
                    <div class="cd-fixed-body__list-content">

                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>HTML &amp; CSS
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>JavaScript
                      </div>
                      <div class="cd-fixed-body__list">
                        <span class="infd-icon"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                            viewBox="0 0 16 16">
                            <path fill="#00C471" fill-rule="evenodd"
                              d="M13.78 4.22c.14.14.22.331.22.53s-.08.39-.22.53l-7.25 7.25c-.14.14-.331.22-.53.22s-.39-.08-.53-.22L2.22 9.28c-.133-.142-.205-.33-.201-.525.003-.194.082-.38.22-.517.137-.137.322-.216.516-.22.195-.003.383.07.525.202L6 10.94l6.72-6.72c.14-.14.331-.22.53-.22s.39.08.53.22z"
                              clip-rule="evenodd"></path>
                          </svg></span>Vue3
                      </div>
                    </div>
                  </section>

                  <hr class="cd-body__divider">
                </section>

                <section class="cd-instructors">
                  <div class="cd-instructors__cover">
                    <div class="cd-instructors__header">
                      <div class="cd-instructors__intro">
                        안녕하세요<br>
                        <a target="_blank" href="/users/432199">짐코딩
                          <span class="infd-icon"><svg width="20" height="20" xmlns="http://www.w3.org/2000/svg"
                              viewBox="0 0 20 20">
                              <path fill="#212529"
                                d="M18.258 1.25l-5.578.006c-.13 0-.256.052-.348.144-.093.092-.145.217-.145.348v1.139c0 .065.014.13.039.19s.062.115.11.161c.046.046.101.082.162.106.061.024.126.036.192.035l2.516-.093.07.07-9.53 9.532c-.039.038-.07.083-.09.133-.02.05-.031.103-.031.157 0 .054.01.108.031.158.02.05.051.095.09.133l.785.786c.039.038.084.069.134.09.05.02.103.03.157.03.054 0 .107-.01.157-.03.05-.021.095-.052.133-.09l9.532-9.532.07.07-.093 2.517c-.001.066.01.13.035.192.024.06.06.116.106.163s.1.084.16.11c.061.024.126.038.191.037h1.139c.13 0 .256-.051.348-.144.092-.092.144-.217.144-.348l.006-5.578c0-.13-.052-.256-.144-.348-.093-.092-.218-.144-.348-.144zm-2.242 9.844h-.547c-.145 0-.284.057-.387.16-.103.103-.16.242-.16.387v5.263c0 .055-.022.107-.06.145-.039.039-.09.06-.145.06H3.096c-.055 0-.107-.021-.145-.06-.039-.038-.06-.09-.06-.145V5.284c0-.055.021-.107.06-.146.038-.038.09-.06.145-.06h5.263c.145 0 .285-.057.387-.16.103-.103.16-.242.16-.387v-.547c0-.145-.057-.284-.16-.386-.102-.103-.242-.16-.387-.16H2.891c-.436 0-.853.172-1.16.48-.308.308-.481.725-.481 1.16V17.11c0 .435.173.853.48 1.16.308.308.725.481 1.16.481h12.032c.435 0 .852-.173 1.16-.48.308-.308.48-.726.48-1.16v-5.47c0-.144-.057-.284-.16-.386-.102-.103-.241-.16-.386-.16z">
                              </path>
                            </svg></span></a>입니다.
                      </div>
                      <div class="cd-instructors__thumbnail"><img
                          src="/public/users/thumbnails/432199/0126f7c5-eca4-4dd9-848f-5e094c7a0e00" alt="짐코딩의 썸네일">
                      </div>
                    </div>
                    <div class="cd-instructors__content">
                      <div class="cd-instructors__body cd-instructors__body--long">
                        <p>안녕하세요.<br>코딩 교육 크리에이터 짐코딩 입니다 🙂</p>
                        <p>유튜브에서 코딩 교육 "<a target="_blank" rel="noopener noreferrer nofollow"
                            href="https://www.youtube.com/channel/UCZ30aWiMw5C8mGcESlAGQbA/?sub_confirmation=1"><u><span
                                style="color:rgb(43, 0, 255)">짐코딩 GYM CODING</span></u></a>"채널을 운영하고 있어요.<br>그리고 인프런 교육
                          플랫폼에서 지식을 공유하고 있습니다.</p>
                        <p>제 강의의 특징은 이제 막 시작하시는 분들을 위하여<br>설명하고자 할 때는 최대한 쉽게,<br>알려드리고자 할 때는 최대한 알차게 설명드립니다.</p>
                        <p>항상 수강생 입장에서 생각하는 코딩 교육 크리에이터가 되겠습니다.<br>감사합니다.</p>
                        <p>📨 이메일 bruce.lean17@gmail.com<br>🏋️‍♀️ 헬스타그램 <a target="_blank"
                            rel="noopener noreferrer nofollow" href="https://www.instagram.com/helinlee.gram/"><span
                              style="color:rgb(34, 139, 230)">@helinlee.gram</span></a><br>🧑‍💻 코딩스타그램 <a
                            target="_blank" rel="noopener noreferrer nofollow"
                            href="https://www.instagram.com/gymcoding/"><span
                              style="color:rgb(34, 139, 230)">@gymcoding</span></a></p>
                      </div>

                      <div class="cd-instructors__more">
                        <button class="ac-button is-text e-instructor-more">더 읽기<span class="infd-icon"><svg width="16"
                              height="16" viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg">
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span></button>
                      </div>

                    </div>
                  </div>
                </section>

                <section class="cd-curriculum" id="curriculum">
                  <div class="cd-curriculum__header">
                    <span class="cd-curriculum__title">커리큘럼</span>
                    <span class="cd-curriculum__sub-title">총 60 개
                      ˙ 10시간 59분의 수업</span>
                  </div>
                  <div class="cd-curriculum__description">
                    <span>이 강의는 영상, 수업 노트가 제공됩니다. 미리보기를 통해 콘텐츠를 확인해보세요.</span>
                    <button class="ac-button is-outlined is-gray e-curri-open-all">
                      모두 접기
                    </button>
                  </div>
                  <div class="cd-curriculum__content">
                    <div class="cd-curriculum__accordion cd-accordion">
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open cd-accordion__section--open">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 0. 강의소개 및 오리엔테이션</span>
                          <span class="cd-accordion__section-info">2 강
                            ∙ 13분</span>
                        </div>
                        <div class="cd-accordion__unit-cover">
                          <a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206160"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">강의소개</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">03:30</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206521"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">오리엔테이션 | 강의교안 &amp;amp; 소스코드 설명</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">09:38</span>
                            </span></a>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open cd-accordion__section--open">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 1. 시작하기 전에</span>
                          <span class="cd-accordion__section-info">3 강
                            ∙ 28분</span>
                        </div>
                        <div class="cd-accordion__unit-cover">
                          <a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206523"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">프레임워크란? 프레임워크 공부법!</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">11:45</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206524"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt란 무엇인가?</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">06:37</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206525"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">NVM으로 Nodejs 버전관리</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">10:33</span>
                            </span></a>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open cd-accordion__section--open">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 2. 개발환경 및 프로젝트 구성</span>
                          <span class="cd-accordion__section-info">4 강
                            ∙ 29분</span>
                        </div>
                        <div class="cd-accordion__unit-cover">
                          <a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206527"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">개발환경 구성</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">05:45</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206529"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">프로젝트 구성</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">11:44</span>
                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">ESLint, Prettier 설정</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">05:44</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Quasar UI Framework 설치</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">05:49</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 3. Routing &amp; Layouts</span>
                          <span class="cd-accordion__section-info">13 강
                            ∙ 3시간 24분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206536"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt 컴포넌트 계층</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">19:16</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206537"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">라우팅 기본 : 파일 기반 라우팅</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">15:08</span>
                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Course 페이지 만들기</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:34</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Vue3 with TypeScript</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">12:59</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Course 데이터 가져오기</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">33:55</span>
                            </span>
                          </div><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206541"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">NuxtPage 내장 컴포넌트</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">21:23</span>
                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Utils - definePageMeta</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">09:15</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">라우팅 고급 - 중첩 라우팅</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">16:09</span>
                            </span>
                          </div><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206544"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">NuxtLinkt 내장 컴포넌트</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">27:15</span>
                            </span></a><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206833"><span class="infd-icon"><svg
                                xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="none"
                                viewBox="0 0 16 16">
                                <path fill="#495057" fill-rule="evenodd"
                                  d="M3.333 1.667C3.15 1.667 3 1.816 3 2v12c0 .184.15.333.333.333h9.334c.184 0 .333-.149.333-.333V5.667h-2.667C9.597 5.667 9 5.07 9 4.333V1.667H3.333zm6.667 0v2.666c0 .184.15.334.333.334H13c-.003-.084-.038-.164-.098-.224l-2.678-2.679c-.06-.06-.14-.094-.224-.097zM2 2C2 1.264 2.597.667 3.333.667h6.655c.354 0 .693.14.943.39l2.679 2.679c.25.25.39.589.39.943V14c0 .736-.597 1.333-1.333 1.333H3.333C2.597 15.333 2 14.736 2 14V2z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">인프런 수강후기 이벤트 🎉</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>

                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">레이아웃 구성 - 기초부터 실전까지</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">28:04</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Utils - navigateTo</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">06:23</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Netlify 배포하기</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:37</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 4. Nuxt 주요 개념 및 특징</span>
                          <span class="cd-accordion__section-info">5 강
                            ∙ 1시간 19분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">nuxtApp (Runtime App Context)</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">10:52</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt plugins(다국어) &amp; utils</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">19:52</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Auto-imports</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">06:31</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Rendering Modes</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:44</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Hydration</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">30:55</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 5. Error Handling</span>
                          <span class="cd-accordion__section-info">6 강
                            ∙ 40분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">에러 던지기 : createError Utils</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:42</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">에러 페이지 정의 (with useError, clearError)</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">07:27</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Error Handling (with Lifecycle hooks)</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">06:41</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Error Utils - showError</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">04:11</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">클라이언트 오류 처리 (NuxtErrorBoundary)</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">05:10</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Route Validation</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">05:05</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 6. Route Middleware and Authentication</span>
                          <span class="cd-accordion__section-info">6 강
                            ∙ 58분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Route Middleware 기초</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">05:52</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Authentication 로그인 UI 만들기</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:21</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Page 공통 컴포넌트 만들기 (쉬어가요)</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:50</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Authentication 비즈니스 로직 구현</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">22:15</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Auth Named Middleware 적용</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:17</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Global &amp; Dynamic Middleware</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:48</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 7. State Management</span>
                          <span class="cd-accordion__section-info">7 강
                            ∙ 57분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt 상태관리 : useState()</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">08:02</span>
                            </span>
                          </div><a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206627"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">useRequestHeaders 컴포저블</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">09:27</span>
                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Authentication : useState 적용</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">10:32</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt &amp; Pinia : 상태관리</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">08:44</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Authentication : Pinia 적용</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">08:12</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Authentication : Pinia 상태 유지</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">08:06</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">useCookie : locale 상태 유지</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">04:19</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 8. Server Routes - Course API</span>
                          <span class="cd-accordion__section-info">6 강
                            ∙ 1시간 13분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Server Routes - Course API</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">20:44</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Client Data fetching - Course API</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">07:39</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">[추가영상] 제네릭 타입 추가</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:12</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Server Routes - Auth API</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">16:54</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Client Data fetching - Auth API</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">18:56</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Server Auth Utils &amp; Middleware</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">06:01</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 9. SEO &amp; Meta</span>
                          <span class="cd-accordion__section-info">2 강
                            ∙ 23분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <a class="cd-accordion__unit e-course-preview"
                            href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206647"><span class="infd-icon"><svg width="16"
                                height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">SEO and Meta Basic (with SNS)</span>
                            <span class="ac-accordion__unit-infos">

                              <span class="ac-accordion__unit-info--preview">미리보기</span>
                              <span class="ac-accordion__unit-info--time">14:10</span>
                            </span></a>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">SEO and Meta Advanced</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">09:09</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 10. Nuxt Modules</span>
                          <span class="cd-accordion__section-info">1 강
                            ∙ 15분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Modules : @nuxtjs/i18n 설치</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">15:28</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 11. Data fetching Advanced</span>
                          <span class="cd-accordion__section-info">2 강
                            ∙ 19분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">VueUse : localStorage sessionStorage</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">07:39</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Data fetching caching</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">11:46</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 12. Configuration</span>
                          <span class="cd-accordion__section-info">2 강
                            ∙ 12분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">Nuxt Configuration</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">08:12</span>
                            </span>
                          </div>
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">App Configuration</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:51</span>
                            </span>
                          </div>
                        </div>
                      </div>
                      <div class="cd-accordion__section-cover">
                        <div class="cd-accordion__section e-curri-open ">
                          <span class="infd-icon is-open"><svg width="16" xmlns="http://www.w3.org/2000/svg" height="16"
                              viewBox="0 0 16 16">
                              <path fill="#495057" fill-rule="evenodd"
                                d="M3.22 9.78c-.293-.293-.293-.767 0-1.06l4.25-4.25c.293-.293.767-.293 1.06 0l4.25 4.25c.293.293.293.767 0 1.06-.293.293-.767.293-1.06 0L8 6.06 4.28 9.78c-.293.293-.767.293-1.06 0z"
                                clip-rule="evenodd"></path>
                            </svg></span>
                          <span class="infd-icon is-close"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
                              <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                                d="M12.7803 6.21967C13.0732 6.51256 13.0732 6.98744 12.7803 7.28033L8.53033 11.5303C8.23744 11.8232 7.76256 11.8232 7.46967 11.5303L3.21967 7.28033C2.92678 6.98744 2.92678 6.51256 3.21967 6.21967C3.51256 5.92678 3.98744 5.92678 4.28033 6.21967L8 9.93934L11.7197 6.21967C12.0126 5.92678 12.4874 5.92678 12.7803 6.21967Z">
                              </path>
                            </svg></span>
                          <span class="cd-accordion__section-title">섹션 13. 수고하셨습니다 💕</span>
                          <span class="cd-accordion__section-info">1 강
                            ∙ 3분</span>
                        </div>
                        <div class="cd-accordion__unit-cover" style="max-height: 0px;">
                          <div class="cd-accordion__unit"><span class="infd-icon"><svg width="16" height="16"
                                xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg></span>
                            <span class="ac-accordion__unit-title">제 강의를 찾아주셔서 진심으로 감사드립니다!</span>
                            <span class="ac-accordion__unit-infos">


                              <span class="ac-accordion__unit-info--time">03:22</span>
                            </span>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </section>

                <section class="cd-date">
                  <div class="cd-date__content">
                    <span class="cd-date__published-date">강의 게시일 : 2024년 02월 07일</span>
                    <span class="cd-date__last-updated-at">(마지막 업데이트일 : 2024년 02월 07일)</span>
                  </div>
                </section>


                <div class="cd-reviews-wrapper">

                  <section class="cd-review" id="reviews">
                    <div class="cd-review__header">
                      <span class="cd-review__title">수강평</span>
                      <span class="cd-review__sub-title">총 11개</span>
                    </div>
                    <div class="cd-review__description">
                      수강생분들이 직접 작성하신 수강평입니다.
                    </div>

                    <div class="cd-review__dashboard">
                      <div class="cd-review__dashboard-el dashboard-star">
                        <div class="dashboard-star__num">5</div>
                        <div class="dashboard-star__star">
                          <div class="decimal-star " style="width: 100px;">
                            <div class="decimal-star__empty-cover">
                              <span class="infd-icon decimal-star__el " data-id="1" style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#dee2e6" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="2"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#dee2e6" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="3"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#dee2e6" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="4"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#dee2e6" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="5"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#dee2e6" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span>
                            </div>
                            <div class="decimal-star__fill-cover" style="width:100px;">
                              <span class="infd-icon decimal-star__el " data-id="1" style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#ffc807" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="2"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#ffc807" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="3"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#ffc807" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="4"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#ffc807" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span><span class="infd-icon decimal-star__el " data-id="5"
                                style="width:20px;height:20px;">
                                <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                  <path fill="#ffc807" fill-rule="evenodd"
                                    d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                    clip-rule="evenodd"></path>
                                </svg>
                              </span>
                            </div>
                          </div>
                        </div>
                        <div class="dashboard-star__text">11개의 수강평</div>
                      </div>
                      <div class="cd-review__dashboard-el dashboard-graph">

                        <div class="dashboard-graph__row dashboard-graph__row--5">
                          <span class="dashboard-graph__text">5점</span>
                          <progress class="dashboard-graph__progress" max="11" value="11"></progress>
                        </div>
                        <div class="dashboard-graph__row dashboard-graph__row--4">
                          <span class="dashboard-graph__text">4점</span>
                          <progress class="dashboard-graph__progress" max="11" value="0"></progress>
                        </div>
                        <div class="dashboard-graph__row dashboard-graph__row--3">
                          <span class="dashboard-graph__text">3점</span>
                          <progress class="dashboard-graph__progress" max="11" value="0"></progress>
                        </div>
                        <div class="dashboard-graph__row dashboard-graph__row--2">
                          <span class="dashboard-graph__text">2점</span>
                          <progress class="dashboard-graph__progress" max="11" value="0"></progress>
                        </div>
                        <div class="dashboard-graph__row dashboard-graph__row--1">
                          <span class="dashboard-graph__text">1점</span>
                          <progress class="dashboard-graph__progress" max="11" value="0"></progress>
                        </div>
                      </div>
                    </div>

                    <div class="cd-review__list review-list">

                      <div class="review-list__filter review-filter">
                        <span class="review-filter__title">VIEW</span>
                        <span class="review-filter__divider"></span>
                        <span class="review-filter__el review-filter__el--active e-filter-el" data-type="recommended">
                          <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                              viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>추천 순
                        </span>
                        <span class="review-filter__el e-filter-el" data-type="id">
                          <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                              viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>최신 순
                        </span>
                        <span class="review-filter__cover--PC">
                          <span class="review-filter__el e-filter-el" data-type="high">
                            <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                                viewBox="0 0 16 16">
                                <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                                </path>
                              </svg></span>높은 평점 순
                          </span>
                          <span class="review-filter__el e-filter-el" data-type="low">
                            <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                                viewBox="0 0 16 16">
                                <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                                </path>
                              </svg></span>낮은 평점 순
                          </span>
                        </span>
                        <span class="review-filter__cover--MB">
                          <span class="review-filter__el e-filter-el-MB review-filter__el--active" data-type="normal">
                            <span class="infd-icon"><svg width="16" height="16" xmlns="http://www.w3.org/2000/svg"
                                viewBox="0 0 16 16">
                                <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                                </path>
                              </svg></span>평점 순
                          </span>
                          <span class="review-filter__el e-filter-el-MB" data-type="high">
                            <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                xmlns="http://www.w3.org/2000/svg">
                                <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                  d="M3.39645 6.93688C3.20118 6.74162 3.20118 6.42503 3.39645 6.22977L7.56311 2.06311C7.75838 1.86784 8.07496 1.86784 8.27022 2.06311L12.4369 6.22977C12.6321 6.42503 12.6321 6.74162 12.4369 6.93688C12.2416 7.13214 11.925 7.13214 11.7298 6.93688L8.41667 3.62377L8.41667 13.25C8.41667 13.5261 8.19281 13.75 7.91667 13.75C7.64052 13.75 7.41667 13.5261 7.41667 13.25L7.41667 3.62377L4.10355 6.93688C3.90829 7.13214 3.59171 7.13214 3.39645 6.93688Z">
                                </path>
                              </svg></span>높은 평점 순
                          </span>
                          <span class="review-filter__el e-filter-el-MB" data-type="low">
                            <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                xmlns="http://www.w3.org/2000/svg">
                                <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                  d="M3.39645 9.06312C3.20118 9.25838 3.20118 9.57497 3.39645 9.77023L7.56311 13.9369C7.75837 14.1322 8.07496 14.1322 8.27022 13.9369L12.4369 9.77023C12.6321 9.57497 12.6321 9.25838 12.4369 9.06312C12.2416 8.86786 11.925 8.86786 11.7298 9.06312L8.41667 12.3762L8.41667 2.75001C8.41667 2.47387 8.19281 2.25001 7.91667 2.25001C7.64052 2.25001 7.41667 2.47387 7.41667 2.75001L7.41667 12.3762L4.10355 9.06312C3.90829 8.86786 3.59171 8.86786 3.39645 9.06312Z">
                                </path>
                              </svg></span>낮은 평점 순
                          </span>
                        </span>
                      </div>
                      <div class="review-list__content">


                        <div class="review-list__el-cover bootstrap-components" data-id="138664" data-post-id="">
                          <div class="review-list__el review-el">
                            <div class="review-el__header">
                              <div class="review-el__header--left">
                                <a class="review-el__thumbnail" href="/users/1042362/@munho">
                                  <img src="/public/main/profile/default_profile-1.png" alt="white123 thumbnail">
                                </a>
                                <div class="review-el__user-info">
                                  <a class="review-el__name" href="/users/1042362/@munho">white123</a>
                                  <div class="review-el__meta-cover">
                                    <span class="review-el__meta">
                                      수강평
                                      <span class="review-el__meta--review-count">3</span>
                                    </span>
                                    <span class="review-el__meta">･</span>
                                    <span class="review-el__meta">
                                      평균 평점
                                      <span class="review-el__meta--rating-average">5.0</span>
                                    </span>
                                  </div>
                                </div>
                              </div>
                              <div class="review-el__header--right">
                                <span class="infd-icon e-copy-review-link" data-id="138664">
                                  <i class="far fa-link fa-sm"></i>
                                </span>

                              </div>
                            </div>
                          </div>
                          <div class="review-el__star-cover">
                            <span class="review-el__star">
                              <div class="decimal-star " style="width: 90px;">
                                <div class="decimal-star__empty-cover">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                                <div class="decimal-star__fill-cover" style="width:90px;">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                              </div>
                            </span>
                            <span class="review-el__star-num">5</span>
                          </div>
                          <div class="review-el__body">짐코딩 사이트에서 vue3 기초편부터 시작하여 실전편 ~ FireBase+Vue3 강의까지 완강을 앞두고 있는데
                            Nuxt 출시 소식에 허겁지겁 달려와서 결제부터 하고 있는 내모습...🙋🏻
                            '이건 이렇게 하시면 되요~~' 라는 식의 강의가 아닌 기초부터 천천히 최대한 이해하기 쉽게 설명해주신 덕분에 독학으로 시작하여 취뽀까지 성공했습니다..!!! 항상
                            좋은 퀄리티의 강의 너무너무 감사드리고 앞으로 더 좋은 강의 많이 부탁드립니다🙇🏻‍♂️🙇🏻‍♂️</div>
                          <div class="review-el__tools">
                            <div class="review-el__tools--left">
                              <span class="review-el__tool">
                                2024-02-15
                              </span>

                            </div>
                            <div class="review-el__tools--right review-el__like-button-cover" data-id="138664"
                              data-pid="">
                              <span class="ac-like-button e-like ">
                                <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                    xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                    <path fill="#e5503c"
                                      d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                    </path>
                                  </svg></span>
                                <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                      d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                    </path>
                                  </svg></span>
                                <span class="ac-like-button__count">3</span>
                              </span>
                            </div>
                          </div>
                          <div class="review-list__add-reply"></div>
                          <div class="review-list__reply-list review-reply-list">
                            <div class="review-reply__el-cover" data-id="318529">
                              <div class="review-reply__el review-reply-el">
                                <div class="review-reply-el__header">
                                  <div class="review-reply-el__name review-reply-el__header--left">
                                    <span class="review-reply-el__name--tag">지식공유자</span>
                                    짐코딩
                                  </div>

                                </div>
                                <div class="review-reply-el__body">와우~!! 취업 축하드립니다! 🎉
                                  웹 개발 입문자들을 위하여 HTML 부터 Vue 실전까지! 이해하기 쉽도록 정말 신경 많이썼는데요.
                                  취업까지 성공하셨다니 너무 뿌듯하네요!
                                  감사합니다 💪</div>
                                <div class="review-reply-el__tools">
                                  <span class="review-reply-el__tools--left">
                                    <span class="review-reply-el__tool">2024-02-16</span>
                                  </span>
                                  <span class="review-reply-el__tools--right review-reply-el__like-button-cover"
                                    data-pid="" data-cid="318529">
                                    <span class="ac-like-button e-like ">
                                      <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                          xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                          <path fill="#e5503c"
                                            d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                          </path>
                                        </svg></span>
                                      <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                          xmlns="http://www.w3.org/2000/svg">
                                          <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                            d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                          </path>
                                        </svg></span>
                                      <span class="ac-like-button__count">0</span>
                                    </span>
                                  </span>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="review-list__el-cover bootstrap-components" data-id="138447" data-post-id="">
                          <div class="review-list__el review-el">
                            <div class="review-el__header">
                              <div class="review-el__header--left">
                                <a class="review-el__thumbnail" href="/users/216002">
                                  <img src="/public/main/profile/default_profile-1.png" alt="swgoodcode thumbnail">
                                </a>
                                <div class="review-el__user-info">
                                  <a class="review-el__name" href="/users/216002">swgoodcode</a>
                                  <div class="review-el__meta-cover">
                                    <span class="review-el__meta">
                                      수강평
                                      <span class="review-el__meta--review-count">8</span>
                                    </span>
                                    <span class="review-el__meta">･</span>
                                    <span class="review-el__meta">
                                      평균 평점
                                      <span class="review-el__meta--rating-average">5.0</span>
                                    </span>
                                  </div>
                                </div>
                              </div>
                              <div class="review-el__header--right">
                                <span class="infd-icon e-copy-review-link" data-id="138447">
                                  <i class="far fa-link fa-sm"></i>
                                </span>

                              </div>
                            </div>
                          </div>
                          <div class="review-el__star-cover">
                            <span class="review-el__star">
                              <div class="decimal-star " style="width: 90px;">
                                <div class="decimal-star__empty-cover">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                                <div class="decimal-star__fill-cover" style="width:90px;">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                              </div>
                            </span>
                            <span class="review-el__star-num">5</span>
                          </div>
                          <div class="review-el__body">19년 vue2를 처음 실무에 사용해오다 작년 초 갑작스럽게 vue3로 전환해야 하는 일이 발생했습니다..
                            부랴부랴 강의를 찾아보는데 어디에도 없더군요... 그러다 인프런에서 vue3 강의가 올라온 것을 발견했습니다. 그런데 제가 vue2 강의를 들었던 강사님이 아닌 처음
                            뵙는 분이더군요...
                            걱정 반으로 회사 계정으로 vue3 기초를 들었는데 퀄리티가 굉장히 높았습니다.
                            그래서 개인 계정으로 vue3 심화를 수강했고 이제 마스터했다 생각했는데 주변 부서에서 vueuse, nuxtjs 등 사용한다는 소문을 들었습니다.
                            다시 짐코딩님에게 신세를 지고자 nuxt.js를 수강하게 되었습니다.
                            120% 준비하셨다는 말은 거짓말이 아니라고 느꼇습니다. 제 신입 때 좌우명? 이 120%였는데 반갑네요...
                            이제 Vue 3 &amp; Firebase 올리신 것도 수강하려고 합니다.
                            앞으로 새로운 기술이 나오면 이번처럼 빠른 강의 출시 부탁드립니다!
                            (항상 강의 빨리 출시해주신 덕분에 제가 인프런 다른 강사님에서 여기로 갈아 탔습니다...후훗)</div>
                          <div class="review-el__tools">
                            <div class="review-el__tools--left">
                              <span class="review-el__tool">
                                2024-02-13
                              </span>

                            </div>
                            <div class="review-el__tools--right review-el__like-button-cover" data-id="138447"
                              data-pid="">
                              <span class="ac-like-button e-like ">
                                <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                    xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                    <path fill="#e5503c"
                                      d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                    </path>
                                  </svg></span>
                                <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                      d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                    </path>
                                  </svg></span>
                                <span class="ac-like-button__count">2</span>
                              </span>
                            </div>
                          </div>
                          <div class="review-list__add-reply"></div>
                          <div class="review-list__reply-list review-reply-list">
                            <div class="review-reply__el-cover" data-id="317798">
                              <div class="review-reply__el review-reply-el">
                                <div class="review-reply-el__header">
                                  <div class="review-reply-el__name review-reply-el__header--left">
                                    <span class="review-reply-el__name--tag">지식공유자</span>
                                    짐코딩
                                  </div>

                                </div>
                                <div class="review-reply-el__body">와우~!! 신입 때 좌우명이 120%였군요!!
                                  훌륭한 개발자로 성장하신 느낌적인 느낌이 들어요! 💪
                                  제 강의를 수강해 주시고 알아봐 주셔서 감사합니다 🙂</div>
                                <div class="review-reply-el__tools">
                                  <span class="review-reply-el__tools--left">
                                    <span class="review-reply-el__tool">2024-02-13</span>
                                  </span>
                                  <span class="review-reply-el__tools--right review-reply-el__like-button-cover"
                                    data-pid="" data-cid="317798">
                                    <span class="ac-like-button e-like ">
                                      <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                          xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                          <path fill="#e5503c"
                                            d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                          </path>
                                        </svg></span>
                                      <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                          xmlns="http://www.w3.org/2000/svg">
                                          <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                            d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                          </path>
                                        </svg></span>
                                      <span class="ac-like-button__count">0</span>
                                    </span>
                                  </span>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="review-list__el-cover bootstrap-components" data-id="139409" data-post-id="">
                          <div class="review-list__el review-el">
                            <div class="review-el__header">
                              <div class="review-el__header--left">
                                <a class="review-el__thumbnail" href="/users/390051">
                                  <img src="/public/main/profile/default_profile-1.png" alt="yestudy thumbnail">
                                </a>
                                <div class="review-el__user-info">
                                  <a class="review-el__name" href="/users/390051">yestudy</a>
                                  <div class="review-el__meta-cover">
                                    <span class="review-el__meta">
                                      수강평
                                      <span class="review-el__meta--review-count">1</span>
                                    </span>
                                    <span class="review-el__meta">･</span>
                                    <span class="review-el__meta">
                                      평균 평점
                                      <span class="review-el__meta--rating-average">5.0</span>
                                    </span>
                                  </div>
                                </div>
                              </div>
                              <div class="review-el__header--right">
                                <span class="infd-icon e-copy-review-link" data-id="139409">
                                  <i class="far fa-link fa-sm"></i>
                                </span>

                              </div>
                            </div>
                          </div>
                          <div class="review-el__star-cover">
                            <span class="review-el__star">
                              <div class="decimal-star " style="width: 90px;">
                                <div class="decimal-star__empty-cover">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                                <div class="decimal-star__fill-cover" style="width:90px;">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                              </div>
                            </span>
                            <span class="review-el__star-num">5</span>
                          </div>
                          <div class="review-el__body">처음 vue를 접할 때 독학으로 공부하여 주먹구구식으로 개발을 하였습니다..
                            제대로 배워봐야지 생각만 하고 실천으로 옮긴 건 처음이네요 :)
                            꼼꼼하게 학습해서 부끄럽지 않은 개발자가 되어보도록 하겠습니다🤍</div>
                          <div class="review-el__tools">
                            <div class="review-el__tools--left">
                              <span class="review-el__tool">
                                2024-02-26
                              </span>

                            </div>
                            <div class="review-el__tools--right review-el__like-button-cover" data-id="139409"
                              data-pid="">
                              <span class="ac-like-button e-like ">
                                <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                    xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                    <path fill="#e5503c"
                                      d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                    </path>
                                  </svg></span>
                                <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                      d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                    </path>
                                  </svg></span>
                                <span class="ac-like-button__count">1</span>
                              </span>
                            </div>
                          </div>
                          <div class="review-list__add-reply"></div>
                          <div class="review-list__reply-list review-reply-list">
                            <div class="review-reply__el-cover" data-id="321093">
                              <div class="review-reply__el review-reply-el">
                                <div class="review-reply-el__header">
                                  <div class="review-reply-el__name review-reply-el__header--left">
                                    <span class="review-reply-el__name--tag">지식공유자</span>
                                    짐코딩
                                  </div>

                                </div>
                                <div class="review-reply-el__body">감사합니다!
                                  제 Vue 강의를 정독하시면 현업에서 절대 꿀리지 않을거에요!
                                  수강생분들 스스로할 수 있는 힘을 길러드리기위해 정말 많이 신경썼어요 👍
                                  (한번 보시고 추후에 또 보시는걸 권장드려요! 2배속으로라도 💪)
                                  감사합니다 🙂</div>
                                <div class="review-reply-el__tools">
                                  <span class="review-reply-el__tools--left">
                                    <span class="review-reply-el__tool">2024-02-27</span>
                                  </span>
                                  <span class="review-reply-el__tools--right review-reply-el__like-button-cover"
                                    data-pid="" data-cid="321093">
                                    <span class="ac-like-button e-like ">
                                      <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                          xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                          <path fill="#e5503c"
                                            d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                          </path>
                                        </svg></span>
                                      <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                          xmlns="http://www.w3.org/2000/svg">
                                          <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                            d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                          </path>
                                        </svg></span>
                                      <span class="ac-like-button__count">1</span>
                                    </span>
                                  </span>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="review-list__el-cover bootstrap-components" data-id="138244" data-post-id="">
                          <div class="review-list__el review-el">
                            <div class="review-el__header">
                              <div class="review-el__header--left">
                                <a class="review-el__thumbnail" href="/users/368907/@terasys">
                                  <img src="/public/main/profile/default_profile-1.png" alt="ByoungJU Park thumbnail">
                                </a>
                                <div class="review-el__user-info">
                                  <a class="review-el__name" href="/users/368907/@terasys">ByoungJU Park</a>
                                  <div class="review-el__meta-cover">
                                    <span class="review-el__meta">
                                      수강평
                                      <span class="review-el__meta--review-count">2</span>
                                    </span>
                                    <span class="review-el__meta">･</span>
                                    <span class="review-el__meta">
                                      평균 평점
                                      <span class="review-el__meta--rating-average">5.0</span>
                                    </span>
                                  </div>
                                </div>
                              </div>
                              <div class="review-el__header--right">
                                <span class="infd-icon e-copy-review-link" data-id="138244">
                                  <i class="far fa-link fa-sm"></i>
                                </span>

                              </div>
                            </div>
                          </div>
                          <div class="review-el__star-cover">
                            <span class="review-el__star">
                              <div class="decimal-star " style="width: 90px;">
                                <div class="decimal-star__empty-cover">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#dee2e6" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                                <div class="decimal-star__fill-cover" style="width:90px;">
                                  <span class="infd-icon decimal-star__el " data-id="1" style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="2"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="3"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="4"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span><span class="infd-icon decimal-star__el " data-id="5"
                                    style="width:18px;height:18px;">
                                    <svg width="100%" height="100%" xmlns="http://www.w3.org/2000/svg"
                                      viewBox="0 0 16 16">
                                      <path fill="#ffc807" fill-rule="evenodd"
                                        d="M8 1.3c.133 0 .263.037.375.108.113.07.203.17.262.29l1.778 3.637 3.978.583c.131.02.254.075.355.161.101.086.176.199.217.326.041.126.046.262.014.392-.031.13-.098.247-.193.34l-2.878 2.831.68 3.996c.022.131.007.267-.042.39-.05.124-.133.23-.24.31-.107.078-.234.125-.366.134-.132.01-.263-.018-.38-.08L8 12.831l-3.558 1.887c-.117.062-.248.09-.38.08-.132-.01-.259-.056-.365-.134-.107-.079-.19-.186-.24-.31-.05-.123-.065-.258-.043-.39l.68-3.997-2.88-2.83c-.094-.093-.161-.21-.193-.34-.032-.13-.027-.266.014-.393.04-.127.116-.24.217-.326.102-.086.225-.142.356-.16l3.978-.583 1.779-3.637c.059-.12.15-.22.262-.29.112-.07.242-.108.374-.108z"
                                        clip-rule="evenodd"></path>
                                    </svg>
                                  </span>
                                </div>
                              </div>
                            </span>
                            <span class="review-el__star-num">5</span>
                          </div>
                          <div class="review-el__body">짐코딩의 vue 강의를 듣고 vue 에 대한 남다른 열정이 있어서 nuxt 강의를 기다리고 있어
                            는데 나오니 정말 기뻣습니다. 저가 몇번째로 등록한지는 모르지만 나오자 마자 등록한듯 합니다.
                            vue를 공부하는 많은 사람들이 기다리는 강의 일것 같아요. vue 를 하면 이강의는 꼭들어야 하지 않을까 생각합니다. 강의 내용이 체계적이고 내용에 막힘이 없어서
                            학습하는데 도움이 됩니다.
                            좋은 강의 감사합니다.</div>
                          <div class="review-el__tools">
                            <div class="review-el__tools--left">
                              <span class="review-el__tool">
                                2024-02-08
                              </span>

                            </div>
                            <div class="review-el__tools--right review-el__like-button-cover" data-id="138244"
                              data-pid="">
                              <span class="ac-like-button e-like ">
                                <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                    xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                    <path fill="#e5503c"
                                      d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                    </path>
                                  </svg></span>
                                <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                    xmlns="http://www.w3.org/2000/svg">
                                    <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                      d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                    </path>
                                  </svg></span>
                                <span class="ac-like-button__count">2</span>
                              </span>
                            </div>
                          </div>
                          <div class="review-list__add-reply"></div>
                          <div class="review-list__reply-list review-reply-list">
                            <div class="review-reply__el-cover" data-id="317404">
                              <div class="review-reply__el review-reply-el">
                                <div class="review-reply-el__header">
                                  <div class="review-reply-el__name review-reply-el__header--left">
                                    <span class="review-reply-el__name--tag">지식공유자</span>
                                    짐코딩
                                  </div>

                                </div>
                                <div class="review-reply-el__body">와우~!! 말씀하신 것처럼 Vue를 수강하시는 분들이 많은 도움을 드릴 수 있도록
                                  정말 체계적으로 구성한 강의에요 도움이 되셨다니 뿌듯하네용 🥹
                                  감사합니다~!! 💪</div>
                                <div class="review-reply-el__tools">
                                  <span class="review-reply-el__tools--left">
                                    <span class="review-reply-el__tool">2024-02-11</span>
                                  </span>
                                  <span class="review-reply-el__tools--right review-reply-el__like-button-cover"
                                    data-pid="" data-cid="317404">
                                    <span class="ac-like-button e-like ">
                                      <span class="infd-icon ac-like-button__icon--visible"><svg width="16"
                                          xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                                          <path fill="#e5503c"
                                            d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                                          </path>
                                        </svg></span>
                                      <span class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                                          xmlns="http://www.w3.org/2000/svg">
                                          <path fill="#adb5bd" fill-rule="evenodd" clip-rule="evenodd"
                                            d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                                          </path>
                                        </svg></span>
                                      <span class="ac-like-button__count">0</span>
                                    </span>
                                  </span>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="cd-review__more">
                      <button class="ac-button is-md is-outlined is-gray e-show-more-review "
                        style="min-width: 100%">수강평 더보기</button>
                    </div>
                  </section>
                </div>
              </div>
            </div>
            <div class="ac-cd-4 ac-ct-12 ac-right-wrapper">
              <aside class="cd-floating">
                <div class="e-curation-banner-desktop">
                  <div class="cd-floating__curation-default"></div>
                </div>
                <div class="cd-floating__container e-floating-wrapper">
                  <div class="cd-floating__card e-cd-floating-card">
                    <div class="cd__discount-banner cd-floating__discount-banner">얼리버드 할인 중(<span>8</span>시간 남음)</div>
                    <div class="cd-floating__card--top">
                      <div class="cd-floating__price cd-floating__price--dis-installment">
                        <div class="cd-floating__price--top"><span class="cd-price__discount-rate">25%</span><del
                            class="cd-price__reg-price">{{ currency(courseStore.course.price) }}</del><span
                            class="cd-price__pay-price">123,750원</span></div>
                        <div class="cd-floating__price--bottom">
                          <p>월 24,750원</p><span class="cd-price__ment">5개월 할부 시</span>
                        </div>
                      </div>
                      <div class="cd-floating__buttons"><button
                          class="ac-button is-lg is-solid is-primary floating__main-button e-enrol "
                          data-type="cart">수강신청 하기</button><button
                          class="ac-button is-lg is-outlined is-gray floating__main-button e-add-cart "
                          data-type="add-cart">바구니에 담기</button></div>
                      <div class="cd-floating__sub-buttons"><span class="cd-floating__sub-button e-add-playlist"><span
                            class="infd-icon"><svg xmlns="http://www.w3.org/2000/svg" width="17" height="17"
                              viewBox="0 0 16 16">
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M2.5 2.5A.5.5 0 0 0 2 3v10a.5.5 0 0 0 .5.5h12a.5.5 0 0 0 .5-.5V4.5a.5.5 0 0 0-.5-.5H7.035a1.5 1.5 0 0 1-1.248-.668l-.406-.61a.5.5 0 0 0-.416-.222H2.5zM1 3a1.5 1.5 0 0 1 1.5-1.5h2.465c.501 0 .97.25 1.248.668l.406.61A.5.5 0 0 0 7.035 3H14.5A1.5 1.5 0 0 1 16 4.5V13a1.5 1.5 0 0 1-1.5 1.5h-12A1.5 1.5 0 0 1 1 13V3z">
                              </path>
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M8.5 5.5A.5.5 0 0 1 9 6v5a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5z"></path>
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M11.5 8.5a.5.5 0 0 1-.5.5H6a.5.5 0 0 1 0-1h5a.5.5 0 0 1 .5.5z"></path>
                            </svg></span>폴더에 추가</span><span class="cd-floating__sub-button like-button e-like "
                          data-cnt="22" data-target="PC"><span class="infd-icon"><svg width="16" height="16"
                              viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg">
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M4.49095 2.66666C3.10493 2.66666 1.66663 3.92028 1.66663 5.67567C1.66663 7.74725 3.21569 9.64919 4.90742 11.0894C5.73796 11.7965 6.571 12.3653 7.19759 12.7576C7.51037 12.9534 7.7704 13.1045 7.95123 13.2061C7.96818 13.2156 7.98443 13.2247 7.99996 13.2333C8.01549 13.2247 8.03174 13.2156 8.04869 13.2061C8.22952 13.1045 8.48955 12.9534 8.80233 12.7576C9.42892 12.3653 10.262 11.7965 11.0925 11.0894C12.7842 9.64919 14.3333 7.74725 14.3333 5.67567C14.3333 3.92028 12.895 2.66666 11.509 2.66666C10.1054 2.66666 8.9751 3.59266 8.4743 5.09505C8.40624 5.29922 8.21518 5.43693 7.99996 5.43693C7.78474 5.43693 7.59368 5.29922 7.52562 5.09505C7.02482 3.59266 5.89453 2.66666 4.49095 2.66666ZM7.99996 13.8018L8.22836 14.2466C8.08499 14.3202 7.91493 14.3202 7.77156 14.2466L7.99996 13.8018ZM0.666626 5.67567C0.666626 3.368 2.55265 1.66666 4.49095 1.66666C6.01983 1.66666 7.25381 2.48414 7.99996 3.73655C8.74611 2.48414 9.98009 1.66666 11.509 1.66666C13.4473 1.66666 15.3333 3.368 15.3333 5.67567C15.3333 8.22121 13.4657 10.3823 11.7407 11.8509C10.863 12.5982 9.98767 13.1953 9.33301 13.6052C9.00516 13.8104 8.73133 13.9696 8.53847 14.0779C8.44201 14.1321 8.36571 14.1737 8.31292 14.2019C8.28653 14.2161 8.26601 14.2269 8.25177 14.2344L8.2352 14.2431L8.23054 14.2455L8.22914 14.2462C8.22897 14.2463 8.22836 14.2466 7.99996 13.8018C7.77156 14.2466 7.77173 14.2467 7.77156 14.2466L7.76938 14.2455L7.76472 14.2431L7.74815 14.2344C7.73391 14.2269 7.71339 14.2161 7.687 14.2019C7.63421 14.1737 7.55791 14.1321 7.46145 14.0779C7.26858 13.9696 6.99476 13.8104 6.66691 13.6052C6.01225 13.1953 5.13695 12.5982 4.25917 11.8509C2.53423 10.3823 0.666626 8.22121 0.666626 5.67567Z">
                              </path>
                            </svg></span><span class="infd-icon is-like"><svg width="16"
                              xmlns="http://www.w3.org/2000/svg" height="16" viewBox="0 0 16 16">
                              <path fill="#e5503c"
                                d="M9.333 13.605c-.328.205-.602.365-.795.473-.102.057-.205.113-.308.168h-.002c-.143.074-.313.074-.456 0-.105-.054-.208-.11-.31-.168-.193-.108-.467-.268-.795-.473-.655-.41-1.53-1.007-2.408-1.754C2.534 10.382.667 8.22.667 5.676c0-2.308 1.886-4.01 3.824-4.01 1.529 0 2.763.818 3.509 2.07.746-1.252 1.98-2.07 3.509-2.07 1.938 0 3.824 1.702 3.824 4.01 0 2.545-1.867 4.706-3.592 6.175-.878.747-1.753 1.344-2.408 1.754z">
                              </path>
                            </svg></span><span class="cd-floating__sub-button--cnt">22</span></span><span
                          class="cd-floating__sub-button e-share"><span class="infd-icon"><svg width="16" height="16"
                              viewBox="0 0 16 16" xmlns="http://www.w3.org/2000/svg">
                              <path fill="#212529" fill-rule="evenodd" clip-rule="evenodd"
                                d="M13.3334 3.66666C13.3334 4.95533 12.2887 6 11 6C10.3257 6 9.7181 5.7139 9.29211 5.25646L5.88379 7.27067C5.95923 7.50012 6.00004 7.74529 6.00004 8C6.00004 8.25469 5.95923 8.49986 5.8838 8.72932L9.29224 10.7434C9.71822 10.286 10.3257 10 11 10C12.2887 10 13.3334 11.0447 13.3334 12.3333C13.3334 13.622 12.2887 14.6667 11 14.6667C9.71138 14.6667 8.66671 13.622 8.66671 12.3333C8.66671 12.0786 8.70752 11.8335 8.78296 11.604L5.37452 9.58992C4.94854 10.0473 4.34103 10.3333 3.66671 10.3333C2.37804 10.3333 1.33337 9.28866 1.33337 8C1.33337 6.71133 2.37804 5.66666 3.66671 5.66666C4.34102 5.66666 4.94853 5.9527 5.37452 6.41007L8.78295 4.39599L8.78321 4.39678C8.70761 4.1671 8.66671 3.92166 8.66671 3.66666C8.66671 2.378 9.71138 1.33333 11 1.33333C12.2887 1.33333 13.3334 2.378 13.3334 3.66666ZM12.3334 3.66666C12.3334 4.40304 11.7364 4.99999 11 4.99999C10.2637 4.99999 9.66671 4.40304 9.66671 3.66666C9.66671 2.93028 10.2637 2.33333 11 2.33333C11.7364 2.33333 12.3334 2.93028 12.3334 3.66666ZM3.66671 9.33333C4.40309 9.33333 5.00004 8.73637 5.00004 8C5.00004 7.26362 4.40309 6.66666 3.66671 6.66666C2.93033 6.66666 2.33337 7.26362 2.33337 8C2.33337 8.73637 2.93033 9.33333 3.66671 9.33333ZM12.3334 12.3333C12.3334 13.0697 11.7364 13.6667 11 13.6667C10.2637 13.6667 9.66671 13.0697 9.66671 12.3333C9.66671 11.5969 10.2637 11 11 11C11.7364 11 12.3334 11.5969 12.3334 12.3333Z">
                              </path>
                            </svg></span>공유</span></div>
                    </div>
                    <div class="cd-floating__card--bottom">
                      <div class="cd-floating__info bootstrap-components">
                        <div class="cd-floating__info-row"><span class="infd-icon"><svg width="16" height="16"
                              xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>지식공유자:&nbsp;<a href="/users/432199/@gymcoding">짐코딩</a></div>
                        <div class="cd-floating__info-row"><span class="infd-icon"><svg width="16" height="16"
                              xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>총 60개 수업 (10시간 59분)</div>
                        <div class="cd-floating__info-row cd-floating__info-row--duration"><span class="infd-icon"><svg
                              width="16" height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>수강기한:&nbsp;<div data-bs-toggle="tooltip" data-bs-placement="auto"
                            title="유료 수강기간 1개월, 이후 복습 및 질문답변 무제한 가능" class="cd-floating__info-tooltip"><span
                              class="course-duration">무제한</span></div>
                        </div>
                        <div class="cd-floating__info-row"><span class="infd-icon"><svg width="16" height="16"
                              xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>수료증: 발급</div>
                        <div class="cd-floating__info-row cd-floating__info-row--levels"><span class="infd-icon"><svg
                              width="16" height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                              <path fill="#212529" d="M8 10c-1.105 0-2-.895-2-2s.895-2 2-2 2 .895 2 2-.895 2-2 2z">
                              </path>
                            </svg></span>
                          <div>난이도:&nbsp;<div data-bs-toggle="tooltip" data-bs-placement="auto" title="누구나 들을 수 있는"
                              class="cd-floating__info-tooltip cd-floating__info--gray"><span>입문</span></div><span
                              class="infd-icon infd-icon--no-margin">-</span>
                            <div data-bs-toggle="tooltip" data-bs-placement="auto" title="선수 지식이 필요한"
                              class="cd-floating__info-tooltip cd-floating__info--gray"><span>초급</span></div><span
                              class="infd-icon infd-icon--no-margin">-</span>
                            <div data-bs-toggle="tooltip" data-bs-placement="auto" title="전문성을 높이는"
                              class="cd-floating__info-tooltip "><span>중급이상</span></div>
                          </div>
                        </div>
                        <div class="cd-floating__info-row cd-floating__info-row--whetherAnswer__true">
                          <div>지식공유자 답변이 제공되는 강의입니다</div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </aside>
            </div>
          </div>
        </div>

      </div>
      <!-- 강사의 다른 강의 추천 리스트 -->
      <div class="courses-by-inst-container"></div>
      <!-- 스킬 관련 채용 공고 -->
      <div class="curated-position"></div>
      <!-- 스킬태그 기반 유사 강의 추천 리스트 -->
      <div class="courses-by-skill-container"></div>

      <div class="cd-sub-courses cd-similar-courses">
        <div class="ac-container">
          <div class="sub-courses__header">
            <div class="sub-courses__title">연관 로드맵</div>
            <div class="sub-courses__sub-title">이 강의가 포함된 잘 짜여진 로드맵을 따라 학습해 보세요!</div>
          </div>
          <div class="sub-courses__content">
            <div class="roadmaps_card columns is-multiline is-mobile">
              <div class="column is-4-desktop is-6-touch">
                <div class="card image_card roadmap_card">
                  <a href="/roadmaps/768">
                    <div class="card-image">
                      <figure class="image"><img
                          src="/public/roadmaps/768/cover/11c7e9b6-18d0-4f2c-bc58-fba723e95d88/2.png" alt="로드맵 대표 이미지">
                      </figure>
                    </div>
                    <div class="card-content">
                      <div class="content">
                        <h5>[짐코딩] Vue 실무자를 위한 최신 Vue 3 &amp; Nuxt 3 Mastery Class</h5>
                        <p class="page_meta"><span class="author">By 짐코딩</span></p>
                      </div>
                    </div>
                  </a>
                </div>
              </div>
              <div class="column is-4-desktop is-6-touch">
                <div class="card image_card roadmap_card">
                  <a href="/roadmaps/781">
                    <div class="card-image">
                      <figure class="image"><img
                          src="/public/roadmaps/781/cover/540b0cf3-d3ab-45ab-b45b-56a871bbb72f/%EB%8F%84%EB%9D%BC%20%EB%A1%9C%EB%93%9C%EB%A7%B5%20%EB%AA%A8%EC%9D%8C.png"
                          alt="로드맵 대표 이미지"></figure>
                    </div>
                    <div class="card-content">
                      <div class="content">
                        <h5>[짐코딩] 웹 개발 입문부터 최신 Vue 3 프론트엔드 실전까지 풀코스!</h5>
                        <p class="page_meta"><span class="author">By 짐코딩</span></p>
                      </div>
                    </div>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="cd-floating__curation-mobile e-curation-banner-mobile"></div>
      <div class="cd-mb-floating e-floating-wrapper"><button
          class="ac-button is-lg is-outlined is-gray floating__main-button e-add-cart " data-type="add-cart">바구니에
          담기</button><button class="ac-button is-lg is-solid is-primary floating__main-button e-enrol "
          data-type="cart">수강신청 하기</button></div>
    </section>
  </main>
</template>

<script>
import MobileAsideComponent from '@/components/MobileAsideComponent.vue'
import { mapStores } from 'pinia'
import { useCourseStore } from '@/stores/useCourseStore';


export default {
  name: 'CourseDetail',
  components: {
    MobileAsideComponent,
  },
  computed: {
    ...mapStores(useCourseStore)
  },
  mounted() {
    this.courseStore.getCourseDetail(this.$route.params.id);
  },
  methods: {
    currency(value) {
      return value.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",") + "원";
    }
  }
}
</script>

<style scoped></style>