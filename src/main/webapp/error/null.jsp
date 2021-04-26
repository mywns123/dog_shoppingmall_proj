<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NULL 에러 발생</title>
</head>
<body>
	<Strong>NULL 에러 발생</Strong>
	<br>
	발생한 예외 종류 : <%=exception.getClass().getName() %><br>
	에러 메세지 : <%=exception.getMessage() %><br>	
	주소를 올바르게 입력했는지 확인해 보시기 바랍니다.
</body>
</html>
<!--
 사용브라우저가 IE일 경우는 에러 페이지 크기가 513바이트 이상 되어야 인식한다. 513바이트 이상을 주석으로 만들어주자
사용브라우저가 IE일 경우는 에러 페이지 크기가 513바이트 이상 되어야 인식한다. 513바이트 이상을 주석으로 만들어주자
사용브라우저가 IE일 경우는 에러 페이지 크기가 513바이트 이상 되어야 인식한다. 513바이트 이상을 주석으로 만들어주자
사용브라우저가 IE일 경우는 에러 페이지 크기가 513바이트 이상 되어야 인식한다. 513바이트 이상을 주석으로 만들어주자
사용브라우저가 IE일 경우는 에러 페이지 크기가 513바이트 이상 되어야 인식한다. 513바이트 이상을 주석으로 만들어주자 
-->