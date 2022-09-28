package com.canastacampesina.controller;

import java.util.ArrayList;

import com.canastacampesina.model.Sesion;

public class SesionController {

    public ArrayList<Sesion> usuarios;

    public boolean crearUsuario(String usuario, String constrasena, String correo, String rol){;
        boolean create=false;
        try { 
            Sesion cuenta = new Sesion(usuario, constrasena, correo, rol);
            usuarios.add(cuenta);  
            create=true;   
        } catch (Exception e) {
        }
        return create;
    }
}
