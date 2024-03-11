<template>
  <section class="inflab-integrated">
    <header>
      <div class="inflab-integrated__container">
        <ul class="inflab-integrated__service">
          <li>
            <a class="active e-integrated-header-inflearn-link" href="index.htm">
              <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M16.4702 7.30208C16.1056 6.46354 15.6135 5.71615 14.9937 5.07813C14.3558 4.4401 13.6267 3.92969 12.7882 3.5651C11.9497 3.20052 11.0383 3 10.0723 3C9.12446 3 8.21308 3.16406 7.35638 3.52865C6.49969 3.89323 5.75236 4.38542 5.09617 5.00521C4.43998 5.64323 3.92961 6.3724 3.56505 7.21094C3.2005 8.04948 3 8.96094 3 9.92708C3 10.875 3.16405 11.7865 3.5286 12.6432C3.89315 13.5 4.38529 14.2474 5.02326 14.9036C5.66122 15.5599 6.40855 16.0703 7.24702 16.4349C8.10371 16.7995 8.99686 17 9.96292 17H16.9988V10.0365C17.017 9.07031 16.8347 8.15885 16.4702 7.30208ZM7.79384 15.1406C7.11943 14.849 6.51792 14.4297 6.00755 13.9193C5.49717 13.3906 5.09617 12.7891 4.80453 12.1146C4.51289 11.4219 4.38529 10.7109 4.38529 9.94531C4.38529 9.16146 4.54934 8.43229 4.84098 7.75781C5.13262 7.08333 5.55186 6.5 6.06223 5.98958C6.59083 5.47917 7.19234 5.09635 7.86676 4.80469C8.5594 4.51302 9.27028 4.38542 10.0358 4.38542C10.8196 4.38542 11.5487 4.54948 12.2231 4.84115C12.8976 5.13281 13.4808 5.53385 13.9912 6.0625C14.5016 6.57292 14.8844 7.17448 15.176 7.84896C15.4676 8.52344 15.5952 9.25261 15.5952 10.0365V14.7396L10.5644 9.65365L11.6763 6.59115C11.8039 6.26302 11.6216 5.89844 11.2935 5.77083C10.9654 5.64323 10.6009 5.82552 10.4733 6.15365L9.58015 8.63281L8.01258 7.04688C7.75739 6.79167 7.35638 6.79167 7.11943 7.04688C6.86424 7.30208 6.86424 7.70313 7.11943 7.9401L10.9472 11.8594H8.17662C7.8303 11.8594 7.53866 12.151 7.53866 12.4974C7.53866 12.8438 7.8303 13.1354 8.17662 13.1354H12.1502C12.1685 13.1354 12.1867 13.1354 12.1867 13.1354L14.6656 15.6146H9.96292C9.17914 15.5964 8.48649 15.4505 7.79384 15.1406Z"
                  fill="#00C471"></path>
              </svg>
              교육
            </a>
          </li>
          <li>
            <a class="e-gtm-rallit-link" href="https://www.rallit.com/my/log">
              <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" clip-rule="evenodd"
                  d="M3 10.7626C3 7.3177 5.76662 4.52502 9.17943 4.52502H12.7955V7.11248H9.17943C7.1823 7.11248 5.56332 8.74672 5.56332 10.7626C5.56332 12.7786 7.1823 14.4128 9.17943 14.4128C11.1765 14.4128 12.7955 12.7786 12.7955 10.7626V7.11248H15.3589V10.7626C15.3589 14.2076 12.5922 17.0003 9.17943 17.0003C5.76662 17.0003 3 14.2076 3 10.7626Z"
                  fill="#858a8d"></path>
                <path
                  d="M15.4272 5.91089C16.2235 5.91089 16.8691 5.25927 16.8691 4.45545C16.8691 3.65163 16.2235 3 15.4272 3C14.6309 3 13.9854 3.65163 13.9854 4.45545V5.91089H15.4272Z"
                  fill="#858a8d"></path>
              </svg>
              커리어
            </a>
          </li>
        </ul>

        <ul class="inflab-integrated__links-right">
          <li>
            <a href="intro-group.html" class="e-integrated-header-b2b-link">기업 서비스</a>
          </li>
          <li>
            <a href="open-knowledge.html" class="e-integrated-header-instructor-apply-link">지식공유 참여</a>
          </li>
        </ul>
      </div>
    </header>
  </section>
  <header id="header">
    <nav class="navbar">

      <div class="container mobile_container">
        <div class="content">
          <div class="mobile_left">
            <span @click="mobileAsideActiveStore.toggleAside" class="infd-icon e_left_aside_btn" data-type="open"><svg
                width="30" height="30" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
                <path fill="#495057" fill-rule="evenodd" clip-rule="evenodd"
                  d="M1.5 6C1.22386 6 1 6.22386 1 6.5C1 6.77614 1.22386 7 1.5 7H10C10.2761 7 10.5 6.77614 10.5 6.5C10.5 6.22386 10.2761 6 10 6H1.5ZM1.5 16C1.22386 16 1 16.2239 1 16.5C1 16.7761 1.22386 17 1.5 17H10C10.2761 17 10.5 16.7761 10.5 16.5C10.5 16.2239 10.2761 16 10 16H1.5ZM1 11.5C1 11.2239 1.22386 11 1.5 11H8.5C8.77614 11 9 11.2239 9 11.5C9 11.7761 8.77614 12 8.5 12H1.5C1.22386 12 1 11.7761 1 11.5ZM15.5 15.5C17.7091 15.5 19.5 13.7091 19.5 11.5C19.5 9.29086 17.7091 7.5 15.5 7.5C13.2909 7.5 11.5 9.29086 11.5 11.5C11.5 13.7091 13.2909 15.5 15.5 15.5ZM15.5 16.5C16.7006 16.5 17.8024 16.0768 18.6644 15.3715L22.1464 18.8536C22.3417 19.0488 22.6583 19.0488 22.8536 18.8536C23.0488 18.6583 23.0488 18.3417 22.8536 18.1464L19.3715 14.6644C20.0768 13.8024 20.5 12.7006 20.5 11.5C20.5 8.73858 18.2614 6.5 15.5 6.5C12.7386 6.5 10.5 8.73858 10.5 11.5C10.5 14.2614 12.7386 16.5 15.5 16.5Z">
                </path>
              </svg></span>
          </div>
          <div class="brand_header">
            <a href="index.htm" class="brand_logo"><span class="visually_hidden">인프런</span><span
                style="width: 110px; display: inline-block"><img src="/assets/brand/brand_logo.png"></span></a>
          </div>
          <div class="mobile_right">

            <button type="button" class="button space-inset-4 text is-5 signin">로그인</button>
            <button type="button" class="e-signup button space-inset-4 text is-5 is-primary ">회원가입</button>
          </div>
        </div>
      </div>
      <div class="container desktop_container">
        <div class="content">
          <div class="brand_header">
            <a href="index.htm" class="brand_logo e-brand-logo">
              <span class="visually_hidden">인프런</span><span style="width: 110px; display: inline-block"><img
                  src="/assets/brand/brand_logo.png"></span>
            </a>
          </div>
          <div class="navbar-menu">
            <div class="navbar-left">
              <div class="has-dropdown is-hoverable navbar-item category_menu content--no-list-style">
                <a href="/course/list" class="navbar-item"><span>강의</span></a>
                <ul class="navbar-dropdown is-boxed">
                  <li>
                    <a class="navbar-item" href="/courses/it-programming">개발 · 프로그래밍</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/web-dev">웹 개발</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-dev?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=spring">Spring</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=nodejs">Node.js</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=spring-boot">Spring
                              Boot</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-dev?skill=typescript">TypeScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=vuejs">Vue.js</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=jquery">jQuery</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-dev?skill=django">Django</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/front-end">프론트엔드</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/front-end?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=vuejs">Vue.js</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/front-end?skill=typescript">TypeScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=next-js">Next.js</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=jquery">jQuery</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=nodejs">Node.js</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=interactive-web">인터랙티브
                              웹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=es6">ES6</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/front-end?skill=responsive-web">반응형
                              웹</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/back-end">백엔드</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=spring">Spring</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=spring-boot">Spring
                              Boot</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=nodejs">Node.js</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/back-end?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=aws">AWS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/back-end?skill=java-persistence-api">JPA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=docker">Docker</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=mongodb">MongoDB</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/back-end?skill=express">Express</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/full-stack">풀스택</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/full-stack?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=nodejs">Node.js</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=django">Django</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=mongodb">MongoDB</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=spring-boot">Spring
                              Boot</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=spring">Spring</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/full-stack?skill=firebase">Firebase</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/full-stack?skill=typescript">TypeScript</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/mobile-app">모바일 앱 개발</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=ios">iOS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=android">Android</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=swift">Swift</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/mobile-app?skill=google-flutter">Flutter</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=kotlin">Kotlin</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=swift-ui">SwiftUI</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=react-native">React
                              Native</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=firebase">Firebase</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/mobile-app?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/mobile-app?skill=jetpack">Jetpack</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/mobile-app?skill=typescript">TypeScript</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/programming-lang">프로그래밍 언어</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-lang?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-lang?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=c">C</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=c-plus">C++</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=coding-test">코딩
                              테스트</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=oop">객체지향</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=c-sharp">C#</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-lang?skill=swift">Swift</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-lang?skill=typescript">TypeScript</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-lang?skill=algorithm">알고리즘</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-lang?skill=kotlin">Kotlin</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/algorithm">알고리즘 · 자료구조</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=coding-test">코딩 테스트</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=algorithm">알고리즘</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=c-plus">C++</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=c">C</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/algorithm?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/algorithm?skill=operating-system">운영체제</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/algorithm?skill=tech-interview">기술면접</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=oop">객체지향</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=ios">iOS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/algorithm?skill=swift-ui">SwiftUI</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/database-dev">데이터베이스</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=sql">SQL</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/database-dev?skill=rdbms">DBMS/RDBMS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=mysql">MySQL</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/database-dev?skill=data-engineering">데이터 엔지니어링</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=oracle">Oracle</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=ms-sql">MSSQL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=mongodb">MongoDB</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/database-dev?skill=postgresql">PostgreSQL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/database-dev?skill=backend">backend</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/devops-infra">데브옵스 · 인프라</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=aws">AWS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=docker">Docker</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/devops-infra?skill=kubernetes">Kubernetes</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/devops-infra?skill=terraform">Terraform</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=cicd">CI/CD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=msa">MSA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=devops">devops</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/devops-infra?skill=azure">Azure</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/devops-infra?skill=data-engineering">데이터 엔지니어링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/devops-infra?skill=virtualization">가상화</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/sw-test">소프트웨어 테스트</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=software-test">소프트웨어
                              테스트</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=tdd">TDD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=jest">Jest</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=spring">Spring</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=mockito">Mockito</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=cypress">Cypress</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/sw-test?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=j-unit">JUnit</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/sw-test?skill=java-persistence-api">JPA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=react-context">React
                              Context</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/sw-test?skill=coding-test">코딩 테스트</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/programming-tool">개발 도구</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-tool?skill=git">Git</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=github">GitHub</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=version-control-system">버전관리시스템</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-tool?skill=java">Java</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-tool?skill=jira">JIRA</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=project-management">프로젝트 관리</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=intellij">IntelliJ IDEA</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/programming-tool?skill=collaboration-tool">협업 툴</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/programming-tool?skill=linux">Linux</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it-programming/web-publishing">웹 퍼블리싱</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-publishing?skill=jquery">jQuery</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=javascript">JavaScript</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=interactive-web">인터랙티브 웹</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=responsive-web">반응형 웹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-publishing?skill=web-design">웹
                              디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=clone-coding">클론코딩</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-publishing?skill=flex">Flex</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=portfolio">포트폴리오</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-publishing?skill=sass">Sass</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it-programming/web-publishing?skill=gsap">gsap</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it-programming/web-publishing?skill=three-js">Three.js</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/game-dev-all">게임 개발</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/game-dev-all/game-programming">게임 프로그래밍</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=unity">Unity</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=c-sharp">C#</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=unreal">Unreal
                              Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=c-plus">C++</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=blueprint">UE
                              Blueprint</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-programming?skill=%EC%96%B8%EB%A6%AC%EC%96%BC-c-plus-plus">언리얼
                              C++</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=ios">iOS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=opengl">OpenGL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=lua">Lua</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=swift">Swift</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=ucc">UCC</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-programming?skill=c">C</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/game-dev-all/game-manage">게임 기획</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=game-planning">게임기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=unity">Unity</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=c-sharp">C#</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=chatgpt">ChatGPT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=unreal">Unreal
                              Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-manage?skill=game-business-pm">게임사업PM</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=ui">ui</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=ux">ux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=service-planning">서비스
                              기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=roblox">Roblox</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-manage?skill=lua">Lua</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-manage?skill=google-tag-manager">Google Tag Manager</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/game-dev-all/game-art">게임 아트 · 그래픽</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=unreal">Unreal Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=blender">Blender</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=3ds-max">3ds MAX</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=character-design">캐릭터
                              디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-art?skill=3d-modelling">3d-modelling</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=vfx">VFX</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=zbrush">ZBrush</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-art?skill=substance-painter">Substance Painter</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=niagara">Niagara</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=blueprint">UE
                              Blueprint</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-art?skill=3d-rendering">3d-rendering</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-art?skill=substance">substance</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/game-dev-all/game-besides">기타 (게임 개발)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=unreal">Unreal
                              Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=sound-system">음향
                              시스템</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=c-sharp">C#</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=meta-sound">meta
                              sound</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=unity">Unity</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-besides?skill=game-introduction">게임개론</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=music-compose">작곡</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=sound">sound</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-besides?skill=game-planning">게임기획</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-besides?skill=game-engine">game-engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/game-dev-all/game-besides?skill=godot">godot</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/game-dev-all/game-besides?skill=3d-modelling">3d-modelling</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/data-science">데이터 사이언스</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/data-science/data-analysis">데이터 분석</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=sql">SQL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=pandas">Pandas</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=excel">Excel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=r-programming">R</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=web-crawling">웹
                              크롤링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-analysis?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=data-literacy">데이터
                              리터러시</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-analysis?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=rdbms">DBMS/RDBMS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-analysis?skill=mysql">MySQL</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/data-science/data-%08engineering">데이터 엔지니어링</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=data-engineering">데이터 엔지니어링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-%08engineering?skill=sql">SQL</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=apache-kafka">Kafka</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=mongodb">MongoDB</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=rdbms">DBMS/RDBMS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-%08engineering?skill=web-crawling">웹
                              크롤링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=apache-hadoop">Hadoop</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-%08engineering?skill=apache-spark">Apache Spark</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-%08engineering?skill=java">Java</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/data-science/certificate-datascience">자격증 (데이터 사이언스)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=engineer-big-data-analysis">빅데이터분석기사</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=adsp">ADsP</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=sql">SQL</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=pandas">Pandas</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=sqld">SQLD</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=r-programming">R</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=access-data-projects">ADP</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/certificate-datascience?skill=keras">Keras</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/data-science/data-besides">기타 (데이터 사이언스)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=digital-literacy">디지털
                              리터러시</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=resume">이력서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=data-literacy">데이터
                              리터러시</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-besides?skill=career-advice">career-advice</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/data-science/data-besides?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=interview">면접</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=job-analysis">직무분석</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/data-science/data-besides?skill=opencv">OpenCV</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/artificial-intelligence">인공지능</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml">딥러닝 · 머신러닝</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=tensorflow">Tensorflow</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=keras">Keras</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=reinforcement-learning">강화학습</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=neural-network">인공신경망</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=ai">인공지능(AI)</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=cuda">CUDA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=cnn">CNN</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/dl-ml?skill=pytorch">PyTorch</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/artificial-intelligence/dl-ml?skill=pandas">Pandas</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/artificial-intelligence/computer-vision">컴퓨터 비전</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=computer-vision">컴퓨터 비전</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=tensorflow">Tensorflow</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=opencv">OpenCV</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=keras">Keras</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=cnn">CNN</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=pose-estimation">pose-estimation</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=vision-transformer">Vision
                              Transformer</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=object-detection">object-detection</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/computer-vision?skill=gan">gan</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/artificial-intelligence/natural-language-processing">자연어
                          처리</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=chatgpt">ChatGPT</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=nlp">NLP</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=llm">LLM</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=openai">openai</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=prompt-engineering">프롬프트엔지니어링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=langchain">LangChain</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=pytorch">PyTorch</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=tensorflow">Tensorflow</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=streamlit">streamlit</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/natural-language-processing?skill=fine-tuning">Fine-Tuning</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/artificial-intelligence/generative-ai">AI · ChatGPT 활용</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=chatgpt">ChatGPT</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=ai">인공지능(AI)</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=prompt-engineering">프롬프트엔지니어링</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=openai">openai</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=gpt">gpt</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=llm">LLM</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=react">React</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/artificial-intelligence/generative-ai?skill=data-literacy">데이터 리터러시</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/it">보안 · 네트워크</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/it/security">보안</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=penetration-testing">모의해킹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=isms-p">ISMS-P</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=system-hacking">시스템 해킹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=forensic">Forensic</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=security">security</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=malware">악성코드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=reversing">리버싱</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=android">Android</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/security?skill=aws">AWS</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/network">네트워크</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=security">security</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=aws">AWS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=penetration-testing">모의해킹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=protocol">프로토콜</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=spring">Spring</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=can">CAN</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=iot">IoT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=cisco">cisco</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/network?skill=isms-p">ISMS-P</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/system">시스템</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=operating-system">운영체제</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=shell-script">Shell Script</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=c">C</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=security">security</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=penetration-testing">모의해킹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=com-archi">컴퓨터 구조</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/it/system?skill=assembly-language">assembly-language</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=powershell">Powershell</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=virtualization">가상화</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/system?skill=system-hacking">시스템 해킹</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/cloud">클라우드</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=aws">AWS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=kubernetes">Kubernetes</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=docker">Docker</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=azure">Azure</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=gcp">Google Cloud Platform</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=cloud-computing">cloud-computing</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=terraform">Terraform</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=serverless">서버리스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=cicd">CI/CD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=msa">MSA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/cloud?skill=devops">devops</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/blockchain">블록체인</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=blockchain">블록체인</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=dapp">DApp</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=etherium">Ethereum</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=nft">NFT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=solidity">Solidity</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=smart-contract">Smart Contract</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=truffle">Truffle</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=mongodb">MongoDB</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=web3">web3</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=go">Go</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=metaverse">메타버스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/blockchain?skill=web-app">웹앱</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/certificate-security">자격증 (보안 · 네트워크)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=isms-p">ISMS-P</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=security">security</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=forensic">Forensic</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=aws">AWS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=cppg">CPPG(개인정보관리사)</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=azure">Azure</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=cisco">cisco</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=protocol">프로토콜</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=devops">devops</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=ccna">CCNA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/certificate-security?skill=privacy">privacy</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/it/it-besides">기타 (보안 · 네트워크)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=ccna">CCNA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=iot">IoT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=cisco">cisco</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=azure">Azure</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=cheat-engine">Cheat Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=frida">Frida</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=platform">플랫폼 비즈니스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/it/it-besides?skill=engineer-info-process">정보처리기사</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/business">비즈니스 · 마케팅</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/business/office">오피스</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=excel">Excel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=powerpoint">PowerPoint</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=business-productivity">업무
                              생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=presentation">프레젠테이션</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=ms-teams">Teams</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=project-management">프로젝트 관리</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=google-spreadsheets">Google
                              Sheets</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=word">Word</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=vba">VBA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=power-query">Excel
                              PowerQuery</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/office?skill=hancom">한컴오피스</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/marketing">마케팅</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=digital-marketing">디지털
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=contents-marketing">콘텐츠
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=performance-marketing">퍼포먼스
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=marketing-theory">마케팅 이론</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=google-analytics">Google
                              Analytics</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=growth-hacking">그로스해킹</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=ga4">GA4</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=copywriting">카피라이팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/marketing?skill=%EB%B8%8C%EB%9E%9C%EB%93%9C%EB%A7%88%EC%BC%80%ED%8C%85">브랜드
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=blog">블로그</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/marketing?skill=facebook-advertise">Facebook
                              Ads</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/project-manage">기획 · 전략 · PM</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=service-planning">서비스
                              기획</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/project-manage?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=project-management">프로젝트
                              관리</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=ux-planning">UX 기획</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/project-manage?skill=planning-document">기획서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=ux-research">UX 리서치</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=ux">ux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=collaboration-tool">협업
                              툴</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=presentation">프레젠테이션</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=data-literacy">데이터
                              리터러시</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=prototyping">프로토타이핑</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/project-manage?skill=figma">Figma</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/task-automation">업무 자동화</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=excel">Excel</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/task-automation?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=web-crawling">웹 크롤링</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=chatgpt">ChatGPT</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/task-automation?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=rpa">RPA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=selenium">Selenium</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=vba">VBA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=power-automate">Power
                              Automate</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/task-automation?skill=ai">인공지능(AI)</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/task-automation?skill=google-spreadsheets">Google Sheets</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/management">경영</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=management">경영노하우</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=accounting">회계</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=financial-management">재무</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=service-planning">서비스 기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=reading-method">독서법</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=marketing-theory">마케팅 이론</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=planning-document">기획서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=contents-marketing">콘텐츠
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=history">history</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=platform">플랫폼 비즈니스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=business-plan">사업계획서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/management?skill=human-resource">HR</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/certificate-office">자격증 (비즈니스 · 마케팅)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=itq">ITQ</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=computer-specialist">컴퓨터활용능력</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=excel">Excel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=engineer-big-data-analysis">빅데이터분석기사</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=accounting">회계</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=computerized-tax-accounting">전산세무회계</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=hancom">한컴오피스</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=%EC%84%9C%EB%B9%84%EC%8A%A4%EA%B4%80%EB%A6%AC">IT
                              서비스 관리</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/certificate-office?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/certificate-office?skill=machine-learning">머신러닝</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/business/business-besides">기타 (비즈니스 · 마케팅)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=english">영어</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/business-besides?skill=communication">커뮤니케이션</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/business-besides?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=service-planning">서비스
                              기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=notion">Notion</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/business-besides?skill=computer-specialist">컴퓨터활용능력</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/business-besides?skill=presentation">프레젠테이션</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/business/business-besides?skill=project-management">프로젝트 관리</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=metaverse">메타버스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=collaboration-tool">협업
                              툴</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=speech">스피치</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/business/business-besides?skill=relationship">대인관계</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/hardware">하드웨어</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/hardware/computer-architecture">컴퓨터 구조</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/hardware/computer-architecture?skill=com-archi">컴퓨터
                              구조</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=operating-system">운영체제</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/computer-architecture?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=linux-kernel">linux-kernel</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=arm-architecture">ARM Architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/computer-architecture?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/computer-architecture?skill=cpu">cpu</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=assembly-language">assembly-language</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=computer-science">computer-science</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/computer-architecture?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/computer-architecture?skill=verilog-hdl">Verilog HDL</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/embedded-iot">임베디드 · IoT</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=fpga">FPGA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=arduino">Arduino</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=verilog-hdl">Verilog
                              HDL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=iot">IoT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=arm-architecture">ARM
                              Architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=can">CAN</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=cortex-a">cortex-a</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/embedded-iot?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/embedded-iot?skill=linux-kernel">linux-kernel</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/semiconductor">반도체</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=fpga">FPGA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=verilog-hdl">Verilog
                              HDL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=arm-architecture">ARM
                              Architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/semiconductor?skill=linux-kernel">linux-kernel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=cortex-a">cortex-a</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/semiconductor?skill=operating-system">운영체제</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/semiconductor?skill=verilog">verilog</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/semiconductor?skill=memory-management">memory-management</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/semiconductor?skill=microblaze">MicroBlaze</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/robotics">로봇공학</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=linux">Linux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=matlab">MATLAB</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=linear-algebra">선형대수학</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=arm-architecture">ARM
                              Architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/robotics?skill=memory-management">memory-management</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=linux-kernel">linux-kernel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=robotics">robotics</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/robotics?skill=interrupt-handling">interrupt-handling</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/robotics?skill=kalman-filter">kalman-filter</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/robotics?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/robotics?skill=context-switching">context-switching</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/mobility">모빌리티</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=can">CAN</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=uds">uds</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=arm-architecture">ARM
                              Architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=iot">IoT</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=canoe">CANoe</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=virtualization">가상화</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=autonomous-driving">자율주행</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=raspberry-pi">Raspberry Pi</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/mobility?skill=linux">Linux</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/certificate-hardware">자격증 (하드웨어)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">

                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/hardware/hardware-besides">기타 (하드웨어)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/hardware-besides?skill=cpu-architecture">cpu-architecture</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/hardware-besides?skill=iec61131-3">iec61131-3</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=verilog-hdl">Verilog
                              HDL</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=plc">plc</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/hardware-besides?skill=connector">connector</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/hardware-besides?skill=digital-signal-processing">digital-signal-processing</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/hardware/hardware-besides?skill=terminals">terminals</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=armv7">armv7</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=circuit">circuit</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=armv8">armv8</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=embedded">임베디드</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/hardware/hardware-besides?skill=arm-architecture">ARM
                              Architecture</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/design">디자인</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/design/3d-modeling">CAD · 3D 모델링</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=blender">Blender</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/3d-modeling?skill=3d-modelling">3d-modelling</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=cad">CAD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=rhino">Rhino</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=autocad">AutoCAD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=cinema4d">Cinema 4D</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/3d-modeling?skill=3d-rendering">3d-rendering</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=maya">MAYA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=3ds-max">3ds MAX</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=siemens-nx">Siemens NX</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=catia">Catia</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/3d-modeling?skill=3d">3d</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/ux-ui">UX/UI</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=figma">Figma</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=ux-planning">UX 기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=app-design">모바일 디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=service-planning">서비스 기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=ux-research">UX 리서치</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=ux">ux</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=prototyping">프로토타이핑</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=web-design">웹 디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=adobe-xd">XD</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=design-system">디자인 시스템</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=portfolio">포트폴리오</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/ux-ui?skill=user-interviews">사용자 인터뷰</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/graphic-design">그래픽 디자인</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=photoshop">Photoshop</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=figma">Figma</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=blender">Blender</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=app-design">모바일 디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/graphic-design?skill=3d-modelling">3d-modelling</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/graphic-design?skill=illustrator">Illustrator</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/graphic-design?skill=3d-rendering">3d-rendering</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=web-design">웹 디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=drawing">드로잉</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=prototyping">프로토타이핑</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=maya">MAYA</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/graphic-design?skill=character-design">캐릭터
                              디자인</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/video-editing">사진 · 영상</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=video-production">영상제작</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=aftereffect">After
                              Effects</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=premiere">Premiere Pro</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=photography">사진</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=youtube-creator">유튜브</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=motion-graphic">모션그래픽</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=davinci-resolve">Davinci
                              Resolve</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=finalcut">Final Cut Pro</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=photoshop">Photoshop</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/video-editing?skill=lightroom">Lightroom</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/video-editing?skill=3d-modelling">3d-modelling</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/video-editing?skill=3d-rendering">3d-rendering</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/certificate-design">자격증 (디자인)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=html-css">HTML/CSS</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=web-design">웹 디자인</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=jquery">jQuery</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/certificate-design?skill=%EC%A0%84%EC%82%B0%EC%9D%91%EC%9A%A9%EA%B1%B4%EC%B6%95%EC%A0%9C%EB%8F%84%EA%B8%B0%EB%8A%A5%EC%82%AC">전산응용건축제도기능사</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/certificate-design?skill=photoshop">Photoshop</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/certificate-design?skill=autodesk-inventor">Inventor</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=autocad">AutoCAD</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/certificate-design?skill=cloud-computing">cloud-computing</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=network">네트워크</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=azure">Azure</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/certificate-design?skill=cad">CAD</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/sound">사운드</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/sound?skill=music-compose">작곡</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/sound?skill=sound-system">음향 시스템</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/sound?skill=studio-one">Studio One</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/design/creative-besides">기타 (디자인)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=ucc">UCC</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=metaverse">메타버스</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=lua">Lua</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=unreal">Unreal
                              Engine</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=blender">Blender</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=roblox">Roblox</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=vfx">VFX</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=niagara">Niagara</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/design/creative-besides?skill=3d">3d</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/creative-besides?skill=3d-modelling">3d-modelling</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/creative-besides?skill=3d-rendering">3d-rendering</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/design/creative-besides?skill=3d-modeling">3d-modeling</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/academics">학문 · 외국어</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/academics/math">수학</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=statistics">통계</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=linear-algebra">선형대수학</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=integral-differential">미적분</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=probability-and-statistics">확률과
                              통계</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=machine-learning">머신러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=deep-learning">딥러닝</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=procession">행렬</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=python">Python</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/math?skill=%EB%8C%80%EC%88%98%ED%95%99">대수학</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=game-math">게임수학</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=r-programming">R</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/math?skill=latex">LaTeX</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/academics/foreign-language">외국어</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=english">영어</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=opic">OPIc</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=toeic">TOEIC</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=toeic-speaking">TOEIC
                              Speaking</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/foreign-language?skill=communication">커뮤니케이션</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=chinese">중국어</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=japanese">일본어</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=spanish">스페인어</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/foreign-language?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=online-education">온라인
                              교육</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=resume">이력서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/foreign-language?skill=sat">SAT</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/academics/academic-besides">기타 (학문 · 외국어)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=online-education">온라인
                              교육</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=logic">logic</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/academic-besides?skill=google-tag-manager">Google Tag Manager</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/academic-besides?skill=self-improvement">자기계발</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=dt">dt</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/academic-besides?skill=flowchart">flowchart</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/academic-besides?skill=business-plan">사업계획서</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/academics/academic-besides?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=english">영어</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=japanese">일본어</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=economics">경제학</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/academics/academic-besides?skill=latex">LaTeX</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <li>
                    <a class="navbar-item" href="/courses/career">커리어</a>

                    <ul class="navbar-dropdown is-boxed step_menu step_2">
                      <li>
                        <a class="navbar-item" href="/courses/career/get-jobs">취업 · 이직</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=interview">면접</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=resume">이력서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=portfolio">포트폴리오</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=service-planning">서비스 기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=tech-interview">기술면접</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=bigdata">빅데이터</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=job-analysis">직무분석</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=communication">커뮤니케이션</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=self-improvement">자기계발</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=business-productivity">업무
                              생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=project-management">프로젝트 관리</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/get-jobs?skill=computer-specialist">컴퓨터활용능력</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/career/personal-branding">개인 브랜딩</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=writing">집필</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=book-pub">출간, 출판</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/personal-branding?skill=self-improvement">자기계발</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=contents-marketing">콘텐츠
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/personal-branding?skill=presentation">프레젠테이션</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=speech">스피치</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=relationship">대인관계</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=notion">Notion</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=public-relation">PR</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/personal-branding?skill=video-production">영상제작</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/personal-branding?skill=business-productivity">업무 생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/personal-branding?skill=management">경영노하우</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/career/business-start-up">창업</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=management">경영노하우</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=digital-marketing">디지털
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=monetization">수익화</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=smart-store">스마트스토어</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/business-start-up?skill=business-plan">사업계획서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=service-planning">서비스
                              기획</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/business-start-up?skill=self-improvement">자기계발</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=history">history</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=chatgpt">ChatGPT</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/business-start-up?skill=planning-document">기획서</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=figma">Figma</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/business-start-up?skill=contents-marketing">콘텐츠
                              마케팅</a>
                          </li>
                        </ul>
                      </li>
                      <li>
                        <a class="navbar-item" href="/courses/career/career-besides">기타 (커리어)</a>
                        <ul class="navbar-dropdown is-boxed step_menu step_3">
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=interview">면접</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/career-besides?skill=computer-specialist">컴퓨터활용능력</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=ms-office">MS-Office</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=digital-marketing">디지털
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=communication">커뮤니케이션</a>
                          </li>
                          <li>
                            <a class="navbar-item"
                              href="/courses/career/career-besides?skill=engineer-info-process">정보처리기사</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=business-productivity">업무
                              생산성</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=service-planning">서비스
                              기획</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=writing">집필</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=excel">Excel</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=contents-marketing">콘텐츠
                              마케팅</a>
                          </li>
                          <li>
                            <a class="navbar-item" href="/courses/career/career-besides?skill=blog">블로그</a>
                          </li>
                        </ul>
                      </li>
                    </ul>

                  </li>
                  <hr class="navbar__course-type-separator">

                  <li>
                    <a class="navbar-item navbar-item--offline"
                      href="courses-1.html?order=seq&amp;types=CONFERENCE,CLASS">
                      <i class="category-icon fa-light fa-calendar-clock"></i>
                      <span> 모임/부트캠프 </span>
                      <i class="fa-regular fa-chevron-right navbar-item__icon--chevron"></i>
                    </a>
                  </li>

                  <li>
                    <a class="navbar-item navbar-item--offline" href="tag-curation/common_tag/kdt.html">
                      <i class="category-icon fa-graduation-cap fa-light"></i>
                      <span> 국비 취업과정 </span>
                      <i class="fa-regular fa-chevron-right navbar-item__icon--chevron"></i>
                    </a>
                  </li>

                </ul>
              </div>
              <div class="navbar-item">
                <a href="roadmaps.html" class="navbar-item"><span>로드맵</span></a>
              </div>
              <div class="navbar-item">
                <a href="mentors.html" class="navbar-item"><span>멘토링</span></a>
              </div>

              <div class="has-dropdown is-hoverable navbar-item  icon_drop_menu">
                <a href="community/questions.html" class="navbar-item "><span>커뮤니티</span></a>
                <div class="navbar-dropdown is-boxed is-right">

                  <a class="navbar-item " href="community/questions.html">
                    <span class="icon"><i class="fal fa-comment-alt-edit"></i></span> <span class="name">질문 &amp;
                      답변</span>

                  </a>

                  <a class="navbar-item " href="community/chats.html">
                    <span class="icon"><i class="fal fa-comment-alt-dots"></i></span> <span class="name">고민있어요</span>

                  </a>

                  <a class="navbar-item " href="community/studies.html">
                    <span class="icon"><i class="fal fa-book-open"></i></span> <span class="name">스터디</span>

                  </a>

                  <a class="navbar-item " href="community/projects.html">
                    <span class="icon"><i class="fal fa-laptop-code"></i></span> <span class="name">팀 프로젝트</span>

                  </a>

                  <a class="navbar-item " href="community/reviews.html">
                    <span class="icon"><i class="fal fa-star"></i></span> <span class="name">수강평</span>

                  </a>

                  <a class="navbar-item " href="community/mentorings-reviews.html">
                    <span class="icon"><i class="fal fa-lightbulb-on"></i></span> <span class="name">멘토링 후기</span>

                  </a>

                </div>

              </div>

            </div>
            <div class="navbar-right">

              <div class="search search_bar navbar-item header_search header_search--gnb">
                <label class="visually-hidden" for="searchbar-input">통합 검색</label>
                <input type="text" id="searchbar-input" enterkeyhint="go" class="input" placeholder=""
                  data-kv="headerSearchWord">
                <span class="search__icon e-header-search"><i class="far fa-search"></i></span>
              </div>

              <div v-if="memberStore.isLogin == false" class="navbar-item buttons">
                <button @click="loginModalActiveStore.toggleLogin" type="button"
                  class="button space-inset-4 signin">로그인</button>
                <button type="button" class="e-signup button space-inset-4 is-primary">회원가입</button>
              </div>
              <template v-else>
                <div @click="logout()" class="navbar-item">
                  
                    로그아웃
                  
                </div>
                <div class="navbar-item navbar-item-icon">
                  <span class="icon_hoverble cart_hoverable">
                    <button class="el cart_modal_btn e_cart_modal_btn nav-modal-btn e-nav-modal-btn">

                      <a href="/carts" class="icon_cover gnb-cart">
                        <span class="icon"><i class="fal fa-shopping-cart"></i></span>
                        <span class="e-gnb-cart-badge"></span>
                      </a>
                      <a href="/carts" class="icon_cover is_active gnb-cart">
                        <span class="icon"><i class="fas fa-shopping-cart"></i></span>
                        <span class="e-gnb-cart-badge"></span>
                      </a>
                    </button>
                    <div class="cart_modal_cover has_bubble e-nav-modal-cover">
                      <div class="cart_modal">
                        <section class="cart_modal__header">
                          <h2 class="cart_modal__header__title">수강바구니 <span class="cart_modal__header__count">0</span>
                          </h2>
                          <span class="cart_modal__header__summary">총 결제금액<strong
                              class="cart_modal__header__price">0</strong>원</span>
                        </section>
                        <section class="cart_modal__body" fxd-data="IN_WEAK_MAP">
                          <div class="cart_modal__placeholder">
                            <p class="cart_modal__placeholder__header">담긴 강의가 없습니다.</p>
                            <p class="cart_modal__placeholder__desc">나를 성장 시켜줄 좋은 지식들을 찾아보세요.</p>
                            <a href="/courses">

                              <button
                                class="ac-button is-md is-outlined is-primary cart_modal__placeholder__button e-cart-course-list-button ">강의리스트
                                보기</button>
                            </a>
                          </div>
                        </section>

                        <section class="cart_modal__footer visually-hidden">
                          <a href="/carts">

                            <button
                              class="ac-button is-md is-solid is-primary cart_modal__footer-link e-cart-total-button "
                              style="min-width: 100%">수강바구니에서 전체보기</button>
                          </a>
                          <div class="cart_modal__button-layer"></div>
                        </section>
                      </div>
                    </div>
                  </span>
                </div>
                <div class="navbar-item navbar-item-icon">
                  <span class="icon_hoverble profile_hoverable">
                    <button class="profile_modal_btn nav-modal-btn e-desktop-header-profile-image-container">
                      <span class="cover">
                        <span class="profile_cover thumbnail"><img
                            src="https://cdn.inflearn.com/public/main/profile/default_profile.png"
                            alt="profile_img"></span>
                        <span class="new-message-mark"></span>
                      </span>
                    </button>
                    <div class="profile_modal_cover has_bubble nav-modal-cover e-profile-modal-cover">

                      <div class="profile_modal">
                        <div class="close_content">
                          <span class="e_close_btn" data-type="close"> <span class="icon"><i
                                class="fal fa-times"></i></span> </span>
                          <a class="message-icon-cover" href="/user/messages">
                            <span class="icon"><i class="fal fa-bell"></i></span> <span
                              class="new-message-mark"></span></a>
                        </div>
                        <div class="info_content">
                          <div class="top_content">
                            <div class="user_content">
                              <div class="left_content">
                                <div class="thumbnail">
                                  <img src="https://cdn.inflearn.com/public/main/profile/default_profile.png"
                                    alt="profile_img" class="e-profile-image-popover"><a
                                    href="/user/settings/account">설정</a>
                                </div>
                              </div>
                              <div class="right_content">
                                <a href="/users/1354061">
                                  <span class="name"><i class="fad fa-home"></i>따라학IT</span>
                                  <span class="icon"><i class="fas fa-chevron-right"></i></span></a>
                                <div class="policy profile__role">
                                  <span>학생</span>
                                </div>
                              </div>
                            </div>
                            <div class="message_list_anchor_wrapper">
                              <a href="/user/messages" class="message_list_anchor e-message-list-anchor"
                                aria-label="알림 페이지">
                                <i aria-hidden="true" class="fa-light fa-bell">
                                  <span class="new-message-mark"></span>
                                </i>
                              </a>
                            </div>
                          </div>
                          <div class="point_content">
                            <a href="/user/coupons" class="coupon point_box">
                              <span class="title">쿠폰</span>
                              <span class="content"><span class="value">0</span>개</span>
                            </a>
                            <a href="/user/points" class="mileage point_box">
                              <span class="title">포인트</span>
                              <span class="content"><span class="value">0</span>잎</span>
                            </a>
                          </div>
                        </div>

                        <div class="menu_content">
                          <div class="tab_content">

                            <span class="tab_menu active" data-id="0">
                              학생
                            </span>

                          </div>
                          <div class="list_content">

                            <div class="tab_list active" data-id="0">

                              <div class="list_el ">
                                <a href="/user/courses" class="title e-go_my_courses"> <span class="icon"><i
                                      class="fal fa-books"></i></span> <span class="name">내 학습</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/roadmaps/enrolled" class="title e-go_my_courses"> <span class="icon"><i
                                      class="fal fa-route"></i></span> <span class="name">내 로드맵</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/courses?charge=free&amp;order=seq" class="title "> <span class="icon"><i
                                      class="fal fa-search-location"></i></span> <span class="name">추천 강의 찾기</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/dashboard" class="title "> <span class="icon"><i
                                      class="fal fa-chart-pie"></i></span> <span class="name">대시보드</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/orders" class="title "> <span class="icon"><i
                                      class="fal fa-receipt"></i></span> <span class="name">구매 내역</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/notes" class="title "> <span class="icon"><i
                                      class="fal fa-pen-to-square"></i></span> <span class="name">강의노트</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/mentorings" class="title "> <span class="icon"><i
                                      class="fal fa-lightbulb-on"></i></span> <span class="name">멘토링 신청 내역</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/posts" class="title "> <span class="icon"><i
                                      class="fal fa-comment-alt-edit"></i></span> <span class="name">작성한 게시글</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/inquiries" class="title "> <span class="icon"><i
                                      class="fal fa-question-circle"></i></span> <span class="name">수강전 문의</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/likes" class="title "> <span class="icon"><i
                                      class="fal fa-heart"></i></span> <span class="name">좋아요</span> </a>
                              </div>

                              <div class="list_el ">
                                <a href="/user/settings/account" class="title "> <span class="icon"><i
                                      class="fal fa-gear"></i></span> <span class="name">설정</span> </a>
                              </div>

                            </div>

                          </div>
                        </div>

                        <div class="footer_content">
                          <span class="left_content">
                            <a href="/user/signout" class="link e-logout">로그아웃</a>
                          </span>
                          <span class="right_content">
                            <span class="link"><a href="/faq" class="link">고객센터</a><span class="icon"><i
                                  class="fal fa-chevron-right"></i></span></span>
                          </span>
                        </div>
                      </div>
                    </div>
                  </span>
                </div>
              </template>






            </div>
          </div>
        </div>
      </div>
    </nav>
  </header>
</template>

<script>
import { mapStores } from 'pinia'
import { useMobileAsideActiveStore } from '@/stores/useMobileAsideActiveStore';
import { useLoginModalActiveStore } from '@/stores/useLoginModalActiveStore';
import { useMemberStore } from '@/stores/useMemberStore';

export default {
  name: 'HeaderComponent',
  computed: {
    ...mapStores(useMobileAsideActiveStore),
    ...mapStores(useLoginModalActiveStore),
    ...mapStores(useMemberStore),
  },methods: {
        async logout() {
          this.memberStore.logout();
        }
    }
}
</script>

<style scoped></style>