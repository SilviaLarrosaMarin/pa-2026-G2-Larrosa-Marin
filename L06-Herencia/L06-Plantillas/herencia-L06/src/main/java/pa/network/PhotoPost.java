package pa.network;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class PhotoPost extends Post // Herencia
{
    
    private String filename;  // Atributos específicos
    private String caption;   // 
    
    
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    
    // Getters específicos
    public String getImageFile()
    {
        return filename;
    }

   
    public String getCaption()
    {
        return caption;
    }

    

    @Override
    public void display()
    {
    	System.out.println("Message author: " + username);
        System.out.println("Message content: [" + filename + "] " + caption);
        
        super.display();
    }
    
}
  
