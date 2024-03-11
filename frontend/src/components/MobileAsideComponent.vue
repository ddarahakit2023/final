<template>
    <div @click="mobileAsideActiveStore.toggleAside" :class="['sidebar_dimmed', 'e-sidebar-dimmed', { 'is-active': mobileAsideActiveStore.isActive }]"
        data-type="close"></div>
    <aside :class="['mobile_left_aside', { 'is-active': mobileAsideActiveStore.isActive }]">

        <div class="search search_bar header_search header_search--lnb e_header_search">
            <label class="visually-hidden" for="mobile-aside-input">통합 검색</label>
            <input type="text" id="mobile-aside-input" enterkeyhint="go" class="input" placeholder="강의/강사명을 입력해주세요"
                data-kv="headerSearchWord">
            <span class="search__icon e-header-search"><i class="far fa-search"></i></span>
        </div>
        <div class="category-content">
            <div class="menu_list">

                <div class="p-menu"><a class="title" href="/courses">전체 강의</a></div>

                <div class="p-menu active" data-id="5">
                    <div class="title">개발 · 프로그래밍</div>
                </div>
                <div class="p-menu " data-id="39306">
                    <div class="title">게임 개발</div>
                </div>
                <div class="p-menu " data-id="9">
                    <div class="title">데이터 사이언스</div>
                </div>
                <div class="p-menu " data-id="456">
                    <div class="title">인공지능</div>
                </div>
                <div class="p-menu active" data-id="492">
                    <div class="title">보안 · 네트워크</div>
                </div>
            </div>
            <div class="submenu-content">
                <!-- 마이 카테고리 영역 시작 -->
                <div class="p-submenu " data-id="my-category">
                    <a class="c-menu" href="/courses/my-category">
                        <p class="title">전체</p>
                    </a>

                    <div class="my-category-setting">
                        <button type="button" class="my-category-setting__btn e-my-category-setting__btn">카테고리 설정 <i
                                class="fa-regular fa-sliders"></i></button>
                    </div>
                </div>
                <!-- 마이 카테고리 영역 끝 -->

                <div class="p-submenu active" data-id="5">
                    <a class="c-menu" href="/courses/it-programming">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            웹 개발 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/web-dev" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=spring" class="s_menu_el">
                            <div class="title">Spring</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=nodejs" class="s_menu_el">
                            <div class="title">Node.js</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=spring-boot" class="s_menu_el">
                            <div class="title">Spring Boot</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=typescript" class="s_menu_el">
                            <div class="title">TypeScript</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=vuejs" class="s_menu_el">
                            <div class="title">Vue.js</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=jquery" class="s_menu_el">
                            <div class="title">jQuery</div>
                        </a>
                        <a href="/courses/it-programming/web-dev?skill=django" class="s_menu_el">
                            <div class="title">Django</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            프론트엔드 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/front-end" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=vuejs" class="s_menu_el">
                            <div class="title">Vue.js</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=typescript" class="s_menu_el">
                            <div class="title">TypeScript</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=next-js" class="s_menu_el">
                            <div class="title">Next.js</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=jquery" class="s_menu_el">
                            <div class="title">jQuery</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=nodejs" class="s_menu_el">
                            <div class="title">Node.js</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=interactive-web" class="s_menu_el">
                            <div class="title">인터랙티브 웹</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=es6" class="s_menu_el">
                            <div class="title">ES6</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/front-end?skill=responsive-web" class="s_menu_el">
                            <div class="title">반응형 웹</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            백엔드 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/back-end" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=spring" class="s_menu_el">
                            <div class="title">Spring</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=spring-boot" class="s_menu_el">
                            <div class="title">Spring Boot</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=nodejs" class="s_menu_el">
                            <div class="title">Node.js</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=java-persistence-api" class="s_menu_el">
                            <div class="title">JPA</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=docker" class="s_menu_el">
                            <div class="title">Docker</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=mongodb" class="s_menu_el">
                            <div class="title">MongoDB</div>
                        </a>
                        <a href="/courses/it-programming/back-end?skill=express" class="s_menu_el">
                            <div class="title">Express</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            풀스택 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/full-stack" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=nodejs" class="s_menu_el">
                            <div class="title">Node.js</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=django" class="s_menu_el">
                            <div class="title">Django</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=mongodb" class="s_menu_el">
                            <div class="title">MongoDB</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=spring-boot" class="s_menu_el">
                            <div class="title">Spring Boot</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=spring" class="s_menu_el">
                            <div class="title">Spring</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=firebase" class="s_menu_el">
                            <div class="title">Firebase</div>
                        </a>
                        <a href="/courses/it-programming/full-stack?skill=typescript" class="s_menu_el">
                            <div class="title">TypeScript</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            모바일 앱 개발 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/mobile-app" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=ios" class="s_menu_el">
                            <div class="title">iOS</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=android" class="s_menu_el">
                            <div class="title">Android</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=swift" class="s_menu_el">
                            <div class="title">Swift</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=google-flutter" class="s_menu_el">
                            <div class="title">Flutter</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=kotlin" class="s_menu_el">
                            <div class="title">Kotlin</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=swift-ui" class="s_menu_el">
                            <div class="title">SwiftUI</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=react-native" class="s_menu_el">
                            <div class="title">React Native</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=firebase" class="s_menu_el">
                            <div class="title">Firebase</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=jetpack" class="s_menu_el">
                            <div class="title">Jetpack</div>
                        </a>
                        <a href="/courses/it-programming/mobile-app?skill=typescript" class="s_menu_el">
                            <div class="title">TypeScript</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            프로그래밍 언어 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/programming-lang" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=c" class="s_menu_el">
                            <div class="title">C</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=c-plus" class="s_menu_el">
                            <div class="title">C++</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=coding-test" class="s_menu_el">
                            <div class="title">코딩 테스트</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=oop" class="s_menu_el">
                            <div class="title">객체지향</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=c-sharp" class="s_menu_el">
                            <div class="title">C#</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=swift" class="s_menu_el">
                            <div class="title">Swift</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=typescript" class="s_menu_el">
                            <div class="title">TypeScript</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=algorithm" class="s_menu_el">
                            <div class="title">알고리즘</div>
                        </a>
                        <a href="/courses/it-programming/programming-lang?skill=kotlin" class="s_menu_el">
                            <div class="title">Kotlin</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            알고리즘 · 자료구조 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/algorithm" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=coding-test" class="s_menu_el">
                            <div class="title">코딩 테스트</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=algorithm" class="s_menu_el">
                            <div class="title">알고리즘</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=c-plus" class="s_menu_el">
                            <div class="title">C++</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=c" class="s_menu_el">
                            <div class="title">C</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=operating-system" class="s_menu_el">
                            <div class="title">운영체제</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=tech-interview" class="s_menu_el">
                            <div class="title">기술면접</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=oop" class="s_menu_el">
                            <div class="title">객체지향</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=ios" class="s_menu_el">
                            <div class="title">iOS</div>
                        </a>
                        <a href="/courses/it-programming/algorithm?skill=swift-ui" class="s_menu_el">
                            <div class="title">SwiftUI</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            데이터베이스 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/database-dev" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=sql" class="s_menu_el">
                            <div class="title">SQL</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=rdbms" class="s_menu_el">
                            <div class="title">DBMS/RDBMS</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=mysql" class="s_menu_el">
                            <div class="title">MySQL</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=data-engineering" class="s_menu_el">
                            <div class="title">데이터 엔지니어링</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=oracle" class="s_menu_el">
                            <div class="title">Oracle</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=ms-sql" class="s_menu_el">
                            <div class="title">MSSQL</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=mongodb" class="s_menu_el">
                            <div class="title">MongoDB</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=postgresql" class="s_menu_el">
                            <div class="title">PostgreSQL</div>
                        </a>
                        <a href="/courses/it-programming/database-dev?skill=backend" class="s_menu_el">
                            <div class="title">backend</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            데브옵스 · 인프라 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/devops-infra" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=docker" class="s_menu_el">
                            <div class="title">Docker</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=kubernetes" class="s_menu_el">
                            <div class="title">Kubernetes</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=terraform" class="s_menu_el">
                            <div class="title">Terraform</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=cicd" class="s_menu_el">
                            <div class="title">CI/CD</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=msa" class="s_menu_el">
                            <div class="title">MSA</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=devops" class="s_menu_el">
                            <div class="title">devops</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=azure" class="s_menu_el">
                            <div class="title">Azure</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=data-engineering" class="s_menu_el">
                            <div class="title">데이터 엔지니어링</div>
                        </a>
                        <a href="/courses/it-programming/devops-infra?skill=virtualization" class="s_menu_el">
                            <div class="title">가상화</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            소프트웨어 테스트 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/sw-test" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=software-test" class="s_menu_el">
                            <div class="title">소프트웨어 테스트</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=tdd" class="s_menu_el">
                            <div class="title">TDD</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=jest" class="s_menu_el">
                            <div class="title">Jest</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=spring" class="s_menu_el">
                            <div class="title">Spring</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=mockito" class="s_menu_el">
                            <div class="title">Mockito</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=cypress" class="s_menu_el">
                            <div class="title">Cypress</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=j-unit" class="s_menu_el">
                            <div class="title">JUnit</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=java-persistence-api" class="s_menu_el">
                            <div class="title">JPA</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=react-context" class="s_menu_el">
                            <div class="title">React Context</div>
                        </a>
                        <a href="/courses/it-programming/sw-test?skill=coding-test" class="s_menu_el">
                            <div class="title">코딩 테스트</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            개발 도구 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/programming-tool" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=git" class="s_menu_el">
                            <div class="title">Git</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=github" class="s_menu_el">
                            <div class="title">GitHub</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=version-control-system"
                            class="s_menu_el">
                            <div class="title">버전관리시스템</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=business-productivity"
                            class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=jira" class="s_menu_el">
                            <div class="title">JIRA</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=project-management" class="s_menu_el">
                            <div class="title">프로젝트 관리</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=intellij" class="s_menu_el">
                            <div class="title">IntelliJ IDEA</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=collaboration-tool" class="s_menu_el">
                            <div class="title">협업 툴</div>
                        </a>
                        <a href="/courses/it-programming/programming-tool?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            웹 퍼블리싱 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it-programming/web-publishing" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=jquery" class="s_menu_el">
                            <div class="title">jQuery</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=javascript" class="s_menu_el">
                            <div class="title">JavaScript</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=interactive-web" class="s_menu_el">
                            <div class="title">인터랙티브 웹</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=responsive-web" class="s_menu_el">
                            <div class="title">반응형 웹</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=web-design" class="s_menu_el">
                            <div class="title">웹 디자인</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=clone-coding" class="s_menu_el">
                            <div class="title">클론코딩</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=flex" class="s_menu_el">
                            <div class="title">Flex</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=portfolio" class="s_menu_el">
                            <div class="title">포트폴리오</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=sass" class="s_menu_el">
                            <div class="title">Sass</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=gsap" class="s_menu_el">
                            <div class="title">gsap</div>
                        </a>
                        <a href="/courses/it-programming/web-publishing?skill=three-js" class="s_menu_el">
                            <div class="title">Three.js</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="39306">
                    <a class="c-menu" href="/courses/game-dev-all">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            게임 프로그래밍 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/game-dev-all/game-programming" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=unity" class="s_menu_el">
                            <div class="title">Unity</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=c-sharp" class="s_menu_el">
                            <div class="title">C#</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=unreal" class="s_menu_el">
                            <div class="title">Unreal Engine</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=c-plus" class="s_menu_el">
                            <div class="title">C++</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=blueprint" class="s_menu_el">
                            <div class="title">UE Blueprint</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=%EC%96%B8%EB%A6%AC%EC%96%BC-c-plus-plus"
                            class="s_menu_el">
                            <div class="title">언리얼 C++</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=ios" class="s_menu_el">
                            <div class="title">iOS</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=opengl" class="s_menu_el">
                            <div class="title">OpenGL</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=lua" class="s_menu_el">
                            <div class="title">Lua</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=swift" class="s_menu_el">
                            <div class="title">Swift</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=ucc" class="s_menu_el">
                            <div class="title">UCC</div>
                        </a>
                        <a href="/courses/game-dev-all/game-programming?skill=c" class="s_menu_el">
                            <div class="title">C</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            게임 기획 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/game-dev-all/game-manage" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=game-planning" class="s_menu_el">
                            <div class="title">게임기획</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=unity" class="s_menu_el">
                            <div class="title">Unity</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=c-sharp" class="s_menu_el">
                            <div class="title">C#</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=chatgpt" class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=unreal" class="s_menu_el">
                            <div class="title">Unreal Engine</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=game-business-pm" class="s_menu_el">
                            <div class="title">게임사업PM</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=ui" class="s_menu_el">
                            <div class="title">ui</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=ux" class="s_menu_el">
                            <div class="title">ux</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=roblox" class="s_menu_el">
                            <div class="title">Roblox</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=lua" class="s_menu_el">
                            <div class="title">Lua</div>
                        </a>
                        <a href="/courses/game-dev-all/game-manage?skill=google-tag-manager" class="s_menu_el">
                            <div class="title">Google Tag Manager</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            게임 아트 · 그래픽 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/game-dev-all/game-art" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=unreal" class="s_menu_el">
                            <div class="title">Unreal Engine</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=blender" class="s_menu_el">
                            <div class="title">Blender</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=3ds-max" class="s_menu_el">
                            <div class="title">3ds MAX</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=character-design" class="s_menu_el">
                            <div class="title">캐릭터 디자인</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=vfx" class="s_menu_el">
                            <div class="title">VFX</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=zbrush" class="s_menu_el">
                            <div class="title">ZBrush</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=substance-painter" class="s_menu_el">
                            <div class="title">Substance Painter</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=niagara" class="s_menu_el">
                            <div class="title">Niagara</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=blueprint" class="s_menu_el">
                            <div class="title">UE Blueprint</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=3d-rendering" class="s_menu_el">
                            <div class="title">3d-rendering</div>
                        </a>
                        <a href="/courses/game-dev-all/game-art?skill=substance" class="s_menu_el">
                            <div class="title">substance</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (게임 개발) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/game-dev-all/game-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=unreal" class="s_menu_el">
                            <div class="title">Unreal Engine</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=sound-system" class="s_menu_el">
                            <div class="title">음향 시스템</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=c-sharp" class="s_menu_el">
                            <div class="title">C#</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=meta-sound" class="s_menu_el">
                            <div class="title">meta sound</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=unity" class="s_menu_el">
                            <div class="title">Unity</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=game-introduction" class="s_menu_el">
                            <div class="title">게임개론</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=music-compose" class="s_menu_el">
                            <div class="title">작곡</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=sound" class="s_menu_el">
                            <div class="title">sound</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=game-planning" class="s_menu_el">
                            <div class="title">게임기획</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=game-engine" class="s_menu_el">
                            <div class="title">game-engine</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=godot" class="s_menu_el">
                            <div class="title">godot</div>
                        </a>
                        <a href="/courses/game-dev-all/game-besides?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="9">
                    <a class="c-menu" href="/courses/data-science">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            데이터 분석 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/data-science/data-analysis" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=sql" class="s_menu_el">
                            <div class="title">SQL</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=pandas" class="s_menu_el">
                            <div class="title">Pandas</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=excel" class="s_menu_el">
                            <div class="title">Excel</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=r-programming" class="s_menu_el">
                            <div class="title">R</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=web-crawling" class="s_menu_el">
                            <div class="title">웹 크롤링</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=data-literacy" class="s_menu_el">
                            <div class="title">데이터 리터러시</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=rdbms" class="s_menu_el">
                            <div class="title">DBMS/RDBMS</div>
                        </a>
                        <a href="/courses/data-science/data-analysis?skill=mysql" class="s_menu_el">
                            <div class="title">MySQL</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            데이터 엔지니어링 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/data-science/data-%08engineering" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=data-engineering" class="s_menu_el">
                            <div class="title">데이터 엔지니어링</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=sql" class="s_menu_el">
                            <div class="title">SQL</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=apache-kafka" class="s_menu_el">
                            <div class="title">Kafka</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=mongodb" class="s_menu_el">
                            <div class="title">MongoDB</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=rdbms" class="s_menu_el">
                            <div class="title">DBMS/RDBMS</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=web-crawling" class="s_menu_el">
                            <div class="title">웹 크롤링</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=apache-hadoop" class="s_menu_el">
                            <div class="title">Hadoop</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=apache-spark" class="s_menu_el">
                            <div class="title">Apache Spark</div>
                        </a>
                        <a href="/courses/data-science/data-%08engineering?skill=java" class="s_menu_el">
                            <div class="title">Java</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자격증 (데이터 사이언스) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/data-science/certificate-datascience" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=engineer-big-data-analysis"
                            class="s_menu_el">
                            <div class="title">빅데이터분석기사</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=adsp" class="s_menu_el">
                            <div class="title">ADsP</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=sql" class="s_menu_el">
                            <div class="title">SQL</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=machine-learning"
                            class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=pandas" class="s_menu_el">
                            <div class="title">Pandas</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=sqld" class="s_menu_el">
                            <div class="title">SQLD</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=r-programming" class="s_menu_el">
                            <div class="title">R</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=access-data-projects"
                            class="s_menu_el">
                            <div class="title">ADP</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=deep-learning" class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/data-science/certificate-datascience?skill=keras" class="s_menu_el">
                            <div class="title">Keras</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (데이터 사이언스) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/data-science/data-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=digital-literacy" class="s_menu_el">
                            <div class="title">디지털 리터러시</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=resume" class="s_menu_el">
                            <div class="title">이력서</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=data-literacy" class="s_menu_el">
                            <div class="title">데이터 리터러시</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=career-advice" class="s_menu_el">
                            <div class="title">career-advice</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=deep-learning" class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=interview" class="s_menu_el">
                            <div class="title">면접</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=job-analysis" class="s_menu_el">
                            <div class="title">직무분석</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/data-science/data-besides?skill=opencv" class="s_menu_el">
                            <div class="title">OpenCV</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="456">
                    <a class="c-menu" href="/courses/artificial-intelligence">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            딥러닝 · 머신러닝 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/artificial-intelligence/dl-ml" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=deep-learning" class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=tensorflow" class="s_menu_el">
                            <div class="title">Tensorflow</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=keras" class="s_menu_el">
                            <div class="title">Keras</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=reinforcement-learning" class="s_menu_el">
                            <div class="title">강화학습</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=neural-network" class="s_menu_el">
                            <div class="title">인공신경망</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=ai" class="s_menu_el">
                            <div class="title">인공지능(AI)</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=cuda" class="s_menu_el">
                            <div class="title">CUDA</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=cnn" class="s_menu_el">
                            <div class="title">CNN</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=pytorch" class="s_menu_el">
                            <div class="title">PyTorch</div>
                        </a>
                        <a href="/courses/artificial-intelligence/dl-ml?skill=pandas" class="s_menu_el">
                            <div class="title">Pandas</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            컴퓨터 비전 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/artificial-intelligence/computer-vision" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=computer-vision"
                            class="s_menu_el">
                            <div class="title">컴퓨터 비전</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=deep-learning"
                            class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=tensorflow" class="s_menu_el">
                            <div class="title">Tensorflow</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=machine-learning"
                            class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=opencv" class="s_menu_el">
                            <div class="title">OpenCV</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=keras" class="s_menu_el">
                            <div class="title">Keras</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=cnn" class="s_menu_el">
                            <div class="title">CNN</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=pose-estimation"
                            class="s_menu_el">
                            <div class="title">pose-estimation</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=vision-transformer"
                            class="s_menu_el">
                            <div class="title">Vision Transformer</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=object-detection"
                            class="s_menu_el">
                            <div class="title">object-detection</div>
                        </a>
                        <a href="/courses/artificial-intelligence/computer-vision?skill=gan" class="s_menu_el">
                            <div class="title">gan</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자연어 처리 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/artificial-intelligence/natural-language-processing" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=chatgpt"
                            class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=nlp"
                            class="s_menu_el">
                            <div class="title">NLP</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=deep-learning"
                            class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=llm"
                            class="s_menu_el">
                            <div class="title">LLM</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=python"
                            class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=openai"
                            class="s_menu_el">
                            <div class="title">openai</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=prompt-engineering"
                            class="s_menu_el">
                            <div class="title">프롬프트엔지니어링</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=langchain"
                            class="s_menu_el">
                            <div class="title">LangChain</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=pytorch"
                            class="s_menu_el">
                            <div class="title">PyTorch</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=tensorflow"
                            class="s_menu_el">
                            <div class="title">Tensorflow</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=streamlit"
                            class="s_menu_el">
                            <div class="title">streamlit</div>
                        </a>
                        <a href="/courses/artificial-intelligence/natural-language-processing?skill=fine-tuning"
                            class="s_menu_el">
                            <div class="title">Fine-Tuning</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            AI · ChatGPT 활용 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/artificial-intelligence/generative-ai" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=chatgpt" class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=ai" class="s_menu_el">
                            <div class="title">인공지능(AI)</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=prompt-engineering"
                            class="s_menu_el">
                            <div class="title">프롬프트엔지니어링</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=deep-learning" class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=openai" class="s_menu_el">
                            <div class="title">openai</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=machine-learning"
                            class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=gpt" class="s_menu_el">
                            <div class="title">gpt</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=llm" class="s_menu_el">
                            <div class="title">LLM</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=react" class="s_menu_el">
                            <div class="title">React</div>
                        </a>
                        <a href="/courses/artificial-intelligence/generative-ai?skill=data-literacy" class="s_menu_el">
                            <div class="title">데이터 리터러시</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu active" data-id="492">
                    <a class="c-menu" href="/courses/it">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            보안 <span class="caret_el"><span class="icon"><i class="fas fa-chevron-down"></i></span><span
                                    class="icon"><i class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/security" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/security?skill=penetration-testing" class="s_menu_el">
                            <div class="title">모의해킹</div>
                        </a>
                        <a href="/courses/it/security?skill=isms-p" class="s_menu_el">
                            <div class="title">ISMS-P</div>
                        </a>
                        <a href="/courses/it/security?skill=system-hacking" class="s_menu_el">
                            <div class="title">시스템 해킹</div>
                        </a>
                        <a href="/courses/it/security?skill=forensic" class="s_menu_el">
                            <div class="title">Forensic</div>
                        </a>
                        <a href="/courses/it/security?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/security?skill=security" class="s_menu_el">
                            <div class="title">security</div>
                        </a>
                        <a href="/courses/it/security?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it/security?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/it/security?skill=malware" class="s_menu_el">
                            <div class="title">악성코드</div>
                        </a>
                        <a href="/courses/it/security?skill=reversing" class="s_menu_el">
                            <div class="title">리버싱</div>
                        </a>
                        <a href="/courses/it/security?skill=android" class="s_menu_el">
                            <div class="title">Android</div>
                        </a>
                        <a href="/courses/it/security?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            네트워크 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/network" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/network?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/network?skill=security" class="s_menu_el">
                            <div class="title">security</div>
                        </a>
                        <a href="/courses/it/network?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                        <a href="/courses/it/network?skill=penetration-testing" class="s_menu_el">
                            <div class="title">모의해킹</div>
                        </a>
                        <a href="/courses/it/network?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/it/network?skill=protocol" class="s_menu_el">
                            <div class="title">프로토콜</div>
                        </a>
                        <a href="/courses/it/network?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it/network?skill=spring" class="s_menu_el">
                            <div class="title">Spring</div>
                        </a>
                        <a href="/courses/it/network?skill=can" class="s_menu_el">
                            <div class="title">CAN</div>
                        </a>
                        <a href="/courses/it/network?skill=iot" class="s_menu_el">
                            <div class="title">IoT</div>
                        </a>
                        <a href="/courses/it/network?skill=cisco" class="s_menu_el">
                            <div class="title">cisco</div>
                        </a>
                        <a href="/courses/it/network?skill=isms-p" class="s_menu_el">
                            <div class="title">ISMS-P</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            시스템 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/system" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/system?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/it/system?skill=operating-system" class="s_menu_el">
                            <div class="title">운영체제</div>
                        </a>
                        <a href="/courses/it/system?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/system?skill=shell-script" class="s_menu_el">
                            <div class="title">Shell Script</div>
                        </a>
                        <a href="/courses/it/system?skill=c" class="s_menu_el">
                            <div class="title">C</div>
                        </a>
                        <a href="/courses/it/system?skill=security" class="s_menu_el">
                            <div class="title">security</div>
                        </a>
                        <a href="/courses/it/system?skill=penetration-testing" class="s_menu_el">
                            <div class="title">모의해킹</div>
                        </a>
                        <a href="/courses/it/system?skill=com-archi" class="s_menu_el">
                            <div class="title">컴퓨터 구조</div>
                        </a>
                        <a href="/courses/it/system?skill=assembly-language" class="s_menu_el">
                            <div class="title">assembly-language</div>
                        </a>
                        <a href="/courses/it/system?skill=powershell" class="s_menu_el">
                            <div class="title">Powershell</div>
                        </a>
                        <a href="/courses/it/system?skill=virtualization" class="s_menu_el">
                            <div class="title">가상화</div>
                        </a>
                        <a href="/courses/it/system?skill=system-hacking" class="s_menu_el">
                            <div class="title">시스템 해킹</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            클라우드 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/cloud" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/cloud?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                        <a href="/courses/it/cloud?skill=kubernetes" class="s_menu_el">
                            <div class="title">Kubernetes</div>
                        </a>
                        <a href="/courses/it/cloud?skill=docker" class="s_menu_el">
                            <div class="title">Docker</div>
                        </a>
                        <a href="/courses/it/cloud?skill=azure" class="s_menu_el">
                            <div class="title">Azure</div>
                        </a>
                        <a href="/courses/it/cloud?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/cloud?skill=gcp" class="s_menu_el">
                            <div class="title">Google Cloud Platform</div>
                        </a>
                        <a href="/courses/it/cloud?skill=cloud-computing" class="s_menu_el">
                            <div class="title">cloud-computing</div>
                        </a>
                        <a href="/courses/it/cloud?skill=terraform" class="s_menu_el">
                            <div class="title">Terraform</div>
                        </a>
                        <a href="/courses/it/cloud?skill=serverless" class="s_menu_el">
                            <div class="title">서버리스</div>
                        </a>
                        <a href="/courses/it/cloud?skill=cicd" class="s_menu_el">
                            <div class="title">CI/CD</div>
                        </a>
                        <a href="/courses/it/cloud?skill=msa" class="s_menu_el">
                            <div class="title">MSA</div>
                        </a>
                        <a href="/courses/it/cloud?skill=devops" class="s_menu_el">
                            <div class="title">devops</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            블록체인 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/blockchain" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=blockchain" class="s_menu_el">
                            <div class="title">블록체인</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=dapp" class="s_menu_el">
                            <div class="title">DApp</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=etherium" class="s_menu_el">
                            <div class="title">Ethereum</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=nft" class="s_menu_el">
                            <div class="title">NFT</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=solidity" class="s_menu_el">
                            <div class="title">Solidity</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=smart-contract" class="s_menu_el">
                            <div class="title">Smart Contract</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=truffle" class="s_menu_el">
                            <div class="title">Truffle</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=mongodb" class="s_menu_el">
                            <div class="title">MongoDB</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=web3" class="s_menu_el">
                            <div class="title">web3</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=go" class="s_menu_el">
                            <div class="title">Go</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=metaverse" class="s_menu_el">
                            <div class="title">메타버스</div>
                        </a>
                        <a href="/courses/it/blockchain?skill=web-app" class="s_menu_el">
                            <div class="title">웹앱</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자격증 (보안 · 네트워크) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/certificate-security" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=isms-p" class="s_menu_el">
                            <div class="title">ISMS-P</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=security" class="s_menu_el">
                            <div class="title">security</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=forensic" class="s_menu_el">
                            <div class="title">Forensic</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=aws" class="s_menu_el">
                            <div class="title">AWS</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=cppg" class="s_menu_el">
                            <div class="title">CPPG(개인정보관리사)</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=azure" class="s_menu_el">
                            <div class="title">Azure</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=cisco" class="s_menu_el">
                            <div class="title">cisco</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=protocol" class="s_menu_el">
                            <div class="title">프로토콜</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=devops" class="s_menu_el">
                            <div class="title">devops</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=ccna" class="s_menu_el">
                            <div class="title">CCNA</div>
                        </a>
                        <a href="/courses/it/certificate-security?skill=privacy" class="s_menu_el">
                            <div class="title">privacy</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (보안 · 네트워크) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/it/it-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=ccna" class="s_menu_el">
                            <div class="title">CCNA</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=iot" class="s_menu_el">
                            <div class="title">IoT</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=cisco" class="s_menu_el">
                            <div class="title">cisco</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=azure" class="s_menu_el">
                            <div class="title">Azure</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=cheat-engine" class="s_menu_el">
                            <div class="title">Cheat Engine</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=frida" class="s_menu_el">
                            <div class="title">Frida</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=platform" class="s_menu_el">
                            <div class="title">플랫폼 비즈니스</div>
                        </a>
                        <a href="/courses/it/it-besides?skill=engineer-info-process" class="s_menu_el">
                            <div class="title">정보처리기사</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="33">
                    <a class="c-menu" href="/courses/business">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            오피스 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/office" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/office?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/business/office?skill=excel" class="s_menu_el">
                            <div class="title">Excel</div>
                        </a>
                        <a href="/courses/business/office?skill=powerpoint" class="s_menu_el">
                            <div class="title">PowerPoint</div>
                        </a>
                        <a href="/courses/business/office?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/business/office?skill=presentation" class="s_menu_el">
                            <div class="title">프레젠테이션</div>
                        </a>
                        <a href="/courses/business/office?skill=ms-teams" class="s_menu_el">
                            <div class="title">Teams</div>
                        </a>
                        <a href="/courses/business/office?skill=project-management" class="s_menu_el">
                            <div class="title">프로젝트 관리</div>
                        </a>
                        <a href="/courses/business/office?skill=google-spreadsheets" class="s_menu_el">
                            <div class="title">Google Sheets</div>
                        </a>
                        <a href="/courses/business/office?skill=word" class="s_menu_el">
                            <div class="title">Word</div>
                        </a>
                        <a href="/courses/business/office?skill=vba" class="s_menu_el">
                            <div class="title">VBA</div>
                        </a>
                        <a href="/courses/business/office?skill=power-query" class="s_menu_el">
                            <div class="title">Excel PowerQuery</div>
                        </a>
                        <a href="/courses/business/office?skill=hancom" class="s_menu_el">
                            <div class="title">한컴오피스</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            마케팅 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/marketing" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/marketing?skill=digital-marketing" class="s_menu_el">
                            <div class="title">디지털 마케팅</div>
                        </a>
                        <a href="/courses/business/marketing?skill=contents-marketing" class="s_menu_el">
                            <div class="title">콘텐츠 마케팅</div>
                        </a>
                        <a href="/courses/business/marketing?skill=performance-marketing" class="s_menu_el">
                            <div class="title">퍼포먼스 마케팅</div>
                        </a>
                        <a href="/courses/business/marketing?skill=marketing-theory" class="s_menu_el">
                            <div class="title">마케팅 이론</div>
                        </a>
                        <a href="/courses/business/marketing?skill=google-analytics" class="s_menu_el">
                            <div class="title">Google Analytics</div>
                        </a>
                        <a href="/courses/business/marketing?skill=growth-hacking" class="s_menu_el">
                            <div class="title">그로스해킹</div>
                        </a>
                        <a href="/courses/business/marketing?skill=ga4" class="s_menu_el">
                            <div class="title">GA4</div>
                        </a>
                        <a href="/courses/business/marketing?skill=copywriting" class="s_menu_el">
                            <div class="title">카피라이팅</div>
                        </a>
                        <a href="/courses/business/marketing?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/business/marketing?skill=%EB%B8%8C%EB%9E%9C%EB%93%9C%EB%A7%88%EC%BC%80%ED%8C%85"
                            class="s_menu_el">
                            <div class="title">브랜드 마케팅</div>
                        </a>
                        <a href="/courses/business/marketing?skill=blog" class="s_menu_el">
                            <div class="title">블로그</div>
                        </a>
                        <a href="/courses/business/marketing?skill=facebook-advertise" class="s_menu_el">
                            <div class="title">Facebook Ads</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기획 · 전략 · PM <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/project-manage" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=project-management" class="s_menu_el">
                            <div class="title">프로젝트 관리</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=ux-planning" class="s_menu_el">
                            <div class="title">UX 기획</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=planning-document" class="s_menu_el">
                            <div class="title">기획서</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=ux-research" class="s_menu_el">
                            <div class="title">UX 리서치</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=ux" class="s_menu_el">
                            <div class="title">ux</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=collaboration-tool" class="s_menu_el">
                            <div class="title">협업 툴</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=presentation" class="s_menu_el">
                            <div class="title">프레젠테이션</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=data-literacy" class="s_menu_el">
                            <div class="title">데이터 리터러시</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=prototyping" class="s_menu_el">
                            <div class="title">프로토타이핑</div>
                        </a>
                        <a href="/courses/business/project-manage?skill=figma" class="s_menu_el">
                            <div class="title">Figma</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            업무 자동화 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/task-automation" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=excel" class="s_menu_el">
                            <div class="title">Excel</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=web-crawling" class="s_menu_el">
                            <div class="title">웹 크롤링</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=chatgpt" class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=rpa" class="s_menu_el">
                            <div class="title">RPA</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=selenium" class="s_menu_el">
                            <div class="title">Selenium</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=vba" class="s_menu_el">
                            <div class="title">VBA</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=power-automate" class="s_menu_el">
                            <div class="title">Power Automate</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=ai" class="s_menu_el">
                            <div class="title">인공지능(AI)</div>
                        </a>
                        <a href="/courses/business/task-automation?skill=google-spreadsheets" class="s_menu_el">
                            <div class="title">Google Sheets</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            경영 <span class="caret_el"><span class="icon"><i class="fas fa-chevron-down"></i></span><span
                                    class="icon"><i class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/management" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/management?skill=management" class="s_menu_el">
                            <div class="title">경영노하우</div>
                        </a>
                        <a href="/courses/business/management?skill=accounting" class="s_menu_el">
                            <div class="title">회계</div>
                        </a>
                        <a href="/courses/business/management?skill=financial-management" class="s_menu_el">
                            <div class="title">재무</div>
                        </a>
                        <a href="/courses/business/management?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/business/management?skill=reading-method" class="s_menu_el">
                            <div class="title">독서법</div>
                        </a>
                        <a href="/courses/business/management?skill=marketing-theory" class="s_menu_el">
                            <div class="title">마케팅 이론</div>
                        </a>
                        <a href="/courses/business/management?skill=planning-document" class="s_menu_el">
                            <div class="title">기획서</div>
                        </a>
                        <a href="/courses/business/management?skill=contents-marketing" class="s_menu_el">
                            <div class="title">콘텐츠 마케팅</div>
                        </a>
                        <a href="/courses/business/management?skill=history" class="s_menu_el">
                            <div class="title">history</div>
                        </a>
                        <a href="/courses/business/management?skill=platform" class="s_menu_el">
                            <div class="title">플랫폼 비즈니스</div>
                        </a>
                        <a href="/courses/business/management?skill=business-plan" class="s_menu_el">
                            <div class="title">사업계획서</div>
                        </a>
                        <a href="/courses/business/management?skill=human-resource" class="s_menu_el">
                            <div class="title">HR</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자격증 (비즈니스 · 마케팅) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/certificate-office" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=itq" class="s_menu_el">
                            <div class="title">ITQ</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=computer-specialist" class="s_menu_el">
                            <div class="title">컴퓨터활용능력</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=excel" class="s_menu_el">
                            <div class="title">Excel</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=engineer-big-data-analysis"
                            class="s_menu_el">
                            <div class="title">빅데이터분석기사</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=accounting" class="s_menu_el">
                            <div class="title">회계</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=computerized-tax-accounting"
                            class="s_menu_el">
                            <div class="title">전산세무회계</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=hancom" class="s_menu_el">
                            <div class="title">한컴오피스</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=%EC%84%9C%EB%B9%84%EC%8A%A4%EA%B4%80%EB%A6%AC"
                            class="s_menu_el">
                            <div class="title">IT 서비스 관리</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/business/certificate-office?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (비즈니스 · 마케팅) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/business/business-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=english" class="s_menu_el">
                            <div class="title">영어</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=communication" class="s_menu_el">
                            <div class="title">커뮤니케이션</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=notion" class="s_menu_el">
                            <div class="title">Notion</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=computer-specialist" class="s_menu_el">
                            <div class="title">컴퓨터활용능력</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=presentation" class="s_menu_el">
                            <div class="title">프레젠테이션</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=project-management" class="s_menu_el">
                            <div class="title">프로젝트 관리</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=metaverse" class="s_menu_el">
                            <div class="title">메타버스</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=collaboration-tool" class="s_menu_el">
                            <div class="title">협업 툴</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=speech" class="s_menu_el">
                            <div class="title">스피치</div>
                        </a>
                        <a href="/courses/business/business-besides?skill=relationship" class="s_menu_el">
                            <div class="title">대인관계</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="178677">
                    <a class="c-menu" href="/courses/hardware">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            컴퓨터 구조 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/computer-architecture" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=com-archi" class="s_menu_el">
                            <div class="title">컴퓨터 구조</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=operating-system" class="s_menu_el">
                            <div class="title">운영체제</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=linux-kernel" class="s_menu_el">
                            <div class="title">linux-kernel</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=cpu" class="s_menu_el">
                            <div class="title">cpu</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=assembly-language" class="s_menu_el">
                            <div class="title">assembly-language</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=computer-science" class="s_menu_el">
                            <div class="title">computer-science</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/computer-architecture?skill=verilog-hdl" class="s_menu_el">
                            <div class="title">Verilog HDL</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            임베디드 · IoT <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/embedded-iot" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=fpga" class="s_menu_el">
                            <div class="title">FPGA</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=arduino" class="s_menu_el">
                            <div class="title">Arduino</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=verilog-hdl" class="s_menu_el">
                            <div class="title">Verilog HDL</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=iot" class="s_menu_el">
                            <div class="title">IoT</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=can" class="s_menu_el">
                            <div class="title">CAN</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=cortex-a" class="s_menu_el">
                            <div class="title">cortex-a</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/hardware/embedded-iot?skill=linux-kernel" class="s_menu_el">
                            <div class="title">linux-kernel</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            반도체 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/semiconductor" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=fpga" class="s_menu_el">
                            <div class="title">FPGA</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=verilog-hdl" class="s_menu_el">
                            <div class="title">Verilog HDL</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=linux-kernel" class="s_menu_el">
                            <div class="title">linux-kernel</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=cortex-a" class="s_menu_el">
                            <div class="title">cortex-a</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=operating-system" class="s_menu_el">
                            <div class="title">운영체제</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=verilog" class="s_menu_el">
                            <div class="title">verilog</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=memory-management" class="s_menu_el">
                            <div class="title">memory-management</div>
                        </a>
                        <a href="/courses/hardware/semiconductor?skill=microblaze" class="s_menu_el">
                            <div class="title">MicroBlaze</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            로봇공학 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/robotics" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=matlab" class="s_menu_el">
                            <div class="title">MATLAB</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=linear-algebra" class="s_menu_el">
                            <div class="title">선형대수학</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=memory-management" class="s_menu_el">
                            <div class="title">memory-management</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=linux-kernel" class="s_menu_el">
                            <div class="title">linux-kernel</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=robotics" class="s_menu_el">
                            <div class="title">robotics</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=interrupt-handling" class="s_menu_el">
                            <div class="title">interrupt-handling</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=kalman-filter" class="s_menu_el">
                            <div class="title">kalman-filter</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/robotics?skill=context-switching" class="s_menu_el">
                            <div class="title">context-switching</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            모빌리티 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/mobility" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=can" class="s_menu_el">
                            <div class="title">CAN</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=uds" class="s_menu_el">
                            <div class="title">uds</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=iot" class="s_menu_el">
                            <div class="title">IoT</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=canoe" class="s_menu_el">
                            <div class="title">CANoe</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=virtualization" class="s_menu_el">
                            <div class="title">가상화</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=autonomous-driving" class="s_menu_el">
                            <div class="title">자율주행</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=raspberry-pi" class="s_menu_el">
                            <div class="title">Raspberry Pi</div>
                        </a>
                        <a href="/courses/hardware/mobility?skill=linux" class="s_menu_el">
                            <div class="title">Linux</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자격증 (하드웨어) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/certificate-hardware" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (하드웨어) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/hardware/hardware-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=cpu-architecture" class="s_menu_el">
                            <div class="title">cpu-architecture</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=iec61131-3" class="s_menu_el">
                            <div class="title">iec61131-3</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=verilog-hdl" class="s_menu_el">
                            <div class="title">Verilog HDL</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=plc" class="s_menu_el">
                            <div class="title">plc</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=connector" class="s_menu_el">
                            <div class="title">connector</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=digital-signal-processing" class="s_menu_el">
                            <div class="title">digital-signal-processing</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=terminals" class="s_menu_el">
                            <div class="title">terminals</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=armv7" class="s_menu_el">
                            <div class="title">armv7</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=circuit" class="s_menu_el">
                            <div class="title">circuit</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=armv8" class="s_menu_el">
                            <div class="title">armv8</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=embedded" class="s_menu_el">
                            <div class="title">임베디드</div>
                        </a>
                        <a href="/courses/hardware/hardware-besides?skill=arm-architecture" class="s_menu_el">
                            <div class="title">ARM Architecture</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="22">
                    <a class="c-menu" href="/courses/design">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            CAD · 3D 모델링 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/3d-modeling" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=blender" class="s_menu_el">
                            <div class="title">Blender</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=cad" class="s_menu_el">
                            <div class="title">CAD</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=rhino" class="s_menu_el">
                            <div class="title">Rhino</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=autocad" class="s_menu_el">
                            <div class="title">AutoCAD</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=cinema4d" class="s_menu_el">
                            <div class="title">Cinema 4D</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=3d-rendering" class="s_menu_el">
                            <div class="title">3d-rendering</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=maya" class="s_menu_el">
                            <div class="title">MAYA</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=3ds-max" class="s_menu_el">
                            <div class="title">3ds MAX</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=siemens-nx" class="s_menu_el">
                            <div class="title">Siemens NX</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=catia" class="s_menu_el">
                            <div class="title">Catia</div>
                        </a>
                        <a href="/courses/design/3d-modeling?skill=3d" class="s_menu_el">
                            <div class="title">3d</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            UX/UI <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/ux-ui" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=figma" class="s_menu_el">
                            <div class="title">Figma</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=ux-planning" class="s_menu_el">
                            <div class="title">UX 기획</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=app-design" class="s_menu_el">
                            <div class="title">모바일 디자인</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=ux-research" class="s_menu_el">
                            <div class="title">UX 리서치</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=ux" class="s_menu_el">
                            <div class="title">ux</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=prototyping" class="s_menu_el">
                            <div class="title">프로토타이핑</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=web-design" class="s_menu_el">
                            <div class="title">웹 디자인</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=adobe-xd" class="s_menu_el">
                            <div class="title">XD</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=design-system" class="s_menu_el">
                            <div class="title">디자인 시스템</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=portfolio" class="s_menu_el">
                            <div class="title">포트폴리오</div>
                        </a>
                        <a href="/courses/design/ux-ui?skill=user-interviews" class="s_menu_el">
                            <div class="title">사용자 인터뷰</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            그래픽 디자인 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/graphic-design" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=photoshop" class="s_menu_el">
                            <div class="title">Photoshop</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=figma" class="s_menu_el">
                            <div class="title">Figma</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=blender" class="s_menu_el">
                            <div class="title">Blender</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=app-design" class="s_menu_el">
                            <div class="title">모바일 디자인</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=illustrator" class="s_menu_el">
                            <div class="title">Illustrator</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=3d-rendering" class="s_menu_el">
                            <div class="title">3d-rendering</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=web-design" class="s_menu_el">
                            <div class="title">웹 디자인</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=drawing" class="s_menu_el">
                            <div class="title">드로잉</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=prototyping" class="s_menu_el">
                            <div class="title">프로토타이핑</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=maya" class="s_menu_el">
                            <div class="title">MAYA</div>
                        </a>
                        <a href="/courses/design/graphic-design?skill=character-design" class="s_menu_el">
                            <div class="title">캐릭터 디자인</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            사진 · 영상 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/video-editing" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=video-production" class="s_menu_el">
                            <div class="title">영상제작</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=aftereffect" class="s_menu_el">
                            <div class="title">After Effects</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=premiere" class="s_menu_el">
                            <div class="title">Premiere Pro</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=photography" class="s_menu_el">
                            <div class="title">사진</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=youtube-creator" class="s_menu_el">
                            <div class="title">유튜브</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=motion-graphic" class="s_menu_el">
                            <div class="title">모션그래픽</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=davinci-resolve" class="s_menu_el">
                            <div class="title">Davinci Resolve</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=finalcut" class="s_menu_el">
                            <div class="title">Final Cut Pro</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=photoshop" class="s_menu_el">
                            <div class="title">Photoshop</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=lightroom" class="s_menu_el">
                            <div class="title">Lightroom</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                        <a href="/courses/design/video-editing?skill=3d-rendering" class="s_menu_el">
                            <div class="title">3d-rendering</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            자격증 (디자인) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/certificate-design" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=html-css" class="s_menu_el">
                            <div class="title">HTML/CSS</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=web-design" class="s_menu_el">
                            <div class="title">웹 디자인</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=jquery" class="s_menu_el">
                            <div class="title">jQuery</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=%EC%A0%84%EC%82%B0%EC%9D%91%EC%9A%A9%EA%B1%B4%EC%B6%95%EC%A0%9C%EB%8F%84%EA%B8%B0%EB%8A%A5%EC%82%AC"
                            class="s_menu_el">
                            <div class="title">전산응용건축제도기능사</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=photoshop" class="s_menu_el">
                            <div class="title">Photoshop</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=autodesk-inventor" class="s_menu_el">
                            <div class="title">Inventor</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=autocad" class="s_menu_el">
                            <div class="title">AutoCAD</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=cloud-computing" class="s_menu_el">
                            <div class="title">cloud-computing</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=network" class="s_menu_el">
                            <div class="title">네트워크</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=azure" class="s_menu_el">
                            <div class="title">Azure</div>
                        </a>
                        <a href="/courses/design/certificate-design?skill=cad" class="s_menu_el">
                            <div class="title">CAD</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            사운드 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/sound" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/sound?skill=music-compose" class="s_menu_el">
                            <div class="title">작곡</div>
                        </a>
                        <a href="/courses/design/sound?skill=sound-system" class="s_menu_el">
                            <div class="title">음향 시스템</div>
                        </a>
                        <a href="/courses/design/sound?skill=studio-one" class="s_menu_el">
                            <div class="title">Studio One</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (디자인) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/design/creative-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=ucc" class="s_menu_el">
                            <div class="title">UCC</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=metaverse" class="s_menu_el">
                            <div class="title">메타버스</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=lua" class="s_menu_el">
                            <div class="title">Lua</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=unreal" class="s_menu_el">
                            <div class="title">Unreal Engine</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=blender" class="s_menu_el">
                            <div class="title">Blender</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=roblox" class="s_menu_el">
                            <div class="title">Roblox</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=vfx" class="s_menu_el">
                            <div class="title">VFX</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=niagara" class="s_menu_el">
                            <div class="title">Niagara</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=3d" class="s_menu_el">
                            <div class="title">3d</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=3d-modelling" class="s_menu_el">
                            <div class="title">3d-modelling</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=3d-rendering" class="s_menu_el">
                            <div class="title">3d-rendering</div>
                        </a>
                        <a href="/courses/design/creative-besides?skill=3d-modeling" class="s_menu_el">
                            <div class="title">3d-modeling</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="493">
                    <a class="c-menu" href="/courses/academics">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            수학 <span class="caret_el"><span class="icon"><i class="fas fa-chevron-down"></i></span><span
                                    class="icon"><i class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/academics/math" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/academics/math?skill=statistics" class="s_menu_el">
                            <div class="title">통계</div>
                        </a>
                        <a href="/courses/academics/math?skill=linear-algebra" class="s_menu_el">
                            <div class="title">선형대수학</div>
                        </a>
                        <a href="/courses/academics/math?skill=integral-differential" class="s_menu_el">
                            <div class="title">미적분</div>
                        </a>
                        <a href="/courses/academics/math?skill=probability-and-statistics" class="s_menu_el">
                            <div class="title">확률과 통계</div>
                        </a>
                        <a href="/courses/academics/math?skill=machine-learning" class="s_menu_el">
                            <div class="title">머신러닝</div>
                        </a>
                        <a href="/courses/academics/math?skill=deep-learning" class="s_menu_el">
                            <div class="title">딥러닝</div>
                        </a>
                        <a href="/courses/academics/math?skill=procession" class="s_menu_el">
                            <div class="title">행렬</div>
                        </a>
                        <a href="/courses/academics/math?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/academics/math?skill=%EB%8C%80%EC%88%98%ED%95%99" class="s_menu_el">
                            <div class="title">대수학</div>
                        </a>
                        <a href="/courses/academics/math?skill=game-math" class="s_menu_el">
                            <div class="title">게임수학</div>
                        </a>
                        <a href="/courses/academics/math?skill=r-programming" class="s_menu_el">
                            <div class="title">R</div>
                        </a>
                        <a href="/courses/academics/math?skill=latex" class="s_menu_el">
                            <div class="title">LaTeX</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            외국어 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/academics/foreign-language" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=english" class="s_menu_el">
                            <div class="title">영어</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=opic" class="s_menu_el">
                            <div class="title">OPIc</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=toeic" class="s_menu_el">
                            <div class="title">TOEIC</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=toeic-speaking" class="s_menu_el">
                            <div class="title">TOEIC Speaking</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=communication" class="s_menu_el">
                            <div class="title">커뮤니케이션</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=chinese" class="s_menu_el">
                            <div class="title">중국어</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=japanese" class="s_menu_el">
                            <div class="title">일본어</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=spanish" class="s_menu_el">
                            <div class="title">스페인어</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=online-education" class="s_menu_el">
                            <div class="title">온라인 교육</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=resume" class="s_menu_el">
                            <div class="title">이력서</div>
                        </a>
                        <a href="/courses/academics/foreign-language?skill=sat" class="s_menu_el">
                            <div class="title">SAT</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (학문 · 외국어) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/academics/academic-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=online-education" class="s_menu_el">
                            <div class="title">온라인 교육</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=logic" class="s_menu_el">
                            <div class="title">logic</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=google-tag-manager" class="s_menu_el">
                            <div class="title">Google Tag Manager</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=self-improvement" class="s_menu_el">
                            <div class="title">자기계발</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=dt" class="s_menu_el">
                            <div class="title">dt</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=flowchart" class="s_menu_el">
                            <div class="title">flowchart</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=business-plan" class="s_menu_el">
                            <div class="title">사업계획서</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=english" class="s_menu_el">
                            <div class="title">영어</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=japanese" class="s_menu_el">
                            <div class="title">일본어</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=economics" class="s_menu_el">
                            <div class="title">경제학</div>
                        </a>
                        <a href="/courses/academics/academic-besides?skill=latex" class="s_menu_el">
                            <div class="title">LaTeX</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="494">
                    <a class="c-menu" href="/courses/career">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            취업 · 이직 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/career/get-jobs" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=interview" class="s_menu_el">
                            <div class="title">면접</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=resume" class="s_menu_el">
                            <div class="title">이력서</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=portfolio" class="s_menu_el">
                            <div class="title">포트폴리오</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=tech-interview" class="s_menu_el">
                            <div class="title">기술면접</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=bigdata" class="s_menu_el">
                            <div class="title">빅데이터</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=job-analysis" class="s_menu_el">
                            <div class="title">직무분석</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=communication" class="s_menu_el">
                            <div class="title">커뮤니케이션</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=self-improvement" class="s_menu_el">
                            <div class="title">자기계발</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=project-management" class="s_menu_el">
                            <div class="title">프로젝트 관리</div>
                        </a>
                        <a href="/courses/career/get-jobs?skill=computer-specialist" class="s_menu_el">
                            <div class="title">컴퓨터활용능력</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            개인 브랜딩 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/career/personal-branding" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=writing" class="s_menu_el">
                            <div class="title">집필</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=book-pub" class="s_menu_el">
                            <div class="title">출간, 출판</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=self-improvement" class="s_menu_el">
                            <div class="title">자기계발</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=contents-marketing" class="s_menu_el">
                            <div class="title">콘텐츠 마케팅</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=presentation" class="s_menu_el">
                            <div class="title">프레젠테이션</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=speech" class="s_menu_el">
                            <div class="title">스피치</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=relationship" class="s_menu_el">
                            <div class="title">대인관계</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=notion" class="s_menu_el">
                            <div class="title">Notion</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=public-relation" class="s_menu_el">
                            <div class="title">PR</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=video-production" class="s_menu_el">
                            <div class="title">영상제작</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/career/personal-branding?skill=management" class="s_menu_el">
                            <div class="title">경영노하우</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            창업 <span class="caret_el"><span class="icon"><i class="fas fa-chevron-down"></i></span><span
                                    class="icon"><i class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/career/business-start-up" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=management" class="s_menu_el">
                            <div class="title">경영노하우</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=digital-marketing" class="s_menu_el">
                            <div class="title">디지털 마케팅</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=monetization" class="s_menu_el">
                            <div class="title">수익화</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=smart-store" class="s_menu_el">
                            <div class="title">스마트스토어</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=business-plan" class="s_menu_el">
                            <div class="title">사업계획서</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=self-improvement" class="s_menu_el">
                            <div class="title">자기계발</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=history" class="s_menu_el">
                            <div class="title">history</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=chatgpt" class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=planning-document" class="s_menu_el">
                            <div class="title">기획서</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=figma" class="s_menu_el">
                            <div class="title">Figma</div>
                        </a>
                        <a href="/courses/career/business-start-up?skill=contents-marketing" class="s_menu_el">
                            <div class="title">콘텐츠 마케팅</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            기타 (커리어) <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/career/career-besides" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=interview" class="s_menu_el">
                            <div class="title">면접</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=computer-specialist" class="s_menu_el">
                            <div class="title">컴퓨터활용능력</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=ms-office" class="s_menu_el">
                            <div class="title">MS-Office</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=digital-marketing" class="s_menu_el">
                            <div class="title">디지털 마케팅</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=communication" class="s_menu_el">
                            <div class="title">커뮤니케이션</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=engineer-info-process" class="s_menu_el">
                            <div class="title">정보처리기사</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=business-productivity" class="s_menu_el">
                            <div class="title">업무 생산성</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=service-planning" class="s_menu_el">
                            <div class="title">서비스 기획</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=writing" class="s_menu_el">
                            <div class="title">집필</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=excel" class="s_menu_el">
                            <div class="title">Excel</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=contents-marketing" class="s_menu_el">
                            <div class="title">콘텐츠 마케팅</div>
                        </a>
                        <a href="/courses/career/career-besides?skill=blog" class="s_menu_el">
                            <div class="title">블로그</div>
                        </a>
                    </div>
                </div>
                <div class="p-submenu " data-id="666">
                    <a class="c-menu" href="/courses/life">
                        <div class="title">전체</div>
                    </a>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            금융 · 재테크 <span class="caret_el"><span class="icon"><i
                                        class="fas fa-chevron-down"></i></span><span class="icon"><i
                                        class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/life/finance" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/life/finance?skill=investment" class="s_menu_el">
                            <div class="title">투자</div>
                        </a>
                        <a href="/courses/life/finance?skill=financial-technology" class="s_menu_el">
                            <div class="title">재테크</div>
                        </a>
                        <a href="/courses/life/finance?skill=quant" class="s_menu_el">
                            <div class="title">퀀트</div>
                        </a>
                        <a href="/courses/life/finance?skill=python" class="s_menu_el">
                            <div class="title">Python</div>
                        </a>
                        <a href="/courses/life/finance?skill=pandas" class="s_menu_el">
                            <div class="title">Pandas</div>
                        </a>
                        <a href="/courses/life/finance?skill=blockchain" class="s_menu_el">
                            <div class="title">블록체인</div>
                        </a>
                        <a href="/courses/life/finance?skill=chart-analysis" class="s_menu_el">
                            <div class="title">차트분석</div>
                        </a>
                        <a href="/courses/life/finance?skill=financial-management" class="s_menu_el">
                            <div class="title">재무</div>
                        </a>
                        <a href="/courses/life/finance?skill=etherium" class="s_menu_el">
                            <div class="title">Ethereum</div>
                        </a>
                        <a href="/courses/life/finance?skill=financial-engineering" class="s_menu_el">
                            <div class="title">금융공학</div>
                        </a>
                        <a href="/courses/life/finance?skill=bitcoin" class="s_menu_el">
                            <div class="title">bitcoin</div>
                        </a>
                        <a href="/courses/life/finance?skill=history" class="s_menu_el">
                            <div class="title">history</div>
                        </a>
                    </div>
                    <div class="c-menu dropdown_el">
                        <div class="title">
                            교양 <span class="caret_el"><span class="icon"><i class="fas fa-chevron-down"></i></span><span
                                    class="icon"><i class="fas fa-chevron-up"></i></span></span>
                        </div>
                    </div>
                    <div class="c-submenu">
                        <a href="/courses/life/lifestyle" class="s_menu_el">
                            <div class="title">전체</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=self-improvement" class="s_menu_el">
                            <div class="title">자기계발</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=online-education" class="s_menu_el">
                            <div class="title">온라인 교육</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=financial-technology" class="s_menu_el">
                            <div class="title">재테크</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=investment" class="s_menu_el">
                            <div class="title">투자</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=writing" class="s_menu_el">
                            <div class="title">집필</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=book-pub" class="s_menu_el">
                            <div class="title">출간, 출판</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=chatgpt" class="s_menu_el">
                            <div class="title">ChatGPT</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=photography" class="s_menu_el">
                            <div class="title">사진</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=video-production" class="s_menu_el">
                            <div class="title">영상제작</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=speech" class="s_menu_el">
                            <div class="title">스피치</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=english" class="s_menu_el">
                            <div class="title">영어</div>
                        </a>
                        <a href="/courses/life/lifestyle?skill=presentation" class="s_menu_el">
                            <div class="title">프레젠테이션</div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </aside>
</template>

<script>
import { mapStores } from 'pinia'
import { useMobileAsideActiveStore } from '@/stores/useMobileAsideActiveStore';

export default {
    name: 'MobileAsideComponent',
    computed: {
        ...mapStores(useMobileAsideActiveStore)
    },
}
</script>

<style scoped></style>