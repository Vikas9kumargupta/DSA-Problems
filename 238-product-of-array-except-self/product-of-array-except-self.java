class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int lM = 1, rM = 1;
        for(int i = ans.length-1; i >= 0; i--){
            ans[i] = rM;
            rM *= nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            ans[j] *= lM;
            lM *= nums[j];
        
        }
        return ans; 
    }
}