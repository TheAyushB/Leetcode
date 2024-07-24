class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int sum = 0;
            for(int wealth : account){
                sum += wealth;
            }
            maxWealth = Math.max(sum, maxWealth);
        }
        return maxWealth;
    }
}