package com.curso;

//INYECTOR POR CONSTRUCTOR
public class InyectorProducto {
    static ServicioProducto inyectarServicioProducto() {
        // Instanciamos el repositorio de productos
        RepositorioProducto repositorioProducto = new RepositorioProductoImpl();

        // Creamos el servicio de productos y le inyectamos el repositorio
        return new ServicioProductoImpl(repositorioProducto);
    }
}

