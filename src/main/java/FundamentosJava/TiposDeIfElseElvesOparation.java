// 4 EXEMPLOS DE COMO USAR O if, else e ?: "Elves Operation"

package FundamentosJava;

import java.util.Scanner;


public class TiposDeIfElseElvesOparation {


    public class App {
        public static void main(String[] args) throws Exception {

            var scanner = new Scanner(System.in);

            System.out.println("Informe seu nome: ");
            var nome = scanner.nextLine();

            System.out.println("Informe sua idade: ");
            var idade = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Você é emancipado? (s/n)");
            var isEmancipated = scanner.nextLine().equalsIgnoreCase("s");

            // Exemplo 1 de utilização de if e else
            /**
             if(idade >= 18) {
             System.out.printf("%s, tem %s anos, você pode dirigir! \n", nome, idade);

             } else if (idade >= 16 && isEmancipated) {
             System.out.printf("%s, apesar de você ter %s, você é emancipado e pode dirigit! \n", nome, idade);

             } else {
             System.out.printf("%s ,Você não pode dirigir! \n", nome);
             }
             */


            // Exemplo 2 de usar o if e else -> declarando e usando apenas a variável
            /**
             var canDrive = ( idade >= 18) || ( idade >= 16 && isEmancipated);
             if(canDrive) {
             System.out.printf("%s, você pode dirigir! \n", nome);
             } else {
             System.out.printf("%s, você não pode dirigir pois você tem apenas %s anos de idade! \n", nome, idade);
             }
             */

            // Exemplo 3 de utilização do if
            /**
             var buscarIdade = (idade >= 18) || (idade >= 16 && isEmancipated);
             var message = "";

             if(buscarIdade) {
             message = nome + ", você pode dirigir! \n";
             } else {
             message = nome + ", você não pode dirigir! \n";
             }
             */

            // Exemplo 4 de utilização do if
            var buscarIdade = (idade>=18) || (idade>=16 && isEmancipated);
            var message = buscarIdade ? nome + ", você pode dirigir! \n" : nome + ", você não pode dirigir! \n";

            System.out.println(message);
            System.out.println("Fim da execução");
            scanner.close();

        }


    }


}
