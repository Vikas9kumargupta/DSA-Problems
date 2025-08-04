class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxFruits = 0;
        int l = 0;

        for(int r = 0; r < fruits.length; r++){
            mp.put(fruits[r], mp.getOrDefault(fruits[r], 0) + 1);

            while(mp.size()>2){
                mp.put(fruits[l], mp.get(fruits[l]) - 1);
                if(mp.get(fruits[l])==0){
                    mp.remove(fruits[l]);
                }
                l++;
            }
            maxFruits = Math.max(maxFruits, r-l+1);
        }
        return maxFruits;
    }
}