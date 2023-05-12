-- amount는 판매금액,  직원별 평균 판매금액 알고 싶다.
SELECT staff_id, avg(amount)
FROM payment
GROUP BY staff_id;


SELECT p.staff_id, s.first_name, s.last_name, AVG(p.amount) AS avg_amount
FROM payment p
	INNER JOIN staff s
	ON p.staff_id = s.staff_id
GROUP BY p.staff_id;

-- 



