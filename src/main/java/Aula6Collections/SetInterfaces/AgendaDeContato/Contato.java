package Aula6Collections.SetInterfaces.AgendaDeContato;

import java.util.Objects;

public class Contato {

    // Atributos
    private String nome;
    private int numero;

    // Construtor

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    // Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return " "+nome+", "+numero+", ";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getNumero() == contato.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumero());
    }
}
