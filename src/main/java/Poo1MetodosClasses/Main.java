/**
package Poo1MetodosClasses;

public class Main {


    public static void main(String[] args) {

        // Criador de objeto de objetos
        // Aqui são dois modos de utilizar os criadores de objetos:

        // Construtos Padrão - Quando é utilizado a forma padrão, o criados fica dessa forma, para que os valores sejam incluídos individualmente
        Pessoa p1 = new Pessoa();
        // construtor com parametro - Quando o construtor foi feito com os parametros dos atributos, os valores podem ser atribuidos diretamente no criador de objeto
        var p2 = new Pessoa("Luiz", "0000", 33,'m', "0198384894");

        // Objetos com valores
        p1.setNome("Paulo");
        p1.setCpf("0000");
        p1.setIdade(33);
        p1.setSexo('m');
        p1.setWhatsapp("81928282");
        System.out.println("--");
        p1.apresentar();
        System.out.println("--");
        p1.getApresentacao();

        System.out.format("nome: %s\n ", p1.getNome());
        System.out.format("cpf: %s\n ", p1.getCpf());
        System.out.format("idade: %d\n ", p1.getIdade());
        System.out.printf("Sexo: %c\n ", p1.getSexo());
        System.out.format("cpf: %s\n ", p1.getWhatsapp());
        p1.apresentar();
        System.out.println(p1.getApresentacao());
        System.out.println("---------------------------");


        // Objetos com valores
        p2.setNome("Gustavo");
        p2.setCpf("0001");
        p2.setIdade(33);
        System.out.println('m');
        p2.setWhatsapp("81928282");
        System.out.println("---");
        p2.apresentar();
        System.out.println("---");
        p2.getApresentacao();

        System.out.format("Nome: %s\n ", p2.getNome());
        System.out.format("Cpf: %s\n ", p2.getCpf());
        System.out.format("Idade: %d\n ", p2.getIdade());
        System.out.printf("Sexo: %c\n ", p2.getSexo());
        System.out.format("Whatsapp: %s\n ", p2.getWhatsapp());
        System.out.println("--");
        p2.apresentar();
        System.out.println("--");
        System.out.println(p2.getApresentacao());


    }

} */
