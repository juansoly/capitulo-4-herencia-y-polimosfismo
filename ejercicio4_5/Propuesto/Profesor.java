package ejercicio4_5.Propuesto;

public class Profesor {
    protected void imprimir() {
        System.out.println("Es un profesor");
    }
}
class ProfesorTitular extends Profesor{
   protected void imprimir(){
       System.out.println("es un profesor Titular");
   }
    }
    class  main{
        public static void main(String[] args) {
            //NO COPILA
            /*Profesor profesor1 = new ProfesorTitular();
            /*ProfesorTitular profesor2 = (Profesor) profesor1;*/
            Profesor profesor1= new Profesor();
            ProfesorTitular profesor2=(ProfesorTitular) profesor1;
            profesor2.imprimir();
        }
    }