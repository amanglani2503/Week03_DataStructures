package day4filehandling.filereader.readingfile;

import java.io.*;

public class ReadingFile {
    public static void readFile(){
        // file reader object to read from a file
        FileReader fileReader = null;

        // bufferedReader object for reading contents
        BufferedReader bufferedReader = null;

        try{
            // specifying file path
            fileReader = new FileReader("C:\\Users\\win\\OneDrive\\Desktop\\Notes\\Essays\\Digital.txt");

            // wrapping fileReader into bufferedReader for reading efficiently
            bufferedReader = new BufferedReader(fileReader);

            // stores current line read
            String line;

            while((line = bufferedReader.readLine()) != null){      // reading contents while there are lines in file.
                System.out.println(line);
            }
        } catch (FileNotFoundException e){      // handling cases if file not found
            System.out.println("File not found : " + e.getMessage());
        } catch (IOException e) {                // catching IOexception
            System.out.println("Error while reading file : " + e.getMessage());
        } finally {
            try{
                if(fileReader != null){
                    fileReader.close();     // closing the objects for garbage collection
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("IOException : " + e.getMessage());
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // calling method for reading file
        readFile();
    }

}
