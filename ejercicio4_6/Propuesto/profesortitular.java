package ejercicio4_6.Propuesto;

import ejercicio4_6.profesor;

public  class  profesortitular extends profesor {
    int años=0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAños() {
        System.out.println("Años = “ + años");
    }
    }
