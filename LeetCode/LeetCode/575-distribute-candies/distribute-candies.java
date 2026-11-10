class Solution {
    public int distributeCandies(int[] candyType)
     {
        int unique = 0;
        int n = candyType.length;

        for (int i = 0; i < n; i++)
         {
            boolean found = false;

            for (int j = 0; j < i; j++)
             {
                if (candyType[i] == candyType[j]) 
                {
                    found = true;
                    break;
                }
            }

            if (!found) 
            {
                unique++;
            }
        }

        return Math.min(unique, n / 2);
    }
}