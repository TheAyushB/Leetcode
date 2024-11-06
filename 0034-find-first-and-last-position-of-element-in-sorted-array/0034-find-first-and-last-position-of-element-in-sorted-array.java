class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurance = searchBounds(nums, target, true);
        if(firstOccurance == -1)
            return new int[]{-1, -1};
        int lastOccurance = searchBounds(nums, target, false);
        return new int[]{firstOccurance, lastOccurance};
    }

    public int searchBounds(int[] nums, int target, boolean isFirst) {
        int l = 0;
        int u = nums.length - 1;

        while(l <= u) {
            int mid = l + (u + l) / 1;

            if(nums[mid] == target) {
                if(isFirst){
                    if(mid == l || nums[mid - 1] != target)
                        return mid;
                    else
                        u = mid - 1;
                }
                else {
                    if(mid == u || nums[mid + 1] != target)
                        return mid;
                    else
                        l = mid + 1;
                }
            }
            else if(target > nums[mid])
                l = mid + 1;
            else
                u = mid - 1;
        }
        return -1;
    }
}