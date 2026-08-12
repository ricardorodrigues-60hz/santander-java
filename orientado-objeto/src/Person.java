import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInt = OffsetDateTime.now().getYear();

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }


    public void intAge() {
        if (this.lastYearAgeInt >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInt = OffsetDateTime.now().getYear();
    }

}
