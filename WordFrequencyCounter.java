import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String sentence = sc.nextLine();

        // Remove punctuation and convert the sentence to lowercase
        String cleanedSentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the sentence into words
        String[] words = cleanedSentence.split(" ");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            // This loop checking the word how much time present in the string.
            if (wordFrequencyMap.containsKey(word)) {
                // getting count 
                int count = wordFrequencyMap.get(word);
                // storing 
                wordFrequencyMap.put(word, count + 1);
            }  // After the completion of loop STring + repeated value is stored in hashmap.
             else {
                wordFrequencyMap.put(word, 1);
            }
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {

            // there is two columns in hashmap names word and frequncy. printingthem one by one with the help of for loop.
            String word = entry.getKey();
            int frequency = entry.getValue();
            // printing both columns 
            System.out.println(word + ": " + frequency);
        }
    }
}
