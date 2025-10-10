package pa.programa_principal;

import pa.Medico;
import pa.Cita;

public class Prueba {

   public static void main(String[] args){
	   
	   // Crear objeto tipo Medico
	   Medico medico = new Medico("001", "Oftalmólogo");
	   
	   // Imprimir horario
	   medico.printHorario();
	   
	   // Mensaje
	   System.out.println("Iniciamos el proceso de reserva de Citas...");
	   
	   // Solicitar citas indicadas en tabla e indicar total de citas procesadas y no posibles
	   
	   // Se crean arrays para los datos de la tabla
	   String[] pacientes = {"Pedro", "María", "Lucas", "Silvia", "Gloria", "Matías", "Eva", "Carlos"};
	   int[] dias = {2,2,2,2,2,3,8,4};
	   String[] franjas = {"mañana","mañana","mañana","mañana","mañana","otro", "tarde", "tarde"};
	   
	   // Se inicializan los contadores para las citas procesadas y las no posibles
	   int citasProcesadas = 0;
	   int citasNoPosibles = 0;
	   
	   // Bucle que recorre los indices de los arrays en un onjeto de tipo Cita
	   // que llama a "reservarCita" y comprueba si esta devuelve "null" o no
	   // para ir sumando a los contadores
	   for (int indice = 0; indice < dias.length; indice++) {
		   Cita citaReservada = medico.reservarCita(dias[indice], franjas[indice], pacientes[indice]);
		   
		   if (citaReservada != null) {
			   citasProcesadas++;
		   } else {
			   citasNoPosibles++;
			   System.out.println("Cita no posible para " + pacientes[indice]);
		   }
	   }
	   
	   // Mensaje de contadores
	   System.out.println("Total de citas procesadas: " + (citasProcesadas + citasNoPosibles));
	   System.out.println("Total de citas no posibles: " + citasNoPosibles);
  
	   // Imprimir horario actualizado con citas
	   medico.printHorario();
   }


}
