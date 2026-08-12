import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
        float saldo = scanner.nextInt();
        float valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada

        if (saldo >= valorTransacao) {
            var novoSaldo = saldo - valorTransacao;
            System.out.printf("Novo saldo: %.2f = %.2f - %.2f", novoSaldo, saldo, valorTransacao);
            System.out.println("Transacao aprovada");
        }
        else { System.out.println("Saldo insuficiente"); }

        scanner.close();


    }
}
