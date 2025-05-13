class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sR = 0;
        int sC = 0;
        int eR = matrix.length-1;
        int eC = matrix[0].length-1;

        while(sR<=eR && sC<=eC){
        for(int i = sC;i<eC;i++){
            ans.add(matrix[sR][i]);
        }
        for(int i = sR;i<eR;i++){
            ans.add(matrix[i][eC]);
        }

        for(int j = eC;j>sC;j--){
            ans.add(matrix[eR][j]);
        }
        for(int i = eR;i>sR;i--){
            ans.add(matrix[i][sC]);
        }
        sR++;
        eR--;
        sC++;
        eC--;
        }
        if(matrix.length == matrix[0].length && matrix.length%2!=0) {
            int mid = matrix.length/2;
            ans.add(matrix[mid][mid]);
        }

        while(ans.size()!=matrix.length*matrix[0].length) {
            ans.remove(ans.size()-1);
        }
        return ans;
    }
}