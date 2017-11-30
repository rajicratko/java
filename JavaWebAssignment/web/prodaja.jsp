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
        <title>Prodaja</title>
    </head>
    <body style="font-family: Helvetica">
        <%@include file="header.jsp" %>
        <h1 align="center">Korpa</h1>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>Unos</h2>
            <label>Ime</label><br>
            <input type="text" name="new_name"<br><br>
            <label>Stanje racuna</label><br>
            <input type="number" name="new_balance"><br><br>
            <input type="submit" value="Dodaj" name="new_buyer"><br><br>
            
        </div>
        <div style="float: left; padding-right: 10em; margin-left: 10em">
            <h2>izmena</h2>
            <label>ID:</label><br>
            <input type="number" name="updated_id"<br><br>
            <label>novo ime</label><br>
            <input type="text" name="update_name"><br><br>
            <input type="submit" value="Izmeni" name="update_buyer"><br><br>
        </div>
        <div style="float: left">
            <label>ID:</label><br>
            <input type="number" name="delete_id"<br><br>
            <input type="text" name="update_name"><br><br>
            <input type="submit" value="Obrisi" name="delete_buyer"><br><br>
        </div>
    </body>
</html>
