package pa;

public class Book {
    private String author;
    private String title;
    // 1. Se añaden los 3 atributos privados
    private int numPaginas;
    private String codReferencia;
    private int numPrestamos;
    
    
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
      // 2. Inicializacion de los 3 nuevos atributos
        numPaginas = bookPages; 
        codReferencia = "";
        numPrestamos = 0;
    }

    // 3. Se añaden los 4 métodos getter
    public String getAuthor() {
    	return author;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public int getNumPrestamos() {
    	return numPrestamos;
    }
    
    public String getCodReferencia() {
    	return codReferencia;
    }
    // 4. Definir método "mutator" para codReferencia
    public void setRefNumber(String ref) {
    	// Comprobar si la longitud de la cadena "ref" es menor que 3
    	if (ref.length() < 3) {
    		System.out.println("\nERROR: EL número de referencia del libro " + title + " debe contener al menos tres caracteres.");	
    	} else {
    		codReferencia = ref;
    	}
    	
    }
    
    // 5. Método para que se incremente en 1 el contador de veces que el 
    // libro ha sido prestado
    public void prestar() {
    	numPrestamos += 1;
    }
    
    // 6. Añadir método público printDetails()
    public void printDetails() {
    	
    	// Se crea una variable auxiliar
    	String refAImprimir = codReferencia;
    	
    	// Se comprueba si el código de referencia está vacío
    	if (codReferencia.length() == 0) {
    		refAImprimir = "ZZZ";
    	}
    	
    	System.out.println("\nDetalles de " + title);
    	System.out.println("--------------------------");
    	System.out.println("--- Autor: " + author);
    	System.out.println("--- Título: " + title);
    	System.out.println("--- Nº páginas: " + numPaginas);
    	System.out.println("--- Nº referencia: " + refAImprimir);
    	System.out.println("--- Nº préstamos: " + numPrestamos);
    	System.out.println("--------------------------");
    }
    
    public void mostrarVecesPrestado() {
    	String mensaje;
    	
    	if (numPrestamos == 0) {
    		mensaje = "El libro " + title + " no se ha prestado ninguna vez.";
  
    	} else if (numPrestamos == 1) {
    		mensaje = "El libro " + title + " se ha prestado 1 vez.";
    	} else {
    		mensaje = "El libro " + title + " se ha prestado " + numPrestamos + " veces.";
    	}
    	
    	System.out.println(mensaje);
    	

    }
}
