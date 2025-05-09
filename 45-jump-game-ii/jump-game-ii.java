class Solution {
    public int jump(int[] nums) {
        int num = 0;
        int A = 0;
        int ans = 0;
        for(int i=0; i<nums.length-1; i++) {
            ans = Math.max(ans, i+nums[i]);
            if( i == A ) {
                num++;
                A = ans;
            } 
        }
        return num;
    }
}