package Aula1FundamentosJava;

import javax.swing.JOptionPane;

public class TextandoJOptionPane {
    public static void main(String[] args) {

        /**
        String fruta;

        // Utilizando o "JOptionPane" Para criar poupup na tela
        // Essa é a forma para perguntar
         // Quando utilizado deste modo, ele só aceita "String"
        fruta = JOptionPane.showInputDialog("Digite: ");

        if(fruta.equalsIgnoreCase("Maça") || fruta.equalsIgnoreCase("Laranja")) {

            // Essa é a forma para responder
            JOptionPane.showMessageDialog(null, "A fruta é: "+fruta);
        } else {
            JOptionPane.showMessageDialog(null, "Fruta inválida!");

        }
        */

        int mes;
        // Quando é incluido a classe dos inteiros (Integer), ele está transformando "String" para "Integer"
        mes = Integer.parseInt(JOptionPane.showInputDialog("De 1 a 12, digite seu mês de nascimento: "));

        switch(mes) {

            case 1 -> JOptionPane.showMessageDialog(null,"Você nasceu em Janeiro!");

            case 2 -> JOptionPane.showMessageDialog(null,"Você nasceu em Fevereiro!");

            case 3 -> JOptionPane.showMessageDialog(null,"Você nasceu em Março!");

            case 4 -> JOptionPane.showMessageDialog(null, "Você nasceu em Abril!");

            default -> JOptionPane.showMessageDialog(null,"Você nasceu em um dos meses do 2º semetre");

            }
        }


    }

