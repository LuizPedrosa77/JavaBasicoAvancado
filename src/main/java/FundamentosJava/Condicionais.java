package FundamentosJava;

public class Condicionais {
        public static void main(String[] args) {

            // Fluxo de dados
            // if, else, else if, switch
            // Comparações de: texto, lógico e numericos
            // if aninhado
            // Metodo
            // Valor lógico: true - false
            // Quando comparar texto, String tem de usar (equals) --> "".equals("");
            // Quando for comparar numero --> ==, >, <, >=, <=
            // Quando for lógico (true/false) pode usar --> ==
            // Switch

        // ESTUDO 1

        String login = "Luiz";

        if (login.equals("Luiz1")) {
            System.out.println("O login está correto");

        } else if(login.equals("Luiz2")) {
            System.out.println("O login está correto 2");

        } else {

            System.out.println("O login está incorreto");
        }


            // ESTUDO 2


        String nome = "Luz";

        if(nome.equals("Luiz Gustavo")) {
            System.out.println("O nome digitado está correto");

        }else if(nome.equals("Luiz")) {
            System.out.println("Apenas o primeiro nome está correto");

        }else if(nome.equals("Gustavo")) {
            System.out.println("Apenas o segundo nome está correto");

        }else {
            System.out.println("O nome digitado está invalido");
        }



            // ESTUDO 3 >> LOGIN E SENHA


        String usuario = "Admin";
        String senha = "root";

        if(usuario.equals("Luiz")) {
            System.out.println("Usuario correto");
            if(senha.equals("root")) {
                System.out.println("Você está logado no sistema");
            }else {
                System.out.println("Senha invalida");
            }

        }else {
            System.out.println("Usuario incorreto");
            if(usuario.equals("Admin")) {
                System.out.println("Entre em contato com o administrador");
                if(senha.equals("root")) {
                    System.out.println("Você precisa atualizar sua senha");
                }
            }else {
                System.out.println("O sistema está fechado");
            }
        }



            // EXEMPLO 4 - Valores lógicos

        boolean ehDeMaior = false;

        if(ehDeMaior == true) {
            System.out.println("Acesso Liberado!");
        }else if(ehDeMaior != true) {
            System.out.println("Acesso Negado!");
        }


            // EXEMPLO 5 - COMPARAÇÃO COM VALORES NUMÉRICOS

        int x = 5;
        int y = 20;
        int soma = x + y;

        //opção 1 mais extensa

        if(soma == 10) {
            System.out.println("É 10");
        } else if(soma > 10) {
            System.out.println("Soma é maior que 10");
        } else if(soma < 10) {
            System.out.println("Soma é menor que 10");

        }else {
            System.out.println("Não é 10");
        }

        // Opção 2 simplificado
        if(soma > 10) {
            System.out.println("Soma é maior ou igual a 10");
        }else if(soma <= 10 ) {
            System.out.println("Soma é igual ou menos que 10");
        }



        // EXEMPLO 6 - if ternario (Quando if e else é reduzido para uma linha) (condicao ? valor1 : valor2)
        // Opção 1
        boolean ehVerdade = (10+5 == 15 ? true : false);
        System.out.println(ehVerdade);

        // Opção 2
        System.out.println(10+5 == 10 ? true : false);



            // EXEMPLO 7 - SWITCH
            // Usa-se com: int, float, double, boolean, byte, short, long, chart

            // Opção 01

        int x1=2;

        switch(x1) {
            case 10:
                System.out.println("É 10");
                break;
            case 5:
                System.out.println("É 5");
                break;
            default:
                System.out.println("Não é 10");
        }

        // Opção 02
        String nome1 = "Luiz";

        switch (nome1) {
            case "Luiz":
                System.out.println("É Luiz");
                break;
            case "Gustavo":
                System.out.println("É Gustavo");
                break;
            default:
                System.out.println("Não é ninguém");

        }


            // EXEMPLO 7 - if ANINHADO


        // FORMA PADRÃO

        String nome2 = "Luiz2";

        if(nome2.equals("Luiz")) {
            System.out.print("é Luiz");
        }if (nome2.equals("Luiz2")) {
            System.out.println("é Luiz2");
        }if(nome2.equals("Luiz3")) {
            System.out.println("é Luiz3");
        }


            // FORMA USANDO CARACTER

            char c = 'c';

            if(c == 'c') {
                System.out.println("É c");
            }else {
                System.out.print("Não é c");
            }


        }

 }

