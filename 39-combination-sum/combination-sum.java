class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solutions = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(solutions, current, candidates, target, 0);
        return solutions;
    }
    private void backtrack(List<List<Integer>> solutions, List<Integer> current,
                            int[] candidates, int target, int start) {
        if (target == 0) {
            solutions.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                backtrack(solutions, current, candidates, target - candidates[i], i);
                current.remove(current.size() - 1);
            }
        }
    }
}