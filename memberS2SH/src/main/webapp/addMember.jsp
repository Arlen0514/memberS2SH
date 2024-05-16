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
<s:form action="AddMemberController" method="post" theme="simple">
名:<s:textfield name="name"/><br>
帳號:<s:textfield name="username"/><br>
密碼:<s:password name="password"/><br>
<s:submit value="確定"/><s:reset value="重設"/>
</s:form>
</body>
</html>