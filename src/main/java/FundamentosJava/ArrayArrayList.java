package FundamentosJava;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayArrayList {
    public static void main(String[] args) {

        // Array -> são vetores para alocar a quantidade que for definida e sempre começa na posição ZERO
        // Exemplo de Array de tipo String


        String[] nome1 = new String[5]; // EXEMPLO 1: aqui eu tenho no maximo 5 posições
        String[] nome2 = {"Luiz", "Gustavo", "Mariana", "Lucas", "cristina"}; // EXEMPLO 2: aqui eu tenho no maximo 3 opções

        /**
         Os "Array" são vetores que alocam posições baseadas em quanto foi pré definidos.
         Pode ser usado Array de: String, inteiro ou outros, o importante é seguir essa base.
         Array é uma classe, por isso tem a primeira letra MAIUSCULO
         */

        // As posições que estão sendo utilizadas aqui são as que foram pré ordenadas na criação
        nome1[0] = "Luiz";
        nome1[1] = "Gustavo";
        nome1[2] = "Mariana";
        nome1[3] = "Lucas";
        nome1[4] = "Gustavo";

        // Imprimindo a posição [0] que representa o 1º
        System.out.println(nome1[0]);


        /**
            ArrayList
            Diferente do "Array" tradizional que pre-determina as posições, no ArrayList não precisa pre-determinar
            ele vai se multiplicando enquanto tiver memoria.

            O construtor do ArrayList funciona assim:
            ArrayList<String> nome3 = new ArrayList<String>();
         */

        // Criador de lista de objetos
        ArrayList<String> nome3 = new ArrayList<String>();

        // Lista de objetos      POSIÇÕES
        nome3.add("Luiz");      // Índice 0
        nome3.add("Pedrosa");   // Índice 1
        nome3.add("Mariana");   // Índice 2
        nome3.add("Lucas");     // Índice 3
        nome3.add("Cristina");  // Índice 4
        nome3.add("Elena");     // Índice 5

        // Imprimindo indice 0
        System.out.println("------------------------------------");
        System.out.println("Isso é para mostrar quantos nomes tem na lista "+nome3.size());
        System.out.println("------------------------------------");
        System.out.println(nome3.get(4));
        System.out.println("-----ABAIXO ESTOU FALANDO DE MIM-----");
        System.out.println("Meu nome é: "+ nome3.get(0));
        System.out.format("Sobrenome: %s\n", nome3.get(1));
        System.out.format("Minha esposa se chama:%s \n", nome3.get(2));
        System.out.printf("O nome do meu irmão é: %s\n", nome3.get(3));
        System.out.format("a filha de %s se chama %s \n", nome3.get(3), nome3.get(4));
        System.out.printf("E %s e eu estamos planejando colocar o nome da nossa filha de %s\n", nome3.get(2),nome3.get(5));


        System.out.println("----IMPRIMINDO TODOS OS ARRAY DO NOME1----");
        for(int indice1 = 0; indice1 < nome1.length; indice1++){
            System.out.println(nome1[indice1]);
        }

        System.out.println("----IMPRIMINDO TODOS OS ARRAY DO NOME3----");
        for(int indice2 = 0; indice2 < nome3.size(); indice2++){
            System.out.println(nome3.get(indice2));
        }


        System.out.println("----REMOVENDO O ELEMENTO LUCAS DA LISTA----");
        nome3.remove("Lucas");
        for(int indice3 = 0; indice3 < nome3.size(); indice3++){
            System.out.println(nome3.get(indice3));
        }

        /**
        System.out.println("----LIMPANDO TODO ARRAY LIST----");
        nome3.clear();
        */

        System.out.println("----LISTANDO TODOS OS OBJETOS DA LISTA NOME3----");
        for(int indice4 = 0; indice4 < nome3.size(); indice4++){
            System.out.println(nome3.get(indice4));
        }

        /**
            O AarrayList não aceita tipos primitivos, só aceita classes. Por este motivo, podemos utilizar
            as classes dos tipos primitivos:
         */

        Integer classeInt = 0;
        Float classeFloat = 0.0f;
        Double classeDouble = 0.0;
        String classeString = "";
        Character classeChar = ' ';


        // Para criar um ArrayList com a classe Integer (inteiro)
        ArrayList<Integer> filme = new ArrayList<Integer>();
        filme.add(0);
        filme.add(1);
        filme.add(2);


        // Para criar um ArrayList com a classe Double (double) e String (String) usando versão de sistemas
        ArrayList<Double> versaoSistema = new ArrayList<Double>();
        ArrayList<String> versaoLatest = new ArrayList<String>();
        versaoSistema.add(1.0);
        versaoSistema.add(1.1);
        versaoSistema.add(1.2);
        versaoSistema.add(1.3);
        versaoSistema.add(1.4);

        versaoLatest.add("a ultima versão do sistema é: "+versaoSistema.get(4));
        System.out.println("----UTILIZANDO 2 CLASSES DO TIPO PRIMITIVO----");
        System.out.println("Na mensagem abaixo, está sendo impresso a Classe 'Double' e a 'String'");
        System.out.println(versaoLatest);


        /**
            Abaixo está a versão simplificada do "for". Com esse metodo,
            podemos encurtar tuodo aquele processo.
         */

        System.out.println("-----ESSA É A VERSÃO SIMPLIFICADA DO 'FOR'-----");
        for(String familia: nome3) {
            System.out.println(familia);
        }

    }
}
