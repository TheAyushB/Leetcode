class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0 || n == 1) return 1; // base case

        // check whether this subproblem is already solved
        if (cache.get(n) != null)
            return cache.get(n);
        
        // solve this subproblem
        int climbOneStep = climbStairs(n - 1);
        int climbTwoSteps = climbStairs(n - 2);
        int totalWays = climbOneStep + climbTwoSteps;
        cache.put(n, totalWays); // store this in cache
        return totalWays;
    }
}