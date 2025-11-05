package pa.hospital.sinInterfaz;

public class GestionSalasHospital {

    public void reservarQuirofano(Quirofano q) {
        q.reservar();
    }

    public void anularReservaQuirofano(Quirofano q) {
        q.anularReserva();
    }

    public void reservarSalaVideo(SalaVideo s) {
        s.reservar();
    }

    public void anularReservaSalaVideo(SalaVideo s) {
        s.anularReserva();
    }
}
