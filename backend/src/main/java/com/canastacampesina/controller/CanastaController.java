package com.canastacampesina.controller;

import java.util.ArrayList;

import org.apache.coyote.http11.filters.IdentityOutputFilter;

import com.canastacampesina.model.Canasta;

public class CanastaController {
    
    public ArrayList<Canasta> productos;

    public CanastaController(){
        productos= new ArrayList<Canasta>();
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

    public boolean comprarProducto(int id, int cantidadCompra){
        boolean compra=false;
        for (int i=0; i<productos.size(); i++){
            if (productos.get(i).getIdProducto().equalsIgnoreCase(id)){
                productos.get(i).setCantidadProducto(productos.get(i).getCantidadProducto()-cantidadCompra);
                break;
            }
        }

        return compra;
    } 
}
