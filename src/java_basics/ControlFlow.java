package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int value : values) { // Same as for (int i = 0; i < values.len; i++)
            if (value % 2 == 0) {
                System.out.println(value + " % 2 == 0");
            } else if (value % 3 == 0) {
                System.out.println(value + " % 3 == 0");
            } else {
                System.out.println(value + " % 2 != 0 and % 3 != 0");
            }
        }

        System.out.println("\n");

        String month = "October";
        boolean error = false;

        switch (month) {
            case "January":
                System.out.println("This is January");
                break;
            case "February":
                System.out.println("This is February");
                break;
            case "March":
                System.out.println("This is March");
                break;
            case "April":
                System.out.println("This is April");
                break;
            case "May":
                System.out.println("This is May");
                break;
            case "June":
                System.out.println("This is June");
                break;
            default:
                if (!error) {
                    System.out.println("Just break the switch statement");
                    break;
                }else {
                    throw new IllegalStateException("Unexpected value: " + month);  // Throw an error
                }
        }

    }
}
