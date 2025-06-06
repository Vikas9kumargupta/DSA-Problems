class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, temp = 1;
        for (int i = 0; i < nums.length; i++) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0)
                temp = 1;
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp *= nums[i];
            max = Math.max(temp, max);
            if (temp == 0)
                temp = 1;
        }
        return max;
    }
}