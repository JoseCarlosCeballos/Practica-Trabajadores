
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario DAM 2
 */
public class Empresa {

    ArrayList<Trabajador> listaTrabajadores;

    public Empresa() {
        this.listaTrabajadores = new ArrayList();
    }

    public void registrarTrabajador(Trabajador trabajador) {
        if (!existeTrabajador(trabajador.getDni())) {
            listaTrabajadores.add(trabajador);
        } else {
            System.out.println("El trabajador ya existe");
        }
    }

    public void listarTrabajadores() {
        for (Trabajador item : listaTrabajadores) {
            item.mostrarDatos();
        }
    }

    public void mostrarUnTrabajador(String dni) {
        for (Trabajador item : listaTrabajadores) {
            if (item.getDni().equals(dni)) {
                item.mostrarDatos();
            }
        }
    }

    public boolean existeTrabajador(String dni) {
        for (Trabajador item : listaTrabajadores) {
            if (item.getDni().equals(dni)) {
                return true;

            }
        }
        return false;
    }
}
