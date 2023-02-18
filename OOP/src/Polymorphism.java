public class Polymorphism {
    public static void main(String[] args) {

    }
}

class Calculator {
    // Method overloading
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b;
    }
}

// Method overiding
class Animal {
    void eats() {
        System.out.println("Eats anything");
    }
}

class Carnivore extends Animal {
    void eats() {
        System.out.println("Eats meat");
    }
}