package Aula2Poo.Poo8Naruto;

public class Pessoa {

    // Atributos
    private String nome;
    private double peso;
    private double altura;
    private String funcao;


    // Constutor
    public Pessoa(String nome, double peso, double altura, String funcao) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.funcao = funcao;
    }

    // Metodos Get e Set daqui para baixo.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    // Metodo para apresentar a Aldeia
    public String toString() {
        return "Nome: "+nome+" Peso: "+peso+" Altura: "+altura+" Função: "+funcao;
    }

    public String getApresentar() {
        return "Nome: "+nome+" Peso: "+peso+" Altura: "+altura+" Função: "+funcao;
    }
}
