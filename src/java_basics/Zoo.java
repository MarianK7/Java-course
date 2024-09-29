package java_basics;

public class Zoo {

    public static void main(String[] args) {

        Animal Dog = new Animal("Dog", "Blue", 4, 4, false, eatingHabits.Carnivore);
        Animal Rhino = new Animal("Rhino", "Jeremy", 15, 4, false, eatingHabits.Herbivore);
        Animal Hooter =  new Animal("Hooter", "Hunter", 10, 2, true, eatingHabits.Carnivore);
        Bird Bird = new Bird("Bird", "Papagaj", 3, 2, true, eatingHabits.Carnivore);
        Eagle Eagle = new Eagle("Bird", "Eagle", 5, 2, true, eatingHabits.Carnivore);
        Chicken Chicken = new Chicken("Bird", "Chicken", 2, 2, true, eatingHabits.Omnivore);

        Dog.describe();
        Rhino.describe();
        Hooter.describe();
        Rhino.isWalking();
        Dog.age = 10;
        Dog.describe();
        Eagle.fly();

    }
}
