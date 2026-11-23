package cl.duoc.llanquihuetour.ui;

import cl.duoc.llanquihuetour.data.GestorPersonas;
import cl.duoc.llanquihuetour.model.Tour;

import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Path ruta = Path.of("src/main/resources", "tour.txt");
        GestorPersonas gestor  = new GestorPersonas();
        try {
            ArrayList<Tour> tours = gestor.cargarTours(ruta);
            System.out.println("=== CATALOGO DE TOUR===");
            System.out.println("TOURS CARGADOS: " +  tours.size());

            // Recorrido de la lista con foreach
            System.out.println("TOURS CARGADOS: ");
            for (Tour tour : tours) {
                System.out.println(tour);

            }

        }catch (Exception e){
            System.err.println("Detalle:" + e.getMessage());
            System.err.println("No se puede realizar la operacion"+ ruta.toAbsolutePath());
        }
    }
}