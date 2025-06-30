class Solution {
    public int findLHS(int[] nums) {
        int dif=0;
        int max_len=0;
        Arrays.sort(nums);
        int start=0,end=1;
        while(end<nums.length){
            while(nums[end]-nums[start]>1)
                start++;
            if(nums[end]-nums[start]==1){
            max_len = Math.max(max_len,end-start+1);
            }
            end++;
        }
        return max_len;
    }
}