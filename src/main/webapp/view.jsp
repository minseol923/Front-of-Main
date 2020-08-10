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
            document.form1.action="${path}/delete.do";
            document.form1.submit();
            
            }
         });
      $("#btnUpdate").click(function(){
         var title =$("#title").val();
         var content =$("content").val();
         var writer =$("writer").val();
         if(title ==""){
            alert("제목을 입력하세요.");
            document.form1.title.focus();
            return;
            }
         if(title ==""){
            alert("내용을 입력하세요.");
            document.form1.content.focus();
            return;
            }
         if(title ==""){
            alert("이름을 입력하세요.");
            document.form1.writer.focus();
            return;
            }
         document.form1.action="${path}/update.do";
         document.form1.submit();
         });
   });
</script>
</head>
<body>
<h2>게시글 보기</h2>
<form name="form1" method="post">
	<div>
		조회수 : ${dto.viewcnt}
	</div>
	 <div>
      	제목 <input type="title" id="title" size="80" value="${dto.title}" placeholer="제목을 입력해주세요">
   </div>
   <div>
      	내용 <textarea name="content" id="content" rows="4" cols="80" placeholer="내용을 입력해주세요.">
   </div>
   <div>
    	  이름 <input type="writer" id="writer" value-"${dto.writer}" placeholder="이름을 입력해주세요">
   </div>
   <div style="width:650px; text-align: center;">
   	<input type="hidden" name="bno" value="${dto.bno}">
   		<button type="button" id="btnUpdate">수정</button>
   		<button type="button" id="btnDelete">삭제</button>
</form>
</body>
</html>