SELECT 
	NAME
	, 'common' AS languge_usage
	, FLOOR(language_id * 3.1415927) AS lang_pi_value
	, UPPER(NAME) AS language_name
	, NAME + 'man'
	, CONCAT(NAME, 'man', 'yep') AS another_name
FROM language;

SELECT distinct actor_id 
FROM film_actor 
ORDER BY actor_id DESC;


SELECT
	concat(cust.first_name, cust.last_name) AS full_name
FROM (
	SELECT first_name, last_name, email
	FROM customer
	WHERE FIRST_NAME = 'JESSIE'
) AS cust;



