package java_basics;

enum eatingHabits {
    Omnivore,
    Carnivore,
    Herbivore
}

public class Animal {

    String type;
    String name;
    int age;
    int numberOfLegs;
    boolean winged;
    eatingHabits eatingHabits;

    public void describe() {
        System.out.println(name + " is " + type + " of " + age + " years old");
        if (winged) {
            System.out.println(name + " has wings and " + numberOfLegs + " legs");
        } else {
            System.out.println(name + " has no wings and " + numberOfLegs + " legs");
        }
        System.out.println(name + " is " + eatingHabits);
    }

    public void isEating() {
        System.out.println(name + " is eating...");
    }

    public void isSleeping() {
        System.out.println(name + " is sleeping...");
    }

    public void isWalking() {
        System.out.println(name + " is walking...");
    }

    public Animal(String type, String name, int age, int numberOfLegs, boolean winged, java_basics.eatingHabits eatingHabits) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.winged = winged;
        this.eatingHabits = eatingHabits;
    }
}
