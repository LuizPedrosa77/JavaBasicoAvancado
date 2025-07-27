package Poo8Naruto;

public abstract class Ninja extends Pessoa {

    // Atributo
    private String nomeCla;
    private String nomeVila;
    private int nivel;


    // Construtor
    public Ninja(String nome, double peso, double altura, String funcao,String nomeCla, String nomeVila, int nivel) {
        super(nome, peso, altura, funcao);
        this.nomeCla = nomeCla;
        this.nomeVila = nomeVila;
        this.nivel = nivel;
    }

    // Metodos Get e Set
    public String getNomeCla() {
        return nomeCla;
    }

    public void setNomeCla(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public String getNomeVila() {
        return nomeVila;
    }

    public void setNomeVila(String nomeVila) {
        this.nomeVila = nomeVila;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
