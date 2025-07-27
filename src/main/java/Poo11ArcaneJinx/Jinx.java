package Poo11ArcaneJinx;

import java.util.ArrayList;

public class Jinx {

    private String nome;
    private ArrayList<Arma> armas;
    private String cordoCabelo;
    private int estiloRoupa;

    // construtor completo da Jinx
    public Jinx(String nome, ArrayList<Arma> armas, String cordoCabelo, int estiloRoupa) {
        this.nome = nome;
        this.cordoCabelo = cordoCabelo;
        this.estiloRoupa = estiloRoupa;
        this.armas = armas;
    }

    // Construtor simplificado da Jinx
    public Jinx(String nome, String cordoCabelo, int estiloRoupa) {
        this.nome = nome;
        this.cordoCabelo = cordoCabelo;
        this.estiloRoupa = estiloRoupa;
        this.armas = new ArrayList<>();
    }


    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public String getCordoCabelo() {
        return cordoCabelo;
    }

    public void setCordoCabelo(String cordoCabelo) {
        this.cordoCabelo = cordoCabelo;
    }

    public int getEstiloRoupa() {
        return estiloRoupa;
    }

    public void setEstiloRoupa(int estiloRoupa) {
        this.estiloRoupa = estiloRoupa;
    }

    // Metodo de acao do ArrayList
    public void adicionar(Arma arma) {
        armas.add(arma);
    }

    // Metodo de acao
    public void atacar(int opcao) {
        if(opcao == 1){
            System.out.println(armas.get(0).getNome()+", "+armas.get(0).getPower());
        } else if (opcao == 1){
            System.out.println(armas.get(1).getNome()+", "+armas.get(1).getPower());
        } else if (opcao == 2){
            System.out.println(armas.get(2).getNome()+", "+armas.get(2).getPower());
        } else if(opcao == 3){
            System.out.println(armas.get(3).getNome()+", "+armas.get(3).getPower());
        } else {
            System.out.println("Atacar com as mãos");
        }
    }

    // Metodo de retorno do construtor com toString
    @Override
    public String toString() {
        return "Jinx{" +
                "nome='" + nome + '\'' +
                ", armas=" + armas +
                ", cordoCabelo='" + cordoCabelo + '\'' +
                ", estiloRoupa=" + estiloRoupa +
                '}';
    }
}
