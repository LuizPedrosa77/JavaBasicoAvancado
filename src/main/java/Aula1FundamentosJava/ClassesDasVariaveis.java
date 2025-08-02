package Aula1FundamentosJava;

public class ClassesDasVariaveis {
    public static void main(String[] args) {

    // soma(+), subtracao(-), multiplicacao(*), divisao(/), resto(%)
    // cada variavel tem um tipo de dado
    // float são os decimais OU ponto flutuantes, float
    // double é usado quando as casas decimais são muito longas

    // inteiro: byte, short, int, long
    // decimais: ponto flutuante, float, double
    // logicos: bollean (true - false) verdadeiro - falso
    // char: caracteres - aspas simples ''

    byte inteiro_pequeno = 127;
    short inteiro_maior = 32767;
    int inteiro_normal = 2121561525;
    long inteiro_grande = 211612725239L; //termina com a letra (L)

    // DECIMAIS
    float decimal_pequeno = 123.019292929292928372f; // termina com a letra (f)
    double decimal_maior = 199.29292929283837844637829290;

    // Logico - boolean
    boolean valor_logico = true;
    valor_logico =false;

    // CARACTER - char
    char caracter = 'a';

    String texto = "Luiz Gustavo";

    // PARA IMPRIMIR QUALQUER RESULTADO É
    // SÓ DIGITAR: System.out.println("escrever a variável")

        System.out.println(inteiro_pequeno);
        System.out.println(inteiro_maior);
        System.out.println(inteiro_normal);
        System.out.println(inteiro_grande);
        System.out.printf("\n");
        System.out.println(decimal_pequeno);
        System.out.println(decimal_maior);
        System.out.printf("\n");
        System.out.println(valor_logico);
        System.out.println(caracter);


        /*
        float x = 2.2f;
        float y = 1.0f;

        float resultado = x  y;
        System.out.println(resultado);

        */
    }
}
