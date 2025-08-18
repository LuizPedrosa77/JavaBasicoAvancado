package Aula7StreamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class SupplierExemple {
    public static void main(String[] args) {
     
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "olá, seja bem-vindo!";
        
        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo!")
                .limit(5)
                .toList();
        
        // Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
