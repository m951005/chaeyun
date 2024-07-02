/* 사용자 계정 */
/* create user [계정명] identified by [패스워드] */
create user shopping identified by 1234;

/* DCL(Data Control Language) */
/* 권한 부여 */
/* grant문 종류 (grant ~ to [계정명];)
 * create user : 계정 생성 권한
 * drop user : 계정 삭제 권한
 * create session : 데이터베이스 접속 권한
 * create table : 테이블 생성 권한
 * create sequence : 시퀀스 생성 권한
 * create view : 뷰 생성 권한
 * create procedure : 프로시저(함수) 생성 권한
 * resource : 저장 공간을 사용할 수 있는 권한
 */
grant create session, create table, create sequence, resource to shopping;