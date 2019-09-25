/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public class Asalariado extends Trabajador {

    int pagas;

    public Asalariado(String nombre, String apellido, String dni, int sueldoAnual, int pagas) {
        super(nombre, apellido, dni, sueldoAnual);
        this.pagas = pagas;
    }

    @Override
    public void calcularSalario() {
        sueldoMes = this.sueldoAnual / this.pagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Pagas %d \n", pagas);
        System.out.printf("Sueldo mes %d \n", sueldoMes);

    }

}
