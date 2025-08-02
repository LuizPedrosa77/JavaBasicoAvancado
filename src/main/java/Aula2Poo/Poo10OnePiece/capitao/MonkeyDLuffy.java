package Aula2Poo.Poo10OnePiece.capitao;

import Aula2Poo.Poo10OnePiece.Ataque;

public class MonkeyDLuffy extends Capitao implements Ataque {

    // Polimorfismo de sobreescrita da interface
    @Override
    public void atacar() {
        System.out.println("Gomu gomu no");
    }
}
