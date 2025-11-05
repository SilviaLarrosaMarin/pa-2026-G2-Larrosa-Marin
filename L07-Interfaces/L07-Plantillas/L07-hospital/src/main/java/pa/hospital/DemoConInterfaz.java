package pa.hospital;

import pa.hospital.conInterfaz.*;

public class DemoConInterfaz {

    public static void main(String[] args) {
        GestionSalasHospital gestion = new GestionSalasHospital();

        final Quirofano[] quir = new Quirofano[5];
        final SalaVideo[] video = new SalaVideo[10];

        for (int i = 0; i < quir.length; i++) {
            quir[i] = new Quirofano();
            gestion.reservarSala(quir[i]);
        }

        for (int i = 0; i < video.length; i++) {
            video[i] = new SalaVideo();
            gestion.reservarSala(video[i]);
        }

        for (Quirofano q : quir) {
            gestion.anularReserva(q);
        }

        for (SalaVideo s : video) {
            gestion.anularReserva(s);
        }
    }
}