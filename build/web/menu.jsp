<%-- 
    Document   : menu
    Created on : 19/11/2017, 19:59:31
    Author     : rwspa
--%>

<!DOCTYPE html>
<html>
    <head>
    <style>
    body {
	padding:0px;
	margin:0px;
    }
    
    ul li { display: inline; }
    ul {
        padding:0;
	margin:0;
	float: left;
	width: 100%;
	background-color: #333;
	list-style:none;
	font:80% Tahoma;
        overflow: hidden;
        
    }
    li {
        float: left;
    }
    li a {
        display: block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    }
    li a:hover:not(.active) {
        background-color: red;
    }
    .active {
        background-color: red;
    }
    </style>
    </head>
    <body>
        <ul>
              <li class="active"><a href="index.jsp" target="_parent">Inicio</a></li>
              <li><a href="modelagem.jsp" target="_parent">Modelagem</a></li>
              <li><a href="complexidade.jsp" target="_parent">Complexidade Ciclomatica</a></li>
        </ul>
    </body>
</html>