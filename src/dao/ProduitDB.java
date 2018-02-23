

package org.cours.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.cours.entities.Produit;

public class ProduitDB {
    public static Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/etablissement","zeglami","zeglami");
        }catch(Exception e){System.out.println(e);}
        return conn;
    }
    public static int ajouter(Produit produit){
        int status = 0;
        try {
            Connection conn=ProduitDB.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into produit (id,nom,quantite) values (?,?,?) ");
            ps.setInt(1,produit.getId());
            ps.setString(2,produit.getNom());
            ps.setInt(3,produit.getQuantite());
            status=ps.executeUpdate();
            conn.close();
        }catch(Exception e){{System.out.println(e);}
    }
        return status;
}
}