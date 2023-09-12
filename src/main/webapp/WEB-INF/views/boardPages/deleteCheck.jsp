<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>삭제할 글 비밀번호 입력</title>
</head>
<body>
    <form action="/board/delete" method="get">
        <input type="text" name="boardPass" placeholder="비밀번호"><br>
        <input type="submit" value="삭제">
    </form>
</body>
</html>
