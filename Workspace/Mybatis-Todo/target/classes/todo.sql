-- 테이블 생성문
CREATE TABLE category (
	id NUMBER PRIMARY KEY,
	title varchar2(500) NOT NULL
);

CREATE TABLE task (
	id NUMBER PRIMARY KEY,
	title varchar2(500) NOT NULL,
	contents varchar2(2000),
	category_id NUMBER REFERENCES category(id),
	status varchar2(100) NOT NULL,
	created_time DATE DEFAULT sysdate,
	deadline DATE,
	complete_time DATE
);

-- 시퀀스 생성문
CREATE SEQUENCE seq_todo;