-- 개
DROP TABLE IF EXISTS shoppingmall.Dog RESTRICT;

-- 개_쇼핑몰
DROP SCHEMA IF EXISTS shoppingmall;

-- 개_쇼핑몰
CREATE SCHEMA shoppingmall;

-- 개
CREATE TABLE shoppingmall.Dog (
	id        INTEGER      NOT NULL COMMENT '아이디', -- 아이디
	kind      VARCHAR(12)  NOT NULL COMMENT '품종', -- 품종
	price     INTEGER      NOT NULL COMMENT '가격', -- 가격
	image     VARCHAR(20)  NOT NULL COMMENT '이미지', -- 이미지
	country   VARCHAR(12)  NOT NULL COMMENT '원산지', -- 원산지
	height    INTEGER      NULL     COMMENT '평균 신장', -- 평균 신장
	weight    INTEGER      NULL     COMMENT '평균 체중', -- 평균 체중
	content   VARCHAR(400) NULL     COMMENT '설명', -- 설명
	readcount INTEGER      NULL     COMMENT '조회수' -- 조회수
)
COMMENT '개';

-- 개
ALTER TABLE shoppingmall.Dog
	ADD CONSTRAINT PK_Dog -- 개 기본키
		PRIMARY KEY (
			id -- 아이디
		);

ALTER TABLE shoppingmall.Dog
	MODIFY COLUMN id INTEGER NOT NULL AUTO_INCREMENT COMMENT '아이디';