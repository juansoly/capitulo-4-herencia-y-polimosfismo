package ejercicio4_7.propuesto;



   abstract class Numerica {
        public abstract String toString();
        public abstract boolean equals(Object ob);
        public abstract Numerica sumar(Numerica numero);
        public abstract Numerica restar(Numerica numero);
        public abstract Numerica multiplicar(Numerica numero);
        public abstract Numerica dividir(Numerica numero);
    }


    class Fraccion extends Numerica {
        private int numerador;
        private int denominador;

        public Fraccion(int numerador, int denominador) {
            this.numerador = numerador;
            this.denominador = denominador;
        }

        @Override
        public String toString() {
            return numerador + "/" + denominador;
        }

        @Override
        public boolean equals(Object ob) {
            if (this == ob) return true;
            if (ob == null || getClass() != ob.getClass()) return false;
            Fraccion fraccion = (Fraccion) ob;
            return numerador == fraccion.numerador && denominador == fraccion.denominador;
        }

        @Override
        public Numerica sumar(Numerica numero) {
            Fraccion fraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * fraccion.denominador + fraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * fraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        @Override
        public Numerica restar(Numerica numero) {
            Fraccion fraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * fraccion.denominador - fraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * fraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        @Override
        public Numerica multiplicar(Numerica numero) {
            Fraccion fraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * fraccion.numerador;
            int nuevoDenominador = this.denominador * fraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        @Override
        public Numerica dividir(Numerica numero) {
            Fraccion fraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * fraccion.denominador;
            int nuevoDenominador = this.denominador * fraccion.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
    }

    // Clase de prueba
     class Prueba {
        public static void main(String[] args) {
            Fraccion fraccion1 = new Fraccion(1, 2);
            Fraccion fraccion2 = new Fraccion(3, 4);

            System.out.println("Fracción 1: " + fraccion1);
            System.out.println("Fracción 2: " + fraccion2);

            Fraccion suma = (Fraccion) fraccion1.sumar(fraccion2);
            System.out.println("Suma: " + suma);

            Fraccion resta = (Fraccion) fraccion1.restar(fraccion2);
            System.out.println("Resta: " + resta);

            Fraccion multiplicacion = (Fraccion) fraccion1.multiplicar(fraccion2);
            System.out.println("Multiplicación: " + multiplicacion);

            Fraccion division = (Fraccion) fraccion1.dividir(fraccion2);
            System.out.println("División: " + division);
        }
    }


