import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the count for the character in the HashMap
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}
