package pa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class MaximoValor {
	
	public static void main(String[] args) {
		
		// 1. ArrayList para almacenar los valores. Es de tipo Double (objeto) en vez de double (primitivo) 
		// puesto que es obligatorio su uso para las colecciones, ya que estas estructuras solo aceptan objetos
		ArrayList<Double> valores = new ArrayList<>();
		
		// 2. Usar clase Scanner y constructor con parámetro System.in para leer los datos introducidos
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.println("\nIntroduzca los datos con o sin decimales separados con espacios");
		System.out.println("Teclee una letra para finalizar");
		
		// Ahora pasamos a leer los datos
		
		// Bucle para validar la entrada del usuario
		
		// Este bucle se repite mientras el escáner detecte que el siguiente dato disponible en la entrada
		// es un número decimal (while(scanner.hasNextDouble())). En cada iteración, el método
		// "scanner.nextDouble()" lee ese valor numérico y lo asigna a la variable "valor" de tipo "double".
		// Inmediatamente después, ese valor es añadido al ArrayList "valores". Este proceso continúa, 
		// permitiendo al usuario introducir tantos números como quiera, hasta que introduce un caracter
		// no numérico (la letra que marca el final de la entrada), lo que hace que "hasNextDouble()" 
		// devuelva "false" y el bucle finalice.
		while (scanner.hasNextDouble()) {
			double valor = scanner.nextDouble();
			valores.add(valor);
		}
		scanner.close(); // cerramos el scanner
		
		// 3. Encontrar el elemento de máximo valor
		
		// Caso A: no se ha leído ningún número
		if (valores.isEmpty()){
			// Si valores está vacío, es porque el usuario ha introducido una letra inicialmente
			System.out.println("No se ha leído ningún número");
		} else {
			// Caso B: sí hay números. Encontrar máximo
			double maximoValor = valores.get(0); // Se inicializa con que el primer número del array es el máximo
			
			for(double valor : valores) {
				if (valor > maximoValor) {
					maximoValor = valor;
				}
			}
			
			// Imprimir la colección y señalar el/los máximo/s
			
			System.out.println("Valores numéricos y máximo valor:");
			for (double valor : valores) {
				System.out.print(valor);
				
				// Si el valor actual es igual al máximo encontrado, lo señalamos.
				if (valor == maximoValor) {
					System.out.print(" <== máximo valor");
				}
				System.out.println();
			}
		}
	}
}
