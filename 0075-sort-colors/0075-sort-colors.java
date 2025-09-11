class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        int temp;
        while(i <= high) {
            switch(nums[i]) {
                case 0: temp = nums[low];
                        nums[low] = nums[i];
                        nums[i] = temp;
                        low++; i++;
                        break;
                case 1: i++;
                        break;
                case 2: temp = nums[high];
                        nums[high] = nums[i];
                        nums[i] = temp;
                        high--;
            }
        }
    }
}