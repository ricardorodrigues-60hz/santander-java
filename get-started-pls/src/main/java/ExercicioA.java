import java.util.Scanner;

public class ExercicioA {

    static void exercicio1() {
        int i;
        for (i = 150; i < 300; i++) {
            System.out.println(i);
        }
    }

    static void exercicio2() {
        int i;
        int soma = 0;
        for (i = 1; i < 1000; i++) {
            System.out.println(soma += i);
        }
    }

    static void exercicio3() {
        int i;
        for (i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            else  {
                System.out.println("Numero paia");
            }
        }

    }

    static void exercicio4(int fatorial) {
        int resultadoFatorial = 1;
        for (int i = fatorial; i <= 1; i--) {
            resultadoFatorial *= i;
            System.out.printf("Resultado Fatorial: %d", resultadoFatorial);
        }
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        exercicio4(10);
    }
}
