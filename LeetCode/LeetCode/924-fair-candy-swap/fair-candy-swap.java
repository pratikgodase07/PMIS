class Solution 
{
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
    {
        int sumAlice=0;
        int sumBob=0;

        for(int a:aliceSizes)
        {
            sumAlice +=a;
        }

        for(int b:bobSizes)
        {
            sumBob +=b;
        }
        
        int diff= (sumAlice- sumBob) /2;


       for (int a : aliceSizes)
        {
            for (int b : bobSizes) 
            {
                if (a - b == diff)
                 {
                    return new int[]{a, b};
                }
            }
        }
        return new int[0];
    }
}