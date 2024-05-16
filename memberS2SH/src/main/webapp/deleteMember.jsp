<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="DeleteMemberController" method="post" theme="simple">
id:<s:textfield name="id"/><br>

<s:submit value="刪除"/>
</s:form>

</body>
</html>