package com.manzano.mensajes;

public class Mensajes {
    int idMensajes;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;

    public Mensajes(){

    }

    public Mensajes(String mensaje, String autorMensaje, String fechaMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    public int getIdMensajes() {
        return idMensajes;
    }

    public void setIdMensajes(int idMensajes) {
        this.idMensajes = idMensajes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
