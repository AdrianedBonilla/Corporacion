package org.example;

public abstract class Empleado {
    private String nombre =  null;
    private  int edad = 0;
    private double salarioBase = 0;
    private String departamento = null;

    public abstract double calcularSalario();

    public void mostrarDetalles (){

    }
}
