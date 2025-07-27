package Poo8Naruto;

import java.util.ArrayList;

public class Time {

    // Atributos
    private String nomeDoTime;
    private ArrayList<Ninja> time;

    //  Construtores
    public Time(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
        this.time = new ArrayList<>();
    }

    // Metodo de Acao
    public void adicionarMembros(Ninja ninja) {
        time.add(ninja);
    }

    // Metodo de acao
    public void setNomeDoTime(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    // Metodo de acao
    public String getNomeDoTime() {
        return nomeDoTime;
    }

    // Metodo para apresentar a Aldeia
    public String toString() {
        return "Nome do time: " + nomeDoTime + " Time: " + time;
    }

    public String getApresentar() {
        return "Nome: " + nomeDoTime + " Time: " + time;
    }
}
