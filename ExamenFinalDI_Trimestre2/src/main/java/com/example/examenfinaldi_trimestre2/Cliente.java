package com.example.examenfinaldi_trimestre2;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String sexo;
    private double peso;
    private int edad;
    private int talla;
    private String tipoActividad;
    private String observaciones;

    public Cliente(String nombre, String sexo, double peso, int edad, int talla, String tipoActividad, String observaciones){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.talla = talla;
        this.tipoActividad = tipoActividad;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cliente(){

    }
    public double metGer(int edad, int talla, double peso,String sexo){
        if (Objects.equals(sexo, "Hombre")){
            return 66.473+13.751*peso+5.0033*talla-6.755*edad;
        }else {
            return Math.round(655.0955+9.463*peso+1.8496*talla-4.6756*edad);
        }

    }
    public double metGet(int edad, int talla, double peso,String tipoActividad,String sexo){
        double primerRes = 0;

        if (Objects.equals(sexo, "Hombre")){
            primerRes = 66.473+13.751*peso+5.0033*talla-6.755*edad;
            switch (tipoActividad){
                case "sedentario":
                    return primerRes*1.3;
                case "moderado":
                    return primerRes*1.6;
                case "activo":
                    return primerRes*1.7;
                case "muy activo":
                    return primerRes*2.1;
            }
        }else {
            primerRes = Math.round(655.0955+9.463*peso+1.8496*talla-4.6756*edad);
            switch (tipoActividad){
                case "sedentario":
                    return primerRes*1.3;
                case "moderado":
                    return primerRes*1.5;
                case "activo":
                    return primerRes*1.6;
                case "muy activo":
                    return primerRes*1.9;
            }
        }
        return 0;

    }
}
