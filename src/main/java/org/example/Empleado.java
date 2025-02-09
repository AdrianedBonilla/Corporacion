package org.example;

public abstract class Empleado {
    private String nombre =  null;
    private  int edad = 0;
    private double salarioBase = 0;
    private String departamento = null;

    public Empleado(String nombre, int edad, double salarioBase, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles (){
        System.out.println("Nombre: " +  nombre + "\n" +
                            ",Edad: " + edad + "\n" +
                            ",Salario: " + salarioBase + "\n" +
                            ",Departamento: " + departamento + "\n" + ".");
    }
}
