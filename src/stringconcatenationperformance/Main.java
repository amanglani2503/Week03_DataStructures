package stringconcatenationperformance;

public class Main {
    public static void main(String[] args) {
        ConcatenationAnalysis analysis = new ConcatenationAnalysis();

        // Number of appends
        int small = 1000;
        int medium = 10000;
        int large = 1000000;

        // String concatenation times
        double stringTimeSmall = analysis.stringConcatenation("", small);
        double stringTimeMedium = analysis.stringConcatenation("", medium);
        double stringTimeLarge = analysis.stringConcatenation("", large);

//        // StringBuilder concatenation times
        double stringBuilderTimeSmall = analysis.stringBuilderConcatenation(new StringBuilder(), small);
        double stringBuilderTimeMedium = analysis.stringBuilderConcatenation(new StringBuilder(), medium);
        double stringBuilderTimeLarge = analysis.stringBuilderConcatenation(new StringBuilder(), large);

        // StringBuffer concatenation times
        double stringBufferTimeSmall = analysis.stringBufferConcatenation(new StringBuffer(), small);
        double stringBufferTimeMedium = analysis.stringBufferConcatenation(new StringBuffer(), medium);
        double stringBufferTimeLarge = analysis.stringBufferConcatenation(new StringBuffer(), large);

        // Printing results
        System.out.println("\nString Concatenation Times:");
        System.out.println("   Small (1000): " + stringTimeSmall + " ms");
        System.out.println("   Medium (10000): " + stringTimeMedium + " ms");
        System.out.println("   Large (1000000): " + stringTimeLarge + " ms");

        System.out.println("\nStringBuilder Concatenation Times:");
        System.out.println("   Small (1000): " + stringBuilderTimeSmall + " ms");
        System.out.println("   Medium (10000): " + stringBuilderTimeMedium + " ms");
        System.out.println("   Large (1000000): " + stringBuilderTimeLarge + " ms");

        System.out.println("\nStringBuffer Concatenation Times:");
        System.out.println("   Small (1000): " + stringBufferTimeSmall + " ms");
        System.out.println("   Medium (10000): " + stringBufferTimeMedium + " ms");
        System.out.println("   Large (1000000): " + stringBufferTimeLarge + " ms");
    }
}
