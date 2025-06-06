class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int wt=rp-lp;
            int Curr=ht*wt;
            max = Math.max(max,Curr);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }
}