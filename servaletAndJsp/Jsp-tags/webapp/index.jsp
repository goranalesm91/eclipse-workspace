<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Jsp File</title>
</head>
<body>
<h1>Welcome to jSP</h1>
<%! int a=10;String s="Siddhu"; %>
<%=a %><br>
<%=s %>
<%  int sum=10+20;
int sub=sum-10;%>
<h1>sum is equal :10+20 =<%= sum %></h1>
<h1>differ of :sum-10 = <%= sub %></h1>
</body>
</html>