package pa;

import pa.music.organizer.MusicOrganizer;
import java.util.Scanner; // Necesario para usar la clase Scanner
import java.util.ArrayList; // Necesario para manejar los títulos cargados

public class PlayerModoTexto{
	
	// Nombres de los temas del fichero tituloCanciones.txt
	// definidos en un array de Strings declarado de tipo private static final, 
	// para definir a este como ina constante de clase que contiene datos fijos
	// private: restringe la visibilidad del array solo al código que se encuentra dentro de la propia clase
	// static: para que el main() que también es static pueda acceder a él
	// final: para convertirlo en una constante y que este no pueda ser reasignado con una nueva lista
	private static final String[] titulos_canciones = {
			"All I See Is You - Omnia feat. Christian Burns",
			"Body to Body - Sture Zetterberg",
			"I Wish - Andrew Rayel",
			"In The Dark-Armin van Armin van Buuren & David Guetta",
			"Invincible - Christina Novelli",
			"Robarte un Beso - Carlos Vives",
			"Save Your Tears - Ariana Grande",
			"Secret Love Song - Little Mix ft Jason Derulo",
			"Simples Corazones - Fonseca-feat Melendi",
			"Stay With Me - AVIRA",
			"The Reason - Hoobastank",
			"Vagabundo - Sebastián Yatra",
			"With My Own Eyes - Sash",
			
	};
	
	
	public static void main(String[] args) {
		
		// 1. Crear MusicOrganizer e inicializarlo
		MusicOrganizer organizer = new MusicOrganizer();
		String path = "src/main/resources/mp3/";
		String extension = ".mp3";
		
		// El método loadSong es el que se encarga de recorrer el array titulos_canciones e ir convirtiendo
		// cada posición de este a "title" y usar "addSong" para unir path+title+extension y añadirlo
		// a fileNames y titles
		organizer.loadSongs(path, extension, titulos_canciones);
		System.out.println("\nCargando las canciones en el reproductor...");
		
		// 2. Mostrar por pantalla listado con títulos y pedir al usuario que elija uno
		
		// Inicializar Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		
		// Bucle principal para preguntar si quiere otra canción
		String quiereOtroTema = "s"; // Se inicializa la variable a "s" para asegurar que el bucle comience al menos una vez
		
		while (quiereOtroTema.equalsIgnoreCase("s")) {
			
			// Empezar el bucle mostrando todos los títulos disponibles, numerados del 1. al N.
			organizer.printAllTitleNames();
			System.out.println("\nElija el número del tema y pulse enter");
			
			int temaElegido = 0; // Variable destinada a almacenar el número elegido. Se inicializa a 0 para garantizar que en cada nueva iteración se borre cualquier valor de la ejecución anterior
			boolean entradaValida = false; // Se inicializa a false para obligar al programa a entrar en el bucle de validación inmediatamente
			
			// 3. Comprobar si el número elegido es válido. Bucle de validación
			while (!entradaValida) {
				
				// Verificar si lo que el usuario ha escrito es un número
				if (scanner.hasNextInt()) {
					temaElegido = scanner.nextInt(); // Si es un número, lo lee y lo guarda. El caracter enter (\n) queda almacenado en el búfer y será eliminado al final del bucle
					
					// Una vez se ha verificado que es un número y lo ha guardado en "temaElegido",
					// ahora se verifica si el número es válido. Como "validIndex" de MusicOrganizer
					// es un método privado no podemos reutilizarlo, por lo que lo comprobamos manualmente
					int numCanciones = organizer.getNumberOfFiles();
					if  (temaElegido > 0 && temaElegido < numCanciones) {
						entradaValida = true;
					} else {
						System.out.println("\nEntrada errónea. Intente de nuevo:");
						// Si no es válido se imprime un mensaje de error y se pide que vuelva a introducir otro número
					}
				} else {
					scanner.next();
					System.out.println("\nEntrada errónea. Intente de nuevo:");
					// Si lo que el usuario ha introducido no es un número, también se imprime un mensaje de error y se pide que ponga un número
				}
				
				scanner.nextLine();
				// Lo más importante del bucle. Su función es consumir el caracter "Enter" (\n)
				// que "nextInt()" deja pendiente al introducir el usuario el número. Si no limpiáramos
				// el búfer con este comando, el \n atascado pasaría a ejecutarse inmediatamente
				// en la siguiente instrucción que es stopPlaying, por lo que la canción ni se llegaría
				// a escuchar.
			}
			
		// Continuación del bucle principal
			
		// Para poder imprimir el nombre de la canción correspondiente al número elegido
		// debemos crear una variable "titulo" que va a "getFiles()" que era donde estaban los nombres
	    // y coge la posición correspondiente en el array al número elegido (que es el nº elegido - 1)
		String titulo = organizer.getFiles().get(temaElegido - 1);
		System.out.println("\nVoy a reproducir el tema \"" + temaElegido + ". " + titulo + "\"");
		
		// Una vez que tiene el número válido (temaElegido), se inicia la reproducción que ocupa esa posición
		organizer.startPlaying(temaElegido);
		
		// Se usa "nextLine()" de la clase "Scanner" que pausa la ejecución del código y espera a que el
		// usuario pulse "Enter" para parar la canción
		System.out.println("Pulse enter para parar...");
		scanner.nextLine();
		
		// Se llama al método stopPlaying para detener la reproducción de la canción al pulsar enter
		organizer.stopPlaying();
		System.out.println("Reproductor detenido");
		
		// Se pregunta al usuario si quiere escuhar otra canción y su respuesta sobreescribe la variable
		// "quiereOtroTema". Si es "s". el bucle comienza otra vez. Si es "n" o cualquier otra cosa,
		// el bucle termina, se cierra el Scanner y se imprime el mensaje de despedida
		System.out.println("¿Quiere escuchar otra canción? (s/n)");
		quiereOtroTema = scanner.nextLine();
		
		} // Fin del bucle principal
		
		scanner.close();
		System.out.println("Gracias por usar nuestro reproductor!!");	
	}
}
