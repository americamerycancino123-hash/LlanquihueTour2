package cl.duoc.llanquihuetour.data;
// Gestiona la carga de Tours

import cl.duoc.llanquihuetour.model.Tour;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorPersonas {
    public ArrayList<Tour> cargarTours(Path rutaArchivo) {

        ArrayList<Tour> personas = new ArrayList<>();


        try (BufferedReader lector = Files.newBufferedReader(rutaArchivo)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.isBlank()) {
                    continue;
                }
                String[] campos = linea.split(";");
                if (campos.length < 4) {
                    continue;
                }

                try {
                    String[] partes = campos[0].trim().split(" ", 2);
                    String nombre = partes[0];
                    String apellido = partes.length > 1 ? partes[1] : "";
                    String cargo = campos[1].trim();
                    String telefono = campos[2].trim();
                    String ciudad = campos[3].trim();


                    Tour tour = new Tour(nombre, apellido, cargo, telefono, ciudad);
                    personas.add(tour);
                } catch (IllegalArgumentException e) {
                    System.err.println("Se omite linea invalida: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return personas;

    }
}