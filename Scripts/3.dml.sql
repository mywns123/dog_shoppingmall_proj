insert into dog(kind, price, image, country, height, weight, content, readcount)
values('푸들',1000,'pu.jpg','프랑스',1,20,'털 많다',0),
	('불독',2000,'bul.jpg','독일',1,20,'못생겼다',0),
	('진도개',3000,'jin.jpg','대한민국',1,20,'최고다',0),
	('허스키',4000,'h.jpg','북극',1,20,'멋지다',0);

select id, kind, price, image, country, height, weight, content, readcount from dog;