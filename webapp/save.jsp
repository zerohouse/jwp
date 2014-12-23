<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ include file="/include/tags.jspf"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/include/header.jspf"%>
</head>

<body>
    <div id="header">
        <div id="title">
            <h2><a href="/list.next">Java Web Programming 실습</a></h2>
        </div>
    </div>
     
    <div id="main">
   	저장 되었습니다.
   	<div>제목 : ${title}</div>
   	<div>작성자 : ${writer}</div>
   	<div>내용 : ${contents}</div>
	</div>

  	<br /> <a href="/list.next">돌아가기</a> 
</body>
</html>