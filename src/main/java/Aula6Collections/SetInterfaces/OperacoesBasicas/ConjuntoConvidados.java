package Aula6Collections.SetInterfaces.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // Atributos
    private Set<Convidado> convidadoSet;

    // Construtor

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Get e Set
    public Set<Convidado> getConjuntoConvidados() {
        return convidadoSet;
    }

    public void setConjuntoConvidados(Set<Convidado> conjuntoConvidados) {
        this.convidadoSet = conjuntoConvidados;
    }

    // Metodo
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Não há convidado com este código de convite!");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convite 1", 100);
        conjuntoConvidados.adicionarConvidado("Convite 1", 101);
        conjuntoConvidados.adicionarConvidado("Convite 1", 102);
        conjuntoConvidados.adicionarConvidado("Convite 1", 103);

        conjuntoConvidados.exibirConvidados();
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(101);
        System.out.println("1 Convidado foi removido!");
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

    }
}

























