package day4filehandling.challengeproblem.performancecomparison;


import java.io.*;

public class PerformanceComparison {
    public static void bufferBuilderComparison(){
        int count = 1000000;

        // objects to store strings
        StringBuilder builderString = new StringBuilder();
        StringBuffer bufferedString = new StringBuffer();

        // storing the startTime before appending to StringBuilder
        long startTime = System.nanoTime();

        // appending "hello" 1,000,000 times to StringBuilder
        for(int i = 0; i < count; i++){
            builderString.append("hello");
        }

        // storing the endTime after appending to StringBuilder
        long endTime = System.nanoTime();

        // displaying total time taken for appending in StringBuilder
        System.out.println("Time taken for appending in StringBuilder: " + (endTime - startTime) + " ns");

        // storing the startTime before appending to StringBuffer
        startTime = System.nanoTime();

        // appending "hello" 1,000,000 times to StringBuffer
        for(int i = 0; i < count; i++){
            bufferedString.append("hello");
        }

        // storing the endTime after appending to StringBuffer
        endTime = System.nanoTime();

        // displaying total time taken for appending in StringBuffer
        System.out.println("Time taken for appending in StringBuffer: " + (endTime - startTime) + " ns");
    }

    public static void compareFileReading() {
        String filePath = "C:\\Users\\win\\OneDrive\\Desktop\\random_text.txt";

        try {
            long startTime = System.currentTimeMillis();
            int wordCountFileReader = countWordsUsingFileReader(filePath);
            long endTime = System.currentTimeMillis();
            System.out.println("FileReader: " + wordCountFileReader + " words, Time: " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();
            int wordCountInputStream = countWordsUsingInputStreamReader(filePath);
            endTime = System.currentTimeMillis();
            System.out.println("InputStreamReader: " + wordCountInputStream + " words, Time: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countWordsUsingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split(" ").length;
        }
        br.close();
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br = new BufferedReader(inputStreamReader);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split(" ").length;
        }
        br.close();
        return wordCount;
    }

    public static void main(String[] args) {
        // method to compare execution times for StringBuilder and StringBuffer
        bufferBuilderComparison();

        // method to compare file reading time in fileReader and InputStreamReader
        compareFileReading();
    }
}
