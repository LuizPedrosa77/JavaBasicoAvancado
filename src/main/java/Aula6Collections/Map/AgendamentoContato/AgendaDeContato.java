package Aula6Collections.Map.AgendamentoContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    @Override
    public String toString() {
        return "AgendaDeContato{" +
                "agendaContatoMap=" + agendaContatoMap +
                '}';
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;



    }

    public static void main(String[] args) {

        AgendaDeContato agendaContato = new AgendaDeContato();

        agendaContato.adicionarContato("Luiz 1", 8181);
        agendaContato.adicionarContato("Luiz 2", 8282);
        agendaContato.adicionarContato("Luiz 3", 8383);

        agendaContato.exibirContato();

        for(Map.Entry<String, Integer> entry : agendaContato.agendaContatoMap.entrySet()) {
            String nome = entry.getKey();
            Integer telefone = entry.getValue();
            System.out.println("Nome: " + nome + ", Telefone: " + telefone);
        }


    }
}
