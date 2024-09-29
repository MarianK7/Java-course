package java_basics;

public class Fisch extends Animal {

    public Fisch(String type, String name, int age, int numberOfLegs, boolean winged, eatingHabits eatingHabits) {
        super(type, name, age, numberOfLegs, winged, eatingHabits);
    }

    @Override
    public void move() {
        System.out.println(name + " is swimming...");
    }
}
