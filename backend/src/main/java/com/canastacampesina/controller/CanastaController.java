package com.canastacampesina.controller;

import java.util.ArrayList;

import com.canastacampesina.model.Canasta;

public class CanastaController {
    
    private ArrayList<Canasta> productos;

    public CanastaController(){
        productos= new ArrayList<Canasta>();
    }

    public int cantidadProductos(){
        return productos.size();
    }

    public boolean crearProducto(int idProducto, String nombreProducto, int cantidadProducto){
        boolean create=false;
        try {
            Canasta canasta = new Canasta(idProducto, nombreProducto, cantidadProducto);
            create=true;    
            productos.add(canasta);        
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return create;
    }

    public String consultarProductos(int index){
        String info = "";
        if (index >= 0 && index < productos.size()) {
            info = productos.get(index).toString();
        }
        return info;    
    }
}
