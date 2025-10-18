package pa;

import pa.network.MessagePost;
import pa.network.PhotoPost;
import pa.network.NewsFeed;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// Crear instancia de NewsFedd
		NewsFeed feed = new NewsFeed();
		
		// Crear instancia de MessagePost
		MessagePost post1 = new MessagePost("Mario", "Me voy a la Uni");
		
		// Añadir 3 likes y 1 unlike
		post1.like();
		post1.like();
		post1.like();
		post1.unlike();
		
		feed.addMessagePost(post1);
		
		// Crear isntancia de PhotoPost
		String path = "src/main/resources/imagenes/leopardo.jpeg";
		
		PhotoPost post2 = new PhotoPost("Juan", path, "Leopardo enfadado");
		
		// Añadir 2 comentarios
		post2.addComment("Qué foto más chula!");
		post2.addComment("Pues a mí no me gusta mucho");
		
		feed.addPhotoPost(post2);
		
		// Mostrar posts iniciales
		System.out.println("\n-- Posts iniciales --");
		System.out.println();
		feed.show();
		
		// Posts con más likes y comentarios
		
		// Post1 con 7 comentarios, 18 likes y 25 unlikes
		
		// Bucle para comentarios post1
		for (int i = 1; i <= 7; i++) {
			post1.addComment("comentario" + i);
		}
		
		// Bucles para likes y unlikes
		for (int i = 0; i < 18; i++) {
			post1.like();
		}
		for (int i = 0; i < 25; i++) {
			post1.unlike();
		}
		
		// Post2 con 10 comentarios, 35 likes y 4 unlikes
		
		// Bucle para comentarios post2
		for (int i = 1; i <= 10; i++) {
			post2.addComment("comentario" + i);
		}
		
		// Bucle para likes y unlikes 
		for (int i = 0; i < 35; i++) {
			post2.like();
		}
		for(int i = 0; i < 4; i++) {
			post2.unlike();
		}
	
		// Mostrar posts finales
		System.out.println("-- Posts finales --");
		System.out.println();
		feed.show();
	}
}
