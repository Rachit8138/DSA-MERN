

public class Inheritance {
    // Base class
    static class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    // Middle static class - Mammal extends Animal
    static class Mammal extends Animal {
        int legs;
    }

    // Child static class - Dog extends Mammal
     static class Dog extends Mammal {
        String breed;
    }

    // Main static class to test
        public static void main(String[] args) {
            Dog dobby = new Dog();
            dobby.eat();
            dobby.legs = 4;
            dobby.breed = "Husky";
            System.out.println(dobby.legs);
            System.out.println(dobby.breed);
    }

}
