package pa;

public class Cita {
	private int inicio; //0..24
	private int fin;  //0..24
	private int dia_semana;  //0..6
	
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
		dia_semana= dia;
	}
	
	public void setFranjaHoraria(int inicio, int fin) {
		this.inicio= inicio;
		this.fin = fin;		
	}
	
	private boolean hora_valida(int hora) {
		return false;
	}
	
	private boolean franja_es_valida(int inicio, int fin) {
		return false;
	}
		
	public boolean solapa_con(Cita c) {
		return false;
	}
	
	private String mostrarDia(int dia) {
		return null;
	}
	
	public void imprimir() {
		
	}

}
