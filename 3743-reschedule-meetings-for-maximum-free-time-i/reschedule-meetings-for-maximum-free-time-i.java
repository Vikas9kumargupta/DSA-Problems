class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int start = 0;
        int n = startTime.length;
        int[] dp = new int[n+1];
        for(int i=0; i<n; i++){
            dp[i] = startTime[i]-start;
            start = endTime[i];
        }
        dp[n] = eventTime-start;
        int i = 0;
        int sol = 0;
        int sum = 0;
        for(int j=0; j<=n; j++){
            if(j-i <= k){
                sum += dp[j];
            }
            sol = Math.max(sum,sol);
            if(j-i >=k){
                sum-=dp[i];
                i++;
            }
        }
        return sol;
    }
}