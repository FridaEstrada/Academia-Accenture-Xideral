package com.curso;

public class Drama extends Pelicula{
	public Drama(String titulo, String director, int año) {
		super(titulo,director,año);
	}

	void mostrarInformacion(){
		System.out.println("Las películas dramáticas se centran en historias más serias y emocionalmente intensas. Pueden abordar temas profundos y complejos, explorando las relaciones humanas, conflictos personales y situaciones difíciles.");
	}
}
