package Aula1FundamentosJava;

public class braekContinue {
    public static void main(String[] args) {

        // Exemplo de utilização do "break" para mostrar ele saindo do loop quando i == 5
        for(int i = 0; i < 10; i++) {
           if(i == 5) {
               break; // Vai sair do Loop
           }
        }


        // Exemplo de utilização do "continue" que vai pular a interação quando j é igual a 5
        for(int j = 0; j < 10; j++) {
            if(j == 5) {
                continue; // Vai pular esse metodo se j == 5
            }
        }

    }
}
