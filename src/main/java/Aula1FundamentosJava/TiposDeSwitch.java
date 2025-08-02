package Aula1FundamentosJava;

import java.util.Scanner;

public class TiposDeSwitch {

    /**
     Crie um programa onde o usuario vai digitar um número e será retornado um dia na semana
     */

    public class App {

        public static void main(String[] args) {
            var ponto1 = new Scanner(System.in);

            System.out.println("Digite um numero de 1 a 7");
            var opcao = ponto1.nextInt();

            // EXEMPLO 1 - PADRÃO
            /**
             switch (opcao) {
             case 1:
             System.out.println("Domingo");
             break;
             case 2:
             System.out.println("Segunda");
             break;
             case 3:
             System.out.println("Terça");
             break;
             case 4:
             System.out.println("Quarta");
             break;
             case 5:
             System.out.println("Quinta");
             break;
             case 6:
             System.out.println("Sexta");
             break;
             case 7:
             System.out.println("Sábado");
             break;

             default:
             System.out.println("Opção inválida!");
             break;
             }
             */


            // Exemplo 2 - Sinal " -> "
            /**
             switch (opcao) {
             case 1, 7 -> System.out.println("Final de semana");
             case 2 -> System.out.println("Segunda");
             case 3 -> System.out.println("Terça");
             case 4 -> System.out.println("Quarta");
             case 5 -> System.out.println("Quinta");
             case 6 -> System.out.println("Sexta");
             default -> System.out.println("Nenhuma das opções");
             }
             */

            // EXEMPLO 3 - Utilizando "var = message" e retirando o "System.out.println"

            var message = switch (opcao) {
                case 1, 7 -> {
                    var dia = opcao == 1 ? "Domingo" : "Sábado";
                    yield "Hoje é final de semana!!!";

                }
                case 2 ->    "Segunda";
                case 3 ->    "Terça";
                case 4 ->    "Quarta";
                case 5 ->    "Quinta";
                case 6 ->    "Sexta";
                default ->   "Nenhuma das opções";
            };




        }
    }



}
