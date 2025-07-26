package Poo6ProjetoJujutsu;

public class MegumiFushiguro extends Feiticeiro implements  Energia {

    // Polimorfismo de sobreescrita do construtor com parametros da Classe "Feiticeiro"
    public MegumiFushiguro(String nome, int forca, int velocidade) {
        super(nome, forca,velocidade);
    }

    //  Polimorfismo de sobreescrita do metodo abstrato da classe abstract "Feiticeiro"
    @Override
    public void tecnicaAmaldicoada() {
        System.out.println("");
    }

    // Polimorfismo de sobreescrita da "interface"
    @Override
    public void energiaAmaldicoada() {
        System.out.println("Invocação das maldições");
    }

    // Polimorfismo de sobreescrita da "interface"
    @Override
    public void dominio() {
        System.out.println("Energia escura");
    }

}
