class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1; // Start from the last character

        // Step 1: Skip all spaces at the end of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i = i - 1;
        }

        // Step 2: Count the characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length = length + 1;
            i = i - 1;
        }

        return length;
    }
}