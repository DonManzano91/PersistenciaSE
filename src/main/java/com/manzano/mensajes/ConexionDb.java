package com.manzano.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {

    public Connection getConexion(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if (conexion!=null){
                System.out.println("conectado DB");
            }
        } catch(SQLException e) {
            System.out.println("no conectado " + e);
        }
        return conexion;
    }
}
