<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/css/dogRegistForm.css">
</head>
<body>
	<section id="registForm">
	<header><h2>개정보 등록</h2></header>
	<form action="dogRegist.do" method="post" name="writeForm" enctype="multipart/form-data">
	<table>
		<tr>
			<td colspan="2"><a href="dogList.do">목록보기</a></td>
		</tr>
		
		<tr>
			<td class="td_left"><label for="kind">품종 : </label></td>
			<td class="td_right"><input type="text" name="kind" id="kind" required/></td>
		</tr>
	
		<tr>
			<td class="td_left"><label for="nation">원산지 : </label></td>
			<td class="td_right"><input type="text" name="nation" id="nation" /></td>
		</tr>
	
		<tr>
			<td class="td_left"><label for="price">가격 : </label></td>
			<td class="td_right"><input type="text" name="price" id="price" /></td>
		</tr>
		
		<tr>
			<td class="td_left"><label for="height">신장 : </label></td>
			<td class="td_right"><input type="text" name="height" id="height" /></td>
		</tr>
		
		<tr>
			<td class="td_left"><label for="weight">체중 : </label></td>
			<td class="td_right"><input type="text" name="weight" id="weight" /></td>
		</tr>
		
		<tr>
			<td class="td_left"><label for="content">글내용 : </label></td>
			<td class="td_right"><textarea name="content" id="content" rows="13" cols="40" wrap="off"></textarea></td>
		</tr>
		
		<tr>
			<td class="td_left"><label for="image">상품이미지 : </label></td>
			<td class="td_right"><input type="file" name="image" id="image" /></td>
		</tr>
		
		<tr>
			<td colspan="2" id="commandCell">	
				<input type="submit" value="개 상품 등록"/>
				<input type="reset" value="다시작성"/>
				<input type="button" value="개 상품목록보기" onclick="window.location.href='dogList.do'"/>
			</td>
		</tr>
	</table>
	</form>
	</section>
</body>
</html>