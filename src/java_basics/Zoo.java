package java_basics;

public class Zoo {

    public static void main(String[] args) {

        Animal Dog = new Animal("Dog", "Blue", 4, 4, false, eatingHabits.Carnivore);
        Animal Rhino = new Animal("Rhino", "Jeremy", 15, 4, false, eatingHabits.Herbivore);
        Animal Hooter =  new Animal("Hooter", "Hunter", 10, 2, true, eatingHabits.Carnivore);

        Dog.describe();
        Rhino.describe();
        Hooter.describe();
        Rhino.isWalking();
        Dog.age = 10;
        Dog.describe();
    }
}
