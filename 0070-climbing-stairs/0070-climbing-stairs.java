class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        // base case
        if(n == 0 || n == 1) return 1;

        if(cache.get(n) != null)
            return cache.get(n);
        
        int climbOneStep = climbStairs(n - 1);
        int climbTwoSteps = climbStairs(n - 2);
        int totalWays = climbOneStep + climbTwoSteps;
        cache.put(n, totalWays);

        return totalWays;
    }
}