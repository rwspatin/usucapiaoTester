<%-- 
    Document   : resultado
    Created on : 19/11/2017, 18:18:24
    Author     : rwspa
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${mensagem==null}">
    <c:set var="mensagem" value="Não Aplicavel." />   
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Resultado</title>
    </head>
    <body>
               <!--Menu-->
        <nav>
            <object width="100%" height="65px" data="menu.jsp"></object>
        </nav>
    <div class="container">
        <font face="tahoma">
            <h1>Resultado</h1><br><br>
            
            <br><br>
            <b>Mensagem do Sistema:</b> <c:out value="${mensagem}" />
        </font>
    </div>
    </body>
</html>

