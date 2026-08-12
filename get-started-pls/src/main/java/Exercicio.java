import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var ano = LocalDate.now().getYear();

        System.out.print("Digite o seu nome:");
        String nome = scanner.next();
        System.out.print("Digite seu ano de  nascimento:\n");
        int anoDeNascimento = scanner.nextInt();
        var idade = ano - anoDeNascimento;
        var idadeStr = Integer.toString(idade);
        System.out.printf("Olá %s você tem %s anos.\n", nome, idadeStr);

        System.out.print("Digite o tamanho do lado do quadrado:");
        double ladoQuadrado = scanner.nextDouble();
        double area = ladoQuadrado * ladoQuadrado;
        scanner.close();
    }
}
