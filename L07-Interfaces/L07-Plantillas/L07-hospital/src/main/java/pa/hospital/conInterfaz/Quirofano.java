package pa.hospital.conInterfaz;

public class Quirofano implements ISala {
    private static int contador = 0;
    private final String id;

    public Quirofano() {
        this.id = "quirofano-" + contador++;
    }

    public String getId() {
        return id;
    }

    @Override
    public void reservar() {
        System.out.println("    Reservado el quirófano: " + id);
    }

    @Override
    public void anularReserva() {
        System.out.println("    Anulada reserva del quirófano: " + id);
    }
}
