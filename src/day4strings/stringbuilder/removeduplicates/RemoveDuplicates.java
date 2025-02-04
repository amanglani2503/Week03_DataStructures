package day4strings.stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String string){
        // creating string builder object for given string
        StringBuilder buildString = new StringBuilder(string);

        // string to store string without duplicates
        StringBuilder removedDuplicates = new StringBuilder();

        // to store unique characters
        HashSet<Character> seen = new HashSet<>();

        for(char character : string.toCharArray()){
            if(!seen.contains(character)){
                seen.add(character);
                removedDuplicates.append(character);
            }
        }

        return removedDuplicates.toString();
    }

    // main method
    public static void main(String[] args) {
        // input string
        String string = "Good Morning";

        // storing string containing unique characters
        String removedDuplicates = removeDuplicates(string);

        System.out.println("Original String : " + string);
        System.out.println("String containing unique charaters : " + removedDuplicates);
    }
}
