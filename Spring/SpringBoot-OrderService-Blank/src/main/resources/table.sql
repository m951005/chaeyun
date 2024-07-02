--system 계정 접속 후 orderservice 계정 생성 및 권한 부여
CREATE USER orderservice IDENTIFIED BY 1234;

GRANT resource, CREATE SESSION, CREATE TABLE, CREATE SEQUENCE TO orderservice;

-- 계정 만든 후 "새접속"으로 사용자 이름 orderservice 비밀번호 1234 입력 후 접속 

--회원관리 테이블
CREATE TABLE member(
	member_id VARCHAR2(20) PRIMARY KEY,
	password VARCHAR2(20) NOT NULL,
	name VARCHAR2(50) NOT NULL
);

--제품 정보 테이블
CREATE TABLE product(
	product_id NUMBER PRIMARY KEY,
	product_name VARCHAR2(500) NOT NULL,
	stock NUMBER,
	price NUMBER
);

--주문 정보 테이블
CREATE TABLE orders(
	order_id NUMBER PRIMARY KEY,
	member_id REFERENCES member(member_id),
	product_id REFERENCES product(product_id),
	count NUMBER,
	order_price number,
	order_date DATE DEFAULT SYSDATE 
);

CREATE SEQUENCE seq_order;

-- 초기 삽입 데이터(상품 정보)
INSERT INTO product VALUES (seq_order.nextval, '잘나와 TV 32인치', 10, 200000);
INSERT INTO product VALUES (seq_order.nextval, '밥 잘되는 밥통', 10, 100000);
INSERT INTO product VALUES (seq_order.nextval, '잘 데우는 전자렌지', 10, 80000);
INSERT INTO product VALUES (seq_order.nextval, '잘 말리는 드라이기', 10, 50000);
INSERT INTO product VALUES (seq_order.nextval, '깔끔하다 청소기', 10, 150000);

COMMIT;