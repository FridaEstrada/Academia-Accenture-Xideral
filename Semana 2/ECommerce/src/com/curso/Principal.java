package com.curso;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Usar el inyector para obtener una instancia de ServicioProducto
        ServicioProducto servicioProducto = InyectorProducto.inyectarServicioProducto();

        // Crear algunos productos
        Producto producto1 = new Producto(1, "Laptop", 1500.00);
        Producto producto2 = new Producto(2, "Smartphone", 800.00);
        Producto producto3 = new Producto(3, "Tablet", 600.00);

        // Agregar productos al inventario
        servicioProducto.agregarProducto(producto1);
        servicioProducto.agregarProducto(producto2);
        servicioProducto.agregarProducto(producto3);

        // Mostrar todos los productos
        System.out.println("Todos los productos:");
        List<Producto> productos = servicioProducto.obtenerTodosLosProductos();
        for (Producto p : productos) {
            System.out.println(p);
        }

        // Buscar un producto por ID
        System.out.println("\nBuscar producto con ID 2:");
        Producto productoBuscado = servicioProducto.obtenerProducto(2);
        System.out.println(productoBuscado);

        // Eliminar un producto por ID
        System.out.println("\nEliminar producto con ID 1:");
        servicioProducto.eliminarProducto(1);

        // Mostrar todos los productos después de la eliminación
        System.out.println("Todos los productos después de la eliminación:");
        productos = servicioProducto.obtenerTodosLosProductos();
        for (Producto p : productos) {
            System.out.println(p);
        }

        // Actualizar un producto existente
        System.out.println("\nActualizar producto con ID 3:");
        Producto productoActualizado = new Producto(3, "Tablet", 650.00);
        servicioProducto.actualizarProducto(productoActualizado);

        // Mostrar todos los productos después de la actualización
        System.out.println("Todos los productos después de la actualización:");
        productos = servicioProducto.obtenerTodosLosProductos();
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

