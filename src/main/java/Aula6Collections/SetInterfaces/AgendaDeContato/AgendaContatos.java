package Aula6Collections.SetInterfaces.AgendaDeContato;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet.toString());
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println("---- EXIBIR CONTATOS ----");
        agendaContatos.exibirContato();

        System.out.println();
        System.out.println("---- ADICIONA CONTATOS ----");
        agendaContatos.adicionarContato("Luiz",1111);
        agendaContatos.adicionarContato("Luiz Gustavo",1122);
        agendaContatos.adicionarContato("Mariana",2222);
        agendaContatos.adicionarContato("Gustavo",3333);
        agendaContatos.adicionarContato("Pedrosa",4444);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Luiz"));

        System.out.println();
        System.out.println("---- ATUALIZA CONTATOS ----");
        agendaContatos.atualizarNumeroContato("Luiz Gustavo",1133);
        System.out.println(agendaContatos.pesquisarPorNome("Luiz Gustavo"));
    }
}










