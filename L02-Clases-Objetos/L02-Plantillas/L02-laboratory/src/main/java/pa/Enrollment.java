/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    
    public static void main(String[] args) {
    	
    	System.out.println("\n\n Ejercicio laboratory 02 hecho \n\n");
	
	// 1. Crear instancias de Student. Como credit se inicializa a 0, debemos usar ".addCredits(int)" para
	// añadir los créditos iniciales de cada uno. El nombre y el ID sí se pueden incluir como strings.
	Student monica = new Student("Monica Geller", "A00234");
	monica.addCredits(24);
	Student joey = new Student("Joe Tribiani", "C22044");
	joey.addCredits(56);
	Student chandler = new Student("Chandler Bing", "A12003");
	chandler.addCredits(6);
	Student rachel = new Student("Rachel Green", "B66003");
	rachel.addCredits(12);

	// Imprimir lista estudiantes, usando system.out.println que con print() imprime una lista con
	// el nombre, ID y créditos de cada estudiante
	System.out.println("Students' list:");
	monica.print();
	joey.print();
	chandler.print();
	rachel.print();
	System.out.println();

	// 2. Crear objetos LabClass con LabClass( int maxNumberOfStudents) para poner cuántos caben en cada
	// clase y luego atribuirle con setInstructor, setTime y setRoom lascaracterísticas de cada clase
	LabClass labEli = new LabClass(2);
	labEli.setInstructor("Eli");
	labEli.setTime("Miércoles, 15h");
	labEli.setRoom("Aulario 2");

	LabClass labJose = new LabClass(1);
	labJose.setInstructor("Jose Antonio");
	labJose.setTime("Miércoles, 17h");
	labJose.setRoom("Aulario 2");

	// 3. Enrolar estudiantes con enrollStudent, que tiene en cuenta que si el número de enrolls de
	//  estudiantes es mayor al maxNumberOfStudents, la clase está llena y no se pueden enrolar más
	System.out.println("Enroll students (Eli):");
	labEli.enrollStudent(monica);
	labEli.enrollStudent(joey);

	System.out.println("\nEnroll students (Jose Antonio):");
	labJose.enrollStudent(chandler);
	labJose.enrollStudent(rachel);

	// Imprime listados con datos de cada estudiante llamando a printList()
	labEli.printList();
	labJose.printList();
	
      
    }
    
}
