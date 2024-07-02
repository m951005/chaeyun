/* 테이블 생성 */
/* 
 * create table 소유계정명.테이블명(
 *  컬럼명1 데이터타입 제약조건,
 *  컬럼명2 데이터타입,
 *  ...
 *  )
 *
 */
 
/* 회원정보관리 테이블 (member)
 * 항목       컬럼명         데이터타입       제약조건
 * 아이디    member_id     varchar2(20)    PK (기본키)
 * 이름      name         varchar2(10)     not null
 * 생년월일   birth         date            default(sysdate)
 * 이메일    email         varchar2(100)
 * 나이      age          number
 */
 create table member(
    member_id varchar2(20),
    name varchar2(10),
    birth date,
    email varchar2(100),
    age number
 );
 
 SELECT * FROM member;
 
 /* 데이터 삽입 */
 /*
  * 1. insert into 테이블명(컬럼명1, 컬럼명2, ...) values(데이터1, 데이터2, ...) : 선택한 컬럼에 맞는 데이터 삽입
  * 2. insert into 테이블명 values(데이터1, 데이터2, ...) : 모든 컬럼에 해당하는 데이터가 있어야함.
  */
insert into member (member_id, name, birth, email, age) 
values ('hong', '홍길동', to_date('2000-03-05','YYYY-MM-DD'), 'hong2000@test.com', 20);
  
insert into member values('kim11', '김개똥', '1998-12-25', 'kim11@test.com', null);
  
/* 테이블 컬럼명 변경 */  
/* alter table 테이블명 rename column 컬럼명 to 새로운 컬럼명 */
alter table member rename column birth to birthday;
desc member; -- 컬럼명과 데이터타입을 출력해줌.

/* 테이블 컬럼 타입 변경 */
/* alter table 테이블명 modify 컬럼명 새로운 데이터타입 */
alter table member modify name varchar2(20);
-- 단, 이미 들어가있는 데이터의 크기보다 작게 변경할 수는 없음.
desc member;

/* 테이블 컬럼 추가 */
/* alter table 테이블명 add 컬럼명 데이터타입 */
alter table member add password varchar2(50);

/* 테이블 컬럼 삭제 */
/* alter table 테이블명 drop column 컬럼명 */
alter table member drop column password;
desc member;

/* 테이블 이름 변경 */
/* rename 테이블명 to 새로운 테이블명 */
rename member to tbl_member;

/* 테이블 삭제 */
/* drop table 테이블명 */
drop table tbl_member;
SELECT * FROM tbl_member;


create table member(
   member_id varchar2(20) primary key,
   name varchar2(10) not null,
   birth date default(sysdate),
   email varchar2(100),
   age number
);

insert into member values('userA', '유저A', '1995-01-01', null, null);
SELECT * FROM member;
insert into member values('userB', '유저B', '1995-01-01', null, null);

/* 트랜젝션 */
commit;


