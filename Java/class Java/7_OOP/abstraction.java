abstract class Animal {

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    @Override
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    @Override
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Animal horse = new Horse();
        horse.eat();
        horse.walk();

        Animal chicken = new Chicken();
        chicken.eat();
        chicken.walk();
    }
}
