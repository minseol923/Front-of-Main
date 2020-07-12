<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

    
<!-- jQuery -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script><script  src="./boardScript.js"></script>



<!-- Bootstrap CSS -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">



<!-- common CSS -->

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/common.css"><link rel="stylesheet" href="./boardStyle.css">


<title>board</title>

</head>

<body>

	<article>

		<div class="container" role="main">

			<h2>board Form</h2>

			<form name="form" id="form" role="form" method="post" action="${pageContext.request.contextPath}/board/saveBoard">

				<div class="mb-3">

					<label for="title">제목</label>

					<input type="text" class="form-control" name="title" id="title" placeholder="제목을 입력해 주세요">

				</div>

				

				<div class="mb-3">

					<label for="reg_id">작성자</label>

					<input type="text" class="form-control" name="reg_id" id="reg_id" placeholder="이름을 입력해 주세요">

				</div>

				

				<div class="mb-3">

					<label for="content">내용</label>

					<textarea class="form-control" rows="5" name="content" id="content" placeholder="내용을 입력해 주세요" ></textarea>

				</div>

	
			

			</form>

			<div >

				<button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>

				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>

			</div>

		</div>

	</article>

</body>

</html>
