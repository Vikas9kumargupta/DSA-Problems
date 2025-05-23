class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[] { first, last };
    }
    public int findPosition(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if (arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}