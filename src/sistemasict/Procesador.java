package sistemasict;

import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Procesador {

    public static void procesar(List<Empleado> empleados) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fecha = LocalDate.now().format(formato);

        String nombreArchivo = "HorariosEmpleados_" + fecha + ".txt";

        PrintWriter writer = null;

        try {
        writer = new PrintWriter(new FileWriter(nombreArchivo));
        } catch (Exception ex) {
        System.out.println("Error al crear archivo");
}

    for (Empleado e : empleados) {

    if (e.entradaReal == null || e.salidaReal == null) {
        continue;
    }

    System.out.println("Empleado: " + e.nombre);
    writer.println("Empleado: " + e.nombre);

    boolean retardo = e.entradaReal.compareTo(e.entradaEsperada) > 0;
    boolean salidaAnticipada = e.salidaReal.compareTo(e.salidaEsperada) < 0;
    boolean horasExtra = e.salidaReal.compareTo(e.salidaEsperada) > 0;

    System.out.println("Retardo: " + (retardo ? "Sí" : "No"));
    writer.println("Retardo: " + (retardo ? "Sí" : "No"));
    System.out.println("Salida anticipada: " + (salidaAnticipada ? "Sí" : "No"));
    writer.println("Salida anticipada: " + (salidaAnticipada ? "Sí" : "No"));
    System.out.println("Horas extra: " + (horasExtra ? "Sí" : "No"));
    writer.println("Horas extra: " + (horasExtra ? "Sí" : "No"));

    System.out.println("Entrada esperada: " + e.entradaEsperada);
    writer.println("Entrada esperada: " + e.entradaEsperada);
    System.out.println("Entrada real: " + e.entradaReal);
    writer.println("Entrada real: " + e.entradaReal);
    System.out.println("Salida esperada: " + e.salidaEsperada);
    writer.println("Salida esperada: " + e.salidaEsperada);
    System.out.println("Salida real: " + e.salidaReal);
    writer.println("Salida real: " + e.salidaReal);

    String estado;

    if (!retardo && !salidaAnticipada && !horasExtra) {
    estado = "EN ORDEN";
    } else if (retardo) {
    estado = "LLEGÓ DESPUÉS";
    } else if (salidaAnticipada) {
    estado = "SE FUE ANTES";
    } else {
    estado = "HORAS EXTRA";
}

System.out.println("ESTADO: " + estado);
writer.println("ESTADO: " + estado);

    System.out.println("----------------------");
}
    if (writer != null) {
    writer.close();
    }
}
    }