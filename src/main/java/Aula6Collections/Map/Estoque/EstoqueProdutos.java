package Aula6Collections.Map.Estoque;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.MIN_VALUE;

public class EstoqueProdutos {

    private Map<Long, Produto2> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto2(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto2 p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto2 obterProdutoMaisCaro() {
        // Inicializa as variáveis com valores iniciais seguros
        Produto2 produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        // Se o estoque não estiver vazio...
        if (!estoqueProdutosMap.isEmpty()) {
            // ...percorre todos os produtos no estoque
            for (Produto2 p : estoqueProdutosMap.values()) {
                // Se o preço do produto atual for maior que o maior preço já encontrado
                if (p.getPreco() > maiorPreco) {
                    // ...atualiza o maior preço
                    maiorPreco = p.getPreco();
                    // ...e armazena a referência para o produto mais caro
                    produtoMaisCaro = p;
                }
            }
        }
        // Retorna o produto que foi encontrado
        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L,"Produto 1",5.0,10);
        estoque.adicionarProduto(2L,"Produto 2",6.0,15);
        estoque.adicionarProduto(3L,"Produto 3",8.90,20);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$"+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$"+estoque.obterProdutoMaisCaro().getPreco());

    }
}
