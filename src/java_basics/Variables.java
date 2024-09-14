package java_basics;

public class Variables {
    public Variables() {
    }

    public static void main(String[] args) {
        int x = 4;
        String word = "Hello";
        System.out.println(x);
        System.out.println(word);
        x += 5;
        System.out.println(x);
        System.out.println(word + " World");
        float y = 4.5F;
        System.out.println("This is a float number " + y);
        double z = 4.5;
        System.out.println("This is a double number " + z);
        long a = 400000000000000000L;
        System.out.println("This is a long number " + a);
        boolean b = true;
        System.out.println("This is a boolean " + b);
        char c = 'A';
        System.out.println("This is a char " + c);
        short d = 4;
        System.out.println("This is a short " + d);
        byte e = -128;
        System.out.println("This is a byte " + e);
    }
}