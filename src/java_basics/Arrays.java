package java_basics;

public class Arrays {
    public static void main(String[] args) {
        int [] values = {1, 2, 3, 4, 5};

        for (int i = 0; i < values.length; i++) {
            System.out.println("This is a " + i + "." + " value from an array " + values[i]);
        }

        System.out.println("\n");

        int [] values2 = new int[5];
        values2[0] = 5;
        values2[4] = 4;
        values2[1] = values2[0] + values2[4];

        for (int i = 0; i < values2.length; i++) {
            System.out.println("This is a " + i + "." + " value from an array " + values2[i]);
        }

        System.out.println("\n");

        String [] words = {"My", "name", "is", "Marian"};
        System.out.println(words[3]);

        String [] words2 = new String[5];
        words2[0] = "My ";
        words2[4] = "name ";
        words2[2] = "is ";
        words2[1] = words2[0] + words2[4] + words2[2] + "Marian.";
        System.out.println(words2[1]);

    }
}
