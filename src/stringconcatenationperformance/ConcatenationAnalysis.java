package stringconcatenationperformance;

public class ConcatenationAnalysis {
    public double stringConcatenation(String string, int numberOfAppends){
        double nanoToMilli = 1000000;
        double startTime = System.nanoTime();
        String appendingString = " Hello";

        for(int i = 0 ; i < numberOfAppends ; i++){
            string += appendingString;
        }

        double endTime = System.nanoTime();
        return (endTime - startTime) / nanoToMilli;
    }

    public double stringBuilderConcatenation(StringBuilder string, int numberOfAppends){
        double nanoToMilli = 1000000;
        double startTime = System.nanoTime();
        String appendingString = " Hello";

        for(int i = 0 ; i < numberOfAppends ; i++){
            string.append(appendingString);
        }

        double endTime = System.nanoTime();
        return (endTime - startTime) / nanoToMilli;
    }

    public double stringBufferConcatenation(StringBuffer string, int numberOfAppends){
        double nanoToMilli = 1000000;
        double startTime = System.nanoTime();
        String appendingString = " Hello";

        for(int i = 0 ; i < numberOfAppends ; i++){
            string.append(appendingString);
        }

        double endTime = System.nanoTime();
        return (endTime - startTime) / nanoToMilli;
    }
}
