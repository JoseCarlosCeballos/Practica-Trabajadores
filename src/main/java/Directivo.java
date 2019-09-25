/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 2
 */
public interface Directivo {
    
    // Variables son CONSTANTES
    // Metodos con solo la firma
    
    default void presentacion(){
        
    }
    public void mandarMensaje(String s);
    public void emitirVoto(int v);
}
