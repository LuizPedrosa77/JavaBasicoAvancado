package Aula1FundamentosJava;


/**
public class MetodoStatic {

    // Metodo estatico de sobrecarga #1 (Quanto há parametros diferentes)
    public static void exibirValor(int a) {
        System.out.format("O valor do inteiro é: %d \n", a);
    }

    // Metodo estatico de sobrecarga #2
    public static void exibirValor(String str) {
        System.out.format("A string é: %s\n", str);

    }
 }
*/

    class Contador {

    /**
        O Metodo "static" fora do "main" indica que foi criado uma CLASSE GLOBAL e essa classe pode ser acessada
        em qualquer lugar pois o "static" torna o metodo estatico ao acesso.
        Assim, não precisa ficar sempre criando metodos para tudo. O ideal e usar essa classe "static" para
        situações onde esse metodo sempre será o mesmo e tornando o programa mais clean (limpo).
     */
    static int contagem = 0;

        public Contador() {
            contagem++;
        }
    }

    public class MetodoStatic {

        public static void main(String[] args) {

            Contador c1 = new Contador();
            Contador c2 = new Contador();
            Contador c3 = new Contador();

            System.out.println("Numero de objetos criados: " + Contador.contagem);


        }

    }