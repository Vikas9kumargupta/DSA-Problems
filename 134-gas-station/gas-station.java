class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tG = 0;
        int tC = 0;
        for(int i = 0;i<gas.length;i++){
            tG += gas[i];
            tC += cost[i];
        }        
        if(tG<tC){
            return -1;
        }
        int tmG = 0, start = 0;
        for(int i = 0;i<gas.length;i++){
            if(tmG<0){
                tmG = 0;
                start = i;
            }
            tmG += (gas[i]-cost[i]);
        }
        return start;
    }
}