package FundamentosJava;

public class Repeticao {
        public static void main(String[] args) {

            // ESTRUTURA DE REPETIÇÃO
            // while, for, do while

            // WHILE <--

        // EXEMPLO 1 - É preciso usar a palavra "break" após o código de impressão igual o "switch" se não ele não para.
        boolean x = true;

        while(x == true) {
            System.out.println("Estou repetindo");
            break;
        }

            // EXEMPLO 2 - O sinal de (++) é a mesma coisa de +1 ou ( contador = contador + 1;) É A MESMA COISA DE (contador++;)
        int contador = 0;

        while (contador == 0) {
            System.out.println("Estou repetindo");
            contador = contador + 1; // OU PODE SER ASSIM TAMBÉM -->  contador++;
        }

            // EXEMPLO 3 - IMPRIMINDO TODAS AS REPETIÇÕES

        boolean x2 = true;
        int contador2 = 0;

        while(x2 == true) {
            if(contador2 < 10) {
                System.out.println("Estou repetindo"+contador2);
                contador2++;
            } else {
                x2 = false;
            }
        }

            // DO WHILE <--
            // O "do while" manda rodar o programar 1x antes de fechar o programa, independente do resultado

        boolean x3 = true;
        int contador3 = 0;

        do {
            if (contador3 < 10) {
                System.out.println("Estou contando" + contador3);
                contador3 = contador3 + 1;
            } else {
                x = false;
            }
        }    while (x3 == true);

            /**
             Abaixo está a versão simplificada do "for". Com esse metodo,
             podemos encurtar tuodo aquele processo.

             for(tipo + nome qualquer : estrutura) {
                System.out.println(nome qualquer);
             }

            System.out.println("-----ESSA É A VERSÃO SIMPLIFICADA DO 'FOR'-----");
            for(String familia: nome3) {
                System.out.println(familia);
            }
             */


            /**
                Abaixo a versão padrão do "for"
             */
            // FOR -> for(variável; comparação; operação){}

        for(int i=0; i<10; i++) {
            System.out.println(i);
        }

            // EXEMPLO DE VETORES -> Um vetor pode ser entendido como um espaço para armazenar valores

            // PRIMEIRA OPÇÃO DE UTILIZAÇÃO
        int vetor[] = new int[4];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;


            // OPÇÃO 1 PARA IMPRIMIR OS RESULTADOS DOS VETORES
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);

            // OPÇÃO 2 PARA IMPRIMIT OS RESULTADOS DOS VETORES
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }

            // OPÇÃO 3 - FORMA DE COMO UTILIZAR UM VETOR PARA MIL ELEMENTOS
        int vetor1[] = new int[1000];

        for(int i=0; i<vetor1.length; i++) {
            vetor1[i] = i+1;
        }

         for(int i=0; i< vetor.length; i++) {
             System.out.println(vetor[i]);
         }

            // MATRIZES
        int matriz[][] = new int[20][20];

        for(int i=0; i<20; i++) {
            for(int j=0; j<20; j++){
                matriz[i][j] = i+j; //AQUI ELE VAI SOMAR
                System.out.println(matriz[i][j]); //AQUI ELE VAI APRESENTAR
            }
        }

            // EXEMPLO AVANÇADO COMPLETO

            String texto = "Luiz Gustavo";
            String palavra = "";
            char caracter;

            for(int i=0; i<texto.length(); i++) {
                caracter = texto.charAt(i);
                if(caracter == ' ') {
                    System.out.println("É um espaço");
                    System.out.println(palavra);
                    palavra = "";
                } else {
                    palavra += caracter;
                }
            }
            System.out.println(palavra);
            palavra = "";
        }
    }
