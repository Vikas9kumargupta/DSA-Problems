class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element is always 1

            // Calculate the middle elements
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            row.add(1); // Last element is always 1
            triangle.add(row);
        }

        return triangle;
    }
}