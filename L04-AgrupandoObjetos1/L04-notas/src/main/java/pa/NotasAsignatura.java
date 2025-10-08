package pa;

/**
* Clase que contiene las notas de una determinada asignatura y proporciona
* métodos para calcular estadísticas (media, máximo, mínimo) y mostrar
* histogramas de frecuencias.
* <p>
* @author Silvia Larrosa Marín
* @version 1.0
*/

public class NotasAsignatura {
	
	private String nombreAsignatura;
	// double[] en vez de float[] porque es capaz de almacenar más
	//información, lo que reduce significativamente los errores de 
	// redondeo, lo que ayudará a que sea más preciso en las notas
	private double[] notas;
	
	/**
	 * Constructor que inicializa los atributos de la clase con
	 * los valores pasados por parámetro.
	 * <p>
	 * Asume que las notas están entre el 1 y el 10.
	 * <p>
	 * @param nombreAsignatura: Nombre de la asignatura.
	 * @param notas: Array de notas a procesar.
	 */
	public NotasAsignatura(String nombreAsignatura, double[] notas) {
		
		// Inicialización de atributos
		this.nombreAsignatura = nombreAsignatura;
		this.notas = notas;
	}
	
	/**
	 * Método accessor que devuelve el nombre de la asignatura
	 * @return Nombre de la asignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	
	/**
	 * Método accessor que devuelve el array de notas
	 * @return Array de notas
	 */
	public double[] notas() {
		return notas;
	}
	
	/**
	 * Calcula y devuelve la nota mínima de la colección de notas.
	 * @return El valor de la nota mínima.
	 */
	public double calcularValorMinimo() {
		// Si el array de notas está vacío, devuelve que la media es 0.0
		if (notas.length == 0) {
			return 0.0;
		}
		
		// Se inicializa la variable local min, para ir comparando cada
		// nota de notas e ir actualizando el valor de min, para al final
		// quedarse con el valor más pequeño encontrado en comparación con 10.0
		double min = 10.0;
		
		for (double nota : notas) {
			if (nota < min) {
				min = nota;
			}
		}
		return min;
	}
	
	/**
	 * Calcula y devuleve la nota máxima de la colección de notas.
	 * @return El valor de la nota máxima.
	 */
	public double calcularValorMaximo() {
		
		if (notas.length == 0) {
			return 0.0;
		}
		
		double max = 0.0;
		
		for (double nota : notas) {
			if (nota > max) {
				max = nota;
			}
		}
		return max;
	}
	
	/**
	 * Calcula y devuelve la nota media de la colección de notas
	 * @return El valor de la nota media de la asignatura
	 */
	public double calcularMedia() {
		
		if (notas.length == 0) {
			return 0.0;
		}
		
		double suma = 0.0;
		
		for (double nota : notas) {
			suma += nota;
		}
		return suma / notas.length;
	}
	
	/**
	 * [PRIVADO] Calcula y devuelve un array con el número de notas en
	 * 11 intervalos: [0,1), [1,2),...,[9,10), [10]
	 * @return Un array de enteros de tamaño 11 con las frecuencias de cada
	 * nota
	 */
	private int[] calcularFrecuencias() {
		
		// Se crea un array de enteros con 11 posiciones
		// [0,1,2,3,4,5,6,7,8,9,10]
		int[] frecuencias = new int[11];
		
		// Para cada nota en notas
		for (double nota : notas) {
			
			// Se trunca la nota y se queda con la parte entera
			int parte_entera = (int) nota;
			
			// Caso especial y exacto: solo si la nota es 10.0
			if (nota == 10.0) {
				frecuencias[10]++;
			}
			
			// Caso general: si la nota está entre 0.0 y 9.99
			else if (parte_entera >= 0 && parte_entera < 10) {
				frecuencias[parte_entera]++;
			}
		}
		return frecuencias;
		
		
	}
	
