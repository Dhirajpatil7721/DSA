// class Shape{
//     String color;

// }

//     class Circle extends Shape{

// }

// public class Main{

//     public static void main(String[] args) {
//         Circle C1 = new Circle();
//         C1.color="Orange";
//     }

// }

// Single Inheritance...

// class Animal {
//     public void eat() {
//         System.out.println("He is Eating...");
//     }

// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog is barking..");
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }
// }

// Multilevel Inheritance...

// class Animal {

//     public void eat() {
//         System.out.println("This animal is Eating...");
//     }

// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog is barking..");
//     }

//     class Cat extends Dog {
//         public void walk() {
//             System.out.println("Cat Is Walking...");
//         }
//     }

// }

// public class Main {

//     public static void main(String[] args) {
//         // Cat c = new Cat();
//         // c.bark();
//         // c.eat();
//         // c.walk();
//         Dog D = new Dog();
//         D.bark();
//         D.eat();

//     }
// }

// Hirarchical  Inheritance

class Animal {
    public void Bite(){
        System.out.println("This Animal Bite");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is Barking...");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Cat is Mewo...");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c = new Cat();

d.Bite();
d.bark();

c.Bite();
c.meow();


    }
}

//Hybrid Inheritance

// class Animal {
//     public void Bite() {
//         System.out.println("This Animal Bite");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog is Barking...");
//     }
// }

// class Cat extends Animal {
//     public void meow() {
//         System.out.println("Cat is Mewo...");
//     }
// }

// class Rat extends Dog {
//     public void run() {
//         System.out.println("Rat is Run...");
//     }
// }

// public class Main { 
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         Cat c = new Cat();
//         Rat r = new Rat();

//         d.Bite();
//         d.bark();

//         c.Bite();
//         c.meow();

//         r.Bite();
//         r.run();

//     }
// }