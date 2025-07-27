package Poo9Loja;

public class Produto {

    // Atributo
    private String nome;
    private String descricao;
    private double preco;

    // construtor padrao
    public Produto() {
        nome = "";
        descricao = "";
        preco = 0;
    }

    // Construtor com parametro
    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo para retorno do construtor padrão
    public void Produto() {
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(preco);
    }

    // Metodo para retorno do construtor com parametro
    public String toString() {
        return "Nome do produto: " + nome + ", Descrição: " + descricao + ", Preço: " + preco;
    }

    public String getApresentacao() {
        return "Nome do produto: " + nome + ", Descrição: " + descricao + ", Preço: " + preco;
    }
}
