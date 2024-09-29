package java_basics;

public class Eagle extends Bird implements Flyable {

    public Eagle(String type, String name, int age, int numberOfLegs, boolean winged, eatingHabits eatingHabits) {
        super(type, name, age, numberOfLegs, winged, eatingHabits);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
