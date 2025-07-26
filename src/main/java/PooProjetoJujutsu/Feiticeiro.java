package PooProjetoJujutsu;

public abstract class Feiticeiro {

    // Atributo
    private String nome;
    private int forca;
    private int velocidade;


    // Construtor com parametro
    public Feiticeiro(String nome, int forca, int velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    // Metodo Set e Get
    public void setNome(String nome){
        this.nome = nome;
    }


    // Metodo Set e Get
    public String getNome() {
        return nome;
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Metodo abstract
    public abstract void tecnicaAmaldicoada();

}
