/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public class Gerente extends Trabajador implements Directivo{

    public Gerente(String nombre, String apellido, String dni, int sueldoAnual) {
        super(nombre, apellido, dni, sueldoAnual);
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void mandarMensaje(String s) {

    }

    @Override
    public void emitirVoto(int v) {

    }
    
}
