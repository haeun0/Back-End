-- 직원 남녀 숫자 알고 싶음.
SELECT gender, count(*)
FROM employees
GROUP BY gender;


-- 사번, 이름, 성, 현재 부서가 어디인지 알고싶음.
SELECT B.emp_no, B.first_name, B.last_name, C.dept_no, C.dept_name
FROM dept_emp A
	INNER JOIN employees B
	ON B.emp_no = A.emp_no
	INNER JOIN departments C
	ON C.dept_no = A.dept_no
WHERE to_date = '9999-01-01';
-- 직원과 부서의 관계는 1:N 관계






