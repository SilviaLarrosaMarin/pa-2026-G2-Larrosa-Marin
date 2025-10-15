package pa;

import pa.gui.EntornoGrafico;

public class PlayerModoGrafico{
	
	private static final String[] titulos_canciones = {
			"All I See Is You - Omnia feat. Christian Burns",
			"Body to Body - Sture Zetterberg",
			"I Wish - Andrew Rayel",
			"In The Dark-Armin van Armin van Buuren & David Guetta",
			"Invincible - Christina Novelli",
			"Robarte un Beso - Carlos Vives",
			"Save Your Tears - Ariana Grande",
			"Secret Love Song - Little Mix ft Jason Derulo",
			"Simples Corazones - Fonseca-feat Melendi",
			"Stay With Me - AVIRA",
			"The Reason - Hoobastank",
			"Vagabundo - Sebastián Yatra",
			"With My Own Eyes - Sash",	
	};
	
	public static void main(String[] args) {
		
		// Craer instancia de la clase EntornoGrafico con titulos_canciones como parámetro
		EntornoGrafico entorno = new EntornoGrafico(titulos_canciones);
		
		// Invocar al método startAplicacion() sobre el objeto de tipo EntornoGrafico
		entorno.startAplicacion();
	}
}