package com.canastacampesina.controller;

import java.util.ArrayList;

import com.canastacampesina.model.Sesion;

public class SesionController {

    public ArrayList<Sesion> usuarios;

    //public SesionController(){
    //    usuarios= new ArrayList<Sesion>();
    //}
    
    //public void mostrarUsuario(){
    //    System.out.println(usuarios.get(0).getUsuario());
    //}

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

    public boolean login(String usuario, String contrasena){
        boolean login = false;
        for (int i=0; i<usuarios.size(); i++){
            if (usuarios.get(i).getUsuario()==usuario && usuarios.get(i).getConstrasena()==contrasena){
                System.out.println("Acceso permitido");;
                login = true;
                break;
            }else{System.out.println("Usuario y/o contraseña incorrecta");}
        }
        return login;
    }
}
