-- 05/12

-- 7.5.1
SELECT  
Mid('Please find the substring in this string', 17,9);

SELECT  
	Mid('Please find the substring in this string', 
	POSITION('substring' IN 'Please find the substring in this string'),
	CHAR_LENGTH('substring'));

-- 7.5.2
SELECT ABS(-25.76823), 
sign(-25.76823), 
round(-25.76823, 2);

-- 7.5.3
SELECT EXTRACT(MONTH FROM NOW()), MONTH(NOW());


-- ch08
SELECT customer_id, COUNT(1) FROM rental
GROUP BY customer_id
ORDER BY COUNT(1) DESC;

-- DB42
-- limit(1), limist(1, 1)(위치, 길이)
SELECT * FROM rental
LIMIT 3;

SELECT * FROM rental
ORDER BY rental_id desc
LIMIT 2, 3;
-- 두번째 부터 3개만


SELECT customer_id, COUNT(1) cnt 
FROM rental
GROUP BY customer_id
ORDER BY COUNT(1) DESC
LIMIT 1;

-- join 이용하여 사용자 이름 찍어주세요

SELECT A.customer_id, COUNT(1) cnt ,  B.first_name, B.last_name
FROM rental A
INNER JOIN customer B
ON A.customer_id = B.customer_id
GROUP BY customer_id
ORDER BY COUNT(1) DESC
LIMIT 1;



-- 가장 적게 빌린 사람의 pk, 이름 빌린 수
SELECT A.customer_id, COUNT(1) ,B.first_name, B.last_name
FROM rental A
INNER JOIN customer B
ON A.customer_id = B.customer_id
GROUP BY customer_id
ORDER BY COUNT(1)
LIMIT 1;


SELECT B.customer_id, B.first_name, B.last_name, A.cnt
FROM
(
	SELECT customer_id, COUNT(1) cnt
	FROM rental
	GROUP BY customer_id
	ORDER BY count(1)
	LIMIT 1
)A
INNER join customer B
ON A.customer_id = B.customer_id;

SELECT customer_id, COUNT(1)
FROM rental 
GROUP BY customer_id
ORDER BY COUNT(1) DESC;


-- 렌탈 횟수가 40회 이상인 사람들pk, 이름, 성, 렌탈수

SELECT B.customer_id, B.first_name, B.last_name, A.cnt
FROM
(
	SELECT customer_id, COUNT(1) cnt
	FROM rental
	GROUP BY customer_id
	HAVING COUNT(1) > 39
) A
INNER join customer B
ON A.customer_id = B.customer_id
ORDER BY A.cnt;


-- p.207집계함수, 그룹함수
-- max, min avg, count, sum

SELECT customer_id
, MAX(amount), MIN(amount) 
, AVG(amount), SUM(amount) / COUNT(amount)
FROM payment
GROUP BY customer_id;
-- 암시적 그룹.. GROUP BY는 명시적 그룹


-- tip!
SELECT COUNT(customer_id)
, COUNT(DISTINCT customer_id)
FROM payment;

SELECT COUNT(1)
FROM customer;

SELECT *
FROM rental
WHERE return_date IS NULL;

SELECT COUNT(*), COUNT(return_date), COUNT(1)
FROM rental
WHERE return_date IS NULL;


-- 빌리고 반납한사람중에 제일 늦게 반납한사람??

SELECT max(DATEDIFF(return_date, rental_date))
FROM rental;


-- 제일 늦게 반납한 사람 정보, pk, 이름, 성

SELECT B.customer_id, B.first_name, B.last_name, A.cnt
FROM
(
	SELECT distinct customer_id
	FROM rental
	GROUP BY customer_id
	HAVING COUNT(1) > 39
) A
INNER join customer B
ON A.customer_id = B.customer_id
ORDER BY A.cnt;


-- 빌리고 반납한사람중에 제일 늦게 반납한사람들?
SELECT B.customer_id, B.first_name, B.last_name
FROM
(
	SELECT distinct customer_id
	FROM rental
	WHERE DATEDIFF(return_date, rental_date) = 
		(
			SELECT max(DATEDIFF(return_date, rental_date))
			FROM rental
		)
) A
INNER join customer B
ON A.customer_id = B.customer_id
ORDER BY B.customer_id;
-- 스칼라값이기 때문에 =을 사용할 수 있었음


-- 배우의 등급별 출연횟수 film_actor, film, rating
SELECT A.actor_id, B.rating, COUNT(1) cnt
FROM film_actor A
INNER JOIN film B
ON A.film_id = B.film_id
GROUP BY A.actor_id, B.rating
ORDER BY A.actor_id;


-- 배우의 카테고리별 출연횟수 
SELECT A.actor_id, B.category_id, COUNT(1) cnt
FROM film_actor A
INNER JOIN film_category B
ON A.film_id = B.film_id
GROUP BY A.actor_id, B.category_id
ORDER BY A.actor_id;


SELECT D.actor_id, D.first_name, D.last_name, A.category_id,A.name, COUNT(1) cnt
FROM category  A
INNER JOIN film_category  B
ON A.category_id = B.category_id
INNER JOIN film_actor   C
ON B.film_id = C.film_id
INNER JOIN actor D
ON D.actor_id = C.actor_id
GROUP BY D.actor_id, A.category_id
ORDER BY D.actor_id;

/*
SELECT Y.actor_id, Y.first_name, Y.last_name, X.category_id, X.name, Z.cnt
FROM (
	SELECT A.actor_id, C.category_id, COUNT(1) cnt
	FROM film_actor A
	INNER JOIN film_category C
	ON A.film_id = C.film_id
	;

*/


-- 연도별 렌탈 횟수 궁금쓰..
SELECT *
FROM rental;

SELECT concat(YEAR(rental_date),'년') `yy`, COUNT(1) cnt
FROM rental
GROUP BY `yy`;


-- 롤업생성 
SELECT fa.actor_id, f.rating, COUNT(1) cnt
FROM  film_actor fa
INNER JOIN film f
ON fa.film_id = f.film_id
GROUP BY fa.actor_id, f.rating WITH ROLLUP;


-- 배우의 등급('G', 'PG')별 출연횟수 궁금함, 출연횟수가 9초과인 actor_id 궁금쓰

SELECT B.actor_id, A.rating, COUNT(1) cnt
FROM (
	SELECT * 
	from film 
	WHERE rating = 'G' OR rating = 'PG'
) A
INNER JOIN film_actor B
ON A.film_id = B.film_id
GROUP BY B.actor_id, A.rating
HAVING COUNT(1) > 9
ORDER BY cnt;

SELECT B.actor_id, A.rating, COUNT(1) cnt
FROM film A
INNER JOIN film_actor B
ON A.film_id = B.film_id
WHERE rating = 'G' OR rating = 'PG'
GROUP BY B.actor_id, A.rating
HAVING COUNT(1) > 9
ORDER BY cnt;


-- 8.5.1
SELECT *
FROM payment;
-- 확인용

SELECT COUNT(*) cnt
FROM payment;

-- 8.5.2

SELECT customer_id, COUNT(*), sum(amount)
FROM payment
GROUP BY customer_id;

-- 8.5.3
SELECT customer_id, COUNT(*), sum(amount)
FROM payment
GROUP BY customer_id
having COUNT(*) >= 40;





