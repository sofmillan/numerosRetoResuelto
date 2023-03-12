package com.example.numeros;

public class NumeroService {



    public  Integer obtenerTotal(Integer n) {

        int retorno=n;
        for(int i = 0;i<n;i++){
            String s;
            s=i+"";
            if(s.length()>=2 && s.charAt(0)=='1'&&s.charAt(1)=='3'){
                retorno--;
            }

        }

        return retorno;
        /** El numero 13 de la mala suerte
         * Crear un algoritmo que pasado un numero n debe retonar
         * la cantidad de numeros que hay sin contar los que contengan
         * el 13,
         *
         * Ejemplo 1
         * numero = 100
         * numeros a descartar =  13
         * total numeros: 99
         *
         * Ejemplo 2:
         * numero = 1000
         * numeros a descartar =  13, 130...139
         * total numeros: 989
         *
         * Ejemplo 2:
         * numero = 3800
         * numeros a descartar = 13, 130..139 , 1300...1399.
         * total numeros: 3699
         */
    }
}
