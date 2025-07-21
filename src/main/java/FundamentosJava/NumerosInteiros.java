package FundamentosJava;

public class NumerosInteiros {
    public static void main(String[] args) {


        // AULA DE NUMEROS INTEIROS
        // Quando tem poucos numeros usa-se: int (inteiro)
        // Quando o número é muito extenso, usa-se long

        /**
        soma, subtração, divisão, multiplicação, resto
        No java cada variável tem um tipo de dado

        abaixo eu tenho uma variavel 'x' do tipo 'inteiro' que armazena um numero '10'
        */

        // O MAXIMO DE NÚMERO ACEITÁVEIS PARA inteiro são de 2³¹-1
        // Logo fica: int x = 2147483648
        // Se passar um número, já sai de (int) e vai para (long)

        int x = 10;

        int a;
        a = 10;

        int y = 2;
        int b;
        b = 2;

        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        int resto;

        //CALCULADORA

                soma = x + y;
        System.out.println("O resultado da soma de" + x + "+" + y + "=" + soma);

        subtracao = x - y; // 10-2
        System.out.println("Subtração " + subtracao);

        multiplicacao = x * y;
        System.out.println("Multiplicação " + multiplicacao);

        divisao = x / y;
        System.out.println("Divisão: " + divisao);

        resto = x % y; //10/2=(resto)0  --> Quando usar '%' ele mostra o resto da divisão
        System.out.println("Resto: " + resto);

    }
}