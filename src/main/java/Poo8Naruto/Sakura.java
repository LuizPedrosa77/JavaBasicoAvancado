package Poo8Naruto;

public class Sakura extends Ninja implements Tecnica {

    // Heranca ca classe Ninja
    public Sakura(String nome, double peso, double altura, String funcao ,String nomeCla, String nomeVila, int nivel) {
        super(nome, peso, altura, funcao, nomeCla, nomeVila, nivel);
    }

    // Implementação da interface Tecnica
    @Override
    public void tecnica() {
        System.out.println("Técnica da Sakura");
    }

    // Polimorfismo de sobrecarga
    public void tecnica(String nome) {
        System.out.println(nome);
    }

}
