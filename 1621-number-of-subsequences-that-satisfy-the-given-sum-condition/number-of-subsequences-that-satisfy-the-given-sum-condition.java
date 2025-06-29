class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int mod = 1000000007;
        int res = 0;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i = 1; i<n; i++){
            pow[i] = pow[i-1]*2%mod;
        }
        while(left<=right){
            if(nums[left] + nums[right] > target){
                right--;
            } else {
                res = (res + pow[right - left++]) % mod;
            }
        }
        return res;
        
    }
}