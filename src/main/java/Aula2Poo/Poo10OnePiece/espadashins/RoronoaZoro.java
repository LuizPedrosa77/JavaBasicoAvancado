package Aula2Poo.Poo10OnePiece.espadashins;

import Aula2Poo.Poo10OnePiece.Ataque;

public class RoronoaZoro extends Espadashin implements Ataque {

    // Polimorfismo de Sobreescrita da interface
    @Override
    public void atacar() {
        System.out.println("Santoriu");
    }

    // Polimorfismo de Sobrecarga (Adicionando parametros)
    public void atacar(int quantEspadas) {
        if (quantEspadas == 0) {
            System.out.println("");
        } else if (quantEspadas == 1) {
            System.out.println("");
        } else if (quantEspadas == 2) {
            System.out.println("");
        } else if (quantEspadas == 3) {
            System.out.println("");
        }
    }
}
