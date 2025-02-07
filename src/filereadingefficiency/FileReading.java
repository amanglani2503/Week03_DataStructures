package filereadingefficiency;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReading {

    // Method to read file using FileReader (Character Stream)
    public static long readUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {
                // Read character by character
            }
        } catch (IOException e) {
            System.out.println("Error reading file using FileReader: " + filePath);
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    // Method to read file using InputStreamReader (Byte Stream)
    public static long readUsingInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fileInputStream)) {
            while (isr.read() != -1) {
                // Read character by character
            }
        } catch (IOException e) {
            System.out.println("Error reading file using InputStreamReader: " + filePath);
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }
}
