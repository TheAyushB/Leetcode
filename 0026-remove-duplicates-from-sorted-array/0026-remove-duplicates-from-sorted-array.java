class Solution {
    public int removeDuplicates(int[] nums) {
        int traversalPtr = 0;
        int k = 0;
        int prev = Integer.MIN_VALUE;

        for(; traversalPtr < nums.length; traversalPtr++){
            int currentElement = nums[traversalPtr];
            if(prev != currentElement){
                nums[k] = currentElement;
                k++;
                prev = currentElement;
            }
        } 
        return k;
    }
}

/* 
    [0,0,1,1,1,2,2,3,3,4]
               t
         k
    [0,1,2,1,1,2,2,3,3,4]
    
     prev = Integer.MIN_VALUE

*/