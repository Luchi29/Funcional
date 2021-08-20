package com.example.funcional;


public class Paquete {


    int id;
    String direccion;
    double peso;
    String localidad;

    Paquete(int id, String direccion, double peso, String localidad){
        this.id = id;
        this.direccion = direccion;
        this.peso = peso;
        this.localidad = localidad;

}

    public int getId() {
        return id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public double getPeso() {
        return peso;
    }

    public String getDireccion() {
        return direccion;
    }



}
