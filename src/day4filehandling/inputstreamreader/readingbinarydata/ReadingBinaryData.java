package day4filehandling.inputstreamreader.readingbinarydata;

import java.io.*;

public class ReadingBinaryData {
    public static void readBinaryFile(){
        // file reader object to read from a file
        FileInputStream fileInputStream = null;

        // inputStreamReader object
        InputStreamReader inputStreamReader = null;

        // bufferedReader object for reading contents
        BufferedReader bufferedReader = null;

        try{
            // specifying file path
            fileInputStream = new FileInputStream("C:\\Users\\win\\OneDrive\\Desktop\\Notes\\Essays\\Digital.txt");

            // Wrap the FileInputStream in an InputStreamReader, specifying charset encoding (UTF-8)
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            // wrapping InputStreamReader into bufferedReader for reading efficiently
            bufferedReader = new BufferedReader(inputStreamReader);

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
                if(bufferedReader != null){
                    bufferedReader.close();     // closing the objects for garbage collection
                }
                if(inputStreamReader != null){
                    inputStreamReader.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("IOException : " + e.getMessage());
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // calling method for reading file
        readBinaryFile();
    }
}
