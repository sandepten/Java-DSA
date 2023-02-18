public class SuperKey {
    public static void main(String[] args) {
        Herbivore horse = new Herbivore();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Herbivore extends Animal {
    Herbivore() {
        super();
        System.out.println("Herbivore constructor");
    }
}
