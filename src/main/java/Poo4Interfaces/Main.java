/**
package Poo4Interfaces;

import Poo4Interfaces.Funcionario;

public class Main {


    public static void main(String[] args) {

        /**
         Aqui eu estou criando um objeto "F1" da classe "Funcionario". Porem, como a
         classe "Funcionario" está herdando a classe "Pessoa", logo, esse objeto "f1"
         poderá usar tudo que está na classe "Funcionario" e na classe "Pessoa"
         */
/**
        // Criador de objeto da Classe (Funcionario (+Pessoa))

        Poo4Interfaces.Funcionario f1 = new Funcionario();

        // Objetos-> está sendo usado os atributos e metodos da classe "Funcionario" junto com tudo que herdou de "Pessoa"
        f1.setNome("Luiz");
        f1.setSexo('M');
        f1.setIdade(33);
        f1.setCpf("0001");
        f1.setCargo("Programador");
        f1.setSalario(4000.0);

        // Está sendo usado o metodo de açao "apresentar" da classe funcionario que tem a SOBREESCRITA da classe "Pessoa"
        f1.apresentar();


    }
}
