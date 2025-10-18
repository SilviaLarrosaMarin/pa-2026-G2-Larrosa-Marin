package pa.network;

import java.util.ArrayList;



public class NewsFeed
{
    private ArrayList<Post> posts; // lista de la superclase Post

    
    public NewsFeed()
    {
       posts = new ArrayList<>(); // Inicializamos la única lista
    }

    // Quitamos addMessagePost y addPhotoPost y ponemos un único método addPost
    
    public void addPost(Post post) {
    	posts.add(post);
    }
 
    // Quitar bucles de MessagePost y PhotoPost por un único bucle para Post
    public void show()  {
        
    	for (Post post : posts) {
    		post.display();
    	}
    }
}
