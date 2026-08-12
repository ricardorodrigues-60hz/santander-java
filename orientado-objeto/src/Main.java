import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var male = new Person();
        male.setName("João");
        male.setAge(18);
        var female = new Person();
        female.setName("Maria");
        female.setAge(19);
        System.out.println(male.getName() + male.getAge() );
        System.out.println(female.getName() + female.getAge() );
    }
}