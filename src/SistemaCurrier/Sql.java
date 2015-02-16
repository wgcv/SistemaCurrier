/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCurrier;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.*;
import javax.sql.rowset.CachedRowSet;
/**
 *
 * @author Gustavo
 */
public class Sql {
    static Connection cn;
 static Statement s;
 static ResultSet rs;
     public static CachedRowSet query(String sql){
         CachedRowSet rowset=null;
     try {
            
         
         
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "BASEDATOS", "123456");
            //Para ejecutar la consulta
            s =  cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery(sql);
             
            rowset = new CachedRowSetImpl();
            rowset.populate(rs);
            
           rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
           

     return ( rowset );
    }
     
       public static void exec(String sql){
      
     try {
            
         
         
            //Para conectarnos a nuestra base de datos
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            // Establecemos los valores de cadena de conexión, usuario y contraseña
            cn = DriverManager.getConnection(url, "BASEDATOS", "123456");
            //Para ejecutar la consulta
            s =  cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = s.executeQuery(sql);
             
          
            
           rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }
           

  
    }
}

