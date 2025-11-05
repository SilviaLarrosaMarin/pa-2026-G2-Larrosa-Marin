package pa.conInterfaces;

public class Peticion {
    private final int pisoDestino;
    private final int id;
    private static int contador = 0;

    public Peticion(int pisoDestino) {
        this.pisoDestino = pisoDestino;
        this.id = contador++;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public int getId() {
        return id;
    }
}

