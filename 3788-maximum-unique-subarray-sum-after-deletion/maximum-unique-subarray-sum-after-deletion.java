class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums) st.add(num);

        int res = 0;
        for (int num : st) {
            if (num > 0) res += num;
        }
        if (res == 0) {
            res = Collections.max(st);
        }
        return res;

    }
}