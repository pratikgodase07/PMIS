class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                // Collect the $5 bill (no change needed)
                five++;
            } else if (bill == 10) {
                // Must give back one $5 bill as change
                if (five == 0) {
                    return false; // Cannot provide change
                }
                five--;
                ten++;
            } else {
                // bill == 20: Must give back $15 in change
                // First choice: Give one $10 bill and one $5 bill (saves $5 bills for later)
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } 
                // Second choice: Give three $5 bills
                else if (five >= 3) {
                    five -= 3;
                } 
                // Otherwise, change cannot be given
                else {
                    return false;
                }
            }
        }

        return true;
    }
}