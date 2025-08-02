package Aula2Poo.Poo6ProjetoJujutsu;

public class SatoruGojo extends Feiticeiro implements Energia {

    // Polimorfismo de sobreescrita do construtor com parametros da Classe "Feiticeiro"
    public SatoruGojo(String nome,  int forca, int velocidade) {
        super(nome,forca,velocidade);
    }

    // Polimorfismo de sobreescrita do Metodo abstrato da classe abstract "Feiticeiro"
    @Override
    public void tecnicaAmaldicoada() {
        System.out.println("");
    }

    // Polimorfismo de Sobrecarga
    public void tecnicaAmaldiçoada(int tipo) {
        if(tipo == 1) {
            System.out.println("Energia Vermelha");
        } else if(tipo == 2) {
            System.out.println(" Energia Azul");
        } else if(tipo == 3) {
            System.out.println("Energia Roxa");
        }
    }

    //  Polimorfismo de sobreescrita da "interface"
    @Override
    public void energiaAmaldicoada() {
        System.out.println("Cobertura corporal");
    }

    // Polimorfismo de sobreescrita da "interface"
    @Override
    public void dominio() {
        System.out.println("Rikugan");
    }
}
