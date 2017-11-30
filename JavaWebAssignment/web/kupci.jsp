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
        <title>Kupci</title>
    </head>
    <body style="font-family: Helvetica;">
        <%@include file="header.jsp" %>
        <h1 align="center">Kupac</h1>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>Novi Kupac</h2>
            <form
            <label>ID:</label><br>
            <input type="text" name="custId"<br><br>
            <label>Ime:</label><br>
            <input type="text" name="firstName"<br><br>
            <label>Prezime:</label><br>
            <input type="text" name="lastName"<br><br>
            <label>E-mail:</label><br>
            <input type="text" name="emailID"<br><br>
            <label>Password:</label><br>
            <input type="text" name="password"<br><br>
            <input type="submit" value="Dodaj" name="Novi kupac"><br><br>
            </form>
        </div>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>izmena</h2>
            <form
            <label>ID:</label><br>
            <input type="number" name="updated_id"<br><br>
            <label>novo ime</label><br>
            <input type="text" name="update_name"><br><br>
            <input type="submit" value="Izmeni" name="izmeni"><br><br>
            </form>
        </div>
        <div style="float: left">
             <h2>Obrisi kupca</h2>
            <label><h2>ID:</h2></label><br>
            <form
            <input type="number" name="delete_id"<br><br>
            <input type="submit" value="Obrisi" name="Obrisi"><br><br>
            </form>
        </div>
    </body>
</html>
