package Aula2Poo.Poo9Loja;

import java.util.ArrayList;

public class Carrinho {

    // Atributo
    ArrayList<Produto> produtos;

    // Construtor
    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    // Metodo de acao
    public void adicionar(Produto p) {
        produtos.add(p);
        System.out.println("Produto "+p.getNome()+" adicionado ao carrinho!");
    }

    // Metodo de acao - remover
    public String remover(String nome) {
        int codigo = -1;
           for(int i=0;i<produtos.size();i++){
               if(produtos.get(i).getNome().equals(nome)){
                   produtos.remove(i);
                   break;
               } else {
                   continue;
               }
           } if (codigo == -1) {
               return null;
        } else {
               return "O prodduto "+ nome + " foi removido do carrinho!";
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}

