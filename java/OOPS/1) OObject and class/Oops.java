class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Something is written..");
    }

    public void info() {
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Call..");
    }
}

public class Oops {

    // public static void main(String[] args) {
    //     Pen pen1 = new Pen();
    //     pen1.color = "red";
    //     pen1.type = "gel";

    //     Pen pen2 = new Pen();
    //     pen2.color = "orange";
    //     pen2.color = "Ball pen";

    //     pen1.write();
    //     pen1.info();
    //     pen2.write();
    //     pen2.info();
    // }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dhiraj";
        s1.age = 24;

        s1.printinfo();

    }

}
