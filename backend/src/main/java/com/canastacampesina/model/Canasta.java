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

    @Override
    public String toString() {
        String info = "-----------" + idProducto + "------------\n";
        info += "Nombre del prodecto: " + nombreProducto;
        info += "\nCantidad disponible: " + cantidadProducto;
        info += "\n--------------------------------------------------------\n";
        return info;
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
