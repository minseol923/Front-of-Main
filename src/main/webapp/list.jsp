<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<script>
	$(document).ready(function(){
		$("#btnWrite").click(function(){
			location.href="${path}/write.do";
			});
		});   
</script>
</head>
<body>
<h2>게시글 목록</h2>
<button type="button" id="btnWrite">글쓰기</button>
	<table border="1" width="600px">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>이름</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
	<c:foreach var="row" items="${list}">
		<tr>
			<td>${row.bno}</td>
			<td><a href="${path}/view.do?bno=${row.bno}">${row.title}</a></td>
			<td>${row.writer}</td>
			<td>
				<fmt:formatDate value="${row.regdate}" pattern="yyy-MM-dd HH:mm:ss"/>
			</td>
			<td>${row.viewcnt}</td>
		</tr>
	</c:foreach>
</table>
</body>
</html>