package FundamentosJava;

import java.util.Scanner;

public class TryCatchFinallyException {
    public static void main(String[] args) {

        /**
            O "try" e o "catch" servem para ler e capturar todos os erros de exceção do programa.
            Quando eles são implementados, sempre que houver um erro de exceção, pode ser adicionado
            alguma informação após o "catch (Exception e)" para que seja impresso informando sobre o erro.
            Quando se utiliza o "finally", independendo do erro ou acerto, será impresso uma mensagem ou qualquer
            outra informação que foi adicionado entre cochetes.
         */

        try {
            Scanner leitor = new Scanner(System.in);
            int idade = 0;

            System.out.println(" Qual sua idade?");
            idade = leitor.nextInt();

            System.out.format("Minha idade é %d", idade);
        } catch (Exception e) {
            System.out.println("Digite uma idade valida!");
        } finally {
            System.out.println("Programa concluído!");
        }
    }
}
