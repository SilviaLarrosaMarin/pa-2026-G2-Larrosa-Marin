package pa.network;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post{
	
	// Atributos protected accesibles por subclases
	protected String username;
	protected long timestamp;
	protected int likes;
	protected ArrayList<String> comments; // importar java.util.ArrayList;
	
	/**
	 * Constructor para objetps de clase Post
	 * @param author El nombre de usuario del autor
	 */
	
	public Post(String author) {
		
		username = author;
		timestamp = System.currentTimeMillis();
		likes = 0;
		comments = new ArrayList<>();		
	}
	
	// Métodos comunes
	
	// Mover los métodos comunes like(), unlike(), addComment(), getTimeStamp(), display() y timeString() desde
	// MessagePost y PhotoPost a Post
	

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time formatted as "hh:mm:ss".
     */
    public String getTimeStamp()
    {
        String date = new SimpleDateFormat("H:mm:ss").format(new Date(timestamp));
        return date;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     * 
     * Implementación base que solo imprime los detalles comunes. Se sobreescribirá por las subclases
     */
    public void display()
    {
        System.out.println("Post author: " + username);
        // Se elimina la parte de escribir el contenido del mensaje
        System.out.println("Message date: " + timeString(timestamp));
        
        if (likes > 0) {
        	System.out.print(" - " + likes + " people like this.");
        }
        System.out.println();
        
        if (comments.isEmpty()) {
        	System.out.println("   No comments.");
        } else {
        	System.out.println("   " + comments.size() + " comment(s):");
        	
        	for(int i = 0; i < comments.size(); i++) {
        		System.out.println("      " + (i + 1) + ". " + comments.get(i));
        	}
        }
        System.out.println();
    }
    
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    protected String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }

}