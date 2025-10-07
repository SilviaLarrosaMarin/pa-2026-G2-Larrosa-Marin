package pa;

import visor.interfaz.ImageViewer;

/**
* Clase de demostración principal para iniciar la aplicación ImageViewer.
* Contiene el método main(), que es el punto de arranque de la aplicación.
* <p>
* Esta clase se debe ejecutar para visualizar y probar el visor de imágenes.
* <p>
* @author Silvia Larrosa Marín
* @version 1.0 
*/

public class Demo {
	
	/**
	* Este es el método principal, que crea una instancia de ImageViewer,
	* iniciando así la interfaz gráfica.
	* <p>
	* @params args: Argumentos de la línea de comandos (no utilizados, solo
	* se crea "new ImageViewer").
	*/	

	public static void main(String[] args) {
		ImageViewer viewer = new ImageViewer();
	}
}
