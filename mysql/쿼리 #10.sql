SELECT last_name, first_name
FROM customer
WHERE last_name LIKE '_A_T%S';


-- KIRK.STCLAIR@sakilacustomer.org
-- 고객 중에 이메일값이 다섯번째에 . 이있고 13번째가 @인 사람
SELECT *
FROM customer
WHERE email LIKE '____._______@%';

SELECT *
FROM customer
WHERE email LIKE '____.%' AND MID(email, 13, 1) = '@';


-- 성이 Q, Y 로 시작하는 사람들 알고 싶어.
SELECT *
FROM customer
WHERE last_name LIKE 'Q%' OR last_name LIKE 'Y%';

SELECT *
FROM customer
WHERE last_name REGEXP '.[QY]';


SELECT *
FROM customer
WHERE LEFT(last_name, 'Q') OR LEFT(last_name, 'Y');


SELECT *
FROM rental
WHERE return_date IS NULL;

-- 성이 L, Y 로 끝나는 사람들 알고 싶어.

SELECT *
FROM customer
WHERE last_name REGEXP '[LY]$';

SELECT *
FROM customer
WHERE last_name REGEXP 'co';


-- 반납일이'2005-05-01' ~ '2005-09-01'이 아닌 렌탈 정보 알고싶다
SELECT *
FROM rental
WHERE DATE(return_date) NOT BETWEEN '2005-05-01' AND '2005-08-31'
OR return_date IS null;



-- 4.5.1
-- 101, 107

-- 4.5.2
-- 108, 110, 111, 112, 113, 115, 116, 117, 118, 119, 120

-- 4.5.3
SELECT *
FROM payment
WHERE amount IN (1.98, 7.98, 9.98);

-- 4.5.4

SELECT *
FROM customer
WHERE last_name REGEXP '^[a-zA-Z]{1}A[a-zA-Z]?[W]';


SELECT *
FROM customer
WHERE last_name LIKE '_A%W%';


SELECT *
FROM person;

SELECT A.food, A.person_id, B.person_id, B.fname, B.lname
FROM favorite_food A
	INNER JOIN person B
	ON A.person_id = B.person_id;


SELECT *
FROM person A
LEFT JOIN favorite_food B
ON A.person_id = B.person_id;

-- 고객 id, 이름, 성, address, district값이 나오는 쿼리문 완성
SELECT A.customer_id, A.first_name, A.last_name, B.address, B.district
FROM customer A
	INNER JOIN address B
	ON A.address_id = B.address_id;
	
-- 같은 컬럼은 using을 사용할수있지만 권장하지 않음 다른 DB에서 사용 불가능할 수 있기 때문에
SELECT A.customer_id, A.first_name, A.last_name, B.address, B.district
FROM customer A
	INNER JOIN address B
	USING(address_id);
	
-- ANSI 조인 문법 존재하지만 쓰지 말것!
SELECT A.customer_id, A.first_name, A.last_name, B.address, B.district
FROM customer A, address B
WHERE A.address_id = B.address_id;


-- 고객id, 이름, 성, 도시명 나오는 쿼리문 완성.
SELECT B.customer_id, B.first_name, B.last_name, A.address, C.city
FROM address A
	INNER JOIN customer B
	ON A.address_id = B.address_id
	INNER JOIN city C
	ON A.city_id = C.city_id;
	
-- 'California'값만 알고있다. 미국 주중에 California에 사는 소비자 정보가 궁금하다

SELECT *
FROM customer A
	INNER JOIN address B
	ON A.address_id = B.address_id
WHERE B.district = 'California';


SELECT *
FROM customer
WHERE address_id IN (
	SELECT address_id FROM address
	WHERE district = 'California'
);

SELECT *
FROM customer A
INNER JOIN (
	SELECT address_id FROM address
	WHERE district = 'California'
) B
ON A.address_id = B.address_id;
-- 테이블자리에 있는 서브쿼리는 알리아스를 줘야한다.
-- 서브쿼리가 들어갈수 있는 자리: 테이블, where절, 컬럼자리(무조건 스칼라값)

SELECT address_id
FROM address
WHERE district = 'California';
	

-- 배우이름 CATE MCQUEEN, CUBA BIRCH가 출연한 영화이름

SELECT DISTINCT C.title
FROM film_actor A
INNER JOIN (
	SELECT * FROM actor
	WHERE (first_name = 'CATE' AND last_name = 'MCQUEEN')
		OR (first_name = 'CUBA' AND last_name = 'BIRCH')
	) B
	ON A.actor_id = B.actor_id
INNER JOIN film C
ON C.film_id = A.film_id
ORDER BY C.title;


SELECT DISTINCT C.*
FROM actor A
INNER JOIN film_actor B
ON A.actor_id = B.actor_id
INNER JOIN film C
ON B.film_id = C.film_id
WHERE (first_name, last_name) IN (('CATE','MCQUEEN'),('CUBA','BIRCH'))
ORDER BY film_id;

-- CATE MCQUEEN, CUBA BIRCH 밖에 모름 둘이 같이 출연한 영화이름

SELECT * 
FROM film F
INNER JOIN
(
	SELECT B.film_id FROM actor A
	INNER JOIN film_actor B
	ON A.actor_id = B.actor_id
	WHERE (first_name, last_name) IN (('CATE','MCQUEEN'),('CUBA','BIRCH'))
	GROUP BY B.film_id
	HAVING COUNT(*) = 2
) S
ON S.film_id = F.film_id; 





-- 5.4.1
SELECT C.first_name, C.last_name, A.address, CT.city
FROM customer C
	INNER JOIN address A
	ON C.address_id = A.address_id
	INNER JOIN city CT
	ON A.city_id = CT.city_id
WHERE A.district = 'California';

-- 5.4.2
SELECT C.title
FROM actor A
	INNER JOIN film_actor B
	ON A.actor_id = B.actor_id
	INNER JOIN film C
	ON B.film_id = C.film_id
WHERE first_name = 'JOHN';

-- 5.4.3
SELECT a1.address addr1, a2.address addr2, a1.city_id, a2.city_id
FROM address a1
INNER JOIN address a2
ON a1.city_id = a2.city_id
WHERE a1.address_id <> a2.address_id;

SELECT address FROM address
WHERE city_id IN(
	SELECT city_id FROM address
	GROUP BY city_id
	HAVING COUNT(*) > 1;
-- city번호가 두개인게 있었고 그것 둘다 찍어라였다....
