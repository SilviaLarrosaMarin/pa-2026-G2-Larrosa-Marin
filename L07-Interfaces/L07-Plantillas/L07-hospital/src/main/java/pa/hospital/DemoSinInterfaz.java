package pa.hospital;

import pa.hospital.sinInterfaz.*;

public class DemoSinInterfaz {
	 public static void main(String[] args) {
	        GestionSalasHospital gestion = new GestionSalasHospital();

	        Quirofano q1 = new Quirofano("Q1");
	        Quirofano q2 = new Quirofano("Q2");

	        SalaVideo s1 = new SalaVideo(1);
	        SalaVideo s2 = new SalaVideo(2);

	        gestion.reservarQuirofano(q1);
	        gestion.reservarQuirofano(q2);
	        gestion.anularReservaQuirofano(q1);
	        gestion.anularReservaQuirofano(q2);

	        gestion.reservarSalaVideo(s1);
	        gestion.reservarSalaVideo(s2);
	        gestion.anularReservaSalaVideo(s1);
	        gestion.anularReservaSalaVideo(s2);
	    }
}
