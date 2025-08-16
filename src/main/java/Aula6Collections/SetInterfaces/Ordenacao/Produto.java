package Aula6Collections.SetInterfaces.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements  Comparable<Produto>{

    // Atributo
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;
    private String descricao;

    // Construtor
    public Produto(String nome, long codigo, double preco, int quantidade, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    // Metodo para comparar produtos
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Metodo equals and HashCode -> Para poder diferenciar os produtos com as informaçõesque foram selecionadas aqui
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    // Retorna informação do produto

    @Override
    public String toString() {
        return "Nome: " + nome +", Código: " + codigo +", Preço: " + preco +", Quantidade: " + quantidade +", descrição: " + descricao +", " ;
    }
}

class ComparatorProduto implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
