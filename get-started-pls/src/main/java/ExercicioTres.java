import java.util.Arrays;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        // TODO: Verifique se o tipo de conta é válido ("corrente", "poupanca" ou "investimento")
        // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.
        String [] tipoDeContas = {"corrente", "poupanca", "investimento"};

        if (Arrays.asList(tipoDeContas).contains(tipoConta)) {
            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome, tipoConta);
        }
        else {
            System.out.println("Tipo de conta invalido.");
        }
    }
}