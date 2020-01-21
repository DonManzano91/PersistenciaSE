package com.manzano.mensajes;

import java.util.Scanner;

public class MensajesServicio {
    /**
     * @Autor Alex Manz
     * Aqui se manejan los datos entre el lado del cliente y la base de datos,
     * se preparan para ser manejados por la capa DAO e interactuar con  la
     * DB
     * */
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribel el mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre");
        String autor = sc.nextLine();
        MensajesDO registro = new MensajesDO();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);
        MensajesDao.crearMensajeDB(registro);

    }

    public static void listarMensajes(){

    }

    public static void borrarMensajes(){

    }

    public static void actalizarMensajes(){

    }
}
