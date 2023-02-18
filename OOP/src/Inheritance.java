public class Inheritance {
    public static void main(String[] args) {
        Fish Whale = new Fish();
        Whale.color = "Blue";
        Whale.eats();
    }
}

// base or parent class
class Animal {
    String color;

    void eats() {
        System.out.println("Eats");
    }
}

// child or derived class
class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swims");
    }
}
