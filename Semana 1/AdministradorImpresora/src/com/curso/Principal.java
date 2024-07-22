package com.curso;

public class Principal {
	public static void main(String[] args) {
        AdminImpresora adminImpresora =  AdminImpresora.getInstancia();
        
        System.out.println("¿La impresora está lista? " +  adminImpresora.estaLista());

        
        adminImpresora.imprimirDocumento("Documento1.txt");

        
        adminImpresora.imprimirDocumento("Documento2.txt");

        
        adminImpresora.restablecerImpresora();

        
        adminImpresora.imprimirDocumento("Documento2.txt");

        
        AdminImpresora otroAdminImpresora =  AdminImpresora.getInstancia();
        System.out.println("¿adminImpresora y otroAdminImpresora son la misma instancia? " + (adminImpresora == otroAdminImpresora));
    }
}
