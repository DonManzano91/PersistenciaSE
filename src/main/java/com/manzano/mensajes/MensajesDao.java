package com.manzano.mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            System.out.printf(String.valueOf(e));
        }
    }

    public static void litarMnsajesDB(){
        ConexionDb conexionDb = new ConexionDb();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection connection = conexionDb.getConexion()) {

            /*consulta general con el contenido de mensajes*/
            String consulta = "Select * from Mensajes";
            ps = connection.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id_Mensajes"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("ID: " + rs.getString("autor_mensaje"));
                System.out.println("ID: " + rs.getString("fecha"));
                System.out.println("////////////");
            }
        }catch (SQLException e) {
            System.out.printf(String.valueOf(e));
        }
    }

    public static void borrarMensajesDB(int id_mensajes){
        ConexionDb conexion = new ConexionDb();
        PreparedStatement ps = null;

        try(Connection conn = conexion.getConexion()){
            try{
                String consulta = "DELETE FROM `mensajes` WHERE `mensajes`.`id_Mensajes` = " + id_mensajes;
                ps=conn.prepareStatement(consulta);
                //ps.setInt(1,id_mensajes);
                ps.executeUpdate(consulta);
                System.out.println("El mensaje fue borrado");
            } catch (SQLException a){
                System.out.println("No se pudo borrar: " + a);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void actalizarMensajesDB(MensajesDO mensajesDO){

    }
}
