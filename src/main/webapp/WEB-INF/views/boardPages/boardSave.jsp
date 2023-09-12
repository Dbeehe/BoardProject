
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글작성 페이지</title>
</head>
<body>
<div id="section">
    <form action="/board/save" method="post"> <br>
        <input type="text" name="boardTitle" placeholder="제목"><br>
        <input type="text" name="boardWriter" placeholder="작성자"><br>
        <input type="text" name="boardPass" placeholder="비밀번호"><br>
        <textarea name="boardContents" cols="30" rows="10"></textarea> <br>
        <input type="submit" value="작성">
    </form>
</div>

</body>
</html>
