import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class Ex6_4 {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Amar", 30),
            new Person("Bevuda", 25),
            new Person("Charlie", 35)
        };

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people);

        System.out.println("\nAfter sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Person person1 = new Person("David", 28);
        Person person2 = new Person("Eve", 30);

        int comparisonResult = person1.compareTo(person2);
        if (comparisonResult < 0) {
            System.out.println("\n" + person1 + " is younger than " + person2);
        } else if (comparisonResult > 0) {
            System.out.println("\n" + person1 + " is older than " + person2);
        } else {
            System.out.println("\n" + person1 + " and " + person2 + " are of the same age");
        }
    }
}
