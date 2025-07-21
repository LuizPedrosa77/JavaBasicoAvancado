package FundamentosJava;

public class SwitchCaseEspressionInitialization {
    public static void main(String[] args) {

        // Exemplo 1 de switch case Expression

        int dia = 3;

        switch (dia) {

            case 1 -> System.out.println("Segunda");

            case 2 -> System.out.println("Terça");

            case 3 -> System.out.println("Quarta");

            default -> System.out.println("Desconhecido");
        }


        // Exemplo 2 de switch case para Initialization

        String dia2 = "Quin.";

        String tipoDedia2 = switch (dia2) { // (String) e o (Tipo) e (tipoDeDia) e a variavel
            case "Seg.", "Ter.", "Qua.", "Quin.", "Sex." -> "Dia útil";
            case "Sabado", "Domingo" -> "Fim de semana";
            default -> "Desconhecido";
        };
        System.out.println(tipoDedia2);

    }
}
