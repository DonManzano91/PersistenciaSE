package com.manzano.mensajes;

import java.sql.Connection;

public class Inicio {

    public static void main(String[] args) {

        ConexionDb conexion = new ConexionDb();

        try(Connection conn = conexion.getConexion()) {
            System.out.println("Conexion exitosa 2");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
