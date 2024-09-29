package java_basics;

public class Zoo {

    public static void moveAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.move();
        }
    }

    public static void main(String[] args) {

        Bird Bird = new Bird("Bird", "Papagaj", 3, 2, true, eatingHabits.Carnivore);
        Eagle Eagle = new Eagle("Bird", "Eagle", 5, 2, true, eatingHabits.Carnivore);
        Chicken Chicken = new Chicken("Bird", "Chicken", 2, 2, true, eatingHabits.Omnivore);

        Bird.describe();
        Eagle.describe();
        Eagle.fly();

        Animal[] animals = new Animal[3];
        animals[0] = Bird;
        animals[1] = Eagle;
        animals[2] = Chicken;

        moveAnimals(animals);

    }
}
