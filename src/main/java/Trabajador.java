/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public abstract class Trabajador {

    public String nombre, apellido, dni;
    public int sueldoAnual;
    public double sueldoMes;

    public Trabajador(String nombre, String apellido, String dni, int sueldoAnual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoAnual = sueldoAnual;
    }
    
    public void mostrarDatos(){
        System.out.printf("Nombre %s \n", nombre);
        System.out.printf("Apellido %s \n", apellido);
        System.out.printf("DNI %s \n", dni);
        System.out.printf("Sueldo anual %d \n", sueldoAnual);
        System.out.printf("Sueldo mensual %d \n", sueldoMes);
    }
    
    public abstract void calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(int sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }

    public double getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(double sueldoMes) {
        this.sueldoMes = sueldoMes;
    }
    
    
}
