package com.manzano.mensajes;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int op = 0;

        do {
            System.out.println("----------------------");
            System.out.println("----App de mensajes--- ");
            System.out.println("1 crea mensaje");
            System.out.println("2 lista mensaje");
            System.out.println("3 edita mensaje");
            System.out.println("4 elimina mensaje");
            System.out.println("5 crea mensaje");
            op = sc.nextInt();
            switch (op){
                case 1:
                    MensajesServicio.crearMensaje();
                    break;
                case 2:
                    MensajesServicio.listarMensajes();
                    break;
                case 3:
                    MensajesServicio.actalizarMensajes();
                    break;
                case 4:
                    MensajesServicio.borrarMensajes();
                    break;
                default:
                    break;
            }
        } while (op != 5);


    }
}
