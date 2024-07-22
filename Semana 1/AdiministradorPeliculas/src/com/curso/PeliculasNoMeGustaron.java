package com.curso;
import java.util.ArrayList;

public class PeliculasNoMeGustaron implements RepositorioPeliculas{
	
	private ArrayList<Pelicula> peliculas;

    public PeliculasNoMeGustaron() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada: " + pelicula.getTitulo());
    }

    @Override
    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
        System.out.println("Película eliminada: " + pelicula.getTitulo());
    }

    @Override
    public void listarPeliculas() {
    	System.out.println(peliculas);
    }
}
