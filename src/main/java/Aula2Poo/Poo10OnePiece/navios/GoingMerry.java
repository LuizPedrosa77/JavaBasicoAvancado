package Aula2Poo.Poo10OnePiece.navios;

import Aula2Poo.Poo10OnePiece.Pirata;

import java.util.ArrayList;

public class GoingMerry extends Navio {

    private ArrayList<Pirata> piratas;

    public GoingMerry() {
        this.piratas = new ArrayList<>();
    }

    public void adicionar(Pirata p) {
        piratas.add(p);
    }
}
