import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        String str = "Hello world! This is a sample string. Hello again.";

        // Remove leading and trailing whitespace, and split the string into words
        String[] words = str.trim().split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            // Convert word to lowercase to make counts case-insensitive
            word = word.toLowerCase();
            // Update word count in the HashMap
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word count for each word
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
