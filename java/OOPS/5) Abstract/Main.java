abstract class Animal {
    abstract public void Walk();

    public void Eat(){
        System.out.println("This animal eat...");
    }
}

class Horse extends Animal {

    public void Walk() {
        System.out.println(" 4 leg");
    }
}

class Chicken extends Animal {
    public void Walk() {
        System.out.println("2 leg");
    }
}

public class Main {
    public static void main(String args[]) {
        Horse H = new Horse();
        H.Walk();
        H.Eat();

    }
}