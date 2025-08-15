package Aula6Collections.Pesquisa;

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Get e Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String toString(){
        return "Titulo: "+titulo+", Autor: "+autor+", ano da publicação: "+anoPublicacao;
    }

}
