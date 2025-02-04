package day4filehandling.inputstreamreader.userinputtofile;

import java.io.*;

public class ReadAndWrite {
    public static void consoleToFile(){
        // creating InputStreamReader object
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // wrapping inputStreamReader into bufferedReader for efficient reading
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // creating fileWriter Object
        FileWriter fileWriter = null;

        // bufferedWriter to write data efficiently
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("C:\\Users\\win\\OneDrive\\Desktop\\Notes\\Essays\\Output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            if(fileWriter == null){
                System.out.println("Nothing opened");
                return;
            }

            // to read text from console
            String line;

            System.out.println("Enter text to be added to file (Type 'exit' to stop) : ");

            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // to ensure data is written immediately
            bufferedWriter.flush();

            System.out.println("Data saved into the file !!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                if(inputStreamReader != null){
                    inputStreamReader.close();
                }

                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e){
                System.out.println("Error while closing resources : " + e.getMessage());
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // calling method to read data from console and write it into a file
        consoleToFile();
    }
}