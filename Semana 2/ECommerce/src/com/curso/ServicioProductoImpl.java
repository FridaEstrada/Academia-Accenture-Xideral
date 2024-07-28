package com.curso;

import java.util.List;

public class ServicioProductoImpl implements ServicioProducto{
	private RepositorioProducto repositorioProducto;

    // Constructor para inyectar el repositorio de productos
    public ServicioProductoImpl(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    @Override
    public void agregarProducto(Producto producto) {
        repositorioProducto.agregarProducto(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        repositorioProducto.actualizarProducto(producto);
    }

    @Override
    public void eliminarProducto(int idProducto) {
        repositorioProducto.eliminarProducto(idProducto);
    }

    @Override
    public Producto obtenerProducto(int idProducto) {
        return repositorioProducto.obtenerProducto(idProducto);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return repositorioProducto.obtenerTodosLosProductos();
    }
}
