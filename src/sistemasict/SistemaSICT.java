package sistemasict;

import java.io.*;
import java.util.*;

public class SistemaSICT {

    public static void main(String[] args) {

        Map<String, Empleado> empleados = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("DatosEmpleados.csv"));
            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.startsWith("Numero")) continue;

                String[] partes = linea.split(",");

                String numero = partes[0];
                String nombre = partes[1];
                String entrada = partes[2];
                String salida = partes[3];

                empleados.put(numero, new Empleado(numero, nombre, entrada, salida));
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer empleados");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("biometrico.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(",");

                String numero = partes[0];
                String entradaReal = partes[1];
                String salidaReal = partes[2];

                Empleado emp = empleados.get(numero);

                if (emp != null) {
                    emp.entradaReal = entradaReal;
                    emp.salidaReal = salidaReal;
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        Procesador.procesar(new ArrayList<>(empleados.values()));
    }
}