package Aula2Poo.Poo9Loja;

public class Loja {
    public static void main(String[] args) {


        Produto p1 = new Produto("Chaveiro", "feito de madeira, cordao e adesivo", 15.90);
        Produto p2 = new Produto("Anel", "Aneis para uso masculino", 9.90);

        Carrinho c = new Carrinho();
        c.adicionar(p1);
        c.adicionar(p2);
        c.remover("Chaveiro");

        Venda v = new Venda(c);
        v.totalPreco();

    }
}
