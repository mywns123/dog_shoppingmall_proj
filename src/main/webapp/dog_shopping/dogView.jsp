<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/dogView.css">
</head>
<body>
	<section id="listForm">
	<h2>${dog.kind}의 상세정보</h2>
		<section id="content_main">
			<section id="content_left">
				<img src="../images/${dog.image}"/>
			</section>
			<section id="content_right">
				<b>품종 :</b>${dog.kind}<br>
				<b>가격 :</b>${dog.price}<br>
				<b>신장 :</b>${dog.height}<br>
				<b>체중 :</b>${dog.weight}<br>
				<b>원산지 :</b>${dog.country}<br>
				<p id="desc">
				<b>내용 :</b>${dog.content}<br>
				</p>
			</section>
			<div style="clear: both;"></div>
			<nav id="commandList">
				<a href="dogList.do">쇼핑계속하기</a>
				<a href="dogCartAdd.do?id=${dog.id}">장바구니에 담기</a>
			</nav>			
		</section>	
	</section>
</body>
</html>