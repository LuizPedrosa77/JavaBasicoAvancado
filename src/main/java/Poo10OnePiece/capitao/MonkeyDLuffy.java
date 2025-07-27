package Poo10OnePiece.capitao;

import Poo10OnePiece.Ataque;
import Poo10OnePiece.Pirata;

public class MonkeyDLuffy extends Capitao implements Ataque {

    // Polimorfismo de sobreescrita da interface
    @Override
    public void atacar() {
        System.out.println("Gomu gomu no");
    }
}
