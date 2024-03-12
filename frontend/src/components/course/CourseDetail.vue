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
                    <img :src="courseStore.course.image" alt="Thumbnail">
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
                  <a :href="'/course/' + courseStore.course.id + '#reviews'">11개의
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
            <a :href="'/course/' + courseStore.course.id + '#'" class="e-cd-menu__link" data-replace="true">
              강의소개
            </a>
          </span>
          <span class="cd-menu__el curriculum ">
            <a :href="'/course/' + courseStore.course.id + '#curriculum'" class="e-cd-menu__link" data-replace="true">
              커리큘럼
            </a>
          </span>
          <span class="cd-menu__el reviews ">
            <a :href="'/course/' + courseStore.course.id + '#reviews'" class="e-cd-menu__link" data-replace="true">
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
                      <div v-for="section in courseStore.course.sections" :key="section.id"
                        class="cd-accordion__section-cover">
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
                          <span class="cd-accordion__section-title">{{ section.name }}</span>
                          <span class="cd-accordion__section-info">{{ section.lectures.length }} 강
                            ∙ 13분</span>
                        </div>
                        <div class="cd-accordion__unit-cover">
                          <a v-for="lecture in section.lectures" :key="lecture.id"
                            class="cd-accordion__unit e-course-preview" href="/course/vue-끝판왕-nuxt3-완벽마스터/unit/206160">
                            <span class="infd-icon">
                              <svg width="16" height="16" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16">
                                <path fill="#212529"
                                  d="M6.333 10.39V5.61c0-.263.292-.422.514-.28l3.717 2.39c.204.13.204.43 0 .56l-3.717 2.39c-.222.142-.514-.017-.514-.28z">
                                </path>
                                <path fill="#212529" fill-rule="evenodd"
                                  d="M8 1.667C4.502 1.667 1.667 4.502 1.667 8S4.502 14.333 8 14.333 14.333 11.498 14.333 8 11.498 1.667 8 1.667zM.667 8C.667 3.95 3.95.667 8 .667c4.05 0 7.333 3.283 7.333 7.333 0 4.05-3.283 7.333-7.333 7.333C3.95 15.333.667 12.05.667 8z"
                                  clip-rule="evenodd"></path>
                              </svg>
                            </span>
                            <span class="ac-accordion__unit-title">{{ lecture.name }}</span>
                            <span class="ac-accordion__unit-infos">
                              <span class="ac-accordion__unit-info--time">{{ lecture.playTime }}</span>
                            </span>
                          </a>
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
                    <div class="cd-floating__card--top">
                      <div class="cd-floating__price cd-floating__price--dis-installment">
                        <div class="cd-floating__price--top"><span class="cd-price__discount-rate">25%</span><del
                            class="cd-price__reg-price">{{ currency(courseStore.course.price) }}</del>

                        </div>
                        <div class="cd-floating__price--bottom">
                          <p> 24,750원</p>
                        </div>

                      </div>
                      <div class="cd-floating__buttons">
                        <button @click="enrollment"
                          class="ac-button is-lg is-solid is-primary floating__main-button e-enrol "
                          data-type="cart">수강신청 하기</button>
                      </div>
                      <div class="cd-floating__sub-buttons">
                        <span class="cd-floating__sub-button like-button e-like " data-cnt="22" data-target="PC"><span
                            class="infd-icon"><svg width="16" height="16" viewBox="0 0 16 16"
                              xmlns="http://www.w3.org/2000/svg">
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
                            </svg></span>공유</span>
                      </div>
                    </div>
                    <div class="cd-floating__card--bottom">
                      <div class="cd-floating__info bootstrap-components">

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
      <div class="cd-mb-floating e-floating-wrapper">
        <button @click="enrollment" class="ac-button is-lg is-outlined is-gray floating__main-button e-add-cart "
          data-type="add-cart">바구니에
          담기</button><button class="ac-button is-lg is-solid is-primary floating__main-button e-enrol "
          data-type="cart">수강신청 하기</button>
      </div>
    </section>
  </main>
</template>

<script>
import MobileAsideComponent from '@/components/MobileAsideComponent.vue'
import { mapStores } from 'pinia'
import { useCourseStore } from '@/stores/useCourseStore';
import { useCartStore } from '@/stores/useCartStore';


