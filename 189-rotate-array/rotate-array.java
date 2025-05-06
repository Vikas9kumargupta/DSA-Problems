class Solution {
    public void rotate(int[] arr, int d) {
        int n = arr.length;
        int temp[] = new int[n];
        int k = 0;
        d=d%n;
        for (int i = n-d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n-d; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}