package com.mycompany.arreglos;

public class MaximoEnArreglo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        System.out.println("El valor máximo en el arreglo es: " + maximo);
    }
}
