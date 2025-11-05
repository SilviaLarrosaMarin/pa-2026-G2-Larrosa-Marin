package pa.hospital.sinInterfaz;

public class SalaVideo {
    private int id;

    public SalaVideo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void reservar() {
        System.out.println("Reservando sala de vídeo " + id);
    }

    public void anularReserva() {
        System.out.println("Anulada reserva de sala de vídeo " + id);
    }
}

