package pa.hospital.conInterfaz;

public class GestionSalasHospital {

    public void reservarSala(ISala sala) {
        sala.reservar();
    }

    public void anularReserva(ISala sala) {
        sala.anularReserva();
    }
}
