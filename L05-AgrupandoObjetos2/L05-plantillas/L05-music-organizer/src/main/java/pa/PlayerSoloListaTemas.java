package pa;

import pa.music.organizer.MusicOrganizer; // Importamos el paquete que contiene a MusicOrganizer

public class PlayerSoloListaTemas{
	
	public static void main(String[] args) {
		
		// 1. Crear el organizador de música con MusicOrganizer
		MusicOrganizer organizer = new MusicOrganizer();
		System.out.println("\nInicializamos nuestro organizador de música...");
		
		// 2. Valores para ruta, extensión y nombres de canciones
		String path = "mp3/Album1/";
		String extension = ".mp3";
		String [] nombreTemas = {"tema1A","tema2B","tema3A","tema4B","tema4B","tema5A","tema6B","tema7B"};
		
		// 3. Imprimir listados de nombres de canciones y nombres de ficheros
		
		// Una vez declarados los valores para ruta, extension y nombreTemas,
		// le dejamos el trabajo de crear y asignar los nombres a fileNames y titles
		// al método "loadSongs"
		organizer.loadSongs(path, extension, nombreTemas);
		
		
		// Y ahora imprimimos los listados con los métodos printAllTitleNames y
		// printAllFileNames
		System.out.println("\nListado de todos los temas: ");
		organizer.printAllTitleNames();
		
		System.out.println("\nListado de ficheros: ");
		organizer.printAllFileNames();
		
		// 4. Consultar títulos que ocupan posiciones 3, -1 y 8
		System.out.println("\nEl título de la posición 3 es: ");
		organizer.printTitleName(3);
		System.out.println("El título de la posición -1 es: ");
		organizer.printTitleName(-1); // Error porque index < 1
		System.out.println("El título de la posición 8 es: ");
		organizer.printTitleName(8); // Error porque index > fileNames.size()
	
		
		// 5. Añadir un nuevo tema "tema1C", extension = ".mp3" y path = "mp3/nuevoAlbum/"
		String nuevoTema = "tema1C";
		String nuevoPath = "mp3/nuevoAlbum/";
		
		System.out.println("\nAñadimos un tema nuevo (\"" + nuevoTema + "\")...");
		organizer.addSong(nuevoPath, extension, nuevoTema);
		
		// 6. Consultar de nuevo la posición 8
		System.out.println("\nEl fichero mp3 número 8 es: ");
		organizer.printFileName(8);
		
		// 7. Borrar todos los ficheros que contienen "B"
		System.out.println("\nBorramos todas las canciones que contienen \"B\"");
		
		// Bucle que recorre hacia atrás para evitar problema de índice al borrar
		// Usamos getNumberOfFiles() y getFiles en vez de fileNames.size() y fileNames, 
		// porque estos últimos son privados y solo pueden usarse internamente
		
		// Iniciamos el contador con i siendo igual a la cantidad de elementos que
		// hay en el ArrayList "fileNames" y continuamos recorriendo este hasta la 
		// posición 1, que es la última
		for (int i = organizer.getNumberOfFiles(); i > 0; i--) {
			
			// Para poder ver qué nombres contienen "B" necesitamos poder
			// acceder a esos nombres, para ello declaramos la varuable local
			// title, que es de tipo String, la cuál va a usar el método getFiles
			// y va a acceder el índice correspondiente a la posición dictada por el 
			// bucle. Es decir, si el bucle está viendo el elemento 8, en el ArrayList
			// de fileNames, el elemento 8 corresponde a la posición 7, por eso
			// pongo getFiles.get(i - 1)
			String title = organizer.getFiles().get(i - 1);
			
			// Y ahora sí ya podemos comprobar si el nombre contiene "B" y si sí, 
			// llamar al método removeSong
			if (title.contains("B")) {
				organizer.removeSong(i); // Aquí ya no hace falta poner (i - 1) porque ya lo hace el método removeSong por nosotros
			}
					
		}
		
		// 8. Imprimir nuevos listados
		System.out.println("\nNuevo listado de nombres de canciones: ");
		organizer.printAllTitleNames();
		
		System.out.println("\nNuevo listado de ficheros mp3; ");
		organizer.printAllFileNames();
		
		System.out.println();
		
	}
}