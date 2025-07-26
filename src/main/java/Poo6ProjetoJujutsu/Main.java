package Poo6ProjetoJujutsu;

public class Main {
    public static void main(String[] args) {

        // Instancias para criar os objetos
        YujiItadori yuji = new YujiItadori("Yiji Itadori", 100, 70);
        MegumiFushiguro megumi = new MegumiFushiguro("Megumi Fushiguro", 70, 50);
        SatoruGojo satoru = new SatoruGojo("Satoru Gojo", 100, 100);

        // Nome dos objetos
        System.out.format("----- Nome dos  Personagens -----");
        System.out.println(yuji.getNome());
        System.out.println(megumi.getNome());
        System.out.println(satoru.getNome());

        // Objetos
        System.out.println("----- Personagens estão se atacando -----");
        System.out.println();
        System.out.format("Saturo Gojo usa a tecnica 3 \n");
        satoru.tecnicaAmaldiçoada(3);
        System.out.println();
        System.out.format("Yuji Itadori usa o dominio \n");
        yuji.dominio();


    }

}
