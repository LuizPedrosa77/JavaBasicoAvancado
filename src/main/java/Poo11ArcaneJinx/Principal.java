package Poo11ArcaneJinx;

public class Principal {
    public static void main(String[] args) {

        Arma a1 = new Arma("Monkey",50);
        Arma a2 = new Arma("Tub",100);
        Arma a3 = new Arma("Dragon",60);
        Arma a4 = new Arma("Bomba",70);


        Jinx jinx = new Jinx("jinx", "azul", 1);

        jinx.adicionar(a1);
        jinx.adicionar(a2);
        jinx.adicionar(a3);
        jinx.adicionar(a4);

        jinx.atacar(1);
        jinx.atacar(2);
        jinx.atacar(3);
        jinx.atacar(4);
        jinx.atacar(5);

    }
}
