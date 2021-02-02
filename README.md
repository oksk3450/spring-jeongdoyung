헤로쿠
- 작업순서1 : html만들고, 더미데이터 생성.
- 작업순서2 : body에서 레이아웃을 3가지 영역분리 header, section, footer.
- 작업순서3 : header영역의 3가지영역(로고, 햄버거메뉴, 글로벌네비메뉴)를 배치작업중
- 작업순서4 : 로고의 세부영역 디자인
- 작업순서5 : 햄버거메뉴 영역의 세부디자인.
- 작업순서6 : 글로벌네비메뉴 영역의 세부디자인.
- 작업순서7 : 자바스크립트로 햄버거메뉴의 토글기능 구현.
- 작업순서8 : 본문 section영역 세부디자인(슬라이드부분)
- 작업순서9 : footer 영역 세부 디자인.
- 작업순서10 : 마무리. home(index.html)메뉴의 작업테스트 확인.
아키텍쳐(스키마) : 콤포너트(플러그인-외부모듈)를 조합해서 프로그램을 만든 것을 말함.
프로젝트 마무리할 때 완료보고서중 아키텍처 구조도엑셀파일을 이력서 작성시 포트폴리오로 제출.
UI의 흐름 : 메뉴(링크) 구조도(필요한 정보를 찾기 쉽게).
reset.css : 크로스브라우징처리(IE와, 크롬, 파이어폭스, 사파리 등등 모든 브라우저에 공통으로 보이게 하는 목적)
카카오오븐 회원가입 후 로그인 미리 확인.
NCS학습모듈로 이론수업
카카오오븐 https://ovenapp.io/에서, 화면설계실습.
목적은: 카카오오븐 툴 사용해서, 화면 레이아웃(와이어프레임)을 만드는 것이목적
위 와이어프레임을 기준으로 V3.0.0에서는 html5+J쿼리자바스크립트를 이용해서 반응형웹페이지 제작.
깃 사용하기 위해서 git scm설치한 것처럼, cf(클라우드 파운드리) cli 프로그램 설치가 필요합니다.
헤로쿠는 깃과 바로 연동되는 것이 장점.
파스타는 이클립스와 바로 연동되는 것이 장점.
분석한 내용은 컨트롤러 단에서 시간데이터 조작한 내용을 뷰단으로 자료전송해서 출력한 예를 분석해 보았습니다.
로그를 콘솔에 출력 : Logger(클래스명-데이터타입) logger(변수명) = 실행대상이 되는 클래스를 지정;
예를 들면, int(데이터타입) age(변수명) = 30;
위처럼 변수를 선언하고, 로그를 사용할려고, logger 변수를 만듬
로그출력 사용예 : logger.info("출력할 내용...");
edu데이터베이스에 address2테이블 제작
물리데이터베이스에 테이블이 1개 추가되었으니, ERD모델에도 테이블 추가된것을 반영하기
물리테이블 추가된 것을 반영하기 위해서 ERD모델에서 싱크(동기화) 시킴
과제물제출 50점
서술형시험 50점
20201116(월) 작업예정
HomeController.java 분석 후 수정
파스타 클라우드에 스프링MVC프로젝트 올리기 후 도메인으로 접속 확인
스프링 MVC구조 중 Controller단 HomeController.java 클래스를 분석
========================================
HomeController 분석. MVC구조중 컨트롤러단 분석(아래)
클래스 특징 : 클래스 이름은 대문자로 시작하는 규칙
이름의 특징 : 낙타등표기법=카멜표기법을 사용 Home+Controller
클래스의 MVC종류 역할 표시 : 아래 3가지 컴포넌트(복합기능)
@controller : 지시자 아래 클래스는 컨트롤러 역할
@Service : 지시자 아래 클래스는 프로그램서비스 구현 역할
@Repository : 지시자는 데이터베이스 Model을 조작하는 역할
참고로, html주석은; <!-- 주석내용 -->
자바 주석 : 2가지(아래)
1줄 주석 : //로 시작
여러줄 주석: /*...*/
import : 임포트지시어 외부 라이브러리(모듈)클래스 사용 목적
추가로 @import는 jsp에서 외부 라이브러리(모듈)클래스를 사용할때 사용
개발자가 import 하는것이 아닌 이클립스가 자동으로 시켜줌
package : 패키지(묶음, 짐보따리) 자바소스코드(클래스)를 관리하기 위해서 만든 영역(도메인 구조와 유사.
http://controller.edu.org > org.edu.controller)
org.edu.controller 클래스를 초기에 프로젝트 생성
java폴더클래스루트
java.폴더안. org폴더안. edu폴더안. controller폴더 안쪽에 자바소스코드(자바클래스파일)이 생성
자바클래스는 개발자가 만듬(백엔드)
========================================
스프링 MVC구조 중 View단 home.jsp 화면 분석(프론트엔드)
프론트엔드에서 제작한 html 디자인파일 개발자가 jsp파일로 프로그램을 입힘
Java(자바) : 오라클에서 제작한(라이센스가 있는) 프로그래밍 언어.
========================================
라이센스(저작권)
GNU : GNU = Not Unix
유닉스 OS는 비싸서 거부감이 듬
LGPL : General Purpose License(일반목적의 라이센스) 공개 라이센스
MIT라이센스 : Mit공대에서 만든 라이센스
비영리, 영리 구분없이 쓸수 있는 유연성있는 라이센스
jsp(Java Server Page) : 스프링 MVC프로젝트 신규생성시 기본 출력
<%....%> : jsp파일에서 자바프로그램을 사용할때
@ : 애노테이션 페이지 지시자(어) 페이지 인코딩(한글처리)
<%@ taglib 애노테이션 태그라이브러리 지시자
taglib = url("외부자바프로그램용 태그를 가져다가 사용할 주소")
prefix(접두사-축약어) = "C"
<%@page session 세션 : 로그인 상태를 유지할때 사용
원래 웹페이지는 페이지 이동시 로그인(변수) 정보가 사라짐
기본은 session = "true" (세션변수를 사용하겠다는 의미, 기본값) false라면 반대
태그 : html 정보 태그
<html><head></head><p>서버시간...</p></body></html>
가격표태그(정보), 타이틀태그(정보), 바디태그(본문정보), P태그(패러그래프-문단정보)
1. 헤로쿠에서는 HSq1 메모리 데이터베이스 사용(내용 원상복귀)
보통 솔루션은 데모페이지에 자료등록 가능
2. 파스타에서는 Mysq1 데이터베이스 사용(내용 유지)
1. 이클립스에서 학생명의 프로젝트 소스수정 + 기능추가
2. 이클립스 수정한 결과, Run on Server로 톰캣에서 확인 http://localhost:8080/
3. 깃에 푸시.
4. 헤로쿠에서 Deploy Branch(깃브랜치) 클릭 > 깃소스 > 클라우드로 배포
5. 헤로쿠에서 OpenApp 버튼 https://학생명.herokuapp.com/ (나중에 이력서 포트폴리오 주소)
- 박재형(OK),  정동규(OK), 정도영(OK)
- 박정수(구름클라우드-리눅스명령어실행), 
- 이찬홍(구름클라우드-리눅스명령어실행),
- 임송하(구름클라우드-리눅스명령어실행),
- 배경득(구름클라우드-리눅스명령어실행),
- 김다혜(구름클라우드-리눅스명령어실행)
- C언어 하실 때, 구름IDE 클라우드에서 C언어로 구구단, 은행입출금 프로그램 제작예정.
- Virtualization Technology [disabled] 찾으셔서, 바꾸고 저장.
- > [enabled] 바꾸시고, [F10] 저장후 재부팅
- vt 설정않되신분은 https://www.osboxes.org/ubuntu/ 에서 
- Ubuntu 16.04.6 Xenial 32bit 다운받으신 후 같이 진행 하십니다.
- 안드로이드 앱 하실때, 같은 문제가 발생하시는데, 
- 마지막 달 학원에서 수업하시게 되니 괜찮을겁니다.
- VT 않되시는 분은 3차 방법으로 수업가능합니다. 염려하실 필요 없습니다.

- 우분투 16.04.6 버전의  vdi(버추어 디스크 이미지) 저장했습니다.
- 앞으로도 프로그램 관련해서는 한글폴더에 저장위치를 잡으시면 않됩니다.
- http://blog.daum.net/web_design (강사 블로그)
- 호스트OS: 윈도 7, 10 <- 버추얼박스: 가상화장치 -> 게스트OS: 우분투(리눅스)
- v1.0.0 : 버전v 1(메이저버전).0(마이너버전).0(소버전)
- egov 3.9.0 버전을 설치해서 자바 스프링 프로젝트를 개발예정.
- 용어에 익숙해 지도록하기 위해서 설명 드리고 있습니다.
- 지금 1단원 하고 있습니다. 이론 마치고, 집PC로 실습진행예정.
- 실습진행: 버추얼박스설치 > 우분투실행 > 리눅스명령어 실행실습
- 클라우드: 가상화기반의 서비스 3가지(아래).
- IaaS(아이아스, 이아스): 인프라 as A 서비스.  오픈스택
- PaaS(파스): 플랫폼 as A 서비스. 한국정화진흥원의 파스타,속도빠름
- 파스타 단점은, 1년 1번은 초기화 됩니다. 클라우드 4G까지 무료지원
- 헤로쿠(Heroku)클라우드: 5개 프로젝트 까지는 무료.단, 속도가 느림
- SaaS(사스): 소프트웨어 as A 서비스. 구글 문서, 프레젠테이션, 스프레드시트
- IaaS(인프라-서버) > PaaS(인프라+개발자) > SaaS(개발자)
- 프로세서: 1개 프로그램과 동일.
- =실행중인프로그램=인스턴스(자바)=오브젝트(자바)=스레드(자바)
- 애플리케이션Application(PC 용) = 앱App (모바일용)
- 서술형시험은 오픈북 이니까 부담없이 보시면 됩니다.
- : 콜론,  ;세미콜론=함수종료,한줄 종료,  :  ;  ,
- 키:값 배열변수 예, var member = [
			{name : "김일국" , gender : "남자"},
			{name : "이병현" , gender : "남자"},
			{name : "남가인" , gender : "여자"}
		];

```
- 출력: member[0][name] => "김일국";
- 출력: member[1][name] => "이병현";
- 출력: member[2][name] => "남가인";
```

- 윈도하단 작업표시줄>오른쪽버튼>작업관리자
- 위 작업관리자>세부설정>우선순위설정(프로그램우선순위)
- GUI: 그래픽유저인터페이스, 탐색기(윈도)
- CLI: 커맨드라인인터페이스, 명령프롬프트(윈도), 배시쉘(리눅스)
디지털컨버전스반
강사: 김일국 (010-8175-6075)
이메일: boramcom@daum.net
IT강의저장소: https://github.com/miniplugin/human
실습은 학원PC에서 하지 못하시는 관계로
여러분 집에 있는 PC로 실습을 진행하시게 됩니다.
- 거의 인터넷 강의하고 비슷하게 진행됩니다.
- 줌으로 실습을 하시니까, 바로 피드백합니다.
- 속도가 느리게 됩니다.
- 대략 1달 정도 후에 학원에 출근하실때,
- 학원PC 작업하실때, 집에 있는 개발 PC환경설정을
- 한번 더 하시게 됩니다.
- 작업결과는 깃허브에 푸시(업로드)해서, 소스관리하게 됩니다.
- Github:  VCS(버전관리시스템)
- 웹 프로그램 만들기(중간목표) -> 이력서 포트폴리오제출 -> 취업(목표)
- 웹프로그램만들기 위해서 배우는 언어들: 자바스크립트+자바
- 웹프로그램만들기 위해서 배우는 프레임워크: 스프링
- 웹프로그램만들기 위해서 배우는 데이터베이스: mysql, oracle
- 웹프로그램만들기 위해서 배우는 클라우드: 파스타, 헤로쿠
- 자바가 오라클 회사 소유입니다. 자바8(1.8)버전부터 유료화.
- 오픈JDK( 자바개발툴 Java Developement Kit) 8(1.8)으로 개발.
- 현업에 가셔도, jdk7 버전까지는 무료기 때문에...
- 현업에 가시면, openjdk 사용하게 됩니다.
- 요즘 핫트렌드 프로그램부분(3가지)
- 1. RestAPI(빅데이터 처리): 시각화, 댓글처리, 네이버아이디로그인
- 2. 클라우드 서비스: 파스타, 헤로쿠 클라우드에 스프링 웹프로그램 서비스
- 3. IoT: 통신(인터넷)으로 하드웨어 제어(1달)
- 아두이노-안드로이드 앱이용 전구 켜기|끄기
- 라즈베리파이-UART통신(USB:컴퓨터PC to Serial:라즈베리PC)
- 맥북으로 수업따라가시는분 2명 있었습니다.(가능했습니다.)
- 현업개발자는 맥북 쓰시는 분들이 더 많습니다.
- 우리반은 윈도우기반(PC, 노트북)으로 수업을 진행합니다.
- 출근하셔서 오프라인 수업시, 종이시험지, 과제물 업로드
- 온라인(줌수업)에서는 그림판 이미지 시험지
- 그림판 수정 후 과제물 업로드 하시게 됩니다.
- 실습하실때, 에러나신 분들 원격으로 제가 봐드립니다.
- 원격PC제어에 사용되는 무료프로그램이 팀뷰어 입니다.
- 다운받습니다. -> 실행을 같이 해 봅니다.
- 공유화면에 띄울 예정 입니다.
- 다른분들은 에러난 PC를 프로그램에러를 어떻게 처리하는지
- 참관하시면 됩니다.
- 디자인 큰 학원이 좋다는 이유와 같습니다.
- 에러상황을 질문할때, 옆에서 볼수 있어서, 에러상황처리도 공부입니다.
- 실습않되시는 분들 없이, 다 같이 진행 됩니다.