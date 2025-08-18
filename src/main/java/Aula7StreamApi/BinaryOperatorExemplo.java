package Aula7StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator; // Mantém o import

// CORREÇÃO: Renomeado a classe para evitar conflito
public class BinaryOperatorExemplo {
    public static void main(String[] args) {

        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Usar o BinaryOperator com expressão lambda para somar dois numeros inteiros
        // O compilador agora sabe que 'BinaryOperator' se refere à interface importada
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: "+resultado);

    }
}