package pa.conInterfaces;

public class DemoConInterfaces {

    public static void main(String[] args) {
        // 🔹 Puedes cambiar entre teclado y fichero fácilmente:
        // IEntradaDatos fuente = new EntradaPorTeclado();
        IEntradaDatos fuente = new EntradaDesdeFichero();

        Ascensor ascensor = new Ascensor(fuente);

        int numPeticiones, numConAvisos;

        do {
            numPeticiones = ascensor.leerPeticiones();
            numConAvisos = ascensor.analizarPeticiones();
            ascensor.llevarPersonasASusDestinos();
        } while (numPeticiones != numConAvisos);

        System.out.println("\nAscensor inactivo.");
    }
}
