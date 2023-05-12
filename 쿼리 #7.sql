SELECT title
FROM film
WHERE rating = 'G' && rental_duration >=7;

-- select from where group having order-by limit 서순

-- 등급이 'G'면서 빌릴수 있는 기간이 7일 이상인 레코드

-- 등급이 'G'면서 빌릴 수 있는 기간이 7일 이상인 레코드
-- 그리고 등급이 'PG-13'이면서 빌릴 수 있는 기간이 4미만인 모든 레코드
-- 모든 레코드, 컬럼은 (제목, 등급, 빌릴 수 있는 기간)

SELECT title, rating, rental_duration
FROM film
WHERE (rating = 'G' AND rental_duration >=7)
OR (rating = 'PG-13' AND rental_duration <4);

-- group by

-- group function 그룹함수
-- sum, avg, min, max, count
SELECT * FROM customer;

SELECT COUNT(*), SUM(active)
, COUNT(*) - SUM(active) 
, MAX(address_id)
, MIN(address_id)
, floor(AVG(address_id)) 'AVG(address_id)'
FROM customer;
-- 전체가 한 구룹 

SELECT store_id, COUNT(*)
FROM customer
WHERE active = 1
GROUP BY store_id
HAVING COUNT(*) >= 300
ORDER BY store_id;
-- 그룹을 만들어서 그룹별로 최대값 평균값 최소값 등을 구할수있다.

-- 3.8.1
SELECT actor_id, first_name, last_name
FROM actor
ORDER BY last_name, first_name;


-- 3.8.2
SELECT actor_id, first_name, last_name 
FROM actor
-- where last_name IN ('Williams', 'davis')
WHERE last_name = 'Williams' OR last_name = 'davis';


-- 3.8.3
SELECT distinct rental_id
FROM rental
WHERE DATE(rental_date) = '2005-07-05'
ORDER BY customer_id;

-- 3.8.4
SELECT c.email, r.return_date
FROM customer c
	INNER JOIN rental r
	ON c.customer_id = r.customer_id
WHERE DATE(r.rental_date) = '2005-06-14'
ORDER BY r.return_date desc;
	
SELECT * FROM customer
WHERE first_name = 'steven'
or create_date > '2006-01-01';

-- 이름은 steven이고, 생성 날짜는 2006년 1월 1일 또는 그 이전
SELECT *
FROM customer
WHERE first_name = 'steven'
AND create_date <= '2006-01-01';

-- 이름은 steven이 아니지만, 생성 날짜는 2006년 01 월 01일 이후
SELECT *
from customer 
WHERE first_name != 'steven'
AND create_date > '2006-01-01';

-- 이름은 steven이 아니거나 성이 'young'인 사람중에
-- 생성날짜가 2006년 1월 1일 이후 인사람들
SELECT *
FROM customer
WHERE (first_name != 'steven' OR last_name = 'young') 
AND create_date >'2006-01-01'; 

-- 이름은 steven이 아니거나 성이 'young'이 아닌 사람중에
-- 생성날짜가 2006년 1월 1일 이후 인사람들
SELECT *
FROM customer
WHERE NOT (first_name = 'steven' OR last_name = 'young')
AND create_date > '2006-01-01';  


SELECT *
FROM film;

-- 내가 알고있는건 title인 file_id: 762, sassy packer 밖에 모름, 대여기간보다 짧은 영화만 알고싶다
SELECT *
FROM film
WHERE rental_duration < (SELECT rental_duration
									FROM film
									WHERE film_id = 762);

SELECT rental_duration
FROM film
WHERE film_id = 762;



-- '2005-06-14'일날 렌탈을 한 사람들의 이메일을 알고싶다.
SELECT distinct c.email
FROM rental r
	INNER JOIN customer c
	ON c.customer_id = r.customer_id
WHERE DATE(r.rental_date) = '2005-06-14'
ORDER BY c.email;


-- 2004, 2005년을 제외한 렌탈정보를 알고싶다.

SELECT *
FROM rental
WHERE YEAR(rental_date) NOT IN(2004, 2005);


-- 2005-06-14 ~ 16 사이에 렌탈정보 알고 시팓.

SELECT *
FROM rental
WHERE DATE(rental_date) BETWEEN '2005-06-14' AND '2005-06-16';


-- 고객 성이 'FA' 와 'FR' 사이에 속하는 사람이 알고 싶다.
SELECT *
FROM customer
WHERE last_name BETWEEN 'FA' AND 'FR';


-- 영화 등급이 'G'혹은 'PG'인 영화 정보를 알고싶다.
SELECT *
FROM film
WHERE rating IN ('G','PG');


-- 제목에 pet이 포함된 영화와 같은 등급을 가진 영화가 궁금하다.

SELECT *
FROM film
WHERE rating IN (
	SELECT DISTINCT rating
	FROM film
	WHERE title LIKE '%pet%'
	);
	
	
-- 등급이 'PG-13', 'R', 'NC-17'이 아닌 영화 정보 알고싶다.
SELECT *
FROM film
WHERE rating != 'PG-13' AND rating != 'R' AND rating != 'NC-17';


SELECT *
FROM film
WHERE rating NOT IN('PG-13', 'R', 'NC-17');

SELECT LEFT('abcdefg', 2), RIGHT('abcdefg', 2), MID('abcdefg', 1, 3);


-- 문자함수 이용하여 고객 성이'Q'로 시작하는 사람 궁금하다.

SELECT *
from customer
WHERE LEFT(last_name, 1) = 'Q';

SELECT * 
from customer
WHERE last_name LIKE 'Q%';
