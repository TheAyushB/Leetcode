class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //cyclic sorting only for numbers that lie between 1 and n
        for(int i = 0; i < n; i++){
            while(nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;

            }
        }
        // finding first missing positive
        for(int i = 1; i <= n; i++)
            if(i != nums[i - 1])
                return i;
        return n + 1;
    }
}