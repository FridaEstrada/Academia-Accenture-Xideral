package com.curso;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProductoImpl implements RepositorioProducto{
	private List<Producto> productos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        
    }

    @Override
    public void actualizarProducto(Producto producto) {
        int indice = encontrarIndiceProducto(producto.getId());
        if (indice != -1) {
            productos.set(indice, producto);
        }
    }

    @Override
    public void eliminarProducto(int idProducto) {
        int indice = encontrarIndiceProducto(idProducto);
        if (indice != -1) {
            productos.remove(indice);
        }
    }

    @Override
    public Producto obtenerProducto(int idProducto) {
        int indice = encontrarIndiceProducto(idProducto);
        return indice != -1 ? productos.get(indice) : null;
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
    	return new ArrayList<>(productos);
        
    }

    private int encontrarIndiceProducto(int idProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == idProducto) {
                return i;
            }
        }
        return -1;
    }
   
}
