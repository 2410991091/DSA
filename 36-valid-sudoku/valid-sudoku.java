class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean flag = true;

        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();

        int n = board.length;

        // ROW
        for(int i = 0; i < n; i++) {

            row.clear();

            for(int j = 0; j < n; j++) {

                if(board[i][j] != '.') {

                    if(row.contains(board[i][j])) {
                        flag = false;
                    }

                    row.add(board[i][j]);
                }
            }
        }

        // COLUMN
        for(int j = 0; j < n; j++) {

            col.clear();

            for(int i = 0; i < n; i++) {

                if(board[i][j] != '.') {

                    if(col.contains(board[i][j])) {
                        flag = false;
                    }

                    col.add(board[i][j]);
                }
            }
        }

        // 3 x 3 BOX
        for(int rowStart = 0; rowStart < n; rowStart += 3) {

            for(int colStart = 0; colStart < n; colStart += 3) {

                HashSet<Character> box = new HashSet<>();

                for(int i = rowStart; i < rowStart + 3; i++) {

                    for(int j = colStart; j < colStart + 3; j++) {

                        if(board[i][j] != '.') {

                            if(box.contains(board[i][j])) {
                                flag = false;
                            }

                            box.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return flag;
    }
}