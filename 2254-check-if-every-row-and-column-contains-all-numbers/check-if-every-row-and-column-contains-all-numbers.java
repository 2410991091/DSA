class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        // Check rows
        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int x = 1; x <= n; x++) {
                set.add(x);
            }

            for (int j = 0; j < n; j++) {

                if (!set.contains(matrix[i][j])) {
                    return false;
                }

                set.remove(matrix[i][j]);
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {

            HashSet<Integer> set = new HashSet<>();

            for (int x = 1; x <= n; x++) {
                set.add(x);
            }

            for (int i = 0; i < n; i++) {

                if (!set.contains(matrix[i][j])) {
                    return false;
                }

                set.remove(matrix[i][j]);
            }
        }

        return true;
    }
}