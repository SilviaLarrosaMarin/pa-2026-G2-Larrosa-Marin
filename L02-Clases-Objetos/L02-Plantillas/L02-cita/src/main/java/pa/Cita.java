package pa;

public class Cita {
    private int inicio;       // de 0 a 24
    private int fin;          // de 0 a 24
    private int dia_semana;   // de 0 a 6, siendo 0 = Lunes y 6 = Domingo

    public Cita() {
        this.dia_semana = 0;
        this.inicio = 0;
        this.fin = 1;	
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getDia() {
        return dia_semana;
    }

    public void setDia(int dia) {
        // Solo actualiza si el día está entre 0 y 6
        if(dia >= 0 && dia <= 6) {
            this.dia_semana = dia;
        }
    }

    public void setFranjaHoraria(int inicio, int fin) {
        // Solo asigna si franja_es_valida lo permite
        if(franja_es_valida(inicio, fin)) {
            this.inicio = inicio;
            this.fin = fin;
        }
    }

    
    private boolean hora_valida(int hora) {
        // Comprueba si la hora está entre 0 y 24. Es un método privado
    	return hora >= 0 && hora <= 24;
    }

    
    private boolean franja_es_valida(int inicio, int fin) {
        // Comprueba con hora_valida que las horas estén entre 0 y 24 y que la
    	// hora de inicio sea menor que la del fin. También es privado
    	return hora_valida(inicio) && hora_valida(fin) && inicio < fin;
    }

    
    public boolean solapa_con(Cita c) {
        // Devuelve "true" si el día de la cita actual (this.dia_semana) y
    	// el día de la otra cita (c.setDia()) son el mismo día y "true"
    	// si el inicio de la cita actual (this.inicio) está antes de que
    	// termine la otra cita (c.getFin()) o si el fin de la cita actual
    	// (this.fin) está después del inicio de la otra cita (c.getInicio())
    	// Es público
        if(this.dia_semana != c.getDia()) {
            return false;
        }
        return this.inicio < c.getFin() && c.getInicio() < this.fin;
    }

    
    private String mostrarDia(int dia) {
        // Devuleve el nombre del día con un switch que convierte un
    	// entero en String. Es privado
    	switch(dia) {
            case 0: return "Lunes";
            case 1: return "Martes";
            case 2: return "Miércoles";
            case 3: return "Jueves";
            case 4: return "Viernes";
            case 5: return "Sábado";
            case 6: return "Domingo";
            default: return "Día no válido";
        }
    }

    
    public void imprimir() {
    	// Muestra los datos de la cita por pantalla. Es público
        System.out.println("Datos de la cita: ");
        System.out.println("    -hora inicio: " + inicio);
        System.out.println("    -hora fin: " + fin);
        System.out.println("    -dia semana: " + mostrarDia(dia_semana));
    }
}

