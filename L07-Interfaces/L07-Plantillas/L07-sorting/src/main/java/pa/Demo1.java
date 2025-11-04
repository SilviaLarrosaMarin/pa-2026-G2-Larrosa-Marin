package pa;

import pa.sorting.*;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Country[] paises = {new Country("España"), new Country("Venezuela"), new Country("Francia"), new Country("Bélgica"), new Country("Holanda")};
		
		System.out.println("Original (Paises)");
		System.out.println("=================");
		for (Country pais : paises) {
			System.out.print("  " + pais + "  ");
		}
		System.out.println();
		System.out.println();
		
		Sort.selectionSort(paises);
		
		System.out.println("Ordenado (Paises)");
		System.out.println("=================");
		for (Country pais : paises) {
			System.out.print("  " + pais + "  ");
		}
		System.out.println();
		System.out.println();
		
		Grade[] notas = {new Grade(8.5), new Grade(4.5), new Grade(0.2), new Grade(1.6), new Grade(8.5)};
		
		System.out.println("Original (Notas)");
		System.out.println("=================");
		for (Grade nota : notas) {
			System.out.print("  " + nota + "  ");
		}
		System.out.println();
		System.out.println();
		
		Sort.selectionSort(notas);
		
		System.out.println("Ordenado (Notas)");
		System.out.println("=================");
		for (Grade nota : notas) {
			System.out.print("  " + nota + "  ");
		}
		System.out.println();
		System.out.println();
		
	}
}
