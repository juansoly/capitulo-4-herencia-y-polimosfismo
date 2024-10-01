package ejercicio4_6.Propuesto;

import java.util.Vector;
import java.util.*;
public class prueba {
        Vector profesores;

        public static void main(String[] args) {
            prueba prueba = new prueba();
            prueba.profesores = new Vector();
            profesor profesor1 = new profesor();
            profesortitular profesor2 = new profesortitular();
            prueba.profesores.add(profesor1);
            prueba.profesores.add(profesor2);
            for (int i = 0; i < prueba.profesores.size(); i++) {
                profesor p = (profesor) prueba.profesores.elementAt(i);
                p.imprimir();
            }
        }
    }


