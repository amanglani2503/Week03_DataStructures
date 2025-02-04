package day4strings.stringbuffer.concatenatestrings;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] strings){
        // Creating StringBuffer object
        StringBuffer concatenatedString = new StringBuffer();

        // traversing the strings array and appending the string to concatenated string
        for(String currentString : strings){
            concatenatedString.append(currentString);
        }

        // returning the concatenated String
        return concatenatedString.toString();
    }

    // main method
    public static void main(String[] args) {
        // creating array of strings
        String[] strings = {"My", " name", " is", " Amber", " Manglani."};

        // storing the concatenated string
        String concatenatedString = concatenateStrings(strings);

        // displaying the concatenated string
        System.out.println("Concatenated String : " + concatenatedString);
    }
}
