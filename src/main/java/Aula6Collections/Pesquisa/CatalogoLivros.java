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
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
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

    // Pesquisa de livros por Intervalo de Ano
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

    // Pesquisa de livros por titulo
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

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 5", 2024);

        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2020,2025));

    }
}