	/**
	 * Muestra por pantalla el histograma de frecuencias en un rango de 
	 * intervalo pasado por parámetro. Dibuja una columna vertical para
	 * cada nota del rango, compuesta por tantos asteriscos como notas
	 * estén en cada intervalo.
	 * @param inicial: El valor inicial del rango.
	 * @param final: El valor final del rango.
	 */
	public void mostrarHistograma(int inicial, int finalRango) {
		
		
	
		
		// Comprobar que el rango pasado por parámetro es correcto
		if (inicial < 0 || finalRango > 10 || inicial > finalRango) {
			
			System.out.println();
			System.out.println("---------------------");
			System.out.println("Histograma de notas de la asignatura: " + nombreAsignatura);
			System.out.println("Intervalo de notas: [" + inicial + "," + finalRango + "]");
			// Lanza el error si el rango no es correcto
			System.out.println("      Rango de valores inválido");
			return; // detiene la ejecución
		}
		
		// Cabecera solo si el rango es válido
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Histograma de notas de la asignatura: " + nombreAsignatura);
		System.out.println("Intervalo de notas: [" + inicial + "," + finalRango + "]");
		System.out.println();
		
		// Obtener frecuencia máxima para determinar cantidad de filas
		
		// El array de enteros "frecuencias" lo obtenemos del método 
		// anterior "calcularFrecuencias"
		int[] frecuencias = calcularFrecuencias();
		
		// Inicializamos una variable "maxFrecuencia" a cero, para ir
		// comparando cada frecuencia del array y al final terminar con
		// que maxFrecuencia sea igual a la mayor frecuencia que encuentre
		// en dicho array
		int maxFrecuencia = 0;
		
		for(int i = inicial; i <= finalRango; i++) {
			if (frecuencias[i] > maxFrecuencia) {
				maxFrecuencia = frecuencias[i];
			}
		}
		
		System.out.println("Frecuencia máxima del intervalo = " + maxFrecuencia);
		System.out.println();
		
		// 4. Bucle externo, que itera sobre la altura (nivel) de la línea
		// que se está imprimiendo. Comienza en la altura máxima, que 
		// está determinada por maxFrecuencia, y baja hasta el nivel 1,
		// que es el mínimo
		for (int nivel = maxFrecuencia; nivel >= 1; nivel = nivel - 1) {
			// Imprime el tabulador al principio de cada línea para alinear el gráfico
			System.out.print("\t");
			
			// 5. Bucle interno, que itera sobre la columna (intervalo) en la
			// línea de altura actual
			for (int i = inicial; i <= finalRango; i++) {
				
				// Si la frecuencia total de la columna es mayor o igual
				// al nivel en el que estamos ahora, significa que ahí debe
				// de haber un asterisco
				if (frecuencias[i] >= nivel) {
					System.out.print(" * ");
				// Si no, ahí habrá un espacio en blanco
				} else {
					System.out.print("   ");
				}
			}
			// Termina la línea actual y el bucle externo continúa bajando
			// de nivel (salto de línea al siguiente nivel)
			System.out.println();
		}
		
		// 6. Dibujo de los números 
		
		System.out.print("\t");
		System.out.println("------------------");
		System.out.print("\t");
		
		
		for (int i = inicial; i <= finalRango; i++) {
			// printf porque se especifica un formato dentro
			// % indica que lo que sigue es una especificación de formato
			// 3 inidica el ancho (3 caracteres, para alinearse con la columna
			// de asteriscos)
			// d inidica que "i" es un número entero decimal (entre 0 y 9)
			System.out.printf("%2d ", i);
		}
		
		System.out.println();
	}
		
		
		/**
		 * Muestra por pantalla las notas en forma de tabla, 
		 * con el número de columnas indicado por parámetro.
		 * <p>
		 * Si el número de columnas está fuera del rango (1..6), 
		 * se muestra un mensaje de error.
		 * <p>
		 * Las notas se muestran con 1 decimal y una anchura de 6 caracteres por columna.
		 * Cada fila empieza con un tabulador ('\t').
		 * <p>
		 * @param numColumnas Número de columnas (entre 1 y 6).
		 */
	
		public void mostrarNotas_en_columnas(int numColumnas) {

		    // Comprobamos si el número de columnas está fuera del rango permitido.
		    // En ese caso, mostramos un mensaje de error y salimos del método.
		    if (numColumnas <= 0 || numColumnas > 6) {
		        
		    	// Cabecera de la tabla. 
			    System.out.println("\nListado de notas de la asignatura: " + nombreAsignatura);
			    System.out.println("     número de columnas = " + numColumnas);
		    	
			    // Imprime el mensaje de error y detiene una posible división por cero más abajo
		    	System.out.println("     Error: El número de columnas debe estar entre 1..6");
		        return; // Detiene la ejecución
		    }
		    
		    // Continúa la ejecución normal si numColumnas es de 1 a 6
		    System.out.println("\nListado de notas de la asignatura: " + nombreAsignatura);
		    System.out.println("     número de columnas = " + numColumnas);
		    System.out.print("\n");

		    // Bucle principael.Se recorren todas las notas del array "notas".
		    for (int i = 0; i < notas.length; i++) {

		        // Si estamos al principio de una fila (es decir, cuando i es múltiplo del número de columnas),
		        // imprimimos un tabulador para alinear la salida.
		        // Ejemplo: con 3 columnas, esto ocurrirá cuando i = 0, 3, 6, 9, ...
		    	// i = 0 -> 0 % 3 columnas = 0 -> sí se tabula
		    	// i = 2 -> 2 % 3 columnas != 0 -> no se tabula
		    	// i = 3 -> 3 % 3 columnas = 0 -> sí se tabula
		        if (i % numColumnas == 0) {
		            System.out.print('\t'); // Tabulador para el inicio de la fila
		        }

		        // Imprime la nota actual con formato:
		        // "%6.1f" significa:
		        // - 6 ->  ancho total del campo (ocupa 6 espacios)
		        // - .1 -> un decimal
		        // - f ->  número en coma flotante (float o double)
		        System.out.printf("%6.1f", notas[i]);

		        // Si hemos impreso el número de notas igual al número de columnas, 
		        // hacemos salto de línea para empezar una nueva fila.
		        // (i+1) se usa porque i empieza en 0.
		        // i = 0 -> (0+1) % 3 columnas != 0 -> no hay salto de línea (es la primera columna)
		        // i = 2 -> (2+1) % 3 columnas = 0 -> sí hay salto de línea (es la tercera columna)
		        if ((i + 1) % numColumnas == 0) {
		            System.out.println(); // Salta de línea después de completar una fila
		        }
		    }

		    
		    // Si el número total de notas no es múltiplo del número de columnas,
		    // puede quedar una fila incompleta. En ese caso, añadimos un salto final.
		    // Por ejemplo, si hay 14 notas, notas.length = 14
		    // 14 % 3 columnas != 0 -> hace salto de línea, porque debajo se van a escribir otras cosas de la práctica
		    // Si hubieran 15 notas, ya se habría hecho el salto de línea antes en el bucle principal, porque:
		    // 15 notas -> i = 14 -> (14+1) % 3 columnas = 0 -> salto de línea
		    if (notas.length % numColumnas != 0) {
		        System.out.println();
		    }
	
	}
	
	
}
