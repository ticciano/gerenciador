<%-- 
    Document   : novaEmpresa
    Created on : Sep 16, 2022, 1:09:32 PM
    Author     : ticiano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String nomeEmpresa = (String)request.getAttribute("empresa"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa cadastrada</title>
    </head>
    <body>
        <h2>Empresa <%= nomeEmpresa %> cadastrada!!</h2>
    </body>
</html>
