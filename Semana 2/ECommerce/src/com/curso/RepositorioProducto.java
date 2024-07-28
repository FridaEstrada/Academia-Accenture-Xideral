package com.curso;

import java.util.List;

public interface RepositorioProducto {
	void agregarProducto(Producto producto);
    void actualizarProducto(Producto producto);
    void eliminarProducto(int idProducto);
    Producto obtenerProducto(int idProducto);
    List<Producto> obtenerTodosLosProductos();
}
