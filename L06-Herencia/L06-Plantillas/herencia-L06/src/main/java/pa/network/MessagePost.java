package pa.network;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MessagePost extends Post // HERENCIA
{
    
    private String message;   // Nos quedamos solo con el atributo específico

    
    public MessagePost(String author, String text)
    {
        super(author); // Llama al constructor de Post que se encarga de username = author, 
        //timestamp = System.currentTimeMillis(), likes = 0 y comments = new ArrayList<>();
        message = text; // Atributo específico que mantenemos
        
    }

    // Getter específico 
    public String getText()
    {
        return message;
    }

    @Override
    public void display()
    {
    	// Formato específico para MessagePost
        System.out.println("Message author: " + username);
        System.out.println("Message content: " + message);
      
        super.display(); // Llama a la implementación de la superclase para imprimir autor, likes y comentarios
    }
    
}