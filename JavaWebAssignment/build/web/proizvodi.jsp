<%-- 
    Document   : user.jsp
    Created on : Nov 27, 2017, 2:42:45 PM
    Author     : rajic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>proizvodi</title>
    </head>
    <body style="font-family: Helvetica">
        <%@include file="header.jsp" %>
        <h1 align="center">Katalog proizvoda</h1>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>Unos</h2>
            <form
            <label>Naziv proizvoda</label><br>
            <input type="text" name="productName"<br><br>
            <input type="number" name="productId"><br><br>
            <input type="number" name="productPrice"><br><br>
            <input type="submit" value="Dodaj" name="proizvodi"><br><br>
            </form>
        </div>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>izmena</h2>
            <form
            <label>ID:</label><br>
            <input type="number" name="productId"<br><br>
            <input type="number" name="productPrice"><br><br>
            <label>Nova Cena</label><br>
            <input type="number" name="productId"<br><br>
            <input type="number" name="productPrice"><br><br>
            <input type="submit" value="Izmeni" name="proizvodi"><br><br>
            </form>
        </div>
        <div style="float: left">
            <form
            <label><h2>Brisanje proizvoda</h2></label><br>
            <input type="text" name="productName"<br><br>
            <input type="number" name="productId"><br><br>
            <input type="submit" value="Obrisi" name="Brisanje proizvoda"><br><br>
            </form>
        </div>
    </body>
</html>
