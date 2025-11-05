
package pa.sinInterfaces;

/**
 * Cada petición se caracteriza por:
 *  - un piso de destino (piso_destino) y 
 *  - un identificador (id), ambos de tipo entero. 
 * Los valores de los dos atributos NO se podrán cambiar, pero sí consultar.
 * En el caso del identificador, su valor no se pasará como parámetro en el constructor, sino que 
 * se asignará automáticamente, comenzando con el valor 0, y cada nueva petición verá incrementado 
 * en 1 su valor de id.
 */
public class Peticion {
	private final int piso_destino;
	private final int id;
	private static int nextId = 0;
	
	public Peticion(int piso_destino) {
		this.piso_destino = piso_destino;
		this.id = nextId;
		nextId++;
	}
	
	public int getPisoDestino() {
		return piso_destino;
	}
	
	public int getId() {
		return id;
	}
	
}