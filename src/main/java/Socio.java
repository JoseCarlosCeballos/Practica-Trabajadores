/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public class Socio implements Directivo{
    String nombre, apellido, dni;

    public Socio(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public void mandarMensaje(String s) {

    }

    @Override
    public void emitirVoto(int v) {
        
    }
    
}
