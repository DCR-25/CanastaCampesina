package com.canastacampesina.view;

import java.util.Scanner;

import com.canastacampesina.controller.SesionController;

public class SesionView {
    
    private SesionController sController;

    public SesionView(){
        sController=new SesionController();
    } 

    public void crearUsuario(Scanner sc){
        System.out.println("\n---------------CREAR USUARIO-------------");
        System.out.println("Ingrese la siguiente informacion: ");
        // ------------Solicitar datos al usuario------------
        System.out.print("usuario: ");
        String usuario = sc.nextLine();
        sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();
        System.out.print("Rol: ");
        String rol = sc.nextLine();
        // CREAR USUARIO
        sController.crearUsuario(usuario, contrasena, correo, rol);
        System.out.println("\n\nUSUARIO CREADO CON EXITO 💪 👊\n\n");
    }


    public void menu() {
        String mensaje = "----------------PANEL USUARIOS------------\n";
        mensaje += "1) Crear usuario\n";  
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while (opc != -1) {
            System.out.print(mensaje);
            opc = sc.nextInt();
            // Evaluar la opción ingresada
            switch (opc) {
                case 1:
                    crearUsuario(sc);
            }
        }
    }
}
