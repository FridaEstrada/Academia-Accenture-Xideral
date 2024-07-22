package com.curso;

public abstract class Pelicula {
	String titulo;
	String director;
	int año;
	
	public Pelicula(String titulo, String director, int año) {
		this.titulo = titulo;
		this.director = director;
		this.año = año;
	}
	
	abstract void mostrarInformacion();
	
	public void agregarPelicula(RepositorioPeliculas repositorio) {
        repositorio.agregarPelicula(this);
    }
	
	public void eliminarPelicula(RepositorioPeliculas repositorio) {
        repositorio.eliminarPelicula(this);
    }
	
	public void listarPeliculas(RepositorioPeliculas repositorio) {
        repositorio.listarPeliculas();
    }
	

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", año=" + año + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	

}
