package pa;

public class PruebaCitas {
	
	private void mostrar_si_hay_solape_entre(Cita citaA, Cita citaB) {
	    System.out.println("Comprobación de solape completada");
	    citaA.imprimir();
	    citaB.imprimir();
	    System.out.print("Estas dos citas ");
	    if(citaA.solapa_con(citaB)) {
	        System.out.println("SOLAPAN");
	    } else {
	        System.out.println("NO solapan");
	    }
	    System.out.println();
	}

	public static void main(String[] args) {		
	    PruebaCitas prueba = new PruebaCitas();
	
	    System.out.println("\nEjercicio hecho\n");

	    Cita cita1 = new Cita();
	    cita1.setDia(3); // Jueves
	    cita1.setFranjaHoraria(10, 12);

	    Cita cita2 = new Cita();
	    cita2.setDia(3);
	    cita2.setFranjaHoraria(11, 13);

	    Cita cita3 = new Cita();
	    cita3.setDia(3);
	    cita3.setFranjaHoraria(7, 12);

	    Cita cita4 = new Cita();
	    cita4.setDia(3);
	    cita4.setFranjaHoraria(10, 11);

	    Cita cita5 = new Cita();
	    cita5.setDia(3);
	    cita5.setFranjaHoraria(16, 18);

	    Cita cita6 = new Cita();
	    cita6.setDia(2); // Miércoles
	    cita6.setFranjaHoraria(10, 11);

	    // comprobar solapes de cita1 con el resto
	    prueba.mostrar_si_hay_solape_entre(cita1, cita2);
	    prueba.mostrar_si_hay_solape_entre(cita1, cita3);
	    prueba.mostrar_si_hay_solape_entre(cita1, cita4);
	    prueba.mostrar_si_hay_solape_entre(cita1, cita5);
	    prueba.mostrar_si_hay_solape_entre(cita1, cita6);

	}

}
