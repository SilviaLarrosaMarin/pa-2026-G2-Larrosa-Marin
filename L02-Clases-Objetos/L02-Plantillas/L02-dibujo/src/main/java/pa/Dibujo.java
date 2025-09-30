    package pa;

    public class Dibujo {


    public static void main(String[] args) {

        System.out.println("\n\n Ejercicio completado con coche y persona \n\n");
        
	// COCHE
	
	// 1. Base del coche (4 CUADRADOS)

     // Cuadrado 1 = c1
	Square c1 = new Square();
	c1.changeColor("red");
	c1.changeSize(50);
	c1.moveHorizontal(-170);
	c1.moveVertical(20);
	c1.makeVisible();        
    
	 // Cuadrado 2 = c2
	Square c2 = new Square();
	c2.changeColor("red");
	c2.changeSize(50);
	c2.moveHorizontal(-120);
	c2.moveVertical(20);
	c2.makeVisible();     
	
	 // Cuadrado 3 = c3
	Square c3 = new Square();
	c3.changeColor("red");
	c3.changeSize(50);
	c3.moveHorizontal(-70);
	c3.moveVertical(20);
	c3.makeVisible();        
	
	 // Cuadrado 4 = c4
	Square c4 = new Square();
	c4.changeColor("red");
	c4.changeSize(50);
	c4.moveHorizontal(-20);
	c4.moveVertical(20);
	c4.makeVisible();   
	
	// 2. Cabina del coche (1 CUADRADO, 2 TRIÁNGULOS)
	
	 // Cabina CUADRADO
	Square cabina = new Square();
	cabina.changeColor("red");
	cabina.changeSize(80);
	cabina.moveHorizontal(-110);
	cabina.moveVertical(-30);
	cabina.makeVisible();    
 
	 // Parabrisas TRIÁNGULO
	Triangle parabrisas = new Triangle();
	parabrisas.changeColor("green");
	parabrisas.changeSize(50, 50);
	parabrisas.moveHorizontal(-10);
	parabrisas.moveVertical(-50);
	parabrisas.makeVisible();
	    
	 // Parabrisas trasero TRIÁNGULO
	Triangle trasero = new Triangle();
	trasero.changeColor("red");
	trasero.changeSize(50, 50);
	trasero.moveHorizontal(70);
	trasero.moveVertical(-50);
	trasero.makeVisible();
	    
	
	// 3. Ruedas y llantas (2 CÍRCULOS GRANDES Y 2 PEQUEÑOS)
	
	 // Rueda izquierda = r1
	Circle r1 = new Circle();
	r1.changeSize(50);
	r1.changeColor("black");
	r1.moveHorizontal(-50);
	r1.moveVertical(75);
	r1.makeVisible();
	
	 // Rueda derecha = r2
	Circle r2 = new Circle();
	r2.changeSize(50);
	r2.changeColor("black");
	r2.moveHorizontal(30);
	r2.moveVertical(75);
	r2.makeVisible();
	 // Llanta izquierda = l1
	Circle l1 = new Circle();
	l1.changeSize(25);
	l1.changeColor("yellow");
	l1.moveHorizontal(-37);
	l1.moveVertical(87);
	l1.makeVisible();
	
	 // Llanta derecha = l2
	Circle l2 = new Circle();
	l2.changeSize(25);
	l2.changeColor("yellow");
	l2.moveHorizontal(42);
	l2.moveVertical(87);
	l2.makeVisible();
	
	// 4. Faro delantero (1 CUADRADO)
	
     // Faro 
	Square faro = new Square();
	faro.changeColor("yellow");
	faro.changeSize(15);
	faro.moveHorizontal(-170);
	faro.moveVertical(20);
	faro.makeVisible(); 
	
	
	// PERSONA
	
	Person persona = new Person();
	persona.changeColor("blue");
	persona.changeSize(120, 50);
	persona.moveHorizontal(-200);
	persona.moveVertical(-60);
	persona.makeVisible();

	
		
    }


    }

