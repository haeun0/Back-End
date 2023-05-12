-- 05/11

SELECT 1 as num, 1 as str
UNION all
SELECT 9 , 'xyzaa'
UNION all
SELECT 1 , 1;


-- 고객의 이름, 성/ 배우의 이름, 성 같이 띄워 부세요 union 이용

SELECT 'customer' as typ, first_name, last_name
FROM customer
UNION
SELECT 'actor', first_name, last_name
FROM actor
ORDER BY first_name;


-- 배우, 고객 둘다 이름이(fnm) J 성(lnm)이 D로 시작하는 사람 리스트

SELECT 'customer' as typ, first_name, last_name
FROM customer
WHERE first_name REGEXP '^J'AND last_name REGEXP '^D'
UNION
SELECT 'actor', first_name, last_name
FROM actor
WHERE first_name REGEXP '^J'AND last_name REGEXP '^D';

SELECT * FROM (
	SELECT 'customer' as typ, first_name, last_name
	FROM customer
	UNION
	SELECT 'actor', first_name, last_name
	FROM actor) A
WHERE first_name REGEXP '^J'AND last_name REGEXP '^D';
-- 전체 다 가지고 와서 속도가 느릴수있음///



-- customer와 actor 둘다 있는 이름
SELECT A.first_name, A.last_name 
FROM(
	SELECT 'customer' as typ, first_name, last_name
	FROM customer
	WHERE first_name REGEXP '^J'AND last_name REGEXP '^D'
	union
	SELECT 'actor', first_name, last_name
	FROM actor
	WHERE first_name REGEXP '^J'AND last_name REGEXP '^D'
) A
GROUP BY A.first_name, A.last_name
HAVING COUNT(1) > 1;

-- customer와 actor에서 곂치지 않는 이름
SELECT A.first_name, A.last_name 
FROM(
	SELECT 'customer' as typ, first_name, last_name
	FROM customer
	WHERE first_name REGEXP '^J'AND last_name REGEXP '^D'
	union
	SELECT 'actor', first_name, last_name
	FROM actor
	WHERE first_name REGEXP '^J'AND last_name REGEXP '^D'
) A
GROUP BY A.first_name, A.last_name
HAVING COUNT(1) = 1;


CREATE TABLE except_a (
id INT UNSIGNED
);

CREATE TABLE except_b (
id INT UNSIGNED
);

INSERT INTO except_a
(id)
VALUES
(10), (11), (12), (10), (10);

INSERT INTO except_b
(id)
VALUES
(10), (10);


-- 10, 11, 12

SELECT id FROM except_a
UNION
SELECT id FROM except_b;


-- 6.5.2
SELECT 'customer' as typ, first_name, last_name FROM actor
WHERE last_name REGEXP '^L'
UNION
SELECT 'actor', first_name, last_name FROM customer
WHERE last_name REGEXP '^L';


-- 6.5.3
SELECT 'customer' as typ, first_name, last_name FROM actor
WHERE last_name REGEXP '^L'
UNION
SELECT 'actor', first_name, last_name FROM customer
WHERE last_name REGEXP '^L'
ORDER BY last_name;


CREATE TABLE string_tbl(
	char_fld CHAR(30),
	vchar_fld VARCHAR(30),
	text_fld text
);

INSERT INTO string_tbl
( char_fld, vchar_fld, text_fld )
VALUES
(
	'This is char data',
	'This is varchar data',
	'This is text data'
);

SELECT *, QUOTE(text_fld) FROM string_tbl;

UPDATE string_tbl
SET vchar_fld = 'This is a piece of extremely long varchar data';

UPDATE string_tbl
SET text_fld = 'This s\'tring didn''t WORK, but it does now';

SELECT @@SESSION.sql_mode;

SET sql_mode = 'strict';

SHOW WARNINGS;


SELECT lname, fname, CONCAT(lname, ' ', fname)
FROM person;
-- DB에서는 가공 왠만하면 하지마라....


