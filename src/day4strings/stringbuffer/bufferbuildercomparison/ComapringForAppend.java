package day4strings.stringbuffer.bufferbuildercomparison;

public class ComapringForAppend {
    public static void Comparison(){
        int count = 1000000;

        // objects to store strings
        StringBuilder builderString = new StringBuilder();
        StringBuffer bufferedString = new StringBuffer();

        // storing the startTime before appending to StringBuilder
        long startTIme = System.nanoTime();

        // appending "hello" 1,000,000 times to StringBuilder
        for(int i = 0 ; i < count ; i++){
            builderString.append("hello");
        }

        // storing the endTime after appending to StringBuilder
        long endTime = System.nanoTime();

        // displaying total time taken for appending in StringBuffer
        System.out.println("Time taken for appending in StringBuilder : " + (endTime - startTIme));

        // storing the startTime before appending to StringBuilder
        startTIme = System.nanoTime();

        // appending "hello" 1,000,000 times to StringBuffer
        for(int i = 0 ; i < count ; i++){
            bufferedString.append("hello");
        }

        // storing the endTime after appending to StringBuilder
        endTime = System.nanoTime();

        // displaying total time taken for appending in StringBuffer
        System.out.println("Time taken for appending in StringBuffer : " + (endTime - startTIme));
    }

    // main method
    public static void main(String[] args) {
        /* calling method that compares execution time for string appending
            in StringBuilder and StringBuffer*/
        Comparison();
    }
}
