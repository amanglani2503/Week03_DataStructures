package searching.linearsearch.searchword;

public class FindWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
                "The sky is blue.",
                "I love programming in Java.",
                "Linear search is simple but slow.",
                "AI is the future of technology."
        };

        String word = "search";
        String result = findSentenceWithWord(sentences, word);

        System.out.println("Sentence found: " + result);
    }
}
