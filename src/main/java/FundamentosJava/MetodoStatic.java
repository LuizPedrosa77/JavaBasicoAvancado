package FundamentosJava;


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