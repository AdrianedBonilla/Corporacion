package org.example;

public class Gerente extends Empleado{
    private double bono=0;

    public Gerente(String nombre, int edad, double salarioBase, String departamento, double bono) {
        super(nombre, edad, salarioBase, departamento);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    @Override
    public double calcularSalario(){
        return  getSalarioBase() + getBono();
    }

    public void mostrarDetalles(){
        System.out.println("Gerente");
        super.mostrarDetalles();
        System.out.println("Bono: " + getBono());
        System.out.println("\n------------------------------------\n");
    }
}
