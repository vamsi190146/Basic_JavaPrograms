import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        // Convert sentence to lowercase
        sentence = sentence.toLowerCase();
        
        // Create a set to store unique letters
        Set<Character> letters = new HashSet<>();
        
        // Iterate over each character in the sentence
        for (char c : sentence.toCharArray()) {
            // If the character is a letter, add it to the set
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        
        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }
    
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(sentence);
        System.out.println("Is the sentence a pangram? " + result);
    }

}
