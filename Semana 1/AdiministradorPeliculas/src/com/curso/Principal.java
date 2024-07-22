package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		RepositorioPeliculas peliculasFav = new PeliculasFavoritas();
		RepositorioPeliculas peliculasNoMeGustaron = new PeliculasFavoritas();
		
		Pelicula accion1 = new Accion ("Mad Max: Fury Road", "George Miller", 2015);
		Pelicula accion2 = new Accion("The Dark Knight", "Christopher Nolan", 2008);
		Pelicula comedia1 = new Comedia("Superbad", "Greg Mottola", 2007);
		Pelicula comedia2 = new Comedia("Anchorman: The Legend of Ron Burgundy", "Adam McKay", 2004);
		Pelicula drama1 = new Drama("The Shawshank Redemption", "Frank Darabont", 1994);
		Pelicula drama2 = new Drama("Forrest Gump", "Robert Zemeckis", 1994);
		
		accion1.mostrarInformacion();
		
		accion1.agregarPelicula(peliculasFav);
		accion2.agregarPelicula(peliculasNoMeGustaron);
		comedia1.agregarPelicula(peliculasNoMeGustaron);
		comedia2.agregarPelicula(peliculasFav);
		drama1.agregarPelicula(peliculasFav);
		drama2.agregarPelicula(peliculasNoMeGustaron);

		
		System.out.println("***********PELICULAS FAVORITAS**********");
		
		accion1.listarPeliculas(peliculasFav);
		
		System.out.println("***********PELICULAS QUE NO ME GUSTARON**********");
		
		accion2.listarPeliculas(peliculasNoMeGustaron);
		
		
		

	}
	
}
