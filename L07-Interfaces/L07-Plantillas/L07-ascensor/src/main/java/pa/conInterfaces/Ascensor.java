package pa.conInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Ascensor {
    private List<Peticion> peticiones;
    private List<Peticion> peticionesValidas;
    private int pisoActual;
    private final IEntradaDatos fuenteDatos; // 💡 Puede ser teclado o fichero

    public Ascensor(IEntradaDatos fuenteDatos) {
        this.fuenteDatos = fuenteDatos;
        peticiones = new ArrayList<>();
        peticionesValidas = new ArrayList<>();
        pisoActual = 0;
    }

    public int leerPeticiones() {
        int[] destinos = fuenteDatos.obtenerDatos();
        for (int d : destinos) {
            peticiones.add(new Peticion(d));
        }
        return destinos.length;
    }

    public int analizarPeticiones() {
        String avisos = "";
        int numAvisos = 0;

        for (Peticion p : peticiones) {
            int destino = p.getPisoDestino();

            if (destino < 0 || destino > 20) {
                avisos += "- El usuario que ha pulsado " + destino + " ha introducido un valor incorrecto\n";
                numAvisos++;
            } else if (destino == pisoActual) {
                avisos += "- El usuario que ha pulsado " + destino + " ya está en esa planta\n";
                numAvisos++;
            } else if (peticionesValidas.size() >= 4) {
                avisos += "- El usuario que ha pulsado " + destino + " ya no cabe\n";
                numAvisos++;
            } else {
                peticionesValidas.add(p);
            }
        }

        peticiones.clear();

        if (!peticionesValidas.isEmpty()) {
            System.out.print("Entran en el ascensor las personas que van a los pisos: ");
            for (int i = 0; i < peticionesValidas.size(); i++) {
                System.out.print(peticionesValidas.get(i).getPisoDestino());
                if (i < peticionesValidas.size() - 1) System.out.print(", ");
            }
            System.out.println();
        }

        if (!avisos.isEmpty()) {
            System.out.println("AVISOS\n" + avisos);
        }

        return numAvisos;
    }

    public void llevarPersonasASusDestinos() {
        System.out.println("Cerrando puertas. Estamos en el piso: " + pisoActual);

        int anteriorDestino = -1;

        while (!peticionesValidas.isEmpty()) {
            Peticion p = peticionesValidas.remove(0);
            int destino = p.getPisoDestino();

            if (destino > pisoActual)
                System.out.println("Subiendo a una persona a la planta " + destino);
            else
                System.out.println("Bajando a una persona a la planta " + destino);

            if (destino == anteriorDestino)
                System.out.println("La siguiente persona también puede bajar");

            pisoActual = destino;
            anteriorDestino = destino;
        }
    }
}

