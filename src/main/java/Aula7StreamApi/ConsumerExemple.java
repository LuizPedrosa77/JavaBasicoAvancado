package Aula7StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {

    public static void main(String[] args) {

        // Cria uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Usar o Consumer com a expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        //numeros.stream().forEach(imprimirNumeroPar);

        numeros.forEach(n -> {
                if(n % 2 ==0) {
                    System.out.println(n);
                }
        });

    }
}
