package pa;

/**
 * Clase principal de demostración para el proyecto L04-notas.
 * <p>
 * Realiza la secuencia de pruebas requerida para la clase NotasAsignatura. 
 */

public class Demo {
	
	public static void main(String[] args) {
		
		// Declaración variables locales de entrada
		double[] coleccionNotas = {7.0, 0.2, 3.2, 5.8, 6.4, 1.4, 4.7, 5.5, 1.6, 5.0, 3.0, 1.0, 8.2, 1.8};
		String materia = "Matemáticas";
		
		// Crear instancia de NotasAsignatura
		NotasAsignatura asignatura = new NotasAsignatura(materia, coleccionNotas);
		
		// Mostrar notas en columnas
		
		// Prueba 1: 0 columnas (error)
		asignatura.mostrarNotas_en_columnas(0);
		// Prueba 2: 3 columnas
		asignatura.mostrarNotas_en_columnas(3);
		
		// Estadísticos (min, max, media)
		double min = asignatura.calcularValorMinimo();
		double max = asignatura.calcularValorMaximo();
		double media = asignatura.calcularMedia();
		
		System.out.printf("\nNota mínima: %.2f%n", min);
		System.out.printf("Nota máxima: %.2f%n", max);
		System.out.printf("Nota media: %.2f%n", media);
		System.out.print("\t");
		
		// Histogramas
		
		// Prueba 1: Rango inválido [0, 11]
		asignatura.mostrarHistograma(0, 11);
		
		// Prueba 2: Rango válido [3, 8]
		asignatura.mostrarHistograma(3, 8);
		
		// Prueba 3: Rango válido [0, 5]
		asignatura.mostrarHistograma(0, 5);
		
		// Prueba 4: Rango inválido [3, 1] (3 > 1)
		asignatura.mostrarHistograma(3,1);
		
	}
}
