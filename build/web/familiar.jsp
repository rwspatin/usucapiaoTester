<%-- 
    Document   : familiar
    Created on : 19/11/2017, 19:28:45
    Author     : rwspa
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

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
        <title>Teste Usucapiao Judicial Familiar</title>
    </head>
    <body>
               <!--Menu-->
        <nav>
            <object width="100%" height="65px" data="menu.jsp"></object>
        </nav>
    <div class="container">
        <font face="tahoma">
            <h1>Insira os Dados</h1>
            <form action="UsucapiaoJudicialFamiliarServlet" method="post" name="frmUsucapiaoJudicialFamiliar" onsubmit="return validaFormularioCadastro()">
                <table>
                    <tr>
                        <td>Deseja ter dominio do imóvel?</td><td><input type="checkbox" name="animusDomini"></td>
                    </tr>
                    <tr>
                        <td>Está a quanto tempo no imóvel (em anos)?</td><td><input type="text" name="prazo" size="4"></td>
                    </tr>
                    <tr>
                        <td>Posse mansa?</td><td><input type="checkbox" name="posseMansa"></td>
                    </tr>
                    <tr>
                        <td>Continua sem ação contra sua posse?</td><td><input type="checkbox" name="possePacifica"></td>
                    </tr>
                    <tr>
                        <td>Exerce posse até hoje?</td><td><input type="checkbox" name="posseIninterrupta"></td>
                    </tr>
                    <tr>
                        <td>Seu conjuge abandonou o imovel?</td><td><input type="checkbox" name="conjugeAbandonou"></td>
                    </tr>
                    <tr>
                        <td>Seu(sua) companheiro(a) abandonou o imovel?</td><td><input type="checkbox" name="companheiroAbandonou"></td>
                    </tr>
                    <tr>
                        <td>Possui registro de outro imovel?</td><td><input type="checkbox" name="resgitroDeOutroImovel"></td>
                    </tr>
                    <tr>
                        <td>O imovel é do casal?</td><td><input type="checkbox" name="bemComumCasal"></td>
                    </tr>
                    <tr>
                        <td>Qual tamanho do terreno?</td><td><input type="text" size="6" name="tamanhoTerreno"></td>
                    </tr>
                    <tr>
                        <INPUT size="3" type="Hidden" name="vOP" value="0">
                        <td></td><td><input type="submit" name="Enviar" value="Enviar"></td>
                    </tr>               
                </table>
            </form>
            <br><br> <br><a href="index.jsp" >Voltar</a><br>
        </font>
    </div>
        <SCRIPT language="JavaScript">
            <!--
    
            function validaFormularioCadastro() { 
                frm = document.frmUsucapiaoExtrajudicial;
                var animusDomini;
                var prazo;
                var consenso;
                vMensagem = "";
                vRequeridos = 0;
                
                if (frm.prazo.value == ""){
                    vMensagem = "Informe O tempo que está no imóvel.\n"+vMensagem;
                    vRequeridos = 1;
                    frm.vFrequencia.focus();
                }                             
                                
            } 
    
    
            //-->
        </SCRIPT>        
    </body>
</html>
