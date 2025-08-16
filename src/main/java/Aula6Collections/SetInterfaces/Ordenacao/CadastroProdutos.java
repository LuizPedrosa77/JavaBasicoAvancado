package Aula6Collections.SetInterfaces.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributos
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Metodo para adicionar produtos
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade, String descricao) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade, descricao));
    }

    // Metodo para exibir produto por nome
    public Set<Produto> exibirProdutosPorNome(String nome) {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    // Metodo para exibir por preço
    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorProduto());
        produtoPorPreco.addAll(this.produtoSet);
        return produtoPorPreco;
    }

    // Outra forma de exibir os produtos
    /**
     // Metodo para exibir produto por codigo
     public Set<Produto> exibirProdutosPorCodigo(long codigo){
     Set<Produto> produtosPorCodigo = new HashSet<>();
     for(Produto produto : produtoSet){
     if(produto.getCodigo() == codigo){
     produtosPorCodigo.add(produto);
     }
     }
     return produtosPorCodigo;
     }

     // Metodo para exibir produto por preco
     public Set<Produto> exibirProdutosPorPreco(double preco){
     Set<Produto> produtosPorPreco = new HashSet<>();
     for(Produto produto : produtoSet){
     // CORRIGIDO: Usando Double.compare() para evitar erros de precisão com números decimais.
     if(Double.compare(produto.getPreco(), preco) == 0){
     produtosPorPreco.add(produto);
     }
     }
     return produtosPorPreco;
     }

     // Metodo para exibir quantidade do produto
     public Set<Produto> exibirQuantidadeDisponivel(int quantidade){
     Set<Produto> quantidadeDisponivel = new HashSet<>();
     for(Produto produto : produtoSet){
     if(produto.getQuantidade() == quantidade){
     quantidadeDisponivel.add(produto);
     }
     }
     return quantidadeDisponivel;
     }

     // É uma boa prática para evitar que outras partes do código modifiquem
     // diretamente a coleção interna da classe.
     public Set<Produto> getProdutoSet() {
     return java.util.Collections.unmodifiableSet(produtoSet);
     }
     */

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos =  new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 1", 15,5.50,10,"Feijão");
        cadastroProdutos.adicionarProduto("Produto 2", 16,4.70,10,"Arroz");
        cadastroProdutos.adicionarProduto("Produto 3", 17,3.90,10,"Macarrão");
        cadastroProdutos.adicionarProduto("Produto 4", 18,10.90,10,"Carne");

        cadastroProdutos.exibirProdutoPorPreco();
        System.out.println(" ---- EXIBINDO TODOS OS PRODUTOS ---- ");
        for(Produto p : cadastroProdutos.produtoSet){
            System.out.println(p);
        }

        System.out.println(" ---- EXIBINDO PRODUTOS POR PREÇO ---- ");
        Set<Produto> produtosOrdenadosPorPreco = cadastroProdutos.exibirProdutoPorPreco();
        for (Produto p : produtosOrdenadosPorPreco) {
            System.out.println(p);
        }
    }
}