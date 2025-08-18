package Aula7StreamApi;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {

        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter( p -> p.length() > 5)
                .forEach( System.out::println);

    }
}
