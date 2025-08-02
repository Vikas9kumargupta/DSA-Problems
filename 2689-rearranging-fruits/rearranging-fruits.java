class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int x : basket1) mp.put(x, mp.getOrDefault(x, 0) + 1);
        for (int x : basket2) mp.put(x, mp.getOrDefault(x, 0) - 1);
        
        List<Integer> toSwap = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;

        for (int key : mp.keySet()) {
            int f = Math.abs(mp.get(key));
            if (f % 2 != 0) return -1; 
            if (f > 0) {
                for (int i = 0; i < f / 2; i++) toSwap.add(key);
            }
            minVal = Math.min(minVal, key);
        }

        Collections.sort(toSwap);
        long cost = 0;

        for (int i = 0; i < toSwap.size() / 2; i++) {
            cost += Math.min(toSwap.get(i), 2 * minVal);
        }

        return cost;
    }
}