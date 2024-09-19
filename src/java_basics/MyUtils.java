package java_basics;

public class MyUtils {

    public static void printStuff(String stuff) {
        System.out.println(stuff);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int calculate(String mode, int a, int b) {
        return switch (mode) {
            case "sum" -> a + b;
            case "sub" -> a - b;
            case "mul" -> a * b;
            case "div" -> a / b;
            default -> {
                printStuff("Wrong arguments passed for method calculate");
                yield 0;
            }
        };
    }

    public int quadVolume(int l, int w, int h) {   // Example of NON-Static method
        return l * w * h;
    }

}
