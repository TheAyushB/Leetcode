class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            int targetNumber = target - nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == targetNumber && i != j){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}