
public class Entrada {


    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        Trabajador autonomo = new Autonomo("NAut", "AAut", "123", 1);
        Trabajador asalariado = new Asalariado("NAs", "AAs", "1234", 2, 15);
        Trabajador gerente = new Gerente("NGr", "AGr", "12345", 3);
        empresa.registrarTrabajador(asalariado);
        empresa.registrarTrabajador(autonomo);
        empresa.registrarTrabajador(gerente);
        
        Socio socio = new Socio("NSocio","ASocio","123456");
        Socio director = new Director("NDirector","ADirector","1234567");
        
        socio.emitirVoto(5);
        director.emitirVoto(6);
        gerente.
    }
    
}
