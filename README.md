# web-backend
with java  
[부스트코스 웹 백엔드 강좌의 프로젝트를 구현합니다.](https://www.boostcourse.org/web326/joinLectures/28762)

<br>

#### 개발환경
- java 13.0.2
- mysql 8.0.22
- eclipse 2020-09 (4.17.0)
- tomcat 8.5

<br>

### project A : 명함 관리 프로그램

- JDBC 프로그래밍으로 BusinessCardManagerDao 를 구현
- 테이블 생성 스크립트 ddl.sql

<br>

CLI 프로그램 실행 화면  

![main program](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbYkCjy%2FbtqTV8qJUZu%2FczeqFeXuFW9QyqQ5bp4Ev1%2Fimg.png)

생성한 project_a db에도 데이터 삽입이 잘 되었음  

![db](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fc7U0JX%2FbtqTNBAylYi%2FGkq1lmkfq3F2cye4en4m2k%2Fimg.png)

<br>

### project B : 방명록 만들기

- Servlet, JSP, JSTL & EL, JDBC 를 이용한 방명록 웹 어플리케이션  
- 초기 화면에서 게시글을 등록할 때마다 페이지 리디렉트  
- form 으로 입력값 가져올 때 한글 인코딩 필요함 (가장 시간을 많이 소요한 부분)  

<br>

로컬 테스트 화면   

![초기화면](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FkzsUM%2FbtqW4hqkSFW%2F1gTQqc46GYnlFh7IjCMee0%2Fimg.png)

![게시글 작성 후](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbGCc0q%2FbtqWVRNgY4k%2FPvk75yqKbWHzrkgIfcwXp0%2Fimg.png)
