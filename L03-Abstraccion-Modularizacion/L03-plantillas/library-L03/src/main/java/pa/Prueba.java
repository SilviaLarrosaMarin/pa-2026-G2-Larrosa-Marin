package pa;

public class Prueba {
   
    public static void main(String[] args) {
    	
    	// 1. Crear tres libros
    	Book libro1 = new Book("George R.R. Martin", "Juego de Tronos", 1300);
    	Book libro2 = new Book("Umberto Eco", "El nombre de la Rosa", 987);
    	Book libro3 = new Book("Christian Jaq", "Tutankamon", 876);
    	
    	// 2. Imprimir mensaje por pantalla
    	System.out.println("\nCreados los tres libros");
    	
    	// 3. Asignar código de referencia
    	libro1.setRefNumber("01");
    	libro2.setRefNumber("001");
    	libro3.setRefNumber("0003");
    	
    	// e imprimir detallles
    	libro1.printDetails();
    	libro2.printDetails();
    	libro3.printDetails();
    	
    	// 4. Cambiar código de referencia de libro1 y libro2
    	System.out.println("\nCambiamos las referencias de los dos primeros libros");
    	
    	libro1.setRefNumber("0001");
    	libro2.setRefNumber("0002");
    	
    	libro1.printDetails();
    	libro2.printDetails();
    	
    	// 5. Solicitar 2 veces un préstamos del primer libro y 1 del segundo libro
    	libro1.prestar();
    	libro1.prestar();
    	
    	libro2.prestar();
    	
    	// 6. Imprimir por pantalla las veces que se ha prestado cada uno
    	libro1.mostrarVecesPrestado();
    	libro2.mostrarVecesPrestado();
    	libro3.mostrarVecesPrestado();
    		    
    }


}


