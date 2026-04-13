package sistemasict;

public class Empleado {

    String numero;
    String nombre;

    String entradaEsperada;
    String salidaEsperada;

    String entradaReal;
    String salidaReal;

    public Empleado(String numero, String nombre, String entradaEsperada, String salidaEsperada) {
        this.numero = numero;
        this.nombre = nombre;
        this.entradaEsperada = entradaEsperada;
        this.salidaEsperada = salidaEsperada;
    }
}