package Aula2Poo.Poo10OnePiece;

import Aula2Poo.Poo10OnePiece.arqueologos.Robin;
import Aula2Poo.Poo10OnePiece.capitao.MonkeyDLuffy;
import Aula2Poo.Poo10OnePiece.espadashins.RoronoaZoro;
import Aula2Poo.Poo10OnePiece.medicos.Chopper;
import Aula2Poo.Poo10OnePiece.navegadores.Nami;
import Aula2Poo.Poo10OnePiece.navios.GoingMerry;

public class Principal {
    public static void main(String[] args) {

        // Instanciando objetos
        MonkeyDLuffy monkey = new MonkeyDLuffy();
        RoronoaZoro zoro = new RoronoaZoro();
        Robin robin = new Robin();
        Chopper chopper = new Chopper();
        Nami nami = new Nami();
        GoingMerry goingMerry = new GoingMerry();

        // Adicionando objetos ao navio
        goingMerry.adicionar(monkey);
        goingMerry.adicionar(nami);
        goingMerry.adicionar(zoro);
        goingMerry.adicionar(chopper);


    }
}
