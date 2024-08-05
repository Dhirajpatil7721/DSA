public class Person {
    // Private fields to encapsulate the data
    private String name;
    private int age;

    // Constructor to initialize the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John", 30);

        // Access and modify the fields using getter and setter methods
        System.out.println("Name: " + person.getName()); // Output: Name: John
        System.out.println("Age: " + person.getAge()); // Output: Age: 30

        // Modify the name and age using setter methods
        person.setName("Jane");
        person.setAge(25);

        // Access the modified fields using getter methods
        System.out.println("Updated Name: " + person.getName()); // Output: Updated Name: Jane
        System.out.println("Updated Age: " + person.getAge()); // Output: Updated Age: 25
    }
}
