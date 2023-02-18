public class Abstraction {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Black";
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class horse extends Animal {
    void changeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}