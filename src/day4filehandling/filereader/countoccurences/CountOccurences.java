package day4filehandling.filereader.countoccurences;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurences {
    public static int countOccurences(String searchWord) {
        // file reader object to read from a file
        FileReader fileReader = null;

        // bufferedReader object for reading contents
        BufferedReader bufferedReader = null;

        int count = 0;      // to count occurences of a word

        try {
            // specifying file path
            fileReader = new FileReader("C:\\Users\\win\\OneDrive\\Desktop\\Notes\\Essays\\Digital.txt");

            // wrapping fileReader into bufferedReader for reading efficiently
            bufferedReader = new BufferedReader(fileReader);

            // stores current line read
            String line;

            while ((line = bufferedReader.readLine()) != null) {      // reading contents while there are lines in file.
                String[] words = line.split(" ");

                for(String word : words){
                    if(word.equalsIgnoreCase(searchWord)){
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {      // handling cases if file not found
            System.out.println("File not found : " + e.getMessage());
        } catch (IOException e) {                // catching IOexception
            System.out.println("Error while reading file : " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();     // closing the objects for garbage collection
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("IOException : " + e.getMessage());
            }
        }

        return count;
    }

    // main method
    public static void main(String[] args) {
        String searchWord = "and";

        // storing count of occurences of given word
        int count = countOccurences(searchWord);

        // displaying count
        System.out.println(searchWord + " occured " + count + " times");
    }
}