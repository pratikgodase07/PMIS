import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Step 1: Split string s into an array of words
        String[] words = s.split(" ");

        // Step 2: If lengths don't match, pattern cannot match
        if (pattern.length() != words.length) {
            return false;
        }

        // Two HashMaps for two-way mapping
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        // Step 3: Iterate through pattern and words simultaneously
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check char -> word mapping
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false; // Character already mapped to a different word
                }
            } else {
                charToWord.put(c, word);
            }

            // Check word -> char mapping
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false; // Word already mapped to a different character
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true; // All mappings are valid
    }
}