export default {
  name: 'CourseDetail',
  components: {
    MobileAsideComponent,
  },
  computed: {
    ...mapStores(useCourseStore, useCartStore),
  },
  mounted() {
    this.courseStore.getCourseDetail(this.$route.params.id);
  },
  methods: {
    currency(value) {
      return value.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",") + "원";
    },
    enrollment() {
      this.cartStore.addCart(this.courseStore.course);
      window.location.href = "/cart";
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

.space-inset-stretch-8,.space-inset-stretch-12 {
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

@media screen and (min-width: 1200px) {
    .container {
        max-width:1180px
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

@media screen and (max-width: 768px) {
    .title.is-2 {
        font-size:1.5rem
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

@media screen and (max-width: 768px) {
    .text.is-1 {
        font-size:.9375rem
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

.ac-display-30,.ac-header-24 {
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

.ac-body-16,.ac-header-20.ac-fwr {
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

.ac-body-15,.ac-body-16.ac-fwr {
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

.ac-body-14,.ac-body-15.ac-fwr {
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

.ac-body-14.ac-fwr,.ac-small-13 {
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

.ac-small-12,.ac-small-13.ac-fwr {
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

.ac-caption,.ac-small-12.ac-fwr {
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

.ac-container,.ac-r {
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

.ac-cd,.ac-cd-1,.ac-cd-2,.ac-cd-3,.ac-cd-4,.ac-cd-5,.ac-cd-6,.ac-cd-7,.ac-cd-8,.ac-cd-9,.ac-cd-10,.ac-cd-11,.ac-cd-12,.ac-cd-offset-0,.ac-cd-offset-1,.ac-cd-offset-2,.ac-cd-offset-3,.ac-cd-offset-4,.ac-cd-offset-5,.ac-cd-offset-6,.ac-cd-offset-7,.ac-cd-offset-8,.ac-cd-offset-9,.ac-cd-offset-10,.ac-cd-offset-11,.ac-cd-offset-12 {
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

@media screen and (max-width: 1024px) {
    .ac-container {
        padding:0 24px;
        max-width: 1024px
    }

    .ac-ct,.ac-ct-1,.ac-ct-2,.ac-ct-3,.ac-ct-4,.ac-ct-5,.ac-ct-6,.ac-ct-7,.ac-ct-8,.ac-ct-9,.ac-ct-10,.ac-ct-11,.ac-ct-12,.ac-ct-offset-0,.ac-ct-offset-1,.ac-ct-offset-2,.ac-ct-offset-3,.ac-ct-offset-4,.ac-ct-offset-5,.ac-ct-offset-6,.ac-ct-offset-7,.ac-ct-offset-8,.ac-ct-offset-9,.ac-ct-offset-10,.ac-ct-offset-11,.ac-ct-offset-12,.ac-ct-unit,.ac-ct-unit-1,.ac-ct-unit-2,.ac-ct-unit-3,.ac-ct-unit-4,.ac-ct-unit-5,.ac-ct-unit-6,.ac-ct-unit-7,.ac-ct-unit-8,.ac-ct-unit-offset-0,.ac-ct-unit-offset-1,.ac-ct-unit-offset-2,.ac-ct-unit-offset-3,.ac-ct-unit-offset-4,.ac-ct-unit-offset-5,.ac-ct-unit-offset-6,.ac-ct-unit-offset-7 {
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

    .center-ct,.start-ct {
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

@media screen and (max-width: 768px) {
    .ac-container {
        padding:0 24px;
        max-width: 768px
    }

    .ac-cm,.ac-cm-1,.ac-cm-2,.ac-cm-3,.ac-cm-4,.ac-cm-5,.ac-cm-6,.ac-cm-7,.ac-cm-8,.ac-cm-9,.ac-cm-10,.ac-cm-11,.ac-cm-12,.ac-cm-offset-0,.ac-cm-offset-1,.ac-cm-offset-2,.ac-cm-offset-3,.ac-cm-offset-4,.ac-cm-offset-5,.ac-cm-offset-6,.ac-cm-offset-7,.ac-cm-offset-8,.ac-cm-offset-9,.ac-cm-offset-10,.ac-cm-offset-11,.ac-cm-offset-12 {
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

    .center-cm,.start-cm {
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
    clip: rect(1px,1px,1px,1px);
    white-space: nowrap
}

.enrolment-info-body .enrolment-modal-info__list {
    padding: unset;
    margin: unset;
    margin-bottom: 16px
}

.enrolment-info-body .enrolment-modal-info__list-el {
    display: flex;
    padding: 4px
}

.enrolment-info-body .enrolment-modal-info__list-el-label {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #1b1c1d
}

.enrolment-info-body .enrolment-modal-info__list-el-label.ac-fwb {
    font-weight: 700
}

.enrolment-info-body .enrolment-modal-info__list-el-label.ac-fwm {
    font-weight: 500
}

.enrolment-info-body .enrolment-modal-info__list-el-label.ac-fwr {
    font-weight: 400
}

.enrolment-info-body .enrolment-modal-info__list-el-value {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #0a58ca;
    margin-left: auto
}

.enrolment-info-body .enrolment-modal-info__list-el-value.ac-fwb {
    font-weight: 700
}

.enrolment-info-body .enrolment-modal-info__list-el-value.ac-fwm {
    font-weight: 500
}

.enrolment-info-body .enrolment-modal-info__list-el-value.ac-fwr {
    font-weight: 400
}

.enrolment-info-body .enrolment-modal-info__alert {
    margin-bottom: unset
}

.enrolment-info-body .enrolment-modal-info__alert .icon-cover {
    margin-right: 8px
}

.enrolment-error-body .enrolment-modal-error__alert {
    margin-bottom: unset
}

.enrolment-error-body .enrolment-modal-error__alert .icon-cover {
    margin-right: 8px
}

.enrolment-error-body .enrolment-modal-error__message {
    margin-top: 16px;
    font-weight: 400;
    font-size: 14px
}

.enrolment-withdraw-modal-body .enrolment-withdraw__alert {
    margin-bottom: unset
}

.enrolment-withdraw-modal-body .enrolment-withdraw__alert .icon-cover {
    margin-right: 8px
}

.enrolment-error-modal .modal-footer .button-icon-cover {
    margin-left: 8px
}

.pg___course-slug .cd-floating {
    position: -webkit-sticky;
    position: sticky;
    top: 75px;
    margin: 0 34px 20px auto;
    width: 332px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating {
        display:none
    }
}

.pg___course-slug .curation-desktop-tooltip,.pg___course-slug .curation-mobile-tooltip {
    z-index: 73
}

.pg___course-slug .curation-mobile-tooltip {
    display: none
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .curation-mobile-tooltip {
        position:fixed;
        z-index: 1;
        display: flex;
        bottom: 115px;
        left: calc(50% - 104px);
        top: unset
    }
}

.pg___course-slug .cd-floating__curation-mobile,.pg___course-slug .curation-mobile-tooltip--hidden {
    display: none
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__curation-mobile {
        position:fixed;
        z-index: 1;
        display: flex;
        bottom: 70px;
        width: 100%
    }
}

.pg___course-slug .cd-floating__curation-default {
    margin: 0 0 16px;
    width: 100%;
    height: 70px
}

.pg___course-slug .cd-floating__curation-wrapper {
    display: flex;
    width: 100%;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 11px 10px 11px 16px;
    margin: 0 0 16px;
    border: 1px solid rgba(20,150,223,.25);
    border-radius: 8px;
    background-color: #e8f5ff;
    color: #3e4042;
    overflow-wrap: break-word
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__curation-wrapper {
        margin:0;
        padding: 8px 10px;
        border: none;
        border-radius: unset
    }
}

.pg___course-slug .cd-floating__curation-button {
    cursor: pointer
}

.pg___course-slug .cd-floating__curation-button:hover {
    background-color: #f4faff;
    border-color: #1496df
}

.pg___course-slug .cd-floating__curation-button:hover .cd-floating__open-modal {
    color: #0c8cd4
}

.pg___course-slug .cd-floating__curation-button:hover .cd-floating__open-modal>svg>path {
    fill: #0c8cd4
}

.pg___course-slug .cd-floating__curation-content {
    width: 100%;
    display: grid;
    grid-template-columns: auto 1fr auto;
    align-items: center
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__curation-content {
        display:flex;
        justify-content: center;
        align-items: center
    }
}

.pg___course-slug .cd-floating__companyLogo {
    width: 38px;
    height: 38px;
    margin-right: 10px;
    border-radius: 50%;
    border: 1px solid #fff;
    -webkit-animation: flipVertical 5s infinite;
    animation: flipVertical 5s infinite;
    transition: all .5s
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__companyLogo {
        margin-right:4px;
        width: 20px;
        height: 20px
    }
}

.pg___course-slug .cd-floating__company-container {
    display: flex;
    justify-content: space-between;
    overflow: hidden
}

.pg___course-slug .cd-floating__company {
    position: relative;
    display: block;
    width: -webkit-fit-content;
    width: -moz-fit-content;
    width: fit-content;
    text-align: start;
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    font-weight: 700;
    -webkit-animation: slideUp 5s infinite;
    animation: slideUp 5s infinite
}

.pg___course-slug .cd-floating__company.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__company.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__company.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__company {
        font-weight:400;
        line-height: 1.5;
        letter-spacing: -.3px;
        font-size: 12px;
        font-weight: 700;
        box-shadow: unset
    }

    .pg___course-slug .cd-floating__company.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__company.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__company.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__highlight:after {
    position: absolute;
    width: 100%;
    height: 100%;
    z-index: -1;
    top: 0;
    left: 0;
    content: "";
    box-shadow: inset 0 -11px 0 rgba(20,150,223,.16);
    -webkit-animation: fadeHighlight 5s infinite;
    animation: fadeHighlight 5s infinite
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__highlight:after {
        display:none
    }
}

.pg___course-slug .cd-floating__description {
    margin-top: 4px;
    font-size: 13px;
    opacity: 0;
    -webkit-animation: fade 5s infinite;
    animation: fade 5s infinite
}

.pg___course-slug .cd-floating__description strong {
    color: #0c8cd4;
    font-weight: 700
}

.pg___course-slug .cd-floating__description--mobile {
    display: none
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__description--mobile {
        display:block;
        margin: 0 0 0 2px;
        font-weight: 400;
        line-height: 1.5;
        letter-spacing: -.3px;
        font-size: 12px;
        font-weight: 500
    }

    .pg___course-slug .cd-floating__description--mobile.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__description--mobile.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__description--mobile.ac-fwr {
        font-weight: 400
    }

    .pg___course-slug .cd-floating__description--mobile strong {
        font-weight: 500
    }
}

.pg___course-slug .cd-floating__description--pc {
    display: block;
    text-align: start;
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    font-weight: 500
}

.pg___course-slug .cd-floating__description--pc.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__description--pc.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__description--pc.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__description--pc {
        display:none
    }
}

.pg___course-slug .cd-floating__open-modal {
    display: flex;
    align-items: center;
    align-self: flex-start;
    height: 100%;
    text-decoration: underline;
    text-underline-position: under;
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    font-weight: 700;
    color: #3e4042
}

.pg___course-slug .cd-floating__open-modal.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__open-modal.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__open-modal.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__open-modal svg {
    margin-left: 5.67px;
    width: 5.17px;
    height: 9.33px
}

.pg___course-slug .cd-floating__open-modal>svg>path {
    fill: #3e4042
}

.pg___course-slug .cd-floating__open-modal--desktop {
    display: flex
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__open-modal--desktop {
        display:none
    }
}

.pg___course-slug .cd-floating__open-modal--mobile {
    display: none
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__open-modal--mobile {
        display:flex
    }
}

@-webkit-keyframes slideUp {
    0% {
        transform: translateY(20px)
    }

    10% {
        transform: translateY(0)
    }

    95% {
        transform: translateY(0)
    }

    to {
        transform: translateY(-55px)
    }
}

@keyframes slideUp {
    0% {
        transform: translateY(20px)
    }

    10% {
        transform: translateY(0)
    }

    95% {
        transform: translateY(0)
    }

    to {
        transform: translateY(-55px)
    }
}

@-webkit-keyframes fade {
    0% {
        opacity: 0
    }

    10% {
        opacity: 1
    }

    95% {
        opacity: 1
    }

    to {
        opacity: 0
    }
}

@keyframes fade {
    0% {
        opacity: 0
    }

    10% {
        opacity: 1
    }

    95% {
        opacity: 1
    }

    to {
        opacity: 0
    }
}

@-webkit-keyframes fadeHighlight {
    0% {
        opacity: 0
    }

    25% {
        opacity: 1
    }
}

@keyframes fadeHighlight {
    0% {
        opacity: 0
    }

    25% {
        opacity: 1
    }
}

@-webkit-keyframes flipVertical {
    0% {
        transform: scaleX(0)
    }

    10% {
        transform: scaleX(1)
    }

    to {
        transform: scaleX(1)
    }
}

@keyframes flipVertical {
    0% {
        transform: scaleX(0)
    }

    10% {
        transform: scaleX(1)
    }

    to {
        transform: scaleX(1)
    }
}

.pg___course-slug .cd-floating__discount-banner {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    padding: 6px;
    border-top-left-radius: 8px;
    border-top-right-radius: 8px;
    text-align: center;
    font-weight: 700;
    word-break: break-all
}

.pg___course-slug .cd-floating__discount-banner.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__discount-banner.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__discount-banner.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__card {
    overflow: hidden;
    border-radius: 8px;
    border: 1px solid #f1f3f5;
    box-shadow: 0 1px 3px 0 rgba(33,37,41,.03);
    background-color: #f8f9fa
}

.pg___course-slug .cd-floating__discount-banner+.cd-floating__card {
    border-top-left-radius: 0;
    border-top-right-radius: 0
}

.pg___course-slug .cd-floating__remaining-info--desktop {
    margin: 0 0 10px;
    display: flex;
    height: 70px
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-label {
    font-weight: 700;
    font-size: 12px;
    color: #0a58ca
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-applicant-count {
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-capacity,.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-time {
    padding: 14px 20px;
    border: 1px solid #e9ecef;
    box-shadow: 0 1px 3px rgba(33,37,41,.03);
    border-radius: 8px;
    background-color: #fff;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-between;
    font-weight: 700;
    font-size: 12px;
    line-height: 100%;
    color: #0a58ca
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-capacity {
    margin-right: 12px;
    padding: 12px 20px;
    min-width: 84px;
    flex-shrink: 0
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-time-wrapper {
    display: flex;
    align-items: center
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-time {
    padding: 12px 0;
    flex-grow: 1
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-text {
    font-weight: 500;
    font-size: 14px;
    color: #052c65
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-days {
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-strong {
    font-weight: 800;
    font-size: 26px
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-capacity-number {
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-time-unit {
    width: 36px;
    text-align: center;
    color: #052c65
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-time-seperator {
    margin: 0 4px;
    font-weight: 900;
    font-size: 20px;
    line-height: 150%;
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-number {
    font-weight: 500;
    font-size: 12px;
    color: #6ea8fe
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-please-refresh {
    display: flex;
    flex-direction: row;
    padding: 12px 20px;
    justify-content: center
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floadting__card-refresh-wrapper {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    flex-grow: 1;
    flex-shrink: 0
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-application-label {
    color: #052c65;
    line-height: 1.25;
    font-size: 12px
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-refresh-label {
    color: #0d6efd;
    line-height: 1.25;
    font-size: 14px
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floading__card-refresh-btn {
    margin-left: 16px;
    padding: 5px 9px;
    width: 60px;
    height: 28px;
    background: #495057;
    border-radius: 3.2px;
    border: none;
    font-size: 12px;
    font-weight: 700;
    flex-shrink: 0;
    color: #fff;
    cursor: pointer
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-duration-close {
    font-weight: 700;
    font-size: 12px;
    line-height: 18px;
    color: #052c65
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-close-comment {
    font-size: 16px;
    line-height: 24px;
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-over-wrapper {
    justify-content: space-around
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-over {
    color: #052c65
}

.pg___course-slug .cd-floating__remaining-info--desktop .cd-floating__card-remaining-over-strong {
    color: #0d6efd;
    font-size: 16px
}

.pg___course-slug .cd-floating__remaining-info--mobile {
    margin-right: 8px;
    flex-basis: calc(50% - 8px);
    color: #052c65;
    font-weight: 500;
    font-size: 12px;
    line-height: 150%
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-label {
    margin: 0 4px 0 0
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-capacity,.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time {
    display: flex;
    font-size: 12px;
    line-height: 150%
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-over-wrapper,.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time--closed {
    flex-direction: column
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-over-strong {
    color: #0d6efd;
    font-weight: 700
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-capacity {
    display: flex
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-strong {
    color: #0d6efd;
    font-weight: 700
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time .cd-floating__card-remaining-label {
    padding: 1px 0 0
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time--closed {
    align-items: start;
    flex-direction: column;
    justify-content: start
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time-wrapper {
    font-weight: 700
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time-seperator {
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-time-unit {
    color: #052c65
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-days-wrapper {
    line-height: 100%
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-days,.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-remaining-text {
    font-size: 12px;
    line-height: 150%
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-close-comment {
    font-weight: 700;
    color: #0d6efd
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floadting__card-refresh-wrapper {
    font-size: 12px
}

.pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__card-refresh-label {
    color: #0d6efd;
    font-weight: 700
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__remaining-info--mobile .cd-floating__remaining-info--closed {
        margin-right:8px;
        flex-basis: calc(50% - 8px)
    }
}

.pg___course-slug .cd-floating__remaining-info--mobile.cd-floating__remaining-info--closed {
    flex-basis: unset
}

.pg___course-slug .cd-floating__remaining-info--mobile.cd-floating__remaining-info--closed~button.floating__main-button {
    margin-left: 8px
}

.pg___course-slug .cd-floating__card-box {
    margin: 0 0 0 6px;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    width: 30px;
    height: 28px;
    background: #f5f5f5;
    border-radius: 4px;
    font-weight: 500;
    font-size: 14px;
    line-height: 20px;
    color: #343a40
}

.pg___course-slug .cd-floating__card--top {
    border-radius: 8px;
    border-bottom: 1px solid #f1f3f5;
    background-color: #fff
}

.pg___course-slug .cd-card__bottom-offline {
    padding: 14px 20px;
    border: 1px solid #e9ecef;
    box-shadow: 0 1px 3px rgba(33,37,41,.03);
    border-radius: 8px;
    background-color: #fff;
    margin: 10px 0 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-card__bottom-offline {
        margin:0
    }
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-card__bottom-offline--online-location {
        margin-top:10px
    }
}

.pg___course-slug .cd-card__bottom-offline--online-location dd {
    display: flex;
    align-items: center;
    justify-content: flex-end;
    width: 100%
}

.pg___course-slug .cd-card__bottom-offline--online-location dd a {
    color: inherit;
    text-decoration: none
}

.pg___course-slug .cd-card__bottom-offline--online-location dd i {
    margin-left: 8px
}

.pg___course-slug .cd-card__item {
    font-size: 14px;
    line-height: 20px;
    letter-spacing: -.3px;
    display: flex
}

.pg___course-slug .cd-card__label {
    padding: 8px 0;
    min-width: 51px;
    width: 51px;
    font-weight: 700;
    color: #343a40;
    flex-shrink: 1
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-card__label {
        width:auto
    }
}

.pg___course-slug .cd-card__label--placement {
    align-self: flex-start
}

.pg___course-slug .cd-card__value {
    margin: 0 0 0 12px;
    font-weight: 500;
    color: #868e96
}

.pg___course-slug .cd-card__value p {
    padding: 8px 0;
    font-size: 14px;
    word-break: break-all
}

.pg___course-slug .cd-card__address,.pg___course-slug .cd-card__calander {
    display: flex;
    align-items: center;
    word-break: break-all
}

.pg___course-slug .cd-card__address p,.pg___course-slug .cd-card__calander p {
    font-size: 14px;
    line-height: 20px;
    letter-spacing: -.3px
}

.pg___course-slug .cd-card__btn {
    margin-left: 12px;
    flex-shrink: 0;
    align-self: center;
    width: 63px;
    height: 28px
}

.pg___course-slug .cd-floating__not-published-message {
    margin-right: 8px;
    flex-basis: 50%;
    font-size: 12px;
    line-height: 150%;
    color: #212529;
    text-align: center
}

.pg___course-slug .cd-floating__price.cd-floating__price--private {
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-bottom: 35px;
    padding: 35px 24px 0;
    color: #343a40;
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--private.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--private.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--private.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--private {
        justify-content:flex-start;
        margin-bottom: 24px;
        padding: 0 24px
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--private br {
        display: none
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--private {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--free {
    margin-bottom: 30px;
    padding: 20px 24px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--free {
        margin-bottom:34px;
        padding: 0 24px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--free {
        margin-bottom:26px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--free p {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    line-height: 1.42;
    color: #343a40;
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--restriction {
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    flex-direction: column;
    margin-bottom: 24px;
    padding: 24px 24px 0;
    color: #343a40;
    text-align: center
}

.pg___course-slug .cd-floating__price.cd-floating__price--restriction.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--restriction.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--restriction.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--restriction {
        justify-content:flex-start;
        align-items: flex-start;
        margin-bottom: 24px;
        padding: 0 24px
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--restriction strong {
        display: block
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--restriction br {
        display: none
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--restriction {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--group {
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    flex-direction: column;
    margin-bottom: 33px;
    padding: 33px 24px 0;
    font-weight: 700;
    text-align: center
}

.pg___course-slug .cd-floating__price.cd-floating__price--group.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--group.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--group.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--group {
        justify-content:flex-start;
        align-items: flex-start;
        margin-bottom: 24px;
        padding: 0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--group {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--group del {
    margin-bottom: 4px;
    color: #ced4da;
    font-weight: 500
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--group del {
        font-weight:400;
        line-height: 1.38;
        letter-spacing: -.3px;
        font-size: 13px;
        margin-bottom: unset;
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group del.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group del.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group del.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--group strong {
    color: #212529
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--group strong {
        font-weight:400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 20px;
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group strong.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group strong.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--group strong.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--group .cd-floating__price--group-enrolment-text {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #1b1c1d;
    margin-top: 4px
}

.pg___course-slug .cd-floating__price.cd-floating__price--group .cd-floating__price--group-enrolment-text.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--group .cd-floating__price--group-enrolment-text.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--group .cd-floating__price--group-enrolment-text.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment {
    margin-bottom: 16px;
    padding: 16px 24px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment {
        margin-bottom:24px;
        padding: 0 24px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-floating__price--top {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: flex;
    align-items: center;
    margin-bottom: 2px
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-floating__price--top.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-floating__price--top.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-floating__price--top.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__discount-rate {
    margin-right: 4px;
    color: #e5503c;
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__reg-price {
    margin-right: 4px;
    color: #ced4da;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__pay-price {
    color: #495057;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-floating__price-bottom {
    display: flex;
    align-items: baseline
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment p {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    margin-right: 6px;
    line-height: 1.42;
    color: #343a40;
    font-weight: 700
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment p {
        font-weight:400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 20px;
        display: inline-block;
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment p.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment p.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis-installment p.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__ment {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    color: #495057;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__ment.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__ment.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis-installment .cd-price__ment.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis {
    display: flex;
    align-items: baseline;
    margin-bottom: 20px;
    padding: 20px 24px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis {
        margin-bottom:24px;
        padding: 0 24px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__discount-rate {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    margin-right: 6px;
    line-height: 1.42;
    color: #e5503c;
    font-weight: 700
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__discount-rate {
        font-weight:400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 20px;
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__discount-rate.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__discount-rate.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__discount-rate.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis p {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    margin-right: 8px;
    line-height: 1.42;
    color: #343a40;
    font-weight: 700
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis p {
        font-weight:400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 20px;
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis p.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis p.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis p.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    color: #ced4da;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price {
        font-weight:400;
        line-height: 1.38;
        letter-spacing: -.3px;
        font-size: 13px;
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--dis .cd-price__reg-price.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment {
    margin-bottom: 20px;
    padding: 20px 24px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--installment {
        margin-bottom:24px;
        padding: 0 24px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--installment {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__ment {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    color: #495057;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__ment.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__ment.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__ment.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-floating__price--bottom {
    display: flex;
    align-items: baseline
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment p {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    margin-right: 8px;
    line-height: 1.42;
    color: #343a40;
    font-weight: 700
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--installment p {
        font-weight:400;
        line-height: 1.4;
        letter-spacing: -.3px;
        font-size: 20px;
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--installment p.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--installment p.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-floating__price.cd-floating__price--installment p.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__pay-price {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    margin-bottom: 2px;
    color: #495057;
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__pay-price.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__pay-price.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__price.cd-floating__price--installment .cd-price__pay-price.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__price.cd-floating__price--owned,.pg___course-slug .cd-floating__price.cd-floating__price--reg {
    margin-bottom: 20px;
    padding: 20px 24px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--owned,.pg___course-slug .cd-floating__price.cd-floating__price--reg {
        margin-bottom:24px;
        padding: 0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__price.cd-floating__price--owned,.pg___course-slug .cd-floating__price.cd-floating__price--reg {
        margin-bottom:16px;
        padding: 0 18px
    }
}

.pg___course-slug .cd-floating__price.cd-floating__price--owned p,.pg___course-slug .cd-floating__price.cd-floating__price--reg p {
    line-height: 1.25;
    letter-spacing: -.3px;
    font-size: 24px;
    line-height: 1.42;
    color: #343a40;
    font-weight: 700
}

.pg___course-slug .cd-floating__price.cd-floating__price--hidden {
    margin: 0
}

.pg___course-slug .cd-floating__buttons {
    margin-bottom: 8px;
    padding: 0 24px
}

.pg___course-slug .cd-floating__buttons button+button {
    margin-top: 8px
}

.pg___course-slug .cd-floating__buttons .floating__main-button {
    font-weight: 700;
    min-width: 100%
}

.pg___course-slug .cd-floating__buttons .floating__main-button--hidden {
    display: none
}

.pg___course-slug .cd-floating__buttons .ac-button.is-outlined:disabled {
    background-color: inherit!important
}

.pg___course-slug .cd-floating__sub-buttons {
    display: flex;
    align-items: center;
    margin-bottom: 20px;
    padding: 0 32px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__sub-buttons {
        margin-bottom:unset;
        padding: 8px 32px;
        border-bottom: 8px solid #f8f9fa
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__sub-buttons {
        padding:8px 16px
    }
}

.pg___course-slug .cd-floating__sub-button {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    position: relative;
    flex: auto;
    padding: 10px 12px;
    color: #495057;
    font-weight: 500;
    cursor: pointer;
    text-decoration: underline
}

.pg___course-slug .cd-floating__sub-button.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__sub-button.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__sub-button.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__sub-button>.infd-icon {
    margin-right: 8px;
    width: 17px;
    height: 16px
}

.pg___course-slug .cd-floating__sub-button+.cd-floating__sub-button:before {
    content: "";
    position: absolute;
    left: 0;
    width: 1px;
    height: 16px;
    background-color: #dee2e6
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__info--wrapper {
        display:flex;
        flex-direction: column;
        align-items: stretch;
        padding: 0 32px
    }

    .pg___course-slug .cd-floating__info--wrapper>* {
        flex: 1
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__info--wrapper {
        padding:0 16px
    }
}

.pg___course-slug .cd-floating__info {
    position: relative;
    padding: 16px 24px;
    background-color: #f8f9fa
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__info {
        padding:16px;
        border-radius: 8px;
        border: 1px solid #e9ecef
    }
}

.pg___course-slug .cd-floating__info .tooltip-inner {
    max-width: none
}

.pg___course-slug .cd-floating__info-row {
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 400;
    display: flex;
    align-items: center;
    color: #3e4042
}

.pg___course-slug .cd-floating__info-row.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__info-row.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__info-row.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__info-row+.cd-floating__info-row {
    margin-top: 4px
}

.pg___course-slug .cd-floating__info-row .infd-icon {
    margin-right: 6px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-floating__info-row .infd-icon path {
    fill: #3e4042
}

.pg___course-slug .cd-floating__info-row>a {
    text-decoration: underline;
    -webkit-text-decoration-color: #175cbe;
    text-decoration-color: #175cbe;
    color: #175cbe
}

.pg___course-slug .cd-floating__info-row--duration .course-duration {
    font-weight: 900
}

.pg___course-slug .cd-floating__info-row--levels {
    align-items: flex-start
}

.pg___course-slug .cd-floating__info-row--levels .infd-icon {
    margin-top: 3px
}

.pg___course-slug .cd-floating__info-row--levels>div {
    display: flex;
    align-items: center;
    flex-wrap: wrap
}

.pg___course-slug .cd-floating__info-row--levels .cd-floating__info--gray {
    color: #abb0b5
}

.pg___course-slug .cd-floating__info-row--levels .infd-icon--no-margin {
    margin: 0;
    width: 14px
}

.pg___course-slug .cd-floating__info-row--whetherAnswer__true>div {
    width: 100%;
    margin-top: 4px;
    padding: 4px 11px;
    border-radius: 4px;
    background-color: rgba(23,92,190,.06);
    text-align: center;
    color: #175cbe
}

.pg___course-slug .cd-floating__mentoring {
    margin-top: 8px;
    padding: 16px 20px;
    border: 1px solid #f1f3f5;
    border-radius: 8px;
    box-shadow: 0 1px 3px 0 rgba(33,37,41,.03)
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-floating__mentoring {
        margin-top:16px;
        padding: 16px;
        border: 1px solid #e9ecef;
        background-color: #f8f9fa;
        box-shadow: unset
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-floating__mentoring {
        margin-top:8px;
        margin-left: unset
    }
}

.pg___course-slug .cd-floating__mentoring-header {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-bottom: 5px;
    color: #495057;
    font-weight: 700
}

.pg___course-slug .cd-floating__mentoring-header.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__mentoring-header.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__mentoring-header.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__mentoring-header>.infd-icon {
    margin-right: 6px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-floating__mentoring-description {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #495057;
    word-break: keep-all
}

.pg___course-slug .cd-floating__mentoring-description.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__mentoring-description.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__mentoring-description.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__inquiry {
    display: flex;
    align-items: center;
    margin-top: 10px;
    padding: 18px 20px;
    border: 1px solid #f1f3f5;
    border-radius: 8px;
    box-shadow: 0 1px 3px 0 rgba(33,37,41,.03)
}

.pg___course-slug .cd-floating__inquiry-header {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #495057;
    font-weight: 700
}

.pg___course-slug .cd-floating__inquiry-header.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__inquiry-header.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__inquiry-header.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__inquiry-header>.infd-icon {
    margin-right: 6px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-floating__inquiry>a {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-left: auto;
    color: #495057;
    font-weight: 500;
    text-decoration: underline
}

.pg___course-slug .cd-floating__inquiry>a.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-floating__inquiry>a.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-floating__inquiry>a.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-floating__inquiry>a>.infd-icon {
    margin-left: 2px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-floating__inquiry>a>.infd-icon path {
    fill: #495057
}

.pg___course-slug .cd-mb-floating {
    position: fixed;
    bottom: 0;
    display: none;
    padding: 12px 32px;
    width: 100%;
    background-color: #fff;
    box-shadow: 0 -2px 12px 0 rgba(33,37,41,.08)
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-mb-floating {
        padding:12px 32px;
        display: flex;
        align-items: center;
        z-index: 8
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-mb-floating {
        padding:12px 16px
    }
}

.pg___course-slug .cd-mb-floating .ac-button:not(:last-of-type) {
    margin-right: 8px
}

.pg___course-slug .cd-mb-floating .floating__main-button {
    font-weight: 700;
    flex: 1 1 auto
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-mb-floating .floating__main-button:not(:first-child) {
        margin-left:8px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-mb-floating .floating__main-button:not(:first-child) {
        margin-left:4px
    }
}

.pg___course-slug .cd-mb-floating .floating__main-button--hidden {
    display: none
}

.pg___course-slug .cd-mb-floating .floating__sub-button {
    flex-shrink: 0;
    min-width: 64px
}

.pg___course-slug .like-button--active .infd-icon,.pg___course-slug .like-button .is-like {
    display: none
}

.pg___course-slug .like-button--active .is-like {
    display: inline-flex
}

.pg___course-slug .infcon-modal .modal-dialog {
    width: 100%;
    max-width: 620px
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .modal-footer,.pg___course-slug .infcon-modal .modal-header {
        padding:20px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .modal-body {
        padding:0 20px
    }
}

.pg___course-slug .infcon-modal .desktop-only {
    display: inherit
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .desktop-only {
        display:none
    }
}

.pg___course-slug .infcon-modal .mobile-only {
    display: none
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .mobile-only {
        display:inherit
    }
}

.pg___course-slug .infcon-modal .modal-header h1 {
    display: flex;
    justify-content: center;
    align-items: center;
    -moz-column-gap: 6px;
    column-gap: 6px;
    width: 100%
}

.pg___course-slug .infcon-modal .infcon-modal__header-icon {
    color: #228be6
}

.pg___course-slug .infcon-modal .infcon-modal__header-text {
    font-size: 18px;
    font-weight: 700;
    line-height: 145%;
    color: #212529
}

.pg___course-slug .infcon-modal .infcon-modal__video-wrapper {
    display: flex;
    justify-content: center;
    width: 100%
}

.pg___course-slug .infcon-modal .infcon-modal__video {
    width: 100%;
    max-width: 518px;
    height: auto
}

.pg___course-slug .infcon-modal .modal-footer {
    display: grid;
    flex-direction: row;
    flex-wrap: nowrap;
    grid-template-columns: 1fr 1fr;
    -moz-column-gap: 10px;
    column-gap: 10px
}

.pg___course-slug .infcon-modal .modal-footer button {
    margin-left: 0!important
}

.pg___course-slug .infcon-modal .infcon-modal__footer-loading {
    grid-template-columns: 1fr
}

.pg___course-slug .infcon-modal .infcon-modal__footer-loading .infcon-modal__button-close,.pg___course-slug .infcon-modal .infcon-modal__footer-loading .infcon-modal__button-share {
    display: none
}

.pg___course-slug .infcon-modal .infcon-modal__footer-loading-button {
    width: 100%;
    background-color: #e9ecef;
    color: #adb5bd
}

.pg___course-slug .infcon-modal .infcon-modal__button-close {
    border: 1px solid #ced4da
}

.pg___course-slug .infcon-modal .infcon-modal__button-share {
    background-color: #228be6;
    color: #fff
}

.pg___course-slug .infcon-modal .infcon-modal__button-share i {
    margin-right: 6px
}

.pg___course-slug .infcon-modal .infcon-modal__content-loading .infcon-modal__content-section {
    display: none
}

.pg___course-slug .infcon-modal .infcon-modal__content-title {
    font-size: 24px;
    font-weight: 700;
    line-height: 150%;
    color: #212529;
    text-align: center;
    margin-bottom: 14px
}

.pg___course-slug .infcon-modal .infcon-modal__content-title strong {
    color: #228be6
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .infcon-modal__content-title {
        font-size:20px
    }
}

.pg___course-slug .infcon-modal .infcon-modal__content-description {
    margin-bottom: 30px;
    font-size: 12px;
    line-height: 150%;
    font-weight: 400;
    color: #495057;
    text-align: center
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .infcon-modal__content-description {
        margin-bottom:20px
    }
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader-wrapper {
    padding: 0 0 39px
}

@media screen and (max-width: 768px) {
    .pg___course-slug .infcon-modal .infcon-modal__content-loader-wrapper {
        padding:0 0 20px
    }
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader,.pg___course-slug .infcon-modal .infcon-modal__content-loader:after,.pg___course-slug .infcon-modal .infcon-modal__content-loader:before {
    border-radius: 50%;
    width: 9px;
    height: 9px;
    -webkit-animation-fill-mode: both;
    -webkit-animation: infcon-load 1.8s ease-in-out infinite;
    animation: infcon-load 1.8s ease-in-out infinite;
    animation-fill-mode: both
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader {
    color: #228be6;
    font-size: 10px;
    margin: 0 auto;
    position: relative;
    top: -9px;
    transform: translateZ(0);
    -webkit-animation-delay: -.16s;
    animation-delay: -.16s
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader:after,.pg___course-slug .infcon-modal .infcon-modal__content-loader:before {
    content: "";
    position: absolute;
    top: 0
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader:before {
    left: -16px;
    -webkit-animation-delay: -.32s;
    animation-delay: -.32s
}

.pg___course-slug .infcon-modal .infcon-modal__content-loader:after {
    left: 16px
}

@-webkit-keyframes infcon-load {
    0%,80%,to {
        box-shadow: 0 9px 0 -4.5px;
        opacity: 1
    }

    40% {
        box-shadow: 0 9px 0 0
    }

    0% {
        opacity: .2
    }
}

@keyframes infcon-load {
    0%,80%,to {
        box-shadow: 0 9px 0 -4.5px;
        opacity: 1
    }

    40% {
        box-shadow: 0 9px 0 0
    }

    0% {
        opacity: .2
    }
}

.pg___course-slug .cd-header {
    position: relative;
    padding: 40px 0;
    background: #002333;
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header {
        padding:32px 0 16px;
        background: linear-gradient(180deg,#002333 75%,#fff 0)
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header {
        padding:24px 0 16px
    }
}

.pg___course-slug .cd-header .ac-r {
    margin: 0;
    align-items: center
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .ac-r {
        flex-direction:column-reverse;
        align-items: flex-start
    }
}

.pg___course-slug .cd-header .ac-container {
    padding: 0 32px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .ac-container {
        padding:0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .ac-container {
        padding:0 16px
    }
}

.pg___course-slug .cd-header .cd-header__left {
    display: inline-flex;
    justify-content: center;
    padding: 8px 0
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__left {
        margin-top:32px;
        width: 100%;
        max-width: 100%;
        z-index: 7
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__left {
        margin-top:24px
    }
}

.pg___course-slug .cd-header .cd-header__thumbnail-cover {
    position: relative;
    padding: 0;
    width: 100%
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__thumbnail-cover {
        padding-left:unset;
        width: auto
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__thumbnail-cover {
        width:100%;
        height: 100%
    }
}

.pg___course-slug .cd-header .cd-header__thumbnail {
    position: relative;
    overflow: hidden;
    width: 100%;
    max-width: 473.33px;
    height: inherit;
    border-radius: 8px;
    aspect-ratio: 100/65.088
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__thumbnail {
        width:525px;
        height: 341px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__thumbnail {
        width:100%;
        height: 100%
    }
}

.pg___course-slug .cd-header .cd-header__thumbnail>img {
    width: 100%;
    height: 100%
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__thumbnail.cd-header__thumbnail--discount {
        border-bottom-left-radius:unset;
        border-bottom-right-radius: unset
    }
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__thumbnail {
        max-width:none
    }
}

.pg___course-slug .cd-header .cd-header__offline-badges {
    position: absolute;
    top: 8px;
    left: 8px;
    display: flex;
    align-items: center
}

.pg___course-slug .cd-header .cd-header__offline-badges>*+* {
    margin-left: 8px
}

.pg___course-slug .cd-header .cd-header__thumbnail-badge {
    padding: 5.25px 9.75px;
    font-weight: 700;
    font-size: 15px;
    line-height: 100%;
    border-radius: 4px;
    z-index: 10
}

.pg___course-slug .cd-header .cd-header__offline-badge {
    color: #055160;
    background: #6edff6;
    border: 1px solid #0dcaf0
}

.pg___course-slug .cd-header .cd-header__recruiting-badge {
    color: #055160;
    background: #cff4fc;
    border: 1px solid #0aa2c0
}

.pg___course-slug .cd-header .cd-header__not-recruiting-badge {
    color: #495057;
    background: #adb5bd;
    border: 1px solid #868e96
}

.pg___course-slug .cd-header .cd-header__discount-banner {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    display: none;
    padding: 4px 0;
    border-bottom-left-radius: 8px;
    border-bottom-right-radius: 8px;
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__discount-banner.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__discount-banner.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__discount-banner.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__discount-banner {
        display:flex;
        align-items: center;
        justify-content: center
    }
}

.pg___course-slug .cd-header .thumbnail-button-cover {
    display: flex;
    align-items: center;
    justify-content: center;
    position: absolute;
    top: 0;
    width: 100%;
    height: 100%;
    cursor: pointer
}

.pg___course-slug .cd-header .thumbnail-button-cover>.infd-icon {
    width: 70px;
    height: 70px
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .thumbnail-button-cover>.infd-icon {
        width:54px;
        height: 54px
    }
}

.pg___course-slug .cd-header .cd-header__right {
    display: flex;
    flex-direction: column;
    padding: 0 0 0 32px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__right {
        padding:0
    }
}

.pg___course-slug .cd-header .cd-header__breadcrumb {
    overflow: hidden;
    display: flex;
    align-items: center;
    margin-bottom: 6px;
    flex-wrap: wrap
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__breadcrumb {
        margin-bottom:4px
    }
}

.pg___course-slug .cd-header .cd-header__breadcrumb>.infd-icon {
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-header .cd-header__breadcrumb>.infd-icon path {
    fill: #fff
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__breadcrumb>.infd-icon path {
        fill:#adb5bd
    }
}

.pg___course-slug .cd-header .cd-header__breadcrumb--offline {
    margin-bottom: 12px
}

.pg___course-slug .cd-header .cd-header__breadcrumb--offline .cd-header__breadcrumb-el {
    color: #084298
}

.pg___course-slug .cd-header .cd-header__breadcrumb--offline .infd-icon path {
    fill: #084298
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label-wrapper {
    display: flex;
    align-items: center
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    margin-right: 10px;
    padding: 0 6px;
    height: 22px;
    color: #fff;
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label--offline-course {
    margin-right: 8px
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label-new {
    background-color: #e5503c
}

.pg___course-slug .cd-header .cd-header__breadcrumb-label-best {
    background-color: #0075ff
}

.pg___course-slug .cd-header .cd-header__breadcrumb-el {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #fff;
    font-weight: 500;
    white-space: pre
}

.pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__breadcrumb-el {
        font-weight:400;
        line-height: 1.5;
        letter-spacing: -.3px;
        font-size: 12px;
        color: #adb5bd;
        font-weight: 500
    }

    .pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwb {
        font-weight: 700
    }

    .pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwm {
        font-weight: 500
    }

    .pg___course-slug .cd-header .cd-header__breadcrumb-el.ac-fwr {
        font-weight: 400
    }
}

.pg___course-slug .cd-header .cd-recruit {
    display: flex;
    margin: 0 0 24px
}

.pg___course-slug .cd-header .recruit-status {
    padding: 2px 10px;
    height: 22px;
    font-weight: 700;
    font-size: 12px;
    line-height: 150%;
    border-radius: 4px;
    margin: 0 10px 0 0;
    letter-spacing: -.3px;
    color: #055160;
    background: #3dd5f3;
    border: 1px solid #3dd5f3
}

.pg___course-slug .cd-header .recruit-status--end {
    padding: 2px 10px;
    height: 22px;
    font-weight: 700;
    font-size: 12px;
    line-height: 150%;
    border-radius: 4px;
    margin: 0 10px 0 0;
    background: #adb5bd;
    color: #495057
}

.pg___course-slug .cd-header .recruit-info {
    padding: 2px 10px;
    height: 22px;
    font-weight: 700;
    font-size: 12px;
    line-height: 150%;
    border-radius: 4px;
    border: 1px solid #868e96;
    letter-spacing: -.3px;
    color: #adb5bd
}

.pg___course-slug .cd-header .cd-header__title-container {
    margin-bottom: 40px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__title-container {
        margin-bottom:12px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__title-container {
        margin-bottom:20px;
        line-height: 1.5;
        font-size: 20px
    }
}

.pg___course-slug .cd-header .cd-header__title-container--offline .cd-header__title {
    color: #212529
}

.pg___course-slug .cd-header .cd-header__title-container--offline .cd-header__course-id {
    color: #084298
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__title-container--offline {
        margin-bottom:16px
    }
}

.pg___course-slug .cd-header .cd-header__title {
    line-height: 1.5;
    letter-spacing: -.3px;
    color: #fff;
    font-weight: 700;
    font-size: 26px;
    word-break: break-word
}

.pg___course-slug .cd-header .cd-header__course-id {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-top: 4px;
    color: hsla(0,0%,100%,.6)
}

.pg___course-slug .cd-header .cd-header__course-id.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__course-id.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__course-id.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header .cd-header__course-id span+span {
    margin-left: 4px
}

.pg___course-slug .cd-header .cd-header__info-cover {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: flex;
    flex-wrap: wrap;
    margin-bottom: 8px;
    color: #fff
}

.pg___course-slug .cd-header .cd-header__info-cover.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__info-cover.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__info-cover.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header .cd-header__info-cover a:hover {
    text-decoration: underline;
    text-underline-position: under;
    color: unset
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header .cd-header__info-cover {
        margin-bottom:4px
    }
}

.pg___course-slug .cd-header .cd-header__info-cover .cd-header__info--star {
    margin-right: 8px
}

.pg___course-slug .cd-header .cd-header__sub-row {
    display: flex;
    flex-wrap: wrap;
    align-items: center
}

.pg___course-slug .cd-header .cd-header__sub-row>.infd-icon {
    margin-right: 6px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-header .cd-header__student_cnt {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-bottom: 8px;
    color: #fff
}

.pg___course-slug .cd-header .cd-header__student_cnt.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__student_cnt.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__student_cnt.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__student_cnt {
        margin-bottom:4px
    }
}

.pg___course-slug .cd-header .cd-header__instructors {
    margin-bottom: 12px
}

.pg___course-slug .cd-header .cd-header__instructors>a {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-right: 8px;
    color: #fff;
    text-decoration: underline
}

.pg___course-slug .cd-header .cd-header__instructors>a.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__instructors>a.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__instructors>a.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header .cd-header__instructors>a.cd-header__instructors--main {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__instructors>a>.infd-icon {
    margin-left: 2px
}

.pg___course-slug .cd-header .cd-header__instructors--offline,.pg___course-slug .cd-header .cd-header__instructors--offline>a {
    color: #084298
}

.pg___course-slug .cd-header .cd-header__instructors--offline .infd-icon {
    font-size: 12px
}

.pg___course-slug .cd-header .cd-header__instructors--offline .infd-icon path {
    fill: #084298
}

.pg___course-slug .cd-header .cd-header__tags>* {
    margin-bottom: 12px
}

.pg___course-slug .cd-header .cd-header__tags>.cd-header__tag {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    margin-right: 4px;
    padding: 4px 12px;
    border-radius: 100px;
    background-color: #173f51;
    color: #fff;
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__tags>.cd-header__tag.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header .cd-header__tags>.cd-header__tag.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header .cd-header__tags>.cd-header__tag.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header .cd-header__tags>.cd-header__tag:hover {
    background-color: #26556a
}

.pg___course-slug .cd-header .cd-header__tags--offline .infd-icon path {
    fill: #084298
}

.pg___course-slug .cd-header .cd-header__tags--offline>.cd-header__tag {
    background-color: rgba(8,66,152,.6)
}

.pg___course-slug .cd-header .cd-header__tags--infcon {
    opacity: 0;
    pointer-events: none
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__tags--infcon {
        display:none
    }
}

.pg___course-slug .cd-header .course-level__wrapper {
    margin: 0 0 12px;
    display: flex;
    align-items: center
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .course-level__wrapper {
        margin-bottom:12px
    }
}

.pg___course-slug .cd-header .course-level-icon__wrapper {
    padding: 2px;
    display: flex;
    flex-wrap: wrap-reverse
}

.pg___course-slug .cd-header .course-level-icon__wrapper *+* {
    margin-left: 1px
}

.pg___course-slug .cd-header .course-level-icon__beginning,.pg___course-slug .cd-header .course-level-icon__beginning--active,.pg___course-slug .cd-header .course-level-icon__entrance,.pg___course-slug .cd-header .course-level-icon__entrance--active,.pg___course-slug .cd-header .course-level-icon__intermediate,.pg___course-slug .cd-header .course-level-icon__intermediate--active {
    width: 3.43px;
    border-radius: 1px
}

.pg___course-slug .cd-header .course-level-icon__beginning,.pg___course-slug .cd-header .course-level-icon__entrance,.pg___course-slug .cd-header .course-level-icon__intermediate {
    background: rgba(8,66,152,.3)
}

.pg___course-slug .cd-header .course-level-icon__beginning--active,.pg___course-slug .cd-header .course-level-icon__entrance--active,.pg___course-slug .cd-header .course-level-icon__intermediate--active {
    background: #084298
}

.pg___course-slug .cd-header .course-level-icon__entrance,.pg___course-slug .cd-header .course-level-icon__entrance--active {
    height: 7.5px
}

.pg___course-slug .cd-header .course-level-icon__beginning,.pg___course-slug .cd-header .course-level-icon__beginning--active {
    height: 9.375px
}

.pg___course-slug .cd-header .course-level-icon__intermediate,.pg___course-slug .cd-header .course-level-icon__intermediate--active {
    height: 11.25px
}

.pg___course-slug .cd-header .course-level__title {
    margin-left: 8px;
    font-weight: 400;
    font-size: 14px;
    line-height: 150%;
    color: #084298
}

.pg___course-slug .cd-header .cd-header__sub-buttons {
    display: flex;
    margin-top: 40px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header .cd-header__sub-buttons {
        display:none
    }
}

.pg___course-slug .cd-header .cd-header__sub-buttons button+button {
    margin-left: 8px
}

.pg___course-slug .cd-header .cd-header__sub-buttons button>.infd-icon {
    margin-right: 8px;
    width: 16px;
    height: 16px
}

.pg___course-slug .cd-header .cd-header__sub-buttons--mentoring button {
    flex: 1 1 auto
}

.pg___course-slug .cd-header--offline-course {
    background: linear-gradient(180deg,rgba(150,212,246,.2),rgba(118,169,243,.2))
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button-cover {
    align-items: flex-end;
    padding: 12px
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    width: 100%;
    height: 40px;
    border: 2px solid #00c471;
    border-radius: 4px;
    color: #fff;
    font-weight: 700;
    background: #1b1c1d;
    cursor: pointer
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button .infd-icon {
    margin-right: 8px
}

.pg___course-slug .cd-header__not-owned-course .thumbnail-bottom-button__highlight {
    display: inline-flex;
    color: #00c471;
    margin-right: 4px
}

.pg___course-slug .cd-header__owned-course .cd-header__thumbnail {
    position: relative
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header__owned-course .cd-header__thumbnail {
        width:525px;
        height: 341px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header__owned-course .cd-header__thumbnail {
        width:100%;
        height: 100%
    }
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover {
    flex-direction: column;
    justify-content: center;
    background-image: linear-gradient(180deg,rgba(0,0,0,.48),rgba(0,0,0,.64) 40%,rgba(0,0,0,.9))
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover>.infd-icon {
    margin-bottom: 12px
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__ment {
    font-weight: 400;
    line-height: 1.4;
    letter-spacing: -.3px;
    font-size: 20px;
    margin-bottom: 6px;
    color: #fff;
    font-weight: 700
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__ment.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__ment.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__ment.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__sub-ment {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #fff
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__sub-ment.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__sub-ment.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__sub-ment.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover {
    position: absolute;
    bottom: 34px;
    display: flex;
    justify-content: center;
    width: 100%
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover {
        bottom:24px
    }
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover progress {
    width: 82%;
    height: 6px;
    border-radius: 2px;
    border: unset;
    background-color: #f8f9fa
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover progress::-webkit-progress-bar {
    width: 100%;
    border-radius: 2px;
    border: unset;
    background-color: #f8f9fa
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover progress::-webkit-progress-value {
    border-radius: 2px;
    background-color: #00c471
}

.pg___course-slug .cd-header__owned-course .thumbnail-button-cover__progress-cover progress::-moz-progress-bar {
    width: 100%;
    border-radius: 2px;
    border: unset;
    background-color: #f8f9fa
}

.pg___course-slug .cd-header__offline-course-bottom-bg {
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    display: none;
    height: 25%;
    background: #fff;
    z-index: 5
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-header__offline-course-bottom-bg {
        display:block
    }
}

.pg___course-slug .cd-mb-information {
    display: none;
    width: 100%
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-mb-information {
        display:block
    }
}

.pg___course-slug .cd-mb-information__cover {
    margin-bottom: 8px;
    padding: 0 24px
}

@media screen and (max-width: 768px) {
    .pg___course-slug .cd-mb-information__cover {
        padding:0 18px
    }
}

.preview-modal__cover {
    position: fixed;
    top: 0;
    width: 100vw;
    height: 100vh;
    overflow-y: auto;
    z-index: 79
}

.preview-modal__dimmed {
    display: flex;
    justify-content: center;
    align-items: baseline;
    padding: 64px 0;
    width: 100%;
    min-height: 100vh;
    background-color: rgba(0,0,0,.56)
}

@media screen and (max-width: 768px) {
    .preview-modal__dimmed {
        align-items:flex-end;
        padding: unset
    }
}

.preview-modal__content {
    overflow: hidden;
    width: 660px;
    border-radius: 8px;
    box-shadow: 0 2px 6px 0 rgba(33,37,41,.26);
    background-color: #212529
}

@media screen and (max-width: 768px) {
    .preview-modal__content {
        height:90vh;
        overflow-y: auto;
        border-bottom-left-radius: unset;
        border-bottom-right-radius: unset
    }
}

.preview-modal .preview-modal__header {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    display: flex;
    align-items: center;
    margin-bottom: 12px;
    padding: 20px 32px 0;
    color: #fff;
    font-weight: 700
}

.preview-modal .preview-modal__header.ac-fwb {
    font-weight: 700
}

.preview-modal .preview-modal__header.ac-fwm {
    font-weight: 500
}

.preview-modal .preview-modal__header.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .preview-modal .preview-modal__header {
        padding:20px 16px 0
    }
}

.preview-modal .preview-modal__x-button {
    margin-left: auto;
    width: 32px;
    height: 32px;
    border-radius: 100%;
    cursor: pointer
}

.preview-modal .preview-modal__x-button:hover {
    box-shadow: 0 2px 6px 0 rgba(33,37,41,.26);
    background-color: #343a40
}

@media screen and (max-width: 768px) {
    .preview-modal .preview-modal__x-button {
        width:24px;
        height: 24px
    }
}

.preview-modal .preview-modal__body {
    padding: 0 32px 32px
}

@media screen and (max-width: 768px) {
    .preview-modal .preview-modal__body {
        padding:0 16px 12px
    }
}

.preview-modal .preview-modal__player-content.modal-player {
    margin-bottom: 40px;
    width: 100%;
    height: 0;
    padding-top: 56.25%;
    position: relative
}

.preview-modal .preview-modal__player-content.modal-player>#overlay {
    position: absolute;
    background: #000;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%
}

.preview-modal .modal-player__player {
    margin-bottom: 12px;
    height: 388px;
    background-color: #000
}

@media screen and (max-width: 768px) {
    .preview-modal .modal-player__player {
        height:214px
    }
}

.preview-modal .modal-player__info {
    display: flex;
    align-items: center;
    margin-top: 12px
}

.preview-modal .modal-player__title {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #fff
}

.preview-modal .modal-player__title.ac-fwb {
    font-weight: 700
}

.preview-modal .modal-player__title.ac-fwm {
    font-weight: 500
}

.preview-modal .modal-player__title.ac-fwr {
    font-weight: 400
}

.preview-modal .modal-unit-list__title {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    display: flex;
    align-items: center;
    padding-bottom: 16px;
    border-bottom: 1px solid #495057;
    color: #fff;
    font-weight: 700
}

.preview-modal .modal-unit-list__title.ac-fwb {
    font-weight: 700
}

.preview-modal .modal-unit-list__title.ac-fwm {
    font-weight: 500
}

.preview-modal .modal-unit-list__title.ac-fwr {
    font-weight: 400
}

.preview-modal .modal-player__cart-button-cover {
    margin-left: auto
}

.preview-modal .modal-play__cart-button {
    font-weight: 700;
    background: unset
}

.preview-modal .modal-play__cart-button[data-type=cart] {
    color: #00c471;
    border-color: #00c471
}

.preview-modal .modal-play__cart-button .infd-icon {
    margin-right: 8px
}

.preview-modal .modal-unit-el {
    display: flex;
    align-items: center;
    padding: 12px;
    border-bottom: 1px solid #343a40;
    cursor: pointer
}

.preview-modal .modal-unit-el--active {
    background-color: #343a40
}

.preview-modal .modal-unit-el--active .modal-unit-el__thumbnail-label-cover {
    display: inline-flex
}

.preview-modal .modal-unit-el__thumbnail {
    flex-shrink: 0;
    position: relative;
    overflow: hidden;
    margin-right: 12px;
    width: 95px;
    height: 64px;
    border-radius: 4px
}

@media screen and (max-width: 768px) {
    .preview-modal .modal-unit-el__thumbnail {
        width:64px;
        height: 42px
    }
}

.preview-modal .modal-unit-el__thumbnail-label-cover {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    display: none;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
    background-color: rgba(0,0,0,.48)
}

.preview-modal .modal-unit-el__thumbnail-label {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    padding: 0 6px;
    height: 22px;
    border-radius: 2px;
    background-color: #e5503c;
    color: #fff;
    font-weight: 700
}

.preview-modal .modal-unit-el__thumbnail-label.ac-fwb {
    font-weight: 700
}

.preview-modal .modal-unit-el__thumbnail-label.ac-fwm {
    font-weight: 500
}

.preview-modal .modal-unit-el__thumbnail-label.ac-fwr {
    font-weight: 400
}

.preview-modal .modal-unit-el__title {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-right: 36px;
    color: #fff
}

.preview-modal .modal-unit-el__title.ac-fwb {
    font-weight: 700
}

.preview-modal .modal-unit-el__title.ac-fwm {
    font-weight: 500
}

.preview-modal .modal-unit-el__title.ac-fwr {
    font-weight: 400
}

.preview-modal .modal-unit-el__runtime {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    margin-left: auto;
    color: #fff
}

.preview-modal .modal-unit-el__runtime.ac-fwb {
    font-weight: 700
}

.preview-modal .modal-unit-el__runtime.ac-fwm {
    font-weight: 500
}

.preview-modal .modal-unit-el__runtime.ac-fwr {
    font-weight: 400
}

.shaka-video-container .shaka-controls-container {
    display: flex;
    flex-direction: column
}

.shaka-video-container .shaka-controls-button-panel {
    order: 2
}

.pg___course-slug .cd-menu {
    border-bottom: 1px solid #f1f3f5
}

.pg___course-slug .cd-menu__container {
    display: flex;
    align-items: flex-end;
    height: 45px;
    overflow-x: auto;
    white-space: nowrap
}

.pg___course-slug .ac-container.cd-menu__container {
    padding: 0 32px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .ac-container.cd-menu__container {
        padding:0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .ac-container.cd-menu__container {
        padding:0 16px
    }
}

.pg___course-slug .cd-menu__el {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    font-weight: 500;
    display: inline-block;
    min-height: 33px;
    padding: 15px 0 6px;
    color: #abb0b5;
    border-bottom: 2px inset transparent
}

.pg___course-slug .cd-menu__el.ac-fwb {
    font-weight: 700
}

.pg___course-slug .cd-menu__el.ac-fwm {
    font-weight: 500
}

.pg___course-slug .cd-menu__el.ac-fwr {
    font-weight: 400
}

.pg___course-slug .cd-menu__el:not(:last-child) {
    margin-right: 30px
}

.pg___course-slug .cd-menu__el--active {
    color: #1b1c1d;
    border-bottom-color: #1b1c1d;
    font-weight: 700
}

.pg___course-slug .cd-menu__count {
    font-weight: 400;
    line-height: 1.45;
    letter-spacing: -.3px;
    font-size: 11px;
    color: #00c471;
    font-weight: 500;
    margin-left: 4px
}

.decimal-star {
    position: relative;
    display: inline-block
}

.decimal-star.decimal-star--selectable .decimal-star__el {
    cursor: pointer
}

.decimal-star .decimal-star__empty-cover {
    display: flex
}

.decimal-star .decimal-star__fill-cover {
    position: absolute;
    top: 0;
    left: 0;
    overflow: hidden;
    height: 100%;
    white-space: nowrap
}

.cd__discount-banner {
    width: 100%;
    background-color: #e5503c;
    color: #fff
}

.pg___course-slug {
    overflow: visible
}

.pg___course-slug.sticky header#header {
    display: none
}

.pg___course-slug.sticky .cd-menu {
    position: fixed;
    top: 0;
    width: 100%;
    background-color: #fff;
    z-index: 72
}

.pg___course-slug.sticky .cd-content {
    padding-top: 56px
}

.pg___course-slug .pagination {
    max-width: 850px;
    padding: 2rem 1rem
}

.pg___course-slug .pagination .pagination-next,.pg___course-slug .pagination .pagination-previous {
    background: #1dc078;
    color: #fff;
    font-weight: 800;
    border: 0
}

.pg___course-slug .course-description-wrapper {
    margin: 0
}

.pg___course-slug .ac-container {
    padding: 0 32px 0 16px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .ac-container {
        padding:0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-slug .ac-container {
        padding:0 16px
    }
}

.pg___course-slug .ac-container-top {
    padding-top: 28px
}

.pg___course-slug .ac-left-wrapper {
    padding-left: 0;
    padding-right: 0;
    flex-basis: 65.666667%;
    max-width: 65.666667%
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .ac-left-wrapper {
        flex-basis:100%;
        max-width: 100%
    }
}

.pg___course-slug .ac-left-container {
    max-width: 702px;
    padding: 0 16px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .ac-left-container {
        max-width:none;
        padding: 0
    }
}

.pg___course-slug .ac-right-wrapper {
    padding-right: 0;
    flex-basis: 34.333333%;
    max-width: 34.333333%
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .ac-right-wrapper {
        flex-basis:100%;
        max-width: 100%
    }
}

.pg___course-slug .cd-content__wrapper {
    width: 100%;
    max-width: 720px
}

@media screen and (max-width: 1024px) {
    .pg___course-slug .cd-content__wrapper {
        max-width:unset
    }
}

.pg___course-slug .cd-content__wrapper .no_result {
    padding: 28px 0 0
}

.classTableTitle {
    margin-bottom: 16px;
    font-weight: 700;
    font-size: 20px;
    line-height: 100%;
    color: #212529
}

#classTable {
    margin-bottom: 32px;
    width: 100%;
    border-collapse: collapse;
    border: 0
}

#classTable thead tr {
    text-align: left;
    background: #e9ecef
}

#classTable thead tr,#classTable tr {
    font-weight: 500;
    font-size: 16px;
    line-height: 150%;
    color: #495057;
    border-top: 1px solid #ced4da;
    border-bottom: 1px solid #ced4da
}

#classTable th {
    padding: 8px 20px;
    border-left: 0;
    border-right: 0
}

#classTable td {
    padding: 12px 20px;
    border-left: 0;
    border-right: 0
}

#classTable td.title {
    padding: 8px 20px;
    border-left: 0;
    border-right: 0;
    text-align: left;
    font-weight: 700;
    font-size: 16px;
    line-height: 150%;
    color: #495057;
    background: #e9ecef;
    border-top: 1px solid #ced4da;
    border-bottom: 1px solid #ced4da
}

#conferenceTable {
    width: 95%;
    border: 0;
    border-collapse: collapse
}

#conferenceTable .conferenceTable__title {
    display: flex;
    align-items: center;
    margin: 0;
    text-align: left;
    padding: 0 20px;
    height: 82px;
    font-size: 26px;
    font-weight: 700;
    color: #000
}

#conferenceTable thead tr {
    background: #f1f3f5;
    border: 1px solid #e9ecef;
    border-radius: 8px
}

#conferenceTable th {
    padding: 0;
    border: 0;
    border-collapse: collapse
}

#conferenceTable td {
    vertical-align: top;
    padding: 32px 20px;
    border: 0;
    border-collapse: collapse;
    font-weight: 500;
    font-size: 16px;
    line-height: 1.45;
    color: #495057;
    border-bottom: 1px solid #ced4da
}

.ac-like-button {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: inline-flex;
    align-items: center;
    color: #adb5bd;
    cursor: pointer
}

.ac-like-button.ac-fwb {
    font-weight: 700
}

.ac-like-button.ac-fwm {
    font-weight: 500
}

.ac-like-button.ac-fwr {
    font-weight: 400
}

.ac-like-button .infd-icon.ac-like-button__icon--visible {
    display: none
}

.ac-like-button.ac-like-button--active {
    color: #e5503c
}

.ac-like-button.ac-like-button--active .infd-icon {
    display: none
}

.ac-like-button.ac-like-button--active .infd-icon.ac-like-button__icon--visible {
    display: inline-flex
}

.ac-like-button .ac-like-button__count {
    margin-left: 2px
}

.open-editable-modal-cover {
    position: relative
}

@media screen and (max-width: 768px) {
    .open-editable-modal-cover .open-editable-modal-PC-icon {
        display:none
    }
}

.open-editable-modal-cover .open-editable-modal-MB-icon {
    display: none
}

@media screen and (max-width: 768px) {
    .open-editable-modal-cover .open-editable-modal-MB-icon {
        display:inline-flex
    }
}

.open-editable-modal-cover .editable-modal-PC {
    position: absolute;
    top: 100%;
    right: 0;
    display: inline-flex;
    flex-direction: column;
    width: 82px;
    border: 1px solid #dee2e6;
    box-shadow: 0 3px 8px 0 rgba(222,226,230,.05);
    background-color: #fff
}

.open-editable-modal-cover .editable-modal-PC__button {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    cursor: pointer
}

.open-editable-modal-cover .editable-modal-PC__button.ac-fwb {
    font-weight: 700
}

.open-editable-modal-cover .editable-modal-PC__button.ac-fwm {
    font-weight: 500
}

.open-editable-modal-cover .editable-modal-PC__button.ac-fwr {
    font-weight: 400
}

.open-editable-modal-cover .editable-modal-PC__button+.editable-modal-PC__button {
    border-top: 1px solid #dee2e6
}

.open-editable-modal-cover .editable-modal-PC__button>.infd-icon {
    margin-right: 6px;
    width: 32px;
    height: 32px
}

.pg___course-description .apply_section {
    background: #303740;
    border-bottom: 1px solid #212529
}

.pg___course-description .apply_section .apply_card .apply_title {
    color: #fff
}

.pg___course-description .apply_section .apply_card .apply_desc {
    color: #e9ecef
}

.pg___course-description section#curriculum:before,.pg___course-description section#reviews:before {
    display: block;
    margin-top: -71px;
    padding-top: 71px;
    visibility: hidden;
    content: " ";
    z-index: 0
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-content .ac-r {
        flex-direction:column
    }
}

.pg___course-description .cd-content__wrapper {
    padding-right: 16px
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-content__wrapper {
        padding-right:0
    }
}

.pg___course-description #description {
    overflow: hidden
}

.pg___course-description .cd-body>* {
    letter-spacing: -.3px
}

.pg___course-description .cd-body h1 {
    margin-bottom: 12px;
    line-height: 1.5;
    color: #343a40;
    font-size: 30px;
    font-weight: 500
}

.pg___course-description .cd-body h2 {
    margin-bottom: 12px;
    font-weight: 500;
    color: #343a40;
    font-size: 26px;
    line-height: 1.5
}

.pg___course-description .cd-body h3 {
    margin-bottom: 10px;
    line-height: 1.45;
    color: #343a40;
    font-size: 22px;
    font-weight: 500
}

.pg___course-description .cd-body h4 {
    margin-bottom: 8px;
    line-height: 1.56;
    color: #343a40;
    font-size: 18px;
    font-weight: 500
}

.pg___course-description .cd-body p {
    margin-bottom: 8px;
    line-height: 1.69;
    color: #495057;
    font-size: 16px
}

.pg___course-description .cd-body p:empty:not(.gap) {
    margin: unset;
    padding-bottom: 16px
}

.pg___course-description .cd-body sub,.pg___course-description .cd-body sup {
    margin-bottom: 12px;
    line-height: 1.46;
    text-align: center;
    color: #495057;
    font-size: 13px
}

.pg___course-description .cd-body hr {
    max-width: 100%;
    width: 100%;
    height: 1px;
    background-color: #e9ecef
}

.pg___course-description .cd-body ol+h1,.pg___course-description .cd-body ol+h2,.pg___course-description .cd-body ol+h3,.pg___course-description .cd-body ol+h4,.pg___course-description .cd-body p+h1,.pg___course-description .cd-body p+h2,.pg___course-description .cd-body p+h3,.pg___course-description .cd-body p+h4,.pg___course-description .cd-body ul+h1,.pg___course-description .cd-body ul+h2,.pg___course-description .cd-body ul+h3,.pg___course-description .cd-body ul+h4 {
    margin-top: 40px
}

.pg___course-description .cd-body h1+h1,.pg___course-description .cd-body h1+h2,.pg___course-description .cd-body h1+h3,.pg___course-description .cd-body h1+h4,.pg___course-description .cd-body h2+h1,.pg___course-description .cd-body h2+h2,.pg___course-description .cd-body h2+h3,.pg___course-description .cd-body h2+h4,.pg___course-description .cd-body h3+h1,.pg___course-description .cd-body h3+h2,.pg___course-description .cd-body h3+h3,.pg___course-description .cd-body h3+h4,.pg___course-description .cd-body h4+h1,.pg___course-description .cd-body h4+h2,.pg___course-description .cd-body h4+h3,.pg___course-description .cd-body h4+h4 {
    padding-top: 8px
}

.pg___course-description .cd-body h1+p>img,.pg___course-description .cd-body h2+p>img,.pg___course-description .cd-body h3+p>img,.pg___course-description .cd-body h4+p>img,.pg___course-description .cd-body p+p {
    padding-top: 10px
}

.pg___course-description .cd-body img {
    max-width: 100%
}

.pg___course-description .cd-body img+p {
    padding-top: 16px
}

.pg___course-description .cd-body img+sub {
    max-width: 100%;
    text-align: center
}

.pg___course-description .cd-body ol,.pg___course-description .cd-body ul {
    margin-left: 0;
    margin-bottom: 12px;
    list-style-type: disc;
    list-style-position: inside;
    padding-left: 10px
}

.pg___course-description .cd-body ol ol,.pg___course-description .cd-body ol ul,.pg___course-description .cd-body ul ol,.pg___course-description .cd-body ul ul {
    padding-left: 1rem
}

.pg___course-description .cd-body ol li,.pg___course-description .cd-body ul li {
    margin-bottom: 2px;
    line-height: 1.69;
    color: #495057;
    font-size: 16px;
    word-break: break-all
}

.pg___course-description .cd-body ol {
    list-style-type: decimal
}

.pg___course-description .cd-body ul {
    list-style-type: disc
}

.pg___course-description .cd-body ul ul {
    list-style-type: circle
}

.pg___course-description .cd-body code,.pg___course-description .cd-body pre {
    background-color: #000;
    color: #fff;
    font-family: D2 coding,monospace!important;
    font-size: 15px
}

.pg___course-description .cd-body pre {
    overflow-x: auto;
    margin-bottom: 12px;
    padding: 8px 12px
}

.pg___course-description .cd-body pre>code {
    padding-right: 0;
    padding-left: 0;
    border: 0
}

.pg___course-description .cd-body code {
    padding: 1px 5px
}

.pg___course-description .cd-body blockquote {
    padding-left: 2rem;
    padding-right: 2rem;
    border-left: 3px solid #adb5bd
}

.pg___course-description .cd-body .gap {
    display: block;
    margin: unset;
    padding: unset;
    width: 100%;
    height: 40px
}

.pg___course-description .cd-body .card-wrapper-2 .card-el {
    width: 50%
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .card-wrapper-2 .card-el {
        width:100%
    }
}

.pg___course-description .cd-body .card-wrapper-3 .card-el {
    width: 33.33%
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .card-wrapper-3 .card-el {
        width:100%
    }
}

.pg___course-description .cd-body .card-wrapper-4 .card-el {
    width: 25%
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-body .card-wrapper-4 .card-el {
        width:50%
    }
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .card-wrapper-4 .card-el {
        width:100%
    }
}

.pg___course-description .cd-body .flex-box {
    display: flex;
    margin-bottom: 16px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .flex-box {
        flex-direction:column
    }
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .flex-box.flex-box--right {
        flex-direction:column-reverse
    }
}

.pg___course-description .cd-body .flex-box.flex-box--right .flex-box__img {
    margin: 0 0 0 16px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .flex-box.flex-box--right .flex-box__img {
        margin:0 0 16px
    }
}

.pg___course-description .cd-body .flex-box .flex-box__img {
    flex: 3;
    margin: 0 16px 0 0
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .flex-box .flex-box__img {
        flex:auto;
        width: 100%;
        margin: 0 0 16px
    }
}

.pg___course-description .cd-body .flex-box .flex-box__img img {
    width: 100%;
    height: auto
}

.pg___course-description .cd-body .flex-box .flex-box__desc {
    flex: 7 1 auto;
    width: 0
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body .flex-box .flex-box__desc {
        flex:auto;
        width: 100%
    }
}

.pg___course-description .cd-body .flex-box--55 .flex-box__desc,.pg___course-description .cd-body .flex-box--55 .flex-box__img {
    flex: 1
}

.pg___course-description .cd-body .cd-recommend-title {
    display: flex;
    flex-direction: column;
    font-size: 22px;
    padding-top: 3rem
}

.pg___course-description .cd-body .cd-recommend-title>span:last-of-type {
    font-weight: 700
}

.pg___course-description h2.cd-body__title {
    line-height: 1.45;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 22px;
    font-weight: 400
}

.pg___course-description h2.cd-body__intro-title {
    margin-bottom: 16px
}

.pg___course-description .cd-body__tip-title {
    margin-top: 42px;
    margin-bottom: 16px
}

.pg___course-description .cd-body__description {
    margin-bottom: 32px;
    line-height: 1.69;
    letter-spacing: -.5px;
    color: #495057;
    font-weight: 500;
    font-size: 18px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-body__description {
        font-size:16px
    }
}

.pg___course-description .cd-body__divider {
    margin: 42px 0;
    width: 100%;
    height: 0;
    background-color: unset;
    border-bottom: 1px solid #f1f3f5
}

.pg___course-description .cd-body__horizon-divider {
    margin: 42px 0;
    width: 100%;
    height: 0;
    background-color: unset;
    border-bottom: 1px dashed #dee2e6
}

.pg___course-description .cd-fixed-body {
    display: flex;
    align-items: center;
    margin: 16px 0;
    padding: 32px 24px 32px 16px;
    border-radius: 8px;
    border: 1px solid #e9ecef;
    background-color: #fff
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-fixed-body {
        flex-direction:column;
        align-items: stretch;
        padding: 30px 20px 20px
    }
}

.pg___course-description .cd-fixed-body__title {
    flex-shrink: 0;
    flex-basis: 130px;
    margin-right: 16px;
    line-height: 1.39;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 18px;
    font-weight: 500;
    text-align: center
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-fixed-body__title {
        flex-basis:auto;
        margin-right: unset;
        margin-bottom: 30px
    }
}

.pg___course-description .cd-fixed-body__list-content {
    flex: 1 1 auto
}

.pg___course-description .cd-fixed-body__list {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    display: flex;
    align-items: baseline;
    color: #343a40
}

.pg___course-description .cd-fixed-body__list.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-fixed-body__list.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-fixed-body__list.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-fixed-body__list>.infd-icon {
    margin-right: 8px;
    width: 16px;
    height: 16px
}

.pg___course-description .cd-fixed-body__list+.cd-fixed-body__list {
    margin-top: 10px
}

.pg___course-description .cd-body .cd-address .cd-address__text {
    margin-top: 8px;
    font-weight: 500;
    font-size: 16px;
    line-height: 20px;
    color: #868e96
}

.pg___course-description .cd-section-title {
    margin: 0 0 20px;
    color: #343a40;
    font-weight: 700;
    font-size: 22px;
    line-height: 1.5
}

.pg___course-description .cd-instructors {
    margin-bottom: 42px
}

.pg___course-description .cd-instructors__cover .cd-instructors__header {
    margin-bottom: 16px;
    display: flex;
    align-items: center
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-instructors__cover .cd-instructors__header {
        margin-bottom:18px
    }
}

.pg___course-description .cd-instructors__cover .cd-instructors__intro {
    line-height: 1.45;
    letter-spacing: -.3px;
    color: #212529;
    font-size: 22px
}

.pg___course-description .cd-instructors__cover .cd-instructors__intro a {
    margin-right: 4px;
    font-weight: 700;
    text-decoration: underline
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-instructors__cover .cd-instructors__intro a {
        display:block
    }
}

.pg___course-description .cd-instructors__cover .cd-instructors__intro a>.infd-icon {
    margin-left: 4px;
    margin-bottom: 1px;
    width: 20px;
    height: 20px;
    vertical-align: middle
}

.pg___course-description .cd-instructors__cover .cd-instructors__intro a>.infd-icon path {
    fill: #212529
}

.pg___course-description .cd-instructors__thumbnail {
    flex-shrink: 0;
    overflow: hidden;
    margin-left: auto;
    width: 64px;
    height: 64px;
    border-radius: 100%;
    border: 1px solid #dee2e6
}

.pg___course-description .cd-instructors__thumbnail>img {
    width: 100%;
    height: 100%;
    -o-object-fit: cover;
    object-fit: cover
}

.pg___course-description .cd-instructors__body {
    overflow-x: auto;
    line-break: anywhere
}

.pg___course-description .cd-instructors__body.cd-instructors__body--long {
    overflow: hidden;
    max-height: 180px
}

.pg___course-description .cd-instructors__body p {
    line-height: 1.63;
    letter-spacing: -.3px;
    color: #495057;
    font-size: 16px
}

.pg___course-description .cd-instructors__more {
    position: relative
}

.pg___course-description .cd-instructors__more:before {
    position: absolute;
    bottom: 100%;
    display: block;
    width: 100%;
    height: 63px;
    background-image: linear-gradient(180deg,hsla(0,0%,100%,0) 0,hsla(0,0%,100%,.3) 30%,#fff);
    content: ""
}

.pg___course-description .cd-instructors__more>button {
    padding-left: 0;
    text-decoration: underline
}

.pg___course-description .cd-instructors__more>button>.infd-icon {
    margin-left: 4px;
    width: 16px;
    height: 16px
}

.pg___course-description .cd-instructors__more>button>.infd-icon path {
    fill: #495057
}

.pg___course-description .cd-instructors__body+.cd-instructors__another {
    margin-top: 16px
}

.pg___course-description .cd-instructors__more+.cd-instructors__another {
    margin-top: 8px
}

.pg___course-description .cd-instructors__another.another-instructors {
    display: flex;
    align-items: center
}

.pg___course-description .another-instructors__header {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-right: 10px;
    color: #495057;
    font-weight: 500
}

.pg___course-description .another-instructors__header.ac-fwb {
    font-weight: 700
}

.pg___course-description .another-instructors__header.ac-fwm {
    font-weight: 500
}

.pg___course-description .another-instructors__header.ac-fwr {
    font-weight: 400
}

.pg___course-description .another-instructors__thumbnail-cover {
    overflow: hidden;
    width: 32px;
    height: 32px;
    border-radius: 100%;
    border: 1px solid #dee2e6
}

.pg___course-description .another-instructors__thumbnail-cover:hover {
    border: 1px solid #495057
}

.pg___course-description .another-instructors__thumbnail-cover+.another-instructors__thumbnail-cover {
    margin-left: 8px
}

.pg___course-description .another-instructors__thumbnail-cover>img {
    width: 100%;
    height: 100%;
    -o-object-fit: cover;
    object-fit: cover
}

.pg___course-description .course-detail__inquiry-email {
    margin: 0 0 43px;
    padding: 16px;
    font-size: 16px;
    line-height: 150%;
    border: 1px solid #e9ecef;
    border-radius: 8px
}

.pg___course-description .course-detail__inquiry-email-title {
    font-weight: 500;
    color: #212529
}

.pg___course-description .course-detail__inquiry-email-value {
    margin: 0 0 0 16px;
    font-weight: 400;
    color: #343a40
}

.pg___course-description .cd-curriculum {
    margin-bottom: 8px
}

.pg___course-description .cd-curriculum__header {
    display: flex;
    align-items: flex-end;
    margin-bottom: 8px
}

.pg___course-description .cd-curriculum__title {
    margin-right: 8px;
    line-height: 1.45;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 22px;
    font-weight: 700
}

.pg___course-description .cd-curriculum__sub-title {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .cd-curriculum__sub-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__sub-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__sub-title.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-curriculum__description {
    display: flex;
    margin-bottom: 20px;
    align-items: flex-end
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-curriculum__description {
        align-items:flex-start
    }
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__description {
        flex-direction:column;
        margin-bottom: 10px
    }
}

.pg___course-description .cd-curriculum__description>span {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-right: 12px;
    color: #495057;
    word-break: keep-all
}

.pg___course-description .cd-curriculum__description>span.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__description>span.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__description>span.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__description>span {
        margin-right:unset;
        margin-bottom: 16px
    }
}

.pg___course-description .cd-curriculum__description>button {
    flex-shrink: 0;
    margin-left: auto
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__description>button {
        width:100%
    }
}

.pg___course-description .cd-curriculum__accordion {
    overflow: hidden;
    border: 1px solid #e9ecef;
    border-radius: 4px
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-cover:first-child .cd-accordion__section {
    border-top: unset
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section {
    display: flex;
    align-items: center;
    padding: 15px 20px;
    border-top: 1px solid #f1f3f5;
    border-bottom: 1px solid #f1f3f5;
    background-color: #f8f9fa;
    cursor: pointer
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section>.infd-icon {
    margin-right: 8px;
    width: 16px;
    height: 16px
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section .is-open {
    display: none
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section.cd-accordion__section--open .is-open {
    display: inline-flex
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section.cd-accordion__section--open .is-close {
    display: none
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-title {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    color: #343a40;
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-title.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-info {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-left: auto;
    color: #343a40
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-info.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-info.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__section-info.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__accordion .cd-accordion__section-info {
        display:none
    }
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__unit-cover {
    overflow: hidden
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__unit {
    display: flex;
    align-items: center;
    padding: 14px 20px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__accordion .cd-accordion__unit {
        padding:14px 16px
    }
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__unit>.infd-icon {
    margin-right: 8px;
    width: 16px;
    height: 16px
}

.pg___course-description .cd-curriculum__accordion .cd-accordion__unit+.cd-accordion__unit {
    border-top: 1px solid #f1f3f5
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-title {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    color: #495057
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-title.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-infos {
    display: inline-flex;
    align-items: center;
    margin-left: auto;
    flex-shrink: 0
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--edit {
    margin-left: 8px;
    width: 26px;
    height: 26px;
    border-radius: 4px;
    border: 1px solid #e9ecef;
    color: #495057
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--preview {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    margin-left: 8px;
    padding: 0 7px;
    height: 26px;
    border-radius: 4px;
    border: 1px solid #00c471;
    color: #00c471;
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--preview.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--preview.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--preview.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--time {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-left: 16px;
    color: #343a40
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--time.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--time.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--time.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-curriculum__accordion .ac-accordion__unit-info--time {
        display:none
    }
}

.pg___course-description .cd-program {
    margin-bottom: 64px
}

.pg___course-description .cd-program__title {
    font-weight: 700;
    font-size: 22px;
    line-height: 32px;
    letter-spacing: -.3px;
    margin-bottom: 20px;
    color: #343a40
}

.pg___course-description .cd-date {
    margin-bottom: 64px
}

.pg___course-description .cd-date__content {
    display: flex;
    justify-content: center;
    padding: 14px 0;
    border-radius: 4px;
    background-color: #f8f9fa
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-date__content {
        flex-direction:column;
        align-items: center
    }
}

.pg___course-description .cd-date__content>span {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #868e96
}

.pg___course-description .cd-date__content>span.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-date__content>span.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-date__content>span.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-date__last-updated-at {
    margin-left: 4px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-date__last-updated-at {
        margin-top:4px;
        margin-left: unset
    }
}

.pg___course-description .cd-cancel-refund {
    margin: 40px 0;
    padding: 24px;
    background: #f8f9fa;
    border: 1px solid #e9ecef;
    border-radius: 8px
}

.pg___course-description .cd-cancel-refund__title {
    display: flex;
    align-items: center;
    font-weight: 700;
    font-size: 16px;
    line-height: 1.5
}

.pg___course-description .cd-cancel-refund__title svg {
    margin-right: 8px
}

.pg___course-description .cd-cancel-refund__title path {
    fill: #495057
}

.pg___course-description .cd-cancel-refund__rules {
    margin: 12px 0
}

.pg___course-description .cd-cancel-refund__rules li+li {
    margin-top: 2px
}

.pg___course-description .cd-cancel-refund__rule {
    display: flex;
    align-items: center;
    padding-left: 6px
}

.pg___course-description .cd-cancel-refund__rule:before {
    content: "";
    margin-right: 10px;
    width: 4px;
    height: 4px;
    background: #868e96;
    border-radius: 4px
}

.pg___course-description .cd-cancel-refund__text {
    color: #868e96;
    font-weight: 400;
    font-size: 16px;
    line-height: 27px
}

.pg___course-description .cd-review {
    margin-bottom: 56px
}

.pg___course-description .cd-review__header {
    margin-bottom: 8px;
    display: flex;
    align-items: baseline
}

.pg___course-description .cd-review__title {
    margin-right: 8px;
    line-height: 1.45;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 22px;
    font-weight: 700
}

.pg___course-description .cd-review__sub-title {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .cd-review__sub-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-review__sub-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-review__sub-title.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-review__description {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-bottom: 16px;
    color: #495057
}

.pg___course-description .cd-review__description.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-review__description.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-review__description.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-review__dashboard {
    display: flex;
    height: 180px
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-review__dashboard {
        flex-direction:column;
        height: auto
    }
}

.pg___course-description .cd-review__dashboard-el {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    border-radius: 4px;
    border: 1px solid #e9ecef
}

.pg___course-description .dashboard-star {
    margin-right: 6px;
    flex: 1
}

@media screen and (max-width: 768px) {
    .pg___course-description .dashboard-star {
        margin-right:unset;
        margin-bottom: 8px;
        padding: 40px 0
    }
}

.pg___course-description .dashboard-star__num {
    margin-bottom: 18px;
    line-height: 1;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 36px;
    font-weight: 700
}

.pg___course-description .dashboard-star__star {
    margin-bottom: 5px
}

.pg___course-description .dashboard-star__text {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .dashboard-star__text.ac-fwb {
    font-weight: 700
}

.pg___course-description .dashboard-star__text.ac-fwm {
    font-weight: 500
}

.pg___course-description .dashboard-star__text.ac-fwr {
    font-weight: 400
}

.pg___course-description .dashboard-graph {
    flex: 2
}

@media screen and (max-width: 768px) {
    .pg___course-description .dashboard-graph {
        flex:1;
        padding: 40px 36px
    }
}

.pg___course-description .dashboard-graph__row {
    display: flex;
    align-items: center
}

@media screen and (max-width: 768px) {
    .pg___course-description .dashboard-graph__row {
        width:100%
    }
}

.pg___course-description .dashboard-graph__row+.dashboard-graph__row {
    margin-top: 3px
}

.pg___course-description .dashboard-graph__row.dashboard-graph__row--5 .dashboard-graph__progress[value]::-webkit-progress-value {
    background-color: #ffc807
}

.pg___course-description .dashboard-graph__text {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin-right: 8px;
    flex-shrink: 0
}

.pg___course-description .dashboard-graph__text.ac-fwb {
    font-weight: 700
}

.pg___course-description .dashboard-graph__text.ac-fwm {
    font-weight: 500
}

.pg___course-description .dashboard-graph__text.ac-fwr {
    font-weight: 400
}

.pg___course-description .dashboard-graph__progress[value] {
    width: 360px;
    height: 8px;
    border: none;
    color: #343a40;
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none
}

.pg___course-description .dashboard-graph__progress[value]::-webkit-progress-bar {
    border-radius: 8px;
    border: unset;
    box-shadow: unset;
    background: #dee2e6
}

.pg___course-description .dashboard-graph__progress[value]::-webkit-progress-value {
    border-radius: 8px;
    background: #868e96
}

.pg___course-description .dashboard-graph__progress[value]::-moz-progress-bar {
    border-radius: 8px;
    border: unset;
    box-shadow: unset;
    background: #dee2e6
}

.pg___course-description .cd-review__add {
    margin-top: 8px;
    margin-bottom: 48px
}

.pg___course-description .review-add-content {
    border-radius: 4px;
    border: 1px solid #e9ecef;
    background-color: #f8f9fa
}

.pg___course-description .review-add-content__top {
    margin-bottom: 24px;
    padding-top: 26px
}

.pg___course-description .review-add-content__star-content {
    display: flex;
    justify-content: center;
    margin-bottom: 8px
}

.pg___course-description .review-add-content__ment {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #343a40;
    text-align: center
}

.pg___course-description .review-add-content__ment.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-add-content__ment.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-add-content__ment.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-add-content__bottom {
    overflow: hidden;
    margin: 0 16px 16px;
    border-radius: 4px;
    border: 1px solid #dee2e6
}

.pg___course-description .review-add-content__editor-content {
    display: flex;
    border-bottom: 1px solid #dee2e6
}

.pg___course-description .review-add-content__editor-content>textarea {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    padding: 13px 12px;
    width: 100%;
    min-height: 102px;
    border: none;
    background-color: #fff;
    color: #495057;
    resize: none
}

.pg___course-description .review-add-content__editor-content>textarea.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-add-content__editor-content>textarea.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-add-content__editor-content>textarea.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-add-content__editor-content>textarea::-moz-placeholder {
    color: #ced4da
}

.pg___course-description .review-add-content__editor-content>textarea:-ms-input-placeholder {
    color: #ced4da
}

.pg___course-description .review-add-content__editor-content>textarea::placeholder {
    color: #ced4da
}

.pg___course-description .review-add-content__button-cover {
    display: flex;
    justify-content: flex-end;
    background-color: #fff
}

.pg___course-description .review-add-content__button-cover>button {
    border-radius: 0
}

.pg___course-description .cd-review__dashboard+.cd-review__list {
    margin-top: 44px
}

.pg___course-description .review-filter {
    display: flex;
    overflow-x: auto;
    align-items: center;
    padding: 0 16px 10px;
    border-bottom: 1px solid #495057;
    white-space: nowrap
}

@media screen and (max-width: 768px) {
    .pg___course-description .review-filter {
        padding:0 0 10px
    }
}

.pg___course-description .review-filter__title {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #495057;
    font-weight: 700
}

.pg___course-description .review-filter__title.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-filter__title.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-filter__title.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .review-filter__title {
        display:none
    }
}

.pg___course-description .review-filter__divider {
    margin: 0 10px 0 12px;
    width: 1px;
    height: 12px;
    background-color: #dee2e6
}

@media screen and (max-width: 768px) {
    .pg___course-description .review-filter__divider {
        display:none
    }
}

.pg___course-description .review-filter__cover--PC {
    display: inline-flex
}

@media screen and (max-width: 768px) {
    .pg___course-description .review-filter__cover--PC {
        display:none
    }
}

.pg___course-description .review-filter__cover--MB {
    display: none
}

@media screen and (max-width: 768px) {
    .pg___course-description .review-filter__cover--MB {
        display:inline-flex
    }
}

.pg___course-description .review-filter__cover--MB .review-filter__el {
    display: none
}

.pg___course-description .review-filter__cover--MB .review-filter__el.review-filter__el--active {
    display: inline-flex
}

.pg___course-description .review-filter__el {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    display: inline-flex;
    align-items: center;
    padding: 4px 6px;
    color: #adb5bd;
    font-weight: 500;
    cursor: pointer
}

.pg___course-description .review-filter__el.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-filter__el.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-filter__el.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-filter__el:not([data-type=recommended]) {
    margin-left: 6px
}

.pg___course-description .review-filter__el>.infd-icon {
    width: 16px;
    height: 16px
}

.pg___course-description .review-filter__el>.infd-icon path {
    fill: #adb5bd
}

.pg___course-description .review-filter__el--active:not([data-type=normal]) {
    color: #495057
}

.pg___course-description .review-filter__el--active:not([data-type=normal])>.infd-icon path {
    fill: #00c471
}

.pg___course-description .review-not-enough {
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    margin: 64px 0;
    color: #495057;
    text-align: center
}

.pg___course-description .review-not-enough.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-not-enough.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-not-enough.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-list__el-cover {
    padding: 32px 0
}

.pg___course-description .review-list__el-cover+.review-list__el-cover {
    border-top: 1px solid #f1f3f5
}

.pg___course-description .review-el__header {
    margin-bottom: 12px;
    display: flex;
    align-items: center
}

.pg___course-description .review-el__header--left {
    display: flex;
    align-items: flex-start
}

.pg___course-description .review-el__thumbnail {
    display: block;
    margin-right: 8px;
    flex-shrink: 0;
    overflow: hidden;
    width: 42px;
    height: 42px;
    border-radius: 100%;
    border: 1px solid #e9ecef
}

.pg___course-description .review-el__thumbnail>img {
    width: 100%;
    height: 100%;
    -o-object-fit: cover;
    object-fit: cover
}

.pg___course-description .review-el__user-info {
    display: flex;
    flex-direction: column
}

.pg___course-description .review-el__name {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #343a40;
    font-weight: 700;
    text-decoration: unset;
    margin-bottom: 2px
}

.pg___course-description .review-el__name.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-el__name.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-el__name.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-el__name:hover {
    color: #343a40
}

.pg___course-description .review-el__meta-cover {
    display: inline-flex;
    align-items: center;
    gap: 0 2px
}

.pg___course-description .review-el__meta {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 12px;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .review-el__meta.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-el__meta.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-el__meta.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-el__star-cover {
    display: inline-flex;
    align-items: center;
    margin-bottom: 12px
}

.pg___course-description .review-el__star {
    display: inline-flex;
    margin-right: 4px
}

.pg___course-description .review-el__star-num {
    display: inline-flex;
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    color: #343a40;
    font-weight: 700;
    margin-right: 8px
}

.pg___course-description .review-el__star-num.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-el__star-num.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-el__star-num.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-el__progress-text {
    color: #868e96
}

.pg___course-description .review-el__header--right {
    margin-left: auto;
    display: inline-flex;
    align-items: center;
    gap: 0 4px
}

.pg___course-description .review-el__header--right .infd-icon {
    width: 32px;
    height: 32px;
    cursor: pointer;
    color: #495057
}

.pg___course-description .review-el__body {
    margin-bottom: 12px;
    line-height: 1.6;
    letter-spacing: -.3px;
    color: #495057;
    font-size: 15px;
    white-space: pre-line
}

.pg___course-description .review-el__tools {
    display: flex;
    align-items: center
}

.pg___course-description .review-el__tools--right {
    margin-left: auto
}

.pg___course-description .review-el__tool {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: inline-flex;
    align-items: center;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .review-el__tool.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-el__tool.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-el__tool.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-el__tool--clickable {
    cursor: pointer
}

.pg___course-description .review-el__tool--reply {
    margin-left: 2px
}

.pg___course-description .review-el__tool--like .infd-icon.review-el__tool--like-visible {
    display: none
}

.pg___course-description .review-el__tool--like.review-el__tool--active {
    color: #e5503c
}

.pg___course-description .review-el__tool--like.review-el__tool--active .infd-icon {
    display: none
}

.pg___course-description .review-el__tool--like.review-el__tool--active .infd-icon.review-el__tool--like-visible {
    display: inline-flex
}

.pg___course-description .review-el__tool--like .review-el__like--cnt {
    margin-left: 2px
}

.pg___course-description .review-reply-editor {
    position: relative;
    margin-top: 24px;
    padding: 14px 16px;
    background-color: #f8f9fa
}

.pg___course-description .review-reply-editor:before {
    content: "";
    position: absolute;
    top: -14px;
    left: 0;
    width: 0;
    height: 0;
    border: none;
    border-right: 14px solid transparent;
    border-bottom: 14px solid #f8f9fa
}

.pg___course-description .review-reply-editor__name {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    margin-bottom: 8px;
    display: flex;
    align-items: center;
    color: #868e96;
    font-weight: 700
}

.pg___course-description .review-reply-editor__name.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-editor__name.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-editor__name.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-editor__name--tag {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    margin-right: 8px;
    padding: 3px 6px;
    border: 1px solid #868e96;
    color: #868e96;
    font-weight: 500
}

.pg___course-description .review-reply-editor__name--tag.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-editor__name--tag.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-editor__name--tag.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-editor__bottom {
    border-radius: 4px;
    border: 1px solid #dee2e6;
    background-color: #fff
}

.pg___course-description .review-reply-editor__content {
    border-bottom: 1px solid #dee2e6
}

.pg___course-description .review-reply-editor__content>textarea {
    font-weight: 400;
    line-height: 1.47;
    letter-spacing: -.3px;
    font-size: 15px;
    padding: 13px 12px;
    width: 100%;
    min-height: 102px;
    border: none;
    background-color: #fff;
    color: #495057;
    resize: none
}

.pg___course-description .review-reply-editor__content>textarea.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-editor__content>textarea.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-editor__content>textarea.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-editor__content>textarea::-moz-placeholder {
    color: #ced4da
}

.pg___course-description .review-reply-editor__content>textarea:-ms-input-placeholder {
    color: #ced4da
}

.pg___course-description .review-reply-editor__content>textarea::placeholder {
    color: #ced4da
}

.pg___course-description .review-reply-editor__buttons {
    display: flex;
    justify-content: flex-end;
    align-items: center
}

.pg___course-description .review-reply-editor__buttons>button {
    border-radius: unset
}

.pg___course-description .review-reply-el {
    position: relative;
    margin-top: 24px;
    padding: 14px 16px;
    background-color: #f8f9fa
}

.pg___course-description .review-reply-el:before {
    content: "";
    position: absolute;
    top: -14px;
    left: 0;
    width: 0;
    height: 0;
    border: none;
    border-right: 14px solid transparent;
    border-bottom: 14px solid #f8f9fa
}

.pg___course-description .review-reply-el__header {
    display: flex;
    align-items: center;
    margin-bottom: 10px
}

.pg___course-description .review-reply-el__name {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: flex;
    align-items: center;
    color: #868e96;
    font-weight: 700
}

.pg___course-description .review-reply-el__name.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-el__name.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-el__name.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-el__name--tag {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    margin-right: 8px;
    padding: 3px 6px;
    border: 1px solid #868e96;
    color: #868e96;
    font-weight: 500
}

.pg___course-description .review-reply-el__name--tag.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-el__name--tag.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-el__name--tag.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-el__header--right {
    margin-left: auto
}

.pg___course-description .review-reply-el__header--right>.infd-icon {
    width: 16px;
    height: 16px;
    cursor: pointer
}

.pg___course-description .review-reply-el__body {
    margin-bottom: 10px;
    line-height: 1.6;
    letter-spacing: -.3px;
    color: #495057;
    font-size: 15px;
    white-space: pre-line;
    word-break: break-all
}

.pg___course-description .review-reply-el__tools {
    display: flex;
    align-items: center
}

.pg___course-description .review-reply-el__tools--right {
    margin-left: auto
}

.pg___course-description .review-reply-el__tool--clickable {
    cursor: pointer
}

.pg___course-description .review-reply-el__tool {
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    display: inline-flex;
    align-items: center;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .review-reply-el__tool.ac-fwb {
    font-weight: 700
}

.pg___course-description .review-reply-el__tool.ac-fwm {
    font-weight: 500
}

.pg___course-description .review-reply-el__tool.ac-fwr {
    font-weight: 400
}

.pg___course-description .review-reply-el__tool--like .infd-icon.review-reply-el__tool--like-visible {
    display: none
}

.pg___course-description .review-reply-el__tool--like.review-reply-el__tool--active {
    color: #e5503c
}

.pg___course-description .review-reply-el__tool--like.review-reply-el__tool--active .infd-icon {
    display: none
}

.pg___course-description .review-reply-el__tool--like.review-reply-el__tool--active .infd-icon.review-reply-el__tool--like-visible {
    display: inline-flex
}

.pg___course-description .review-reply-el__tool--like .review-reply-el__like--cnt {
    margin-left: 2px
}

.pg___course-description .cd-inst-courses {
    padding-top: 48px;
    padding-bottom: 16px
}

.pg___course-description .cd-similar-courses {
    padding-top: 16px;
    padding-bottom: 48px
}

.pg___course-description .cd-sub-courses {
    background-color: #f8f9fa
}

.pg___course-description .cd-sub-courses .ac-container {
    padding: 0 54px
}

@media screen and (max-width: 1024px) {
    .pg___course-description .cd-sub-courses .ac-container {
        padding:0 32px
    }
}

@media screen and (max-width: 768px) {
    .pg___course-description .cd-sub-courses .ac-container {
        padding:0 16px
    }
}

.pg___course-description .cd-sub-courses .sub-courses__header {
    margin-bottom: 24px
}

.pg___course-description .cd-sub-courses .sub-courses__title {
    display: inline-flex;
    align-items: center;
    justify-content: center;
    margin-bottom: 8px;
    line-height: 1.45;
    letter-spacing: -.3px;
    color: #343a40;
    font-size: 22px;
    font-weight: 700
}

.pg___course-description .cd-sub-courses a.sub-courses__title {
    text-decoration: underline
}

.pg___course-description .cd-sub-courses a.sub-courses__title .infd-icon {
    margin-left: 4px
}

.pg___course-description .cd-sub-courses .sub-courses__sub-title {
    font-weight: 400;
    line-height: 1.5;
    letter-spacing: -.3px;
    font-size: 16px;
    color: #adb5bd;
    font-weight: 500
}

.pg___course-description .cd-sub-courses .sub-courses__sub-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .cd-sub-courses .sub-courses__sub-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .cd-sub-courses .sub-courses__sub-title.ac-fwr {
    font-weight: 400
}

.pg___course-description .cd-sub-courses .sub-courses__courses-card>div,.pg___course-description .cd-sub-courses .sub-courses__courses-list>div {
    margin-bottom: 8px
}

.pg___course-description .wish-button--active .infd-icon,.pg___course-description .wish-button .is-wish {
    display: none
}

.pg___course-description .wish-button--active .is-wish {
    display: inline-flex
}

.pg___course-description .curated-position .position-card {
    overflow: hidden;
    margin-bottom: 48px;
    background-color: #fff;
    border-radius: 4px;
    box-shadow: 0 2px 3px rgba(0,10,18,.1),0 0 0 1px rgba(0,10,18,.1)
}

.pg___course-description .curated-position .position-card__thumbnail {
    padding-top: 55.46875%
}

.pg___course-description .curated-position .position-card__thumbnail img {
    position: absolute;
    left: 0;
    top: 0;
    right: 0;
    width: 100%;
    height: 100%;
    bottom: 0;
    opacity: 1;
    background-color: #fff;
    -o-object-fit: cover;
    object-fit: cover;
    -o-object-position: center center;
    object-position: center center
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card {
        margin-bottom:28px
    }
}

.pg___course-description .curated-position .position-card__content {
    padding: 10px
}

.pg___course-description .curated-position .position-card__content-title {
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
    font-weight: 400;
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    font-weight: 500;
    padding-bottom: 2px;
    color: #1b1c1d
}

.pg___course-description .curated-position .position-card__content-title.ac-fwb {
    font-weight: 700
}

.pg___course-description .curated-position .position-card__content-title.ac-fwm {
    font-weight: 500
}

.pg___course-description .curated-position .position-card__content-title.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card__content-title {
        font-weight:400;
        line-height: 1.5;
        letter-spacing: -.3px;
        font-size: 12px;
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-title.ac-fwb {
        font-weight: 700
    }

    .pg___course-description .curated-position .position-card__content-title.ac-fwm {
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-title.ac-fwr {
        font-weight: 400
    }
}

.pg___course-description .curated-position .position-card__content-position {
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
    font-weight: 500;
    height: 44px;
    color: #1b1c1d
}

.pg___course-description .curated-position .position-card__content-position.ac-fwb {
    font-weight: 700
}

.pg___course-description .curated-position .position-card__content-position.ac-fwm {
    font-weight: 500
}

.pg___course-description .curated-position .position-card__content-position.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card__content-position {
        font-weight:400;
        line-height: 1.43;
        letter-spacing: -.3px;
        font-size: 14px;
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-position.ac-fwb {
        font-weight: 700
    }

    .pg___course-description .curated-position .position-card__content-position.ac-fwm {
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-position.ac-fwr {
        font-weight: 400
    }
}

.pg___course-description .curated-position .position-card__content-detail {
    font-weight: 400;
    line-height: 1.43;
    letter-spacing: -.3px;
    font-size: 14px;
    font-weight: 500;
    display: flex;
    align-items: center;
    padding-top: 8px;
    color: #616568
}

.pg___course-description .curated-position .position-card__content-detail.ac-fwb {
    font-weight: 700
}

.pg___course-description .curated-position .position-card__content-detail.ac-fwm {
    font-weight: 500
}

.pg___course-description .curated-position .position-card__content-detail.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card__content-detail {
        font-weight:400;
        line-height: 1.38;
        letter-spacing: -.3px;
        font-size: 13px;
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-detail.ac-fwb {
        font-weight: 700
    }

    .pg___course-description .curated-position .position-card__content-detail.ac-fwm {
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-detail.ac-fwr {
        font-weight: 400
    }
}

.pg___course-description .curated-position .position-card__career,.pg___course-description .curated-position .position-card__location {
    font-style: normal
}

.pg___course-description .curated-position .position-card__divider {
    display: inline-block;
    margin: 0 6px;
    width: 1px;
    height: 6px;
    border-left: 1px solid #e9ebee
}

.pg___course-description .curated-position .position-card__content-duration {
    line-height: 1.38;
    letter-spacing: -.3px;
    font-size: 13px;
    font-weight: 400;
    padding-top: 4px;
    color: #858a8d
}

.pg___course-description .curated-position .position-card__content-duration.ac-fwb {
    font-weight: 700
}

.pg___course-description .curated-position .position-card__content-duration.ac-fwm {
    font-weight: 500
}

.pg___course-description .curated-position .position-card__content-duration.ac-fwr {
    font-weight: 400
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card__content-duration {
        font-weight:400;
        line-height: 1.5;
        letter-spacing: -.3px;
        font-size: 12px
    }

    .pg___course-description .curated-position .position-card__content-duration.ac-fwb {
        font-weight: 700
    }

    .pg___course-description .curated-position .position-card__content-duration.ac-fwm {
        font-weight: 500
    }

    .pg___course-description .curated-position .position-card__content-duration.ac-fwr {
        font-weight: 400
    }
}

.pg___course-description .curated-position .position-card__content-joinReward {
    font-weight: 400;
    line-height: 1.45;
    letter-spacing: -.3px;
    font-size: 11px;
    font-weight: 700;
    display: inline-flex;
    justify-content: center;
    align-items: center;
    margin-top: 10px;
    padding: 4px 8px;
    height: 24px;
    color: #00b594;
    background: #e9fbf8;
    border-radius: 62px
}

@media screen and (max-width: 768px) {
    .pg___course-description .curated-position .position-card__content-joinReward {
        margin-top:8px
    }
}

.pg___course-description .curated-position .sub-courses__content {
    display: flex;
    flex-wrap: wrap;
    width: 100%;
    margin-bottom: -26px
}

.pg___course-description .curated-position .position-card:nth-child(4n) {
    margin-right: 0
}

.pg___course-description .curated-position .position-card:first-child,.pg___course-description .curated-position .sub-courses__content>*+* {
    margin-right: 16px
}

.pg___course-description .curated-position .position-card {
    width: calc(25% - 12px)
}

@media screen and (max-width: 1024px) {
    .pg___course-description .curated-position .position-card:nth-child(2n) {
        margin-right:0
    }

    .pg___course-description .curated-position .position-card:first-child,.pg___course-description .curated-position .sub-courses__content>*+* {
        margin-right: 16px
    }

    .pg___course-description .curated-position .position-card {
        width: calc(50% - 8px)
    }

    .pg___course-description .curated-position .position-card:nth-child(3n) {
        margin-right: 16px
    }
}

/*! @license
 * Shaka Player
 * Copyright 2016 Google LLC
 * SPDX-License-Identifier: Apache-2.0
 */
.shaka-hidden {
    display: none!important
}

.shaka-video-container {
    position: relative;
    top: 0;
    left: 0;
    display: flex
}

.shaka-video-container .material-icons-round {
    font-family: Material Icons Round;
    font-size: 24px
}

.shaka-video-container * {
    font-family: Roboto-Regular,Roboto,sans-serif,TengwarTelcontar
}

.shaka-video-container:fullscreen {
    width: 100%;
    height: 100%;
    background-color: #000
}

.shaka-video-container:fullscreen .shaka-text-container {
    font-size: 4.4vmin
}

.shaka-video-container:-webkit-full-screen {
    width: 100%;
    height: 100%;
    background-color: #000
}

.shaka-video-container:-webkit-full-screen .shaka-text-container {
    font-size: 4.4vmin
}

.shaka-video-container:-moz-full-screen {
    width: 100%;
    height: 100%;
    background-color: #000
}

.shaka-video-container:-moz-full-screen .shaka-text-container {
    font-size: 4.4vmin
}

.shaka-video-container:-ms-fullscreen {
    width: 100%;
    height: 100%;
    background-color: #000
}

.shaka-video-container:-ms-fullscreen .shaka-text-container {
    font-size: 4.4vmin
}

.shaka-controls-container {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    justify-content: flex-end;
    align-items: center;
    z-index: 1
}

.shaka-video-container:not([shaka-controls=true]) .shaka-controls-container {
    display: none
}

.shaka-controls-container * {
    flex-shrink: 0
}

.shaka-controls-container[casting=true] .shaka-fullscreen-button {
    display: none
}

.shaka-canvas-container {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    pointer-events: none
}

.shaka-bottom-controls {
    width: 96%;
    padding: 0 0 2.5%;
    z-index: 1
}

.shaka-controls-button-panel {
    padding: 0;
    margin: 0;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    align-items: center;
    overflow: hidden;
    min-width: 48px;
    font-size: 12px;
    font-weight: 400;
    font-style: normal;
    user-select: none;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1)
}

.shaka-controls-container[casting=true] .shaka-controls-button-panel,.shaka-controls-container[shown=true] .shaka-controls-button-panel {
    opacity: 1
}

.shaka-controls-button-panel>* {
    color: #fff;
    height: 32px;
    line-height: .5;
    margin: 1px;
    padding: 0 5px;
    background: 0 0;
    border: 0;
    cursor: pointer
}

.shaka-controls-button-panel .shaka-overflow-menu-only {
    display: none
}

.shaka-play-button-container {
    margin: 0;
    width: 100%;
    height: 100%;
    flex-shrink: 1;
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    display: flex;
    justify-content: center;
    align-items: center
}

.shaka-statistics-container {
    overflow-x: hidden;
    overflow-y: auto;
    min-width: 300px;
    color: #fff;
    background-color: rgba(35 35 35/90%);
    font-size: 14px;
    padding: 5px 10px;
    border-radius: 2px;
    position: absolute;
    z-index: 2;
    left: 15px;
    top: 15px;
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1)
}

.shaka-controls-container[casting=true] .shaka-statistics-container,.shaka-controls-container[shown=true] .shaka-statistics-container {
    opacity: 1
}

.shaka-statistics-container div {
    display: flex;
    justify-content: space-between
}

.shaka-statistics-container span {
    color: #969696
}

.shaka-context-menu {
    background-color: rgba(35 35 35/90%);
    border-radius: 2px;
    position: absolute;
    z-index: 3
}

.shaka-context-menu button {
    padding: 5px 10px;
    width: 100%;
    display: flex;
    align-items: center;
    color: #fff;
    background: 0 0;
    border: 0;
    cursor: pointer
}

.shaka-context-menu button:hover {
    background-color: rgba(50 50 50/90%)
}

.shaka-context-menu label {
    padding: 0 20px
}

.shaka-context-menu .shaka-current-selection-span,.shaka-context-menu label {
    align-items: flex-start;
    color: #fff;
    cursor: pointer
}

.shaka-scrim-container {
    margin: 0;
    width: 100%;
    height: 100%;
    flex-shrink: 1;
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1);
    background: linear-gradient(0deg,#000 0,transparent 15%)
}

.shaka-controls-container[casting=true] .shaka-scrim-container,.shaka-controls-container[shown=true] .shaka-scrim-container {
    opacity: 1
}

.shaka-text-container {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    pointer-events: none;
    bottom: 0;
    width: 100%;
    min-width: 48px;
    transition: bottom .1s cubic-bezier(.4,0,.6,1);
    transition-delay: .5s;
    font-size: 20px;
    line-height: 1.4;
    color: #fff
}

.shaka-text-container span.shaka-text-wrapper {
    display: inline;
    background: 0 0
}

.shaka-controls-container[shown=true]~.shaka-text-container {
    bottom: 15%;
    transition-delay: 0s
}

.shaka-spinner-container {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    width: 100%;
    height: 100%;
    flex-shrink: 1;
    display: flex;
    justify-content: center;
    align-items: center
}

.shaka-video-container:not([shaka-controls=true]) .shaka-spinner-container {
    display: none
}

.shaka-spinner {
    position: relative;
    top: 0;
    left: 0;
    padding: 7.8%;
    filter: drop-shadow(0 0 2px rgba(255 255 255/50%))
}

.shaka-play-button,.shaka-spinner {
    margin: 0;
    box-sizing: border-box;
    width: 0;
    height: 0
}

.shaka-play-button {
    padding: 7.5%;
    border-radius: 50%;
    box-shadow: 0 0 20px 0 rgba(0 0 0/10%);
    border: none;
    background-size: 50%;
    background-repeat: no-repeat;
    background-position: 50%;
    background-color: rgba(255 255 255/90%);
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1)
}

.shaka-controls-container[casting=true] .shaka-play-button,.shaka-controls-container[shown=true] .shaka-play-button {
    opacity: 1
}

.shaka-play-button[icon=play] {
    background-image: url("data:image/svg+xml;charset=utf-8,%3Csvg height='24' width='24' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath d='M8 5v14l11-7z'/%3E%3Cpath d='M0 0h24v24H0z' fill='none'/%3E%3C/svg%3E")
}

.shaka-play-button[icon=pause] {
    background-image: url("data:image/svg+xml;charset=utf-8,%3Csvg height='24' width='24' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath d='M6 19h4V5H6v14zm8-14v14h4V5h-4z'/%3E%3Cpath d='M0 0h24v24H0z' fill='none'/%3E%3C/svg%3E")
}

.shaka-current-time {
    font-size: 14px;
    color: #fff;
    cursor: pointer
}

.shaka-current-time[disabled] {
    background-color: transparent;
    color: #fff;
    cursor: default
}

.shaka-controls-container button:focus,.shaka-controls-container input:focus {
    outline: 1px solid Highlight
}

.shaka-controls-container button:-moz-focus-inner,.shaka-controls-container input:-moz-focus-outer {
    outline: 0;
    border: 0
}

.shaka-controls-container:not(.shaka-keyboard-navigation) button:focus,.shaka-controls-container:not(.shaka-keyboard-navigation) input:focus {
    outline: 0
}

.shaka-range-container {
    position: relative;
    top: 0;
    left: 0;
    margin: 4px 6px;
    height: 4px;
    border-radius: 4px;
    background: #fff
}

.shaka-volume-bar-container {
    width: 100px;
    padding: 0
}

.shaka-range-element {
    -webkit-appearance: none;
    background: 0 0;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    height: 12px;
    top: -4px;
    z-index: 1
}

.shaka-range-element::-webkit-slider-runnable-track {
    width: 100%;
    cursor: pointer;
    height: 12px;
    background: 0 0;
    color: transparent;
    border: none
}

.shaka-range-element::-webkit-slider-thumb {
    -webkit-appearance: none;
    border: none;
    border-radius: 12px;
    height: 12px;
    width: 12px;
    background: #fff
}

.shaka-range-element::-moz-range-track {
    width: 100%;
    cursor: pointer;
    height: 12px;
    background: 0 0;
    color: transparent;
    border: none
}

.shaka-range-element::-moz-range-thumb {
    -webkit-appearance: none;
    border: none;
    border-radius: 12px;
    height: 12px;
    width: 12px;
    background: #fff
}

.shaka-seek-bar-container {
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1)
}

.shaka-controls-container[casting=true] .shaka-seek-bar-container,.shaka-controls-container[shown=true] .shaka-seek-bar-container {
    opacity: 1
}

/*!
 * @license
 * The SVG/CSS buffering spinner is based on http://codepen.io/jczimm/pen/vEBpoL
 * Some local modifications have been made.
 *
 * Copyright (c) 2016 by jczimm
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
.shaka-ad-markers,.shaka-spinner-svg {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%
}

.shaka-spinner-svg {
    animation: rotate 2s linear infinite;
    transform-origin: center center
}

.shaka-spinner-path {
    stroke: #202124;
    stroke-dasharray: 20,200;
    stroke-dashoffset: 0;
    animation: dash 1s ease-in-out infinite;
    stroke-linecap: round
}

@keyframes rotate {
    to {
        transform: rotate(1turn)
    }
}

@keyframes dash {
    0% {
        stroke-dasharray: 1,200;
        stroke-dashoffset: 0
    }

    50% {
        stroke-dasharray: 89,200;
        stroke-dashoffset: -35px
    }

    to {
        stroke-dasharray: 89,200;
        stroke-dashoffset: -124px
    }
}

.shaka-spacer {
    cursor: default;
    flex-shrink: 1;
    flex-grow: 1;
    margin: 0
}

.shaka-overflow-menu,.shaka-settings-menu {
    overflow-x: hidden;
    overflow-y: auto;
    white-space: nowrap;
    background: #fff;
    box-shadow: 0 1px 9px 0 rgba(0 0 0/40%);
    border-radius: 2px;
    max-height: 250px;
    min-width: 180px;
    opacity: 0;
    transition: opacity .6s cubic-bezier(.4,0,.6,1);
    display: flex;
    flex-direction: column;
    position: absolute;
    z-index: 2;
    right: 15px;
    bottom: 30px
}

.shaka-controls-container[casting=true] .shaka-overflow-menu,.shaka-controls-container[casting=true] .shaka-settings-menu,.shaka-controls-container[shown=true] .shaka-overflow-menu,.shaka-controls-container[shown=true] .shaka-settings-menu {
    opacity: 1
}

.shaka-overflow-menu button,.shaka-settings-menu button {
    font-size: 14px;
    background: 0 0;
    color: #000;
    border: none;
    min-height: 30px;
    padding: 3.5px 6px;
    display: flex;
    align-items: center;
    cursor: pointer
}

.shaka-overflow-menu button:hover,.shaka-settings-menu button:hover {
    background: #e0e0e0
}

.shaka-overflow-menu button label,.shaka-settings-menu button label {
    cursor: pointer
}

.shaka-keyboard-navigation .shaka-overflow-menu button:focus,.shaka-keyboard-navigation .shaka-settings-menu button:focus {
    background: #e0e0e0
}

.shaka-overflow-menu i,.shaka-settings-menu i {
    padding-left: 10px;
    padding-right: 10px
}

.shaka-overflow-menu.shaka-low-position,.shaka-settings-menu.shaka-low-position {
    bottom: 15px
}

.shaka-overflow-menu span {
    text-align: left
}

.shaka-overflow-button-label {
    position: relative;
    display: flex;
    flex-direction: column
}

.shaka-current-selection-span {
    color: rgba(0 0 0/54%)
}

.shaka-settings-menu span {
    margin-left: 54px
}

.shaka-back-to-overflow-button span {
    margin-left: 0
}

.shaka-back-to-overflow-button i {
    padding-right: 20px
}

.shaka-auto-span {
    left: 17px
}

.shaka-controls-container[ad-active=true] {
    pointer-events: none
}

.shaka-controls-container[ad-active=true] .shaka-bottom-controls {
    pointer-events: auto
}

.shaka-client-side-ad-container,.shaka-server-side-ad-container {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0
}

.shaka-video-container[shaka-controls=true] .shaka-client-side-ad-container iframe,.shaka-video-container[shaka-controls=true] .shaka-server-side-ad-container iframe {
    height: 90%
}

.shaka-server-side-ad-container {
    width: 100%;
    height: 100%;
    flex-shrink: 1
}

.shaka-server-side-ad-container:not([ad-active=true]) {
    pointer-events: none
}

.shaka-ad-controls {
    display: flex;
    flex-direction: row;
    z-index: 1;
    padding-bottom: 1%
}

.shaka-video-container:not([shaka-controls=true]) .shaka-ad-controls {
    display: none
}

.shaka-ad-controls button,.shaka-ad-controls div {
    color: #fff;
    font-size: medium
}

.shaka-ad-controls div:not(.shaka-skip-ad-counter) {
    margin: 1px
}

.shaka-ad-counter,.shaka-ad-position {
    display: flex;
    justify-content: flex-end;
    flex-direction: column;
    text-shadow: 1px 1px 4px #000
}

.shaka-ad-controls .shaka-ad-position:not(.shaka-hidden)+.shaka-ad-counter {
    margin-left: .75em
}

.shaka-skip-ad-container {
    position: relative;
    right: -2%;
    display: flex;
    flex-direction: row;
    margin: 0
}

.shaka-skip-ad-button {
    padding: 5px 15px;
    background: rgba(0 0 0/70%);
    border: none;
    cursor: pointer
}

.shaka-skip-ad-button:disabled {
    background: rgba(0 0 0/30%)
}

.shaka-skip-ad-counter {
    padding: 5px;
    background: rgba(0 0 0/70%);
    margin: 0
}

/*!
 * @license
 * The tooltip is based on https://github.com/felipefialho/css-components/
 * Local modifications have been performed.
 *
 * Copyright (c) 2017 Felipe Fialho
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
.shaka-tooltips-on {
    overflow: visible
}

.shaka-tooltips-on>[class*=shaka-tooltip] {
    position: relative
}

.shaka-tooltips-on>[class*=shaka-tooltip]:active:after,.shaka-tooltips-on>[class*=shaka-tooltip]:focus-visible:after,.shaka-tooltips-on>[class*=shaka-tooltip]:hover:after {
    content: attr(aria-label);
    font-family: Roboto-Regular,Roboto,sans-serif;
    line-height: 16px;
    white-space: nowrap;
    font-size: 13px;
    background: rgba(35 35 35/90%);
    color: #fff;
    border-radius: 3px;
    padding: 5px 10px;
    position: absolute;
    bottom: 37px;
    left: 16px;
    -webkit-transform: translateX(-50%);
    -moz-transform: translateX(-50%);
    -ms-transform: translateX(-50%);
    -o-transform: translateX(-50%);
    transform: translateX(-50%)
}

.shaka-tooltips-on>.shaka-tooltip-status:active:after,.shaka-tooltips-on>.shaka-tooltip-status:focus-visible:after,.shaka-tooltips-on>.shaka-tooltip-status:hover:after {
    content: attr(aria-label) " (" attr(shaka-status) ")"
}

.shaka-tooltips-on button:first-child:active:after,.shaka-tooltips-on button:first-child:focus-visible:after,.shaka-tooltips-on button:first-child:hover:after {
    left: 0;
    -webkit-transform: translateX(0);
    -moz-transform: translateX(0);
    -ms-transform: translateX(0);
    -o-transform: translateX(0);
    transform: translateX(0)
}

.shaka-tooltips-on button:last-child:active:after,.shaka-tooltips-on button:last-child:focus-visible:after,.shaka-tooltips-on button:last-child:hover:after {
    left: 32px;
    -webkit-transform: translateX(-100%);
    -moz-transform: translateX(-100%);
    -ms-transform: translateX(-100%);
    -o-transform: translateX(-100%);
    transform: translateX(-100%)
}

#shaka-player-ui-thumbnail-container {
    background-color: #000;
    border: 1px solid #000;
    box-shadow: 0 8px 8px 0 rgba(0,0,0,.5);
    min-width: 150px;
    overflow: hidden;
    position: absolute;
    visibility: hidden;
    width: 15%;
    z-index: 1
}

#shaka-player-ui-thumbnail-container #shaka-player-ui-thumbnail-image {
    position: absolute
}

#shaka-player-ui-thumbnail-container #shaka-player-ui-thumbnail-time {
    background-color: rgba(0,0,0,.5);
    bottom: 0;
    color: #fff;
    font-size: 16px;
    left: 0;
    position: absolute;
    right: 0;
    text-align: center
}


.material-icons-round {
    font-family: Material Icons Round;
    font-weight: 400;
    font-style: normal;
    font-size: 24px;
    line-height: 1;
    letter-spacing: normal;
    text-transform: none;
    display: inline-block;
    white-space: nowrap;
    word-wrap: normal;
    direction: ltr
}

</style>