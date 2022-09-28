package com.canastacampesina.model;

public class Sesion {
    
    private String usuario;
    private String constrasena;
    private String correo;
    private String rol;
    
    public Sesion(String usuario, String constrasena, String correo, String rol) {
        this.usuario = usuario;
        this.constrasena = constrasena;
        this.correo = correo;
        this.rol=rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getConstrasena() {
        return constrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    

}
