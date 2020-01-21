package com.manzano.mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Alex Manz
 * */
public class MensajesDao {
    /**
     * CRUD de mensajes contenido y autor de los mensajes
     * Aqui viven las operaciones tal cual se operan en la DB
     * */
    public static void crearMensajeDB(MensajesDO mensajes)
    /**
     * @Param mensajes contenido y autor del mensaje
     * Operación de generación de una nueva fila.
     * */
    {
        ConexionDb conexionDb = new ConexionDb();
        try(Connection connection = conexionDb.getConexion()) {
            PreparedStatement ps = null;
            try{
                /*Llenando la consulta con el contenido de mensajes*/
                String consulta ="INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?,?)";
                ps = connection.prepareStatement(consulta);
                ps.setString(1, mensajes.getMensaje());
                ps.setString(2, mensajes.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.printf("");
        }
    }

    public static void litarMensajesDB(){

    }

    public static void borrarMensajesDB(){

    }

    public static void actalizarMensajesDB(MensajesDO mensajesDO){

    }
}
