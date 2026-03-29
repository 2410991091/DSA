class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        int col = arr[0].length;

        for (int row = 0; row < n; row++) {

            int start = 0;
            int end = col - 1;

            // reverse each row
            while (start < end) {
                int temp = arr[row][start];
                arr[row][start] = arr[row][end];
                arr[row][end] = temp;

                start++;
                end--;
            }
        }

        // invert
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }

        return arr;
    }
}