package pa.hospital.conInterfaz;

public class SalaVideo implements ISala {
    private static int contador = 100;
    private final int id;

    public SalaVideo() {
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    @Override
    public void reservar() {
        System.out.println("---> Reservada la sala de video " + id);
    }

    @Override
    public void anularReserva() {
        System.out.println("---> Anulada reserva de la sala de video " + id);
    }
}
