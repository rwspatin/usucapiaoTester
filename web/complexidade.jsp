<%-- 
    Document   : complexidade
    Created on : 19/11/2017, 20:52:12
    Author     : rwspa
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Usucapiao</title>
    </head>
    <body>
        <!--Menu-->
        <nav>
            <object width="100%" height="65px" data="menu.jsp"></object>
        </nav>
    <div class="container">
        <font face="tahoma">
            <h1>Escolha a classe para conferir a complexidade ciclomatica</h1><br><br>
            
            <a href="#" onclick="alert('Não há complexidade ciclomatica na classe usucapião');">1. Usucapiao</a><br>
            <a href="complexidade/usucapiao_extrajudicialC.jsp">2. Usucapiao Extrajudicial</a><br>
            <a href="#" onclick="alert('Não há complexidade ciclomatica na classe usucapião judicial');">3. Usucapiao Judicial</a><br>
            <a href="complexidade/_judicial_extraordinariaC.jsp">4. Usucapiao Judicial Extraordinaria</a><br>
            <a href="complexidade/_judicial_ordinariaC.jsp">5. Usucapiao Judicial Ordinaria</a><br>
            <a href="complexidade/_judicial_urbanaC.jsp">6. Usucapiao Judicial Urbana</a><br>
            <a href="complexidade/_judicial_coletivaC.jsp">7. Usucapiao Judicial Urbana Coletiva</a><br>
            <a href="complexidade/_judicial_ruralC.jsp">8. Usucapiao Judicial Rural</a><br>
            <a href="complexidade/_judicial_familiarC.jsp">9. Usucapiao Judicial Familiar</a><br>
            <a href="complexidade/medida_terrenoC.jsp">10. Medida Terreno</a><br>
        </font>
    </div>
    </body>
</html>