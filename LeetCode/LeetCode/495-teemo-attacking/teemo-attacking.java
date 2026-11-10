class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // Base case:if no attack then return 0
        if (timeSeries.length == 0) {
            return 0;
        }

        int totalTime = 0;

        // Loop through all attacks except the last one
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];

            // Condition 1: if gap between 2 attack is small 
            if (gap < duration) {
                totalTime = totalTime + gap; 
            } 
            // Condition 2: if gap is big
            else {
                totalTime = totalTime + duration; 
            }
        }

       
        totalTime = totalTime + duration;

        return totalTime;
    }
}