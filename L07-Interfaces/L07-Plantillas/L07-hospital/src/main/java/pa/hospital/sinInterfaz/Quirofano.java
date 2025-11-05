package pa.hospital.sinInterfaz;

public class Quirofano {
    private String id;

    public Quirofano(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void reservar() {
        System.out.println("Reservando quirófano " + id);
    }

    public void anularReserva() {
        System.out.println("Anulada reserva de quirófano " + id);
    }
}

