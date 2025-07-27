package Poo8Naruto;

public class Naruto extends Ninja implements Tecnica {

    // Heranca ca classe Ninja
    public Naruto(String nome, double peso, double altura, String funcao,String nomeCla, String nomeVila, int nivel) {
        super(nome, peso, altura, funcao,nomeCla, nomeVila, nivel);
    }

    // Polimorfismo de sobreescrita da "interface"
    @Override
    public void tecnica() {
        System.out.println("Rasengan");
    }

    // Polimorfismo de sobrecarga
    public void tecnica(String nome) {
        System.out.println(nome);
    }

}
