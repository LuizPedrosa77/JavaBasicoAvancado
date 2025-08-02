package Aula2Poo.Poo11ArcaneJinx;

public class Arma {

    private String nome;
    private int power;

    public Arma(String nome, int power) {
        this.nome = nome;
        this.power = power;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // metodo toString para retornar o construtor


    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", power=" + power +
                '}';
    }
}
