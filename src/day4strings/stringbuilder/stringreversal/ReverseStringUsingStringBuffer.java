package day4strings.stringbuilder.stringreversal;

public class ReverseStringUsingStringBuffer {
    // method to reverse a string using StringBuffer
    public static String reverseString(String string){
        // creating StringBuilder object of given string
        StringBuilder builderString = new StringBuilder(string);

        // reversing the builder string
        builderString.reverse();

        // returning the reversed String
        return builderString.toString();
    }

    // Main method
    public static void main(String[] args) {
        // String to be reversed
        String string = "Hello Everyone";

        // storing reversed string
        String reversedString = reverseString(string);

        System.out.println("Original String : " + string);
        System.out.println("Reversed String : " + reversedString);
    }
}
