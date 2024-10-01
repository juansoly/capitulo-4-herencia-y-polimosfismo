package ejercicio4_6;

import ejercicio4_5.ProfesorTitular;
import ejercicio4_5.Propuesto.Profesor;

public class profesor {
    protected void imprimir() {
        System.out.println("Es un profesor.");
    }
}
class  profesorTitular extends  profesor{
    int años=0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAños() {
        System.out.println("Años = “ + años");
    }
}
/*public class  Prueba3{
    public static void main(String[] args) {
        //LA PRUEBA NO COPILA
       /* Profesor profesor1 = new ProfesorTitular();*/


