package java_basics;

public class Methods {

    public static void PrintArray(String[] array) {
        for (String element : array) {
            MyUtils.printStuff(element);
        }
    }

    public static void main(String[] args) {
        MyUtils.printStuff("Sum of 1 and 2 is");    // Invoking methods from another Class
        System.out.println(MyUtils.add(1, 2));

        System.out.println(MyUtils.calculate("div",39,3));

        String [] array = {"Hello", "World", "!"};

        System.out.println("\n");

        PrintArray(array);

        int test = MyUtils.calculate("mul", 6, 8) + 10;
        System.out.println(test);

        MyUtils utils = new MyUtils();  // Instancing Class MyUtils to be able to invoke non-static quadVolume method

        int quadVol = utils.quadVolume(5,5,5);

        System.out.println(quadVol);

//        CTRL + / == Comment shortcut

    }
}
