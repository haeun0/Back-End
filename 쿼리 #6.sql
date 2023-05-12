SELECT * FROM film_actor
ORDER BY actor_id DESC, film_id;

-- rental 테이블, staff_id = 1인 사람이 거래한 정보만 보고싶다.
-- 컬럼은 rental_id, rental_date, return_date, customer_id만
-- 나오게 해주세요

SELECT 
	rental_id
	, rental_date
	, return_date
	, customer_id
FROM rental
WHERE staff_id = 1
ORDER BY rental_id;