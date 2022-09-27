package com.canastacampesina.view;

import java.util.Scanner;

import com.canastacampesina.controller.CanastaController;

public class CanastaView {

    private CanastaController cController;

    public CanastaView(){
        cController=new CanastaController();
    } 
    
    public void crearProducto(Scanner sc){
        System.out.println("\n---------------CREAR PRODUCTO-------------");
        System.out.println("Ingrese la siguiente informacion: ");
        // ------------Solicitar datos al usuario------------
        // Solicitar id
        System.out.print("id: ");
        int idProducto = sc.nextInt();
        sc.nextLine();
        // Solicitar producto
        System.out.print("Nombre producto: ");
        String nombreProducto = sc.next();
        sc.nextLine();
        // Solicitar cantidad del producto
        System.out.print("Cantidad del producto: ");
        int cantidadProducto = sc.nextInt();
        sc.nextLine();
        // CREAR PRODUCTO
        cController.crearProducto(idProducto, nombreProducto, cantidadProducto);
        System.out.println("\n\nUNIVERSIDAD CREADA CON EXITO 💪 👊\n\n");
    }

    public void mostrarProductos(){
        String mensaje= "\n\n ------PRODUCTOS REGISTRADOS-----\n";  
        for (int i=0; i<cController.productos.size(); i++){
            mensaje+=cController.consultarProductos(i);
        } 
        System.out.println(mensaje);
    }

    public void comprarProducto(Scanner sc){
        System.out.println("\n------------COMPRAR PRODUCTO-----------\n");
        System.out.print("Ingrese el id del producto a comprar: ");
        int id = sc.nextInt();
        System.out.print("Ingrese la cantidad a comprar: ");
        int cantidadCompra=sc.nextInt();
        cController.comprarProducto(id, cantidadCompra);
        System.out.println("\n---COMPRA REALIZADA CON EXITO----\n");
    }

    public void venderProducto(Scanner sc){
        System.out.println("\n------------COMPRAR PRODUCTO-----------\n");
        System.out.print("Ingrese el id del producto a vender: ");
        int id = sc.nextInt();
        System.out.print("Ingrese la cantidad a vender: ");
        int cantidadVenta=sc.nextInt();
        cController.venderProducto(id, cantidadVenta);
        System.out.println("\n---COMPRA REALIZADA CON EXITO----\n");
    }    

    public void menu() {
        String mensaje = "----------------CANASTA CAMPESINA------------\n";
        mensaje += "1) Crear producto\n";
        mensaje += "2) Mostrar productos\n";
        mensaje += "3) Comprar producto\n";
        mensaje += "4) Vender producto\n";        
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
                    crearProducto(sc);
                    break;
                case 2:
                    mostrarProductos();
                default:
                    break;
                case 3:
                    comprarProducto(sc);
                    break;
                case 4:
                    venderProducto(sc);
                    break;
            }
        }
    }
}