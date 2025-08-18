package Aula7StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar a Function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero % 2;

        // Usar a função para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
