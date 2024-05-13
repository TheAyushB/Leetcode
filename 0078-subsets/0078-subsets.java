class Solution {

    public List<List<Integer>> finalAns = new ArrayList<>();

    public void helper(int[] nums, int index, List<Integer> combinationsFormedSoFar) {

        if (index == nums.length) {
            finalAns.add(new ArrayList<>(combinationsFormedSoFar));
            return;
        }

        // Do not include the current element in combination
        helper(nums, index + 1, new ArrayList<>(combinationsFormedSoFar));

        // Include the current element in combination
        combinationsFormedSoFar.add(nums[index]);
        helper(nums, index + 1, combinationsFormedSoFar);
        combinationsFormedSoFar.remove(combinationsFormedSoFar.size() - 1);

    }


    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return finalAns;
    }
}