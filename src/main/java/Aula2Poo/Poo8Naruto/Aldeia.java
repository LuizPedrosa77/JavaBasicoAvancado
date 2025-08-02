package Aula2Poo.Poo8Naruto;


import java.util.ArrayList;

public class Aldeia {

    // Atributo
    private String nome;
    private ArrayList<Ninja> ninjas;
    private ArrayList<Pessoa> pessoas;

    // Construtor
    public Aldeia(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
        this.ninjas = new ArrayList<>();
    }

    // Metodo Set e Get
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Metodo de acao
    public void adicionarPessoas(Pessoa p) {
        pessoas.add(p);
    }

    public void adicionarNinja(Ninja ninja) {
        ninjas.add(ninja);
    }

    // Metodo para apresentar a Aldeia
    public String toString() {
        return "Nome: "+nome+" Ninjas: "+ninjas+" Pessoas: "+pessoas;
    }

    public String getApresentar() {
        return "Nome: " + nome + " Ninjas: " + ninjas + " Pessoas: " + pessoas;
    }

}
