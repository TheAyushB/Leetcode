class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // cyclic sorting
        for(int i = 0; i < n; i++)
        {
            int cur = nums[i];
            while(nums[cur - 1] != cur)
            {
                int temp = nums[cur - 1];
                nums[cur - 1] = cur;
                cur = nums[i] = temp;
            }
        }

        // finding the duplicate no
        for(int i = 0; i < n; i++)
            if(nums[i] != (i + 1))
                return nums[i];
        return -1;
    }
}
