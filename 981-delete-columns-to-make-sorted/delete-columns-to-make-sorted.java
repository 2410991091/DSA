class Solution {
    public int minDeletionSize(String[] strs) {

        int row = strs.length;
        int count = 0;
        int col = strs[0].length();

        for(int i = 0; i < col; i++) {

            for(int j = 1; j < row; j++) {

                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}