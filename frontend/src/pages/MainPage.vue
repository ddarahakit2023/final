<template>
  <MobileAsideComponent />
  <main id='main' class="pg___courses is_logged_out is-student-user">
    <section id="courses_section" class="section">
      <div class="container">
        <div class="columns is-tablet">
          <aside class="column is-2 sidebar_left">

            <nav class="accordions e-accordions is-hidden-mobile">
              <div class="my-category-root">

              </div>
              <div class="accordion">
                <a class="e-change-qs accordion-header accordion-header__all" href="courses.html">
                  <span class="accordion-header__icon"><i class="fa-regular fa-grid-2"></i></span>
                  <span class="accordion-header__text">전체 강의</span>
                </a>
              </div>

              <div id="accordion_5" class="accordion e-accordion ">
                <div class="accordion-header toggle">
                  <p class="accordion-header-text">
                    <span class="accordion-header-text__icon"><i class="fa-regular fa-computer-classic"></i></span>
                    <span class="accordion-header-text__title">개발 · 프로그래밍</span>
                  </p>
                </div>
                <div class="accordion-body e-accordion-body" hidden="until-found">
                  <a class="e-change-qs accordion-content accordion-content--all " href="/courses/it-programming">전체</a>

                  <a class="e-change-qs accordion-content " href="/courses/it-programming/web-dev">웹 개발</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/front-end">프론트엔드</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/back-end">백엔드</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/full-stack">풀스택</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/mobile-app">모바일 앱 개발</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/programming-lang">프로그래밍 언어</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/algorithm">알고리즘 · 자료구조</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/database-dev">데이터베이스</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/devops-infra">데브옵스 · 인프라</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/sw-test">소프트웨어 테스트</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/programming-tool">개발 도구</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/web-publishing">웹 퍼블리싱</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/desktop-application">데스크톱 앱
                    개발</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/vr-ar">VR/AR</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/certificate-programming">자격증
                    (개발 · 프로그래밍)</a>
                  <a class="e-change-qs accordion-content " href="/courses/it-programming/dev-besides">기타 (개발 ·
                    프로그래밍)</a>
                </div>
              </div>
              <div id="accordion_39306" class="accordion e-accordion ">
                <div class="accordion-header toggle">
                  <p class="accordion-header-text">
                    <span class="accordion-header-text__icon"><i class="fa-regular fa-alien-8bit"></i></span>
                    <span class="accordion-header-text__title">게임 개발</span>
                  </p>
                </div>
                <div class="accordion-body e-accordion-body" hidden="until-found">
                  <a class="e-change-qs accordion-content accordion-content--all " href="/courses/game-dev-all">전체</a>

                  <a class="e-change-qs accordion-content " href="/courses/game-dev-all/game-programming">게임 프로그래밍</a>
                  <a class="e-change-qs accordion-content " href="/courses/game-dev-all/game-manage">게임 기획</a>
                  <a class="e-change-qs accordion-content " href="/courses/game-dev-all/game-art">게임 아트 · 그래픽</a>
                  <a class="e-change-qs accordion-content " href="/courses/game-dev-all/game-besides">기타 (게임 개발)</a>
                </div>
              </div>
              <div id="accordion_9" class="accordion e-accordion ">
                <div class="accordion-header toggle">
                  <p class="accordion-header-text">
                    <span class="accordion-header-text__icon"><i class="fa-regular fa-atom-simple"></i></span>
                    <span class="accordion-header-text__title">데이터 사이언스</span>
                  </p>
                </div>
                <div class="accordion-body e-accordion-body" hidden="until-found">
                  <a class="e-change-qs accordion-content accordion-content--all " href="/courses/data-science">전체</a>

                  <a class="e-change-qs accordion-content " href="/courses/data-science/data-analysis">데이터 분석</a>
                  <a class="e-change-qs accordion-content " href="/courses/data-science/data-%08engineering">데이터
                    엔지니어링</a>
                  <a class="e-change-qs accordion-content " href="/courses/data-science/certificate-datascience">자격증
                    (데이터 사이언스)</a>
                  <a class="e-change-qs accordion-content " href="/courses/data-science/data-besides">기타 (데이터 사이언스)</a>
                </div>
              </div>
              <div id="accordion_456" class="accordion e-accordion ">
                <div class="accordion-header toggle">
                  <p class="accordion-header-text">
                    <span class="accordion-header-text__icon"><i class="fa-regular fa-brain-circuit"></i></span>
                    <span class="accordion-header-text__title">인공지능</span>
                  </p>
                </div>
                <div class="accordion-body e-accordion-body" hidden="until-found">
                  <a class="e-change-qs accordion-content accordion-content--all "
                    href="/courses/artificial-intelligence">전체</a>

                  <a class="e-change-qs accordion-content " href="/courses/artificial-intelligence/dl-ml">딥러닝 · 머신러닝</a>
                  <a class="e-change-qs accordion-content " href="/courses/artificial-intelligence/computer-vision">컴퓨터
                    비전</a>
                  <a class="e-change-qs accordion-content "
                    href="/courses/artificial-intelligence/natural-language-processing">자연어 처리</a>
                  <a class="e-change-qs accordion-content " href="/courses/artificial-intelligence/generative-ai">AI ·
                    ChatGPT 활용</a>
                </div>
              </div>
              <div id="accordion_492" class="accordion e-accordion ">
                <div class="accordion-header toggle">
                  <p class="accordion-header-text">
                    <span class="accordion-header-text__icon"><i class="fa-regular fa-shield-check"></i></span>
                    <span class="accordion-header-text__title">보안 · 네트워크</span>
                  </p>
                </div>
                <div class="accordion-body e-accordion-body" hidden="until-found">
                  <a class="e-change-qs accordion-content accordion-content--all " href="/courses/it">전체</a>

                  <a class="e-change-qs accordion-content " href="/courses/it/security">보안</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/network">네트워크</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/system">시스템</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/cloud">클라우드</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/blockchain">블록체인</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/certificate-security">자격증 (보안 · 네트워크)</a>
                  <a class="e-change-qs accordion-content " href="/courses/it/it-besides">기타 (보안 · 네트워크)</a>
                </div>
              </div>
              
            </nav>
          </aside>
          <div class="column courses_body">

            <header class="courses_header">
              <h1 class="title is-hidden">전체 강의</h1>

              <nav class="breadcrumb" aria-label="breadcrumbs">
                <ul>
                  <li><a href='courses.html' class="category_link">전체 강의</a></li>
                </ul>
              </nav>
              <form class="search bootstrap-components">

                <div class="col-auto">


                  <input type="search" placeholder="전체 강의 검색" class="form-control form-control-sm " required="">

                </div>


                <button type="button" class="btn btn-outline-secondary btn-sm button e-search-course">

                  검색
                </button>

              </form>
            </header>

            <main class="courses_main">
              <div class="courses__skill-tags are-medium skills e-skill-tags">

                <div class="courses__skill-tag-search-wrapper">
                  <div class="field has-addons courses__skill-tag-search e-skilltag-search-input bootstrap-components">
                    <form class="courses__skill-tag-search-input e-skill-tag-search-form" action=".">
                      <input type="search" placeholder="기술 검색">
                    </form>

                    <button type="button"
                      class="btn btn-outline-secondary btn-icon btn-icon-md courses__skill-tag-search-icon e-search-skilltag-button">

                      <i class="fa-regular fa-magnifying-glass"></i>
                    </button>

                  </div>
                  <button
                    class="courses__skill-tag-search-input-open-button courses__action-icon e-open-search-input-button">
                    <i class="fa-regular fa-magnifying-glass"></i>
                  </button>
                </div>


                <div class="skill_buttons">
                  <button class="courses__skill-tag skill e-skill-tag" name="React"
                    fxd-data='{"type":"skill","slug":"react"}'>React</button><button
                    class="courses__skill-tag skill e-skill-tag" name="Jenkins"
                    fxd-data='{"type":"skill","slug":"jenkins"}'>Jenkins</button><button
                    class="courses__skill-tag skill e-skill-tag" name="TypeScript"
                    fxd-data='{"type":"skill","slug":"typescript"}'>TypeScript</button>
                </div>


                <div class="courses__skill-tag-button-wrapper">
                  <button class="courses__action-icon courses__skill-tag--small e-skill-more">
                    <i class="fa-regular fa-chevron-down"></i>
                  </button>
                </div>

              </div>
              <div class="courses__skill-tag-search-result--empty bootstrap-components">
                <p class="courses__skill-tag-search-result-text">검색 결과가 없어요</p>
              </div>
              <div class="search-option">
                <nav class="course-filter bootstrap-components">


                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="누구나 들을 수 있는"
                    class="e-level-tag-tooltip-level-1 courses__filter-tag-wrapper--level ">

                    <button data-slug="level-1"
                      class="courses__filter-tag--outline courses__filter-tag--level e-level-filter  courses__filter-tag--start">

                      <i class="courses__filter-tag-icon--level">
                        <svg width="16" height="16" viewbox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                          <path
                            d="M4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286Z"
                            fill="black"></path>
                          <path opacity="0.4"
                            d="M8.4285 4.11865C9.13832 4.11865 9.71422 4.74824 9.71422 5.5249V12.2437C9.71422 13.02 9.13832 13.6499 8.4285 13.6499H7.57136C6.86154 13.6499 6.28564 13.02 6.28564 12.2437V5.5249C6.28564 4.74824 6.86154 4.11865 7.57136 4.11865H8.4285ZM10.5714 3.80615C10.5714 3.02979 11.1473 2.3999 11.8571 2.3999H12.7142C13.424 2.3999 13.9999 3.02979 13.9999 3.80615V12.2437C13.9999 13.02 13.424 13.6499 12.7142 13.6499H11.8571C11.1473 13.6499 10.5714 13.02 10.5714 12.2437V3.80615Z"
                            fill="black"></path>
                        </svg>
                      </i>
                      <i class="courses__filter-tag-icon--level-active">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewbox="0 0 16 16" fill="none">
                          <path
                            d="M4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286Z"
                            fill="#00C471"></path>
                          <path opacity="0.4"
                            d="M8.4285 4.11865C9.13832 4.11865 9.71422 4.74824 9.71422 5.5249V12.2437C9.71422 13.02 9.13832 13.6499 8.4285 13.6499H7.57136C6.86154 13.6499 6.28564 13.02 6.28564 12.2437V5.5249C6.28564 4.74824 6.86154 4.11865 7.57136 4.11865H8.4285ZM10.5714 3.80615C10.5714 3.02979 11.1473 2.3999 11.8571 2.3999H12.7142C13.424 2.3999 13.9999 3.02979 13.9999 3.80615V12.2437C13.9999 13.02 13.424 13.6499 12.7142 13.6499H11.8571C11.1473 13.6499 10.5714 13.02 10.5714 12.2437V3.80615Z"
                            fill="#00C471"></path>
                        </svg>
                      </i>

                      입문
                    </button>
                  </div>
                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="선수 지식이 필요한"
                    class="e-level-tag-tooltip-level-2 courses__filter-tag-wrapper--level ">

                    <button data-slug="level-2"
                      class="courses__filter-tag--outline courses__filter-tag--level e-level-filter  ">

                      <i class="courses__filter-tag-icon--level">
                        <svg width="16" height="16" viewbox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                          <path opacity="0.4"
                            d="M10.5713 3.80615C10.5713 3.02979 11.1472 2.3999 11.857 2.3999H12.7141C13.424 2.3999 13.9999 3.02979 13.9999 3.80615V12.2437C13.9999 13.02 13.424 13.6499 12.7141 13.6499H11.857C11.1472 13.6499 10.5713 13.02 10.5713 12.2437V3.80615Z"
                            fill="black"></path>
                          <path
                            d="M8.42857 4.11865C9.13839 4.11865 9.71429 4.74824 9.71429 5.5249V12.2437C9.71429 13.02 9.13839 13.6499 8.42857 13.6499H7.57143C6.86161 13.6499 6.28571 13.02 6.28571 12.2437V5.5249C6.28571 4.74824 6.86161 4.11865 7.57143 4.11865H8.42857ZM4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286Z"
                            fill="black"></path>
                        </svg>
                      </i>
                      <i class="courses__filter-tag-icon--level-active">
                        <svg width="16" height="16" viewbox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                          <path opacity="0.4"
                            d="M10.5713 3.80615C10.5713 3.02979 11.1472 2.3999 11.857 2.3999H12.7141C13.424 2.3999 13.9999 3.02979 13.9999 3.80615V12.2437C13.9999 13.02 13.424 13.6499 12.7141 13.6499H11.857C11.1472 13.6499 10.5713 13.02 10.5713 12.2437V3.80615Z"
                            fill="#00C471"></path>
                          <path
                            d="M8.42857 4.11865C9.13839 4.11865 9.71429 4.74824 9.71429 5.5249V12.2437C9.71429 13.02 9.13839 13.6499 8.42857 13.6499H7.57143C6.86161 13.6499 6.28571 13.02 6.28571 12.2437V5.5249C6.28571 4.74824 6.86161 4.11865 7.57143 4.11865H8.42857ZM4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286Z"
                            fill="#00C471"></path>
                        </svg>
                      </i>

                      초급
                    </button>
                  </div>
                  <div data-bs-toggle="tooltip" data-bs-placement="auto" title="전문성을 높이는"
                    class="e-level-tag-tooltip-level-3 courses__filter-tag-wrapper--level courses__filter-tag-wrapper--last-level">

                    <button data-slug="level-3"
                      class="courses__filter-tag--outline courses__filter-tag--level e-level-filter  ">

                      <i class="courses__filter-tag-icon--level">
                        <svg width="16" height="16" viewbox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                          <path
                            d="M8.42857 4.11865C9.13839 4.11865 9.71429 4.74824 9.71429 5.5249V12.2437C9.71429 13.02 9.13839 13.6499 8.42857 13.6499H7.57143C6.86161 13.6499 6.28571 13.02 6.28571 12.2437V5.5249C6.28571 4.74824 6.86161 4.11865 7.57143 4.11865H8.42857ZM4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286ZM10.5714 3.80615C10.5714 3.02979 11.1473 2.3999 11.8571 2.3999H12.7143C13.4241 2.3999 14 3.02979 14 3.80615V12.2437C14 13.02 13.4241 13.6499 12.7143 13.6499H11.8571C11.1473 13.6499 10.5714 13.02 10.5714 12.2437V3.80615Z"
                            fill="black"></path>
                        </svg>
                      </i>
                      <i class="courses__filter-tag-icon--level-active">
                        <svg width="16" height="16" viewbox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                          <path
                            d="M8.42857 4.11865C9.13839 4.11865 9.71429 4.74824 9.71429 5.5249V12.2437C9.71429 13.02 9.13839 13.6499 8.42857 13.6499H7.57143C6.86161 13.6499 6.28571 13.02 6.28571 12.2437V5.5249C6.28571 4.74824 6.86161 4.11865 7.57143 4.11865H8.42857ZM4.14286 6.1499C4.85268 6.1499 5.42857 6.77979 5.42857 7.55615V12.2437C5.42857 13.02 4.85268 13.6499 4.14286 13.6499H3.28571C2.57562 13.6499 2 13.02 2 12.2437V7.55615C2 6.77979 2.57562 6.1499 3.28571 6.1499H4.14286ZM10.5714 3.80615C10.5714 3.02979 11.1473 2.3999 11.8571 2.3999H12.7143C13.4241 2.3999 14 3.02979 14 3.80615V12.2437C14 13.02 13.4241 13.6499 12.7143 13.6499H11.8571C11.1473 13.6499 10.5714 13.02 10.5714 12.2437V3.80615Z"
                            fill="#00C471"></path>
                        </svg>
                      </i>

                      중급이상
                    </button>
                  </div>


                  <div class="courses__filter-tags-divider"></div>

                  <button
                    class="courses__filter-tags courses__filter-tag--outline courses__filter-tag--charge e-charge-filter "
                    data-slug="free" type="button">
                    <i class="fa-solid fa-check"></i>무료
                  </button>
                  <button
                    class="courses__filter-tags courses__filter-tag--outline courses__filter-tag--charge e-charge-filter "
                    data-slug="paid" type="button">
                    <i class="fa-solid fa-check"></i>유료
                  </button>

                  <div class="courses__filter-tags-divider"></div>

                  <button class="courses__filter-tag--outline courses__filter-tag--discount e-discount-filter"
                    is-active="">
                    <i class="fa-solid fa-badge-percent"></i>
                    할인중
                  </button>

                  <div class="courses__filter-tags-divider"></div>

                  <button class="courses__filter-tag--outline e-new-filter courses__filter-tag--new" is-active="">
                    <i class="fa-solid fa-sparkles"></i>
                    New
                  </button>

                  <div class="courses__filter-tags-divider"></div>

                  <button class="courses__filter-tags courses__filter-tag--outline e-online-filter  " type="button">
                    <i class="fa-solid fa-check courses__check-icon" aria-hidden="true"></i>
                    <span>온라인</span>
                  </button>


                  <button
                    class="courses__filter-tags courses__filter-tag--outline e-offline-filter  courses__filter-tag--end"
                    type="button">
                    <i class="fa-solid fa-check courses__check-icon" aria-hidden="true"></i>
                    <span>모임/부트캠프</span>
                  </button>


                  <div class="courses__filter-reset-button-wrapper">
                    <button class="courses__filter-reset-button e-skilltag-filter-reset ">
                      <i class="fa-regular fa-arrows-rotate"></i>
                    </button>
                  </div>

                </nav>
                <div class="courses_order_select bootstrap-components">
                  <label for="courses_order_selector" class="visually_hidden">정렬 순서 선택:</label>


                  <select id="courses_order_selector" name="order_select" class="form-select form-select-sm "
                    aria-label="정렬 순서 선택">
                    <option selected="" value="seq">추천순</option>
                    <option value="popular">인기순</option>
                    <option value="recent">최신순</option>
                    <option value="rating">평점순</option>
                    <option value="famous">좋아요순</option>
                  </select>


                </div>
              </div>
              <div class="courses_container">
                <div class="columns is-multiline is-mobile courses_card_list_body">
                  <div class="column is-3-fullhd is-3-widescreen is-3-desktop is-4-tablet is-6-mobile ">
                    <div class="card course course_card_item" data-productid="324145"
                      fxd-data='{"courseId":324145,"regPrice":33000,"isInCart":false}'>

                      <a class="course_card_front e_course_click"
                        href="/course/프로그래밍-파이썬-입문-인프런-오리지널?attributionToken=ChM0MTE1OTQ0NDE2OTQzODk0NjE4EA0aI3JlY29tbWVuZGVfcmVjb21tZW5kZV8xNzAyNTI2NDM0MDY2IhdyZWNvbW1lbmRlZC1mb3IteW91LWN2cigA">
                        <div class="card-image">
                          <figure class="image is_thumbnail">

                            <img loading="lazy"
                              src="public/courses/324145/cover/184a19f3-c99f-4eea-a764-dc8e71d4c37a/324145.png"
                              data-src="https://cdn.inflearn.com/public/courses/324145/cover/184a19f3-c99f-4eea-a764-dc8e71d4c37a/324145.png"
                              class="swiper-lazy" alt="324145.png">
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
                          <div class="course_title">프로그래밍 시작하기 : 파이썬 입문 (Inflearn Original)</div>
                          <div class="instructor">인프런</div>

                          <div class="rating">
                            <div class='rating_star'>
                              <div class='star_solid' style="width: 94%"><svg aria-hidden="true" data-prefix="fas"
                                  data-icon="star" class="svg-inline--fa fa-star fa-w-18" role="img"
                                  xmlns="http://www.w3.org/2000/svg" viewbox="0 0 576 512" width="16" height="16"
                                  data-value="1">
                                  <path fill="currentColor"
                                    d="M259.3 17.8L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0z">
                                  </path>
                                </svg><svg aria-hidden="true" data-prefix="fas" data-icon="star"
                                  class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                  viewbox="0 0 576 512" width="16" height="16" data-value="2">
                                  <path fill="currentColor"
                                    d="M259.3 17.8L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0z">
                                  </path>
                                </svg><svg aria-hidden="true" data-prefix="fas" data-icon="star"
                                  class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                  viewbox="0 0 576 512" width="16" height="16" data-value="3">
                                  <path fill="currentColor"
                                    d="M259.3 17.8L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0z">
                                  </path>
                                </svg><svg aria-hidden="true" data-prefix="fas" data-icon="star"
                                  class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                  viewbox="0 0 576 512" width="16" height="16" data-value="4">
                                  <path fill="currentColor"
                                    d="M259.3 17.8L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0z">
                                  </path>
                                </svg><svg aria-hidden="true" data-prefix="fas" data-icon="star"
                                  class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                  viewbox="0 0 576 512" width="16" height="16" data-value="5">
                                  <path fill="currentColor"
                                    d="M259.3 17.8L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0z">
                                  </path>
                                </svg></div><svg aria-hidden="true" data-prefix="fal" data-icon="star"
                                class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                viewbox="0 0 576 512" width="16" height="16" data-value="5">
                                <path fill="currentColor"
                                  d="M528.1 171.5L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6zM405.8 317.9l27.8 162L288 403.5 142.5 480l27.8-162L52.5 203.1l162.7-23.6L288 32l72.8 147.5 162.7 23.6-117.7 114.8z">
                                </path>
                              </svg><svg aria-hidden="true" data-prefix="fal" data-icon="star"
                                class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                viewbox="0 0 576 512" width="16" height="16" data-value="4">
                                <path fill="currentColor"
                                  d="M528.1 171.5L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6zM405.8 317.9l27.8 162L288 403.5 142.5 480l27.8-162L52.5 203.1l162.7-23.6L288 32l72.8 147.5 162.7 23.6-117.7 114.8z">
                                </path>
                              </svg><svg aria-hidden="true" data-prefix="fal" data-icon="star"
                                class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                viewbox="0 0 576 512" width="16" height="16" data-value="3">
                                <path fill="currentColor"
                                  d="M528.1 171.5L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6zM405.8 317.9l27.8 162L288 403.5 142.5 480l27.8-162L52.5 203.1l162.7-23.6L288 32l72.8 147.5 162.7 23.6-117.7 114.8z">
                                </path>
                              </svg><svg aria-hidden="true" data-prefix="fal" data-icon="star"
                                class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                viewbox="0 0 576 512" width="16" height="16" data-value="2">
                                <path fill="currentColor"
                                  d="M528.1 171.5L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6zM405.8 317.9l27.8 162L288 403.5 142.5 480l27.8-162L52.5 203.1l162.7-23.6L288 32l72.8 147.5 162.7 23.6-117.7 114.8z">
                                </path>
                              </svg><svg aria-hidden="true" data-prefix="fal" data-icon="star"
                                class="svg-inline--fa fa-star fa-w-18" role="img" xmlns="http://www.w3.org/2000/svg"
                                viewbox="0 0 576 512" width="16" height="16" data-value="1">
                                <path fill="currentColor"
                                  d="M528.1 171.5L382 150.2 316.7 17.8c-11.7-23.6-45.6-23.9-57.4 0L194 150.2 47.9 171.5c-26.2 3.8-36.7 36.1-17.7 54.6l105.7 103-25 145.5c-4.5 26.3 23.2 46 46.4 33.7L288 439.6l130.7 68.7c23.2 12.2 50.9-7.4 46.4-33.7l-25-145.5 105.7-103c19-18.5 8.5-50.8-17.7-54.6zM405.8 317.9l27.8 162L288 403.5 142.5 480l27.8-162L52.5 203.1l162.7-23.6L288 32l72.8 147.5 162.7 23.6-117.7 114.8z">
                                </path>
                              </svg>
                            </div><span class="review_cnt">(834)</span>
                          </div>

                          <div class="price"><del>₩33,000</del><br><span class="pay_price">₩0</span></div>

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
                          href="/course/프로그래밍-파이썬-입문-인프런-오리지널?attributionToken=ChM0MTE1OTQ0NDE2OTQzODk0NjE4EA0aI3JlY29tbWVuZGVfcmVjb21tZW5kZV8xNzAyNTI2NDM0MDY2IhdyZWNvbW1lbmRlZC1mb3IteW91LWN2cigA">
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
                                  class="svg-inline--fa fa-cubes fa-w-16" role="img" xmlns="http://www.w3.org/2000/svg"
                                  viewbox="0 0 512 512">
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

                          <div
                            class="tooltip is-tooltip-warning is-tooltip-left course-card__button-cart add_cart e_cart_action"
                            fxd-data='{"type":"cart"}' data-tooltip="수강바구니에 추가">
                            <i class="far fa-cart-plus fa-lg"></i>
                          </div>


                          <div
                            class="tooltip is-tooltip-warning is-tooltip-left course-card__button-like add_cart e-like"
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
                  
                </div>
              </div>
            </main>



            <footer class="courses_footer">
              <nav class="pagination is-centered is-small" role="navigation" aria-label="pagination">

                <div class="pagination_container">


                  <a class="pagination-link pagination-next" fxd-data='{"type":"page","slug":2}'>다음 페이지</a>
                  <ul class="pagination-list">
                    <li><a class="pagination-link is-current" fxd-data='{"type":"page","slug":1}'
                        aria-label="1 페이지로 이동">1</a></li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":2}' aria-label="2 페이지로 이동">2</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":3}' aria-label="3 페이지로 이동">3</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":4}' aria-label="4 페이지로 이동">4</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":5}' aria-label="5 페이지로 이동">5</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":6}' aria-label="6 페이지로 이동">6</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":7}' aria-label="7 페이지로 이동">7</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":8}' aria-label="8 페이지로 이동">8</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":9}' aria-label="9 페이지로 이동">9</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":10}' aria-label="10 페이지로 이동">10</a>
                    </li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":11}'
                        aria-label="11 페이지로 이동">&hellip;</a></li>
                    <li><a class="pagination-link " fxd-data='{"type":"page","slug":133}'
                        aria-label="133 페이지로 이동">133</a></li>
                  </ul>
                </div>
              </nav>
            </footer>
          </div>
        </div>
      </div>
    </section>
  </main>
</template>

<script>
import MobileAsideComponent from '@/components/MobileAsideComponent.vue'


export default {
  name: 'MainPage',
  components: {
    MobileAsideComponent
    }
}
</script>

<style scoped></style>
