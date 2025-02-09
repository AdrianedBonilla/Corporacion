package org.example;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion = null;

    public Desarrollador(String nombre, int edad, double salarioBase, String departamento, String lenguajeProgramacion) {
        super(nombre, edad, salarioBase, departamento);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }

    public void programar(){
        System.out.println(getNombre() + "Está programado en " + getLenguajeProgramacion());
    }

    @Override
    public  void mostrarDetalles(){
        System.out.println("Desarrollador");
        super.mostrarDetalles();
        System.out.println("El lenguaje de programacion; " + getLenguajeProgramacion());
        System.out.println("\n------------------\n");
    }
}
