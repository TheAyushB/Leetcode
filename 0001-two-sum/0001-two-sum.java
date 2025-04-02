class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // calculate the complement of the current number
            int complement = target - nums[i];

            // check if the complement is already in the map
            if(map.containsKey(complement)) {
                // if found, return the indices of the complement and the current number
                return new int[] { map.get(complement), i };
            }

            // otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        // return an empty array if no solution is found (this case woun't occur as per problem constraints)
        return new int[] {};
    }
}