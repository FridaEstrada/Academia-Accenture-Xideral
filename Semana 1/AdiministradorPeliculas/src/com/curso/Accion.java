package com.curso;

public class Accion extends Pelicula{
	
	public Accion(String titulo, String director, int año) {
		super(titulo,director,año);
	}

	void mostrarInformacion(){
		System.out.println("Este género es conocido por sus escenas emocionantes y de alto ritmo, que incluyen persecuciones, peleas, explosiones y otros elementos de suspenso. ");
	}
	
}
