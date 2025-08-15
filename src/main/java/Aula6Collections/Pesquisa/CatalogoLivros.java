package Aula6Collections.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos
    private List<Livro> livroList;

    // construtor da lista de livros
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    // Adicionando livros
    public void adicionarLivro(String titulo, String autor, String descricao) {
        livroList.add(new Livro(titulo, autor, descricao));
    }

    // Pesquisa de livros por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equals(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
