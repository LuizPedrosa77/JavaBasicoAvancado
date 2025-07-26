package Poo6ProjetoJujutsu;

// Este personagem esta herdando a Classe Feiticeiro e esta implementando a interface Energia
public class YujiItadori extends Feiticeiro implements  Energia {

    // Polimorfismo de sobreescrita do construtor com parametros da Classe "Feiticeiro"
    public YujiItadori(String nome, int forca, int velocidade) {
        super(nome,forca,velocidade);
    }

    // Polimorfismo de sobreescrita do metodo abstrato da classe abstract "Feiticeiro"
    @Override
    public void tecnicaAmaldicoada() {
        System.out.println("");
    }

    // Polimorfismo de Sobreescrita da "interface"
    @Override
    public void energiaAmaldicoada() {
        System.out.println("Kokosen");
    }

    // Polimorfismo de sobreescrita da "interface"
    @Override
    public void dominio() {
        System.out.println("Sukuna");
    }

}
