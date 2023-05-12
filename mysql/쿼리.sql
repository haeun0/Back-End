
-- Data Definition Language

CREATE TABLE t_test(
	id BIGINT UNSIGNED AUTO_INCREMENT
	, nm VARCHAR(100) NOT NULL
	, jumin CHAR(9) NOT null
	, age INT NOT NULL
	, addr VARCHAR(200)
	, created_at DATETIME DEFAULT NOW()
	, PRIMARY KEY(id)
);

DROP TABLE t_test;
-- AUTO_INCREMENT 숫자를 자동으로 1씩올림 pk에 사용

-- Data Mamipulation Language
-- CRUD

INSERT INTO t_test
( nm, jumin, age, addr)
VALUES
( '신사임당', '9012112', 30, '대구시');

INSERT INTO t_test
( nm, jumin, age, addr)
VALUES
( '홍길동', '9510142', 25, '서울시');

INSERT t_test
SET nm = '강감찬'
, jumin = '971211212'
, age = 21
, addr = '경북';

-- Read (Select문)
SELECT * FROM t_test;

SELECT nm, jumin FROM t_test;

SELECT nm, jumin AS '주민번호' FROM t_test;

SELECT * FROM t_test
WHERE nm = '홍길동';

SELECT * FROM t_test
WHERE nm = '신사임당'
AND age > 27;

SELECT * FROM t_test
WHERE age = 25 OR age = 27;

SELECT * FROM t_test
WHERE age IN (25, 27);

SELECT * FROM t_test
WHERE age BETWEEN 27 and 30;

SELECT * FROM t_test
WHERE nm LIKE '%사임%';

-- U (update문)

UPDATE t_test
SET nm = '유관순'
WHERE id = 2;

UPDATE t_test
SET age = 27
, addr = '부산시'
WHERE id = 3;

-- Delete

DELETE FROM t_test
WHERE id = 4;


