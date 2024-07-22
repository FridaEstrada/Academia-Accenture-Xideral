package com.curso;

public class AdminImpresora {
	
    private static AdminImpresora instancia;

    
    private boolean estaLista;

   
    private AdminImpresora() {
        estaLista = true;
    }

    
    public static AdminImpresora getInstancia() {
        if (instancia == null) {
            instancia = new AdminImpresora();
        }
        return instancia;
    }

    
    public boolean estaLista() {
        return estaLista;
    }

    
    public void imprimirDocumento(String documento) {
        if (estaLista) {
            System.out.println("Imprimiendo documento: " + documento);
            estaLista = false; 
        } else {
            System.out.println("La impresora no está lista.");
        }
    }

    
    public void restablecerImpresora() {
        estaLista = true;
        System.out.println("La impresora está lista.");
    }
}
