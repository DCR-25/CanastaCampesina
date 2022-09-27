package com.canastacampesina.model;

public class Canasta {
    private int idProducto;
    private String nombreProducto;
    private int cantidadProducto;

    public Canasta(){

    }

    public Canasta(int idProducto, String nombreProducto, int cantidadProducto){
        this.idProducto=idProducto; 
        this.nombreProducto=nombreProducto;
        this.cantidadProducto=cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
