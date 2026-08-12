import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var male = new Person("João");
        var female = new Person("Maria");



        System.out.println(male.getName() + male.getAge() );
        System.out.println(female.getName() + female.getAge() );
    }
}