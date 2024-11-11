class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[nums.length - 1])
                low = mid + 1;
            else 
                high = mid - 1;

        } 
        return nums[low];
    }
}

/*
 // search in a rotated sorted array - similar question on LC

  1. array - 0 --- low - 1 
  2.         low - n - 1

  Same Question;;;(KINDA):
  1. find min - nums[low]
  2. find inflection - low
  3. find the number of rotations - low
  4. search -> find low, apply binary search on 1. 0 --- low-1
                                                2. low --- n-1


*/