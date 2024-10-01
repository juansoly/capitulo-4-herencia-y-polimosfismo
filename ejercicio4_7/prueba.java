package ejercicio4_7;

public class prueba {
    public static void main(String[] args) {
        animal[] animales = new animal[4];

        animales[0] = new gato();
        animales[1] = new perro();
        animales[2] = new lobo();
        animales[3] = new leon();
        for (int i = 0; i < animales.length; i++) {

            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].
                    getAlimentos());

            System.out.println("Hábitat:"  + animales[i].getHabitad());
            System.out.println();
        }
    }
}
