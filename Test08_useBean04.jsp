<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>

	<%--200728 ? useBean���� id�� Capital ���X?  a�׷�����?����--%>
	
	<jsp:useBean id ="Person1" class="com.id.dao.Person1" scope="request" />
	<p> ���̵�: <%=Person1.getId()%>
	<p> ��   ��: <%=Person1.getName()%>
		<%
			Person1.setId(20182342);
			Person1.setName("2�����");
		%>
	
	<jsp:include page="Test07_useBean03.jsp"/>
</body>
</html>