<%-- 
    Document   : Produit
    Created on : Nov 27, 2017, 3:21:52 PM
    Author     : Abdelhamid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <form action="AjouterProduit" method="post">
            <fieldset> <legend>Formulaire</legend>
            ID<input type="text" name="id"> <br>
            Nom<input type="text" name="nom"><br>
            Quantite<input type="text" name="quantite"><br>
            </fieldset>
            <input type="submit" name="Valider" value="Valider">
             <input type="reset" name="reset" value="reset">
            
        </form>
        
    </body>
</html>
