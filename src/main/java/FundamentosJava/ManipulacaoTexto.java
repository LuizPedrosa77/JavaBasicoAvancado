package FundamentosJava;

public class ManipulacaoTexto {
    public static void main(String[] args) {

        String nome = "Luiz Gustavo";

        /*
            INDEX
            Luiz Gustavo Jeronimo Pedrosa
         */


        char caracter = nome.charAt(0);
        System.out.println(caracter);

        String primeira_letra_segundo_nome = nome.substring(5);
        System.out.println(primeira_letra_segundo_nome);

        String primeiro_nome = nome.substring(0, 4);
        System.out.println(primeiro_nome);

        String segundo_nome = nome.substring(5, 12);
        System.out.println(segundo_nome);

        String texto_substituto = "Pedrosa";
        System.out.println(texto_substituto);

        nome = nome.replace("Gustavo", texto_substituto);
        System.out.println(nome);


        nome = nome.toUpperCase();
        System.out.println(nome);

        nome = nome.toLowerCase();
        System.out.println(nome);

        nome = nome.concat(" Jeronimo Pedrosa");
        nome = nome + " programador junior";
        System.out.println(nome);

        System.out.println(nome.contains("Pedrosa"));
        System.out.println(nome.equals("Luiz Gustavo"));
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        char c = 'm';
        char b = 'a';
        String palavra = c + b + "";

    /*
    TODA STRING É UM CONJUNTO DE CARACTER OU ESPAÇO E SEMPRE COMEÇA COM O NUMERO ZERO E O ESPAÇO TBM CONTA!
    ->L-U-I-Z- -G-U-S-T-A-V-O<-
    ->0-1-2-3-4-5-6-7-8-9-10-11<-
    */

    }
}
