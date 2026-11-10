class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers must be strictly positive
        if (n <= 0) {
            return false;
        }

        // Divide out all factors of 2, 3, and 5
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        // If reduced to 1, all prime factors were 2, 3, or 5
        return n == 1;
    }
}