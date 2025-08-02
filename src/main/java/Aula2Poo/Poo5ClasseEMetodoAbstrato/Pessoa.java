/**
    Essa Classe "Pessoa" só serve de modelo e estrutora para criar os objetos dentro da Classe "Funcionario" e "Gestor"
    Por causa disso, ela pode se tornar uma classe "abstract" que é abstrata, já que ela nunca vai criar nada.
    Essa classe "PESSOA" é uma classe ABSTRACT. Classes CONCRETAS podem gerar objetos e ABSTRACT não
 */

package Aula2Poo.Poo5ClasseEMetodoAbstrato;

// A principal diferença entre este metodo de "interface" para a "Classe abstract" é que a "interface" obrigado utilizar
// todos os conteudos que estão dentro da interface enquanto a "Classe abstract" não, você escolhe o que quer usar.

// Porém, o "metodo abstract" é obrigatorio a implementação!

public abstract class Pessoa {


    // Atributos
    private String nome;
    private char sexo;
    private int idade;

    // construtor padrão
    public Pessoa() {
        nome = "";
        sexo = ' ';
        idade = 0;
    }

    // construtor com parametros
    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Metodos Get e Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    // Metodo especifico de açao
    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }

    // O metodo abstract pode ser tanto com retorno quando sem retorno mas
    // sua utilização só pode ser dentro da classe abstract como estamos agora!
    public abstract void falar();
}