SELECT lname, CHAR_LENGTH(lname)
FROM person;


SELECT lname, POSITION('홍' IN lname)
FROM person;


SELECT text_fld, POSITION('n' IN text_fld), LOCATE('n',text_fld, 12)
FROM string_tbl;

SELECT '안녕' = '안녕'
		, 'abc' = 'ABC'
		, 'abc' = 'cba'
		, STRCMP('ABC', 'ABCC')
		, STRCMP('abc', 'ac'); 



SELECT NAME, NAME LIKE '%y', NAME REGEXP '^[C]' FROM category;


SELECT first_name || ' ' || last_name
FROM customer;
-- mysql에서는 사용 불가능

-- fname중에 BA를 전부다 DA로 바꾸겠다.
SELECT first_name, REPLACE(first_name, 'BA', 'DA') FROM customer;


-- 이름에서 PH > TH 바꾸고, NI > NA ==> STECHANAE

SELECT first_name, REPLACE(REPLACE(first_name, 'PH', 'TH'), 'NI', 'NA')
FROM customer
where customer_id = 41;



-- insert 사용해서 문자열 삽입하기
SELECT 'goodbye world', INSERT('goodbye world', 9, 0, 'cruel ')
, INSERT('goodye world', POSITION('world' IN 'goodye world') 5, 'cls');

SELECT 'goodbye world', INSERT('goodbye world', 9, 0, 'cruel ')
, INSERT('goodye asdf world', 
	POSITION('world' IN 'goodye asdf world') , CHAR_LENGTH('world'), 'cls');


-- 영화제목 빈간에 NICE 추가해 주세요
SELECT title, INSERT(title, POSITION(' ' in title), 0,' NICE') 
FROM film;

-- SUBSTRING, SUBSTRING, SUBSTR
SELECT email, SUBSTRING(email, 3), SUBSTRING(email, 3, 6), SUBSTR(email, 3, 3)
FROM customer;

-- 사용자 이메일 쪼개서 @ 기준으로 아이디 / 도메인
SELECT email, 
SUBSTR(email, 1 , POSITION('@' IN email)-1) AS email_id, 
SUBSTRING(email, POSITION('@' IN email)+1) AS domain
FROM customer;


SELECT (38 * 59) / (78 - (8 * 6));


SELECT MOD(9, 2);
-- 0나오면 짝수 1나오면 홀수

SELECT TRUNCATE(1123.3456, 1), ABS(-10), ABS(10);

SELECT NOW(), CURRENT_DATE(), CURRENT_TIME(), CURRENT_TIMESTAMP();

-- 문자열을 날자열로 형변환
SELECT CAST('2023-05-11 16:46:30' AS DATETIME), CONVERT('2023-05-11 16:46:30', DATETIME);

SELECT date_add(CURRENT_DATE(), INTERVAL 5 DAY)
, DATE_ADD(NOW(), INTERVAL '01:27:11' HOUR_SECOND);
-- date_add의 반대 date_sub

-- 1953-09-02 > 1955-10-02
SELECT * FROM employees
WHERE emp_no = 10001;

UPDATE employees
SET birth_date = DATE_ADD(birth_date, interval '2-1' YEAR_MONTH)
WHERE emp_no = 10001;


SELECT 
	CURDATE()
	, SYSDATE()
	, WEEKDAY(NOW()) -- 월(0), 화(1), 수(1), 목(3), 금(4), 토(5), 일(6)
	, DAYNAME(NOW())
	, LAST_DAY(NOW()) -- 그 달의 마지막 일
	, LAST_DAY('2023-06-11')
	, DATE_SUB(NOW(), INTERVAL '2' YEAR)
	, EXTRACT(YEAR FROM NOW()) -- 정보 뽑아내기 YEAR, month, day등..
	-- 프로그래밍 언어에서 get 1월은 0(0번방).. 그래서 +1로 사용해야한다.
	, DATEDIFF('2023-09-20', '2023-05-11') -- d-day?
	;













