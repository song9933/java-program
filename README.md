# 심야식당 서비스



## 개요
*현재 영업 중 인 식당의 정보를 
접속 위치 기반으로 여러 조건에 맞게 제공하는 웹 서비스*

## 주요 기술
- Java, JSP, JSTL, EL
- jQuery, Ajax, JSON
- HTML, CSS, Javascript, BootStrap, jQueryPlugin
- mysql, mybatis
- google map API, KAKAO login API,  Naver login API

## ERD
![]()


## 나의 역할
- controller 설계
- 회원가입 및 API를 이용한 로그인 기능의 설계 및 구현, 웹 화면 구성

## 회원가입(점주)
카테고리, 지역, 가격대, 메뉴 등 기본 정보 입력을 통한 회원가입 기능

## 회원가입 (일반회원)
![]()
네이버, 카카오 로그인 API를 이용하여 회원가입 및 로그인기능을 구현함

## 위도, 경도 등록 기능
![]()
도로명주소API, 좌표제공API 를 이용하여 회원가입 시 입력받은 주소를 통해 위도, 경도를 db에 등록함


## 최근 본 맛집 기능
![]()
sessionstorage를 이용하여 조회하였던 값들을 가져오도록 설정하였다.
