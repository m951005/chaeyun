# 테이블 및 시퀀스 생성 쿼리 작성
CREATE TABLE MEMBER (
	id varchar2(20) PRIMARY KEY,
	password varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL
);

CREATE TABLE guestbook (
	id NUMBER PRIMARY key,
	member_id varchar2(20) REFERENCES MEMBER(id),
	contents varchar2(1000),
	hit NUMBER DEFAULT 0,
	input_date DATE DEFAULT sysdate
);

CREATE SEQUENCE SEQ_GUESTBOOK;