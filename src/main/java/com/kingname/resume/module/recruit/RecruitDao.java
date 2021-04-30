package com.kingname.resume.module.recruit;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@Data
public class RecruitDao {

    private String keyword;     // 기업명, 공고명, 업직종 키워드, 직무내용에서 검색하고자 하는 검색어
    private String bbs_gb;      // 공채구분
    private String stock;       //상장여부  kospi : 유가증권  kosdaq : 코스닥  nasdaq : 나스닥
    private String sr;          // 제외 설정  directhire : 헤드헌팅/파견업체 공고 제외

    private String loc_cd;      // 근무지/지역 조건, 근무지/지역 코드표 참조
    private String loc_mcd;     // 근무지/지역 조건, 근무지/지역 1차 코드표 참조
    private String loc_bcd;     // 근무지/지역 조건, 근무지/지역 2차 코드표 참조
    private String ind_cd;      // 산업/업종 조건, 산업/업종 코드표 및 업종 키워드 코드표 참조
    private String job_category;    // 직업/직종 조건, 직업/직종 코드표 및 직종 키워드 코드표 참조
    private String job_type;    // 근무형태/고용형태 조건(1-15), 근무형태 코드표 참조

    private String edu_lv;      // 학력 조건(0-9), 학력 코드표 참조
    private String fields;      // 필드 선택 posting-date : 날짜/시간 형식의 게시일시 expiration-date : 날짜/시간 형식의 마감일시 keyword-code : 업직종 키워드(상세분류) 코드 count : 조회수/지원자수/댓글수

    private String published;       // 등록일 검색 (ex. 2019-03-20)
    private String published_min;   // 등록일 검색 최소값 (ex. 2019-03-20 19:55:00 | Unix timestamp)
    private String published_max;   // 등록일 검색 최대값

    private String updated;     // 수정일 검색
    private String updated_min; // 수정일시 검색 최소값
    private String updated_max; // 수정일시 검색 최대값
    private String deadline;    // 마감일  today : 오늘 마감 공고  tomorrow : 내일 마감 공고  - : 마감된 공고
    private String start;       // 검색 결과 페이지 번호, 제로(0) 기반의 서수 번호 입니다.  0 : 기본 값
    private String count;       // 검색 결과 수  10 : 기본값  110 : 최대값
    private String sort;        // 검색 결과의 정렬 순서  pd: 게시일 역순(기본값)  pa: 게시일순 ud: 최근수정순 ua: 수정일 정순 da: 마감일 정순 dd: 마감일 역순 rc: 조회수 역순 ac: 지원자수 역순

}
