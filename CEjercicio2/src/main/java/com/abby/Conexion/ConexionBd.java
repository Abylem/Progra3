package com.abby.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBd {
private Connection connec;

     public ConexionBd()
     {
    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");
    		 connec = DriverManager.getConnection("jdbc:mysql://localhost/appbanco","root","root");
		     System.out.println("Conectado a la BD");
    		 
    	 }catch(Exception e) {
    		 
    		 System.out.println("Error de Conexion a la BD" + e);
    	 }
    	 
     }
     public Connection RetornarConexion() {
    	 return connec;
     }
}
