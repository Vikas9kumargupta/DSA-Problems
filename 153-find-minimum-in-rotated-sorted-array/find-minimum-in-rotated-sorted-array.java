class Solution {
    public int findMin(int[] nums) {
        // int start = 0;
        // int end = nums.length-1;
        // while(start <= end){
        //     int mid = start + (end-start)/2;
        //     if(nums[start]<=nums[mid])
        // }
        Arrays.sort(nums);
        return nums[0];
    }
}