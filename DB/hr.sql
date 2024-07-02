select * from employees;

SELECT * FROM tab;

// select * from jobs;

// select * from departments;

// SELECT * from locations;

/*  select문 */
/* select 컬럼명1, 컬럼명2, 컬럼명3, ..., 컬럼명10 from 테이블명 */
select employee_id, first_name, last_name, email from employees;

/* where 절 */
/* select 컬럼명1, 컬럼명2, 컬럼명3, ... from 테이블명 where 조건식 */
SELECT * from employees where salary >= 8000;

/* manager_id 가 100인 모든 사원의 정보 */
select * from employees where manager_id = 100;

/* manager_id 가 100이고, department_id 가 60보다 큰 모든 사원의 정보 */
select * from employees WHERE manager_id = 100 AND department_id > 60;

/* salary * 12 한 값(연봉)을 검색 */
select employee_id, first_name, last_name, salary * 12, department_id from employees;

/* alias 설정 */
select salary * 12 ann_salary from employees;
select salary * 12 "ann_salary" from employees;
select salary * 12 as ann_salary from employees;
select salary * 12 as "ann_salary" from employees;

select employee_id as id from employees;

/* order by : 정렬 */
SELECT * FROM employees WHERE department_id = 100 ORDER BY first_name;
/* 단일 컬럼 정렬 */
SELECT * FROM employees order by employee_id desc;
/* 복수 컬럼 정렬 */
SELECT * FROM employees order by department_id, salary;

/*  1. 급여가 9000 이상인 사원들의 모든 정보를 출력하시오. */
select * from employees where salary >= 9000;
/*  2. 부서번호가 20인 사원들의 모든 정보를 출력하시오. */
select * from employees where department_id = 20;
/*  3. 사원번호가 109인 사원의 이름과 성을 출력하시오. */
select first_name, last_name from employees where employees = 109;
/*  4. 부서번호가 50보다 큰 사원들의 모든 정보를 출력하시오. */
select * from employees where department_id > 50;
/*  5. 사원들의 모든 정보를 부서번호의 오름차순으로 사원 아이디의 내림차순으로 출력하시오. */
select * from employees order by department_id, employeement desc;
/*  6. 사원들의 사원 아이디, 이름, 성, 급여, 연봉을 사원 아이디의 내림차순으로 출력하시오. */
SELECT employee_id, first_name, last_name, salary, salary * 12 as ann_salary
from employees 
order by employee_id desc;


/* distinct(단일 컬럼 중복제거) */
SELECT * FROM employees;
SELECT distinct commission_pct from employees where commission_pct is not null;
/* distinct(복수 컬럼 중복제거) */
SELECT distinct commission_pct, salary from employees where commission_pct is not null;

/* 논리연산(AND, OR) */
SELECT * FROM employees where department_id = 100 and salary = 9000;
SELECT * FROM employees where salary > 5000 or salary < 3000;

/* 비교연산(<, <=, >, >=, =, !=) */
SELECT * FROM employees WHERE job_id = 'IT_PROG';       /* 문자열은 ''으로 감싸기, 대소문자 구분 O */
SELECT * FROM employees WHERE salary != 3000;

/* 부정연산(NOT) */
SELECT * FROM employees WHERE not salary = 3000;

/* IN */
SELECT * FROM employees WHERE department_id = 30 or department_id = 60 or department_id = 90;
SELECT * FROM employees WHERE department_id in (30, 60, 90);

/* BETWEEN A AND B */
SELECT * FROM employees WHERE salary >= 3000 and salary <= 5000;
SELECT * FROM employees WHERE salary BETWEEN 3000 and 5000;

/* LIKE */
SELECT * FROM employees WHERE first_name LIKE 'A%';
SELECT * FROM employees WHERE first_name not LIKE '%a%';
SELECT * FROM employees WHERE first_name LIKE '__a%';        /* _는 자리수를 표시 */

/* IS NULL */
SELECT * FROM employees WHERE commission_pct is null;
SELECT * FROM employees WHERE commission_pct is not null;       /* null은 !=로 찾을 수 없음 */

/* UNION(중복제거), UNION ALL(중복값 포함) */
SELECT * FROM employees WHERE department_id = 30
union
SELECT * FROM employees WHERE department_id = 50;

SELECT * FROM employees WHERE department_id = 30
union all
SELECT * FROM employees WHERE department_id = 30;

/* 오라클 함수 */
/* 대소문자 변경 : UPPER(), LOWER() */
SELECT first_name, last_name from employees;
SELECT upper(first_name), lower(last_name) from employees;
/* 대소문자를 구분하지 않고 특정 문자가 포함된 데이터 조회 */
SELECT * from employees WHERE lower(first_name) like '%b%';
SELECT * from employees WHERE upper(first_name) like '%B%';

/* 문자열의 길이 : LENGTH() */
SELECT first_name, length(first_name) from employees;
/* fisrt_name 의 길이가 6보다 큰 사원의 모든 정보를 조회 */
SELECT * FROM employees WHERE length(first_name) > 6;

/* 문자열 추출 : SUBSTR() */
SELECT job_id from employees;
SELECT job_id, substr(job_id, 1, 2) from employees;
SELECT job_id, substr(job_id, 4, 100) from employees;
SELECT job_id, substr(job_id, 4, length(job_id)-3) from employees;
SELECT job_id, substr(job_id, 4) from employees;
SELECT job_id, substr(job_id, -2) from employees;

select 1 + 2 from dual;
select sysdate from dual;

/* 특정문자위치 : INSTR(대상문자, 찾는문자, 시작위치, 몇 번째) */
SELECT instr('HelloWorld', 'l') from dual;
SELECT instr('HelloWorld', 'l', 5) from dual;
SELECT instr('HelloWorld', 'l', 4, 2) from dual;

/* 특정문자변경 : REPLACE(대상문자, 찾는문자, 변경문자) */
SELECT * FROM employees;
SELECT phone_number, replace(phone_number, '.', '-') FROM employees;

/* 빈공간 채우기 : LPAD(대상문자, 자릿수, 채울문자), RPAD(대상문자, 자릿수, 채울문자) */
SELECT salary FROM employees;
SELECT salary, lpad(salary, 8, '-'), rpad(salary, 8, '#') from employees;

/* 901111-2333444
    -> 901111-2****** */
SELECT '901111-2333444' from dual;
SELECT substr('901111-2333444', 1, 8) from dual;
SELECT rpad(substr('901111-2333444', 1, 8), 14,'*') from dual;

/* <연습문제> */
/* 1. 부서번호가 30보다 크고 100보다 작은 사원의 모든 정보를 출력하시오. */
SELECT * FROM employees WHERE department_id > 30 and department_id < 100;
/* 2. 부서번호가 20이거나 30인 사원의 모든 정보를 출력하시오. */
SELECT * FROM employees WHERE department_id = 20 or department_id = 30;
/* 3. 부서번호가 30에서 50사이인 사원의 모든 정보를 출력하시오. */
SELECT * FROM employees WHERE department_id between 30 and 50;
/* 4. 부서번호가 10, 20, 30 중에 하나인 사원의 모든 정보를 출력하시오. */
SELECT * FROM employees WHERE department_id in (10, 20, 30);
/* 5. 부서번호가 50, 80, 100 중에 하나이면서 급여가 7000~8000인 사원의 모든 정보를 출력하시오. */
SELECT * FROM employees WHERE department_id in (50, 80, 100) AND salary BETWEEN 7000 and 8000;
/* 6. 사원 테이블 등록된 직무 아이디 (JOB_ID)를 중복을 제거하고 출력하시오. */
SELECT distinct JOB_ID from employees;
/* 7. 이름에 b가 포함된 모든 사원의 정보를 출력하시오. */
SELECT * FROM employees WHERE lower(first_name) LIKE '%b%';
SELECT * FROM employees WHERE upper(first_name) LIKE '%B%';
/* 8. 급여가 10000 이상인 사원 중 커미션을 받지 않는 사원의 급여를 중복제거하여 출력하시오. */
SELECT distinct salary as ann_salary from employees WHERE salary >= 10000 and commission_pct is null;
/* 9. 이름에 'a'가 포함되어 있지 않은 사원의 정보를 모두 출력하시오. */
SELECT * FROM employees WHERE lower(first_name) not LIKE '%a%';

/* 두 문자열 합치기 : concat() */
SELECT * FROM employees;
select concat(first_name, concat(' ', last_name)) from employees;
select first_name || ' ' || last_name from employees;

/* 숫자함수 */
/* round() : 반올림 */
select round(1234.5678) from dual;
select round(1234.5678, 2) from dual;
select round(1234.5678, -2) from dual;

/* trunc() : 버림 */
select trunc(1234.5678) from dual;
select trunc(1234.5678, 2) from dual;
select trunc(1234.5678, -3) from dual;

/* ceil() : 가장 가까운 큰 정수 */
select ceil(-3.14) from dual;

/* floor() : 가장 가까운 작은 정수 */
select ceil(3.14), floor(-3.14) from dual;

/* mod() : 나머지 */
SELECT mod(5, 3) from dual;

/* 날짜관련 함수 */
select sysdate + 1 from dual;
/* add_months() */
select add_months(sysdate, 3) from dual;
/* months_between() */
select hire_date, months_between(sysdate, hire_date) from employees;
/* next_day() */
select next_day(sysdate, '월요일') from dual;
/* last_day() */
select last_day(sysdate) from dual;
select last_day(add_months(sysdate, 3)) from dual;

/* to_char() */
select sysdate from dual;
select to_char(sysdate, 'YYYY') from dual;
select to_char(sysdate, 'YYYY/MM/DD(DAY)') from dual;
select to_char(sysdate, 'HH24:MI:SS AM') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS AM') from dual;


/* to_number() */
select '100' + '500' from dual;
select to_number('1,000', '9,999') + to_number('5,000', '9,999') from dual;

/* to_date() */
select to_date('20230901', 'YYYYMMDD') +1 from dual;

/* 오라클 데이터 타입
 * 1. 문자열 : varchar2, char
 * 2. 숫자 : number
 * 3. 날짜 : date, timestamp
 * 4. 이진데이터 : blob, clob
 */

/* NULL 처리 함수 */
/* nvl(대상, NULL일 경우) */
SELECT * FROM employees;
select employee_id, first_name, last_name, salary, commission_pct from employees;
select employee_id, first_name, last_name, salary, nvl(commission_pct, 0) from employees;
/* nvl2(대상, NULL이 아닐 경우 반환할 데이터, NULL일 경우) */
select employee_id, first_name, last_name, salary, 
commission_pct, nvl2(commission_pct, salary * 12 * (1 + commission_pct), salary * 12) as ann
from employees;

/* decode, case 함수 */
/* decade(대상 혹은 연산,
 *          조건1, 조건1에 해당할 때 반환,
 *          조건2, 조건2에 해당할 때 반환,
 *          ...
 *          해당사항이 없을 경우 반환)
 */
/* case 대상 혹은 연산
 *      when 조건1 then 조건1이 참일 경우 반환
 *      when 조건2 then 조건2가 참일 경우 반환
 *      ...
 *      else 일치하는 조건이 없을 경우
 * end
 */

/* job_id가
 * 'IT_PROG' 이면, 급여를 20% 올리고,
 * 'FI_ACCOUNT' 이면, 급여를 10% 올리고,
 * 'ST_CLERK' 이면, 급여를 5% 올리고,
 * 나머지는 그대로 출력한다.
 */
select
    employee_id,
    first_name,
    last_name,
    job_id,
    salary,
    decode(job_id,
            'IT_PROG', salary * 1.2,
            'FI_ACCOUNT', salary * 1.1,
            'ST_CLERK', salary * 1.05,
            salary) as upsal
from employees;

select
    employee_id,
    first_name,
    last_name,
    job_id,
    salary,
    case job_id
        when 'IT_PROG' then salary * 1.2
        when 'FI_ACCOUNT' then salary * 1.1
        when 'ST_CLERK' then salary * 1.05
        else salary
    end as upsal
from employees;

/* 그룹화 함수 -> 결과값은 하나. 행의 개수가 맞지 않으면 에러 */
/* sum() : 합계 */
SELECT sum(salary) FROM employees;

/* count() : 개수 */
SELECT count(*) FROM employees where department_id = 50;

/* max(), min(), avg() */
SELECT max(salary), min(salary), trunc(avg(salary)) FROM employees;

/* SELECT first_name, max(salary) FROM employees;  -> 오류 */

/* <연습문제> */
/* 1. 모든 사원의 이름과 성을 한 칼럼에 소문자로 출력하시오. */
SELECT lower(first_name) || ' ' || lower(last_name) as fullname from employees;
SELECT concat(lower(first_name), concat(' ', lower(last_name))) as fullname from employees;
/* 2. 입사일이 07/01/01 이후인 모든 사원의 정보를 출력하시오. */
SELECT * FROM employees where hire_date > '07/01/01';
SELECT * FROM employees where hire_date > to_date('20070101', 'YYYYMMDD');
SELECT * FROM employees WHERE to_char(hire_date,'YY/MM/DD') > '07/01/01';
/* 3. 2007년도에 입사한 사원들의 모든 정보를 출력하시오. */
SELECT * FROM employees where to_char(hire_date, 'YYYY') = '2007';
SELECT * FROM employees where substr(hire_date, 1, 2) = 07;
SELECT * FROM employees where hire_date BETWEEN '07/01/01' and '07/12/31';
/* 4. 입사일 이후 오늘 날짜까지의 날짜 수를 정수단위로 출력하시오. 
    (최근 입사한 사원순으로 정렬하여 사원번호, 입사일, 근무일수 출력) */
SELECT employee_id, hire_date, 
trunc(sysdate - hire_date) as hired_days
from employees
order by hire_date;
/* 5. 성(last_name)이 'Smith'인 사원의 사원번호, 이름, 급여를 출력하시오.
    (단, 대소문자는 구분하지 않고 검색한다.) */
SELECT employee_id, first_name, last_name, salary FROM employees 
WHERE lower(last_name) like 'smith';
/* 6. 모든 사원의 입사일을 '2003년 06월 17일 화요일' 형식으로 출력하시오. */
SELECT to_char(hire_date, 'YYYY"년 "MM"월 "DD"일 "DAY') as 입사일 FROM employees;
/* 7. 모든 사원의 연봉을 출력하되, 커미션이 있는 사원은 커미션 비율을 적용하여 출력하시오. */
select salary, commission_pct, nvl2(commission_pct, salary * 12 * (commission_pct + 1), salary*12) 
as ann_salary from employees;

select (salary * 12 * (commission_pct + 1)) as ann_salary from employees where commission_pct is not null
union all
select (salary * 12) as ann_salary from employees where commission_pct is null;
/* 8. 사원 전체의 최대급여, 최소급여, 총 급여합계, 평균급여를 출력하되
    단, 평균은 정수자리까지만 출력하시오. */
select max(salary), min(salary), sum(salary), trunc(avg(salary)) from employees;

/* GROUP BY */
SELECT * FROM employees;
SELECT department_id, max(salary), avg(salary) FROM employees group by department_id;
/* -> group by는 그룹화 함수와 함께 사용 가능. */
/* job_id 별 최대 급여 */
SELECT job_id, max(salary) FROM employees group by job_id order by max(salary);

SELECT department_id, job_id FROM employees group by department_id, job_id order by department_id;

/* HAVING */
SELECT department_id, job_id, min(salary) FROM employees group by department_id, job_id having min(salary) >= 6000;

/* SELECT department_id, job_id, min(salary) FROM employees where min(salary) >= 6000 group by department_id, job_id;
    -> min(salary)는 그룹화된 정보로 where절로 조건설정 X */
SELECT department_id, job_id, min(salary) FROM employees where salary <= 9000
group by department_id, job_id having min(salary) >= 6000;

/* JOIN */
SELECT 
   count(*)
FROM
    employees e,
    departments d;

select count(*) from employees;
select count(*) from departments;
select 107 * 27 from dual;

SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   d.department_id,
   d.department_name
FROM
    employees e,
    departments d
where
    e.department_id = d.department_id
;

/* JOIN 표준문법 */
SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   department_id,
   d.department_name
FROM
    employees e
natural join
    departments d
;
/* 자동으로 공통된 컬럼으로 조인해줌. 공통컬럼이 더 있을 경우 결과값이 다를 수 있음
공통 칼럼은 알리아스 표시 X */

SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   department_id,
   d.department_name
FROM
    employees e
join
    departments d
using (department_id)
;
/* 정확하게 조인의 기준, 조건을 명시해줌, natural 문과 같이 공통 칼럼 알리아스 표시 X */

SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   d.department_id,
   d.department_name
FROM
    employees e
join
    departments d
on e.department_id = d.department_id
;
/* 가장 많이 사용하는 문법, on절 where절 동일하게 사용 */

SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   d.department_id,
   d.department_name,
   l.location_id,
   l.city
FROM
    employees e,
    departments d,
    locations l
where
    e.department_id = d.department_id
    and d.location_id = l.location_id
;

SELECT 
   e.employee_id,
   e.first_name,
   e.last_name,
   d.department_id,
   d.department_name,
   l.location_id,
   l.city
FROM
    employees e
join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
;

/* 내부조인 (INNER JOIN) */
SELECT *
FROM employees e1, employees e2
where e1.manager_id = e2.employee_id
order by e1.employee_id;

SELECT *
FROM employees e1 
join employees e2
on e1.manager_id = e2.employee_id
order by e1.employee_id;

/* LEFT OUTER JOIN : 왼쪽 열을 기준으로 오른쪽 열의 데이터 존재 유무과 상관없이 출력 */
/* 상사가 없는 직원이 추가로 출력 */
select
    e1.employee_id,
    e1.first_name,
    e1.last_name,
    e1.manager_id,
    e2.first_name,
    e2.last_name
from
    employees e1, employees e2
where
    e1.manager_id = e2.employee_id(+)
order by e1.employee_id;

select
    e1.employee_id,
    e1.first_name,
    e1.last_name,
    e1.manager_id,
    e2.first_name,
    e2.last_name
from
    employees e1
left outer join
    employees e2
on e1.manager_id = e2.employee_id
order by e1.employee_id;

/* RIGHT OUTER JOIN : 오른쪽 열을 기준으로 왼쪽 열의 데이터 존재 유무와 상관없이 출력 */
/* 부하직원이 없는 직원이 추가로 출력 */
select
    e1.employee_id,
    e1.first_name,
    e1.last_name,
    e1.manager_id,
    e2.first_name,
    e2.last_name
from
    employees e1, employees e2
where
    e1.manager_id(+) = e2.employee_id
order by e1.employee_id;

select
    e1.employee_id,
    e1.first_name,
    e1.last_name,
    e1.manager_id,
    e2.first_name,
    e2.last_name
from
    employees e1
right outer join
    employees e2
on
    e1.manager_id = e2.employee_id
order by e1.employee_id;

/* 서브쿼리 */
select * from employees e where salary > 9000;
select * from employees e
where salary > (select salary from employees e2 where lower(first_name) like 'daniel');
/* 괄호 안 selcet문을 서브쿼리라고 함 */
select * from employees e
where hire_date > (select hire_date from employees e2 where e2.employee_id = 121);

select
    employee_id,
    first_name,
    last_name,
    manager_id,
    (select first_name || ' ' || last_name from employees e2 where e2.employee_id = e1.manager_id) as manager_name
from
    employees e1;
    
select employee_id, first_name, email from (select * from employees where department_id = 50);
