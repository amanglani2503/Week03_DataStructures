package filereadingefficiency;

public class Main {
    public static void main(String[] args) {
        // Array to store file paths
        String[] filePaths = {"C:\\Users\\win\\OneDrive\\Desktop\\smallFile.txt",
                "C:\\Users\\win\\OneDrive\\Desktop\\mediumFile.txt",
                "C:\\Users\\win\\OneDrive\\Desktop\\largeFile.txt"};


        // Reading files using FileReader
        System.out.println("Reading Files using FileReader");
        double smallFileReaderTime = FileReading.readUsingFileReader(filePaths[0]);
        System.out.println("    Small File : " + smallFileReaderTime + " ms");

        double mediumFileReaderTime = FileReading.readUsingFileReader(filePaths[1]);
        System.out.println("    Medium File : " + mediumFileReaderTime + " ms");

        double largeFileReaderTime = FileReading.readUsingFileReader(filePaths[2]);
        System.out.println("    Large File : " + largeFileReaderTime + " ms");


        // Reading files using InputStreamReader
        System.out.println("Reading Files using InputStreamReader...");
        double smallInputStreamReaderTime = FileReading.readUsingInputStreamReader(filePaths[0]);
        System.out.println("    Small File: " + smallInputStreamReaderTime + " ms");

        double mediumInputStreamReaderTime = FileReading.readUsingInputStreamReader(filePaths[1]);
        System.out.println("    Medium File : " + mediumInputStreamReaderTime + " ms");

        double largeInputStreamReaderTime = FileReading.readUsingInputStreamReader(filePaths[2]);
        System.out.println("    Large File : " + largeInputStreamReaderTime + " ms");

    }
}
