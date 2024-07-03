class Solution {
    List<List<Integer>> permutations = new ArrayList<>();

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void helper(int[] nums, int index) {
        // base case
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int x : nums)
                permutation.add(x);
            permutations.add(permutation);
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, i, index);
                helper(nums, index + 1); // incrementing the index
                // backtracking
                swap(nums, i, index);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        permutations.clear(); // reset permutations for each call
        helper(nums, 0);
        return permutations;
    }
}
