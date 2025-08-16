package Aula6Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributos
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefa(String descricao) {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    // Testando os metodos
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa("Nenhuma tarefa"));

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa("Nenhuma tarefa"));

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa("Nenhuma tarefa"));


        listaTarefa.obterDescricoesTarefas();


    }
}
