package java_basics;

public class LoopsPractice {

    public static int printCategories(String str) {
        int i = 0;
        while (true) {
            int found = str.indexOf("category:", i);
            if (found == -1)  return 1;
            int start = found + 10;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end + 1;
        }
    }

    public static void printEvenNumbers(int n, int mod) {
        for (int i = 0; i <= n; i++) {
            if (i % mod == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in the category: apparel and the slightly more in demand category: makeup along with the category: furniture and ...";

        // for loop
        for (int i = 0; i < 5; i++) {
//            System.out.println("The value of i is: " + i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
//            System.out.println("The value of j is: " + j);
            j++;
            if (j == 3) {
//                System.out.println("The value of j is 3, breaking the loop...");
                break;
            }
        }

        // do while loop
        int k = 0;
        do {
//            System.out.println("The value of k is: " + k);
            k++;
        } while (k < 5);

        // for each loop
        String[] animals = {"dog", "cat", "bird", "fish"};
        for (String animal : animals) {
//            System.out.println("The animal is: " + animal);
        }

        printCategories(str);
        printEvenNumbers(100, 3);
    }
}
