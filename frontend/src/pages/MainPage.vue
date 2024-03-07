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

                  <CourseCardComponent v-for="course in courseStore.courseList" :key="course.idx" :course="course"/>

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
import CourseCardComponent from '@/components/course/CourseCardComponent.vue'
import { mapStores } from 'pinia'
import { useCourseStore } from '@/stores/useCourseStore';

export default {
  name: 'MainPage',
  components: {
    MobileAsideComponent,
    CourseCardComponent
  },
  computed: {
    ...mapStores(useCourseStore)
  },
  mounted() {
    this.courseStore.getCourseList()
  }
}
</script>

<style scoped></style>
