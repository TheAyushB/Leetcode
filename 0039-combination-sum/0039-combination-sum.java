class Solution {
  public List<List<Integer>> ans = new ArrayList<>();

  public void helper(int[] candidates, int target, int index, List<Integer> lst) {
    if (target == 0) {
      ans.add(new ArrayList<>(lst));
      return;
    }

    if (index == candidates.length || target < 0) {
      return;
    }

    helper(candidates, target, index + 1, lst);

    lst.add(candidates[index]);
    helper(candidates, target - candidates[index], index, lst);
    lst.remove(lst.size() - 1);
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    helper(candidates, target, 0, new ArrayList<>());
    return ans;
  }
}
