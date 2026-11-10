class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        
        for (int i = 0; i < points.length - 1; i++) {
            int currentX = points[i][0];
            int currentY = points[i][1];
            
            int nextX = points[i + 1][0];
            int nextY = points[i + 1][1];

            
            int diffX = Math.abs(nextX - currentX);
            int diffY = Math.abs(nextY - currentY);

            
            totalTime += Math.max(diffX, diffY);
        }

        return totalTime;
    }
}