class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int len = happiness.length;
        int countK = 0;long sum=0;
        for(int i=len-1;i>=0;i--)
        {
            if(countK>=k)
                break;
            if(happiness[i]>=countK)
                sum=sum+(happiness[i]-countK);
            else
                break;
            countK++;
        }
        return sum;
    }
}

/*
    Time Complexity: O(n*log(n)) where n is the length of the input array happiness
    Space Complexity: O(1)
*/