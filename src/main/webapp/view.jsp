<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<script>
	$(document).read(function(){
		$("#btnDelete").click(function(){
			if(confirm("삭제하시겠습니까?")){
				document.form1.action="delete.do";
				document.form1.submit();
				
				}
			});
		
</script>
</head>
<body>
</body>
</html>