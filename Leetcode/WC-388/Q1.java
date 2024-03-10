class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int countApples = 0;
        for(int i:apple)
            countApples+=i;
        Arrays.sort(capacity);
        int countBoxes = 0;
        for(int i=capacity.length-1;i>=0;i--)
        {
            countApples-=capacity[i];
            countBoxes++;
            if(countApples<=0){
                break;
            }
        }
        return countBoxes;
    }
}


/*
    Time Complexity: O(n*log(n)) where n is the length of the input array capacity
    Space Complexity: O(1)
*/