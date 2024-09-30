package java_basics;

public class StringPractice {
    public static void main(String[] args) {
        String name = "John";
        String str = "Hello ";

        System.out.println(name.length()); // Length of the string
        System.out.println(name.substring(1, 3)); // Substring of the string
        System.out.println(name.equals(str)); // Compare two strings

        if (name.equalsIgnoreCase("joHn")) { // Compare two strings ignoring the case
            System.out.println("The name is John");
        } else {
            System.out.println("The name is not John");
        }

        System.out.println(name.charAt(1)); // Get the character at the specified index
        System.out.println(name.indexOf("o")); // Get the index of the first occurrence of the specified character
        System.out.println(name.lastIndexOf("o")); // Get the index of the last occurrence of the specified character
        System.out.println(name.startsWith("J")); // Check if the string starts with the specified character
        System.out.println(name.endsWith("n")); // Check if the string ends with the specified character
        System.out.println(name.toUpperCase()); // Convert the string to uppercase
        System.out.println(name.toLowerCase()); // Convert the string to lowercase
        System.out.println(name.trim()); // Remove leading and trailing whitespaces
        System.out.println(name.replace("J", "K")); // Replace the specified character with another character
        System.out.println(str.concat(name)); // Concatenate two strings
    }
}
