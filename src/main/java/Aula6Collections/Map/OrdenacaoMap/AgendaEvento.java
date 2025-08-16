package Aula6Collections.Map.OrdenacaoMap;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        // CORREÇÃO: Inicializa o HashMap
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        // TreeMap ordena o Map automaticamente por chave (LocalDate)
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        // O TreeMap já ordena por data, então o primeiro 'Entry' que for depois da data atual é o próximo
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);

        System.out.println("Buscando proximo evento...");

        // Percorre as entradas ordenadas
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isAfter(dataAtual)) { // Apenas um 'if' basta
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                // Encontrando o primeiro evento, para o loop
                break;
            }
        }

        // CORREÇÃO: Imprime o resultado depois do loop, se um evento foi encontrado
        if (proximoEvento != null) {
            System.out.println("O proximo evento é: " + proximoEvento + " e acontecerá na data: " + proximaData.toString());
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }


    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        // Adicionando eventos depois de exibirAgenda, para evitar o NullPointerException
        agendaEvento.adicionarEvento(LocalDate.of(2025,8,20),"Evento 1","Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2025,8,25),"Evento 2","Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2025,8,29),"Evento 3","Atração 3");

        System.out.println("--- Exibindo a agenda completa ---");
        agendaEvento.exibirAgenda();

        System.out.println("\n--- Buscando o próximo evento ---");
        agendaEvento.obterProximoEvento();
    }
}