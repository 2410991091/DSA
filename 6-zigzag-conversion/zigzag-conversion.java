class Solution {
    public String convert(String s, int row) {

        if(row == 1 || s.length() <= row){
            return s;
        }

        String[] arr = new String[row];

        // Initialize each row
        for(int i = 0; i < row; i++){
            arr[i] = "";
        }

        int currentRow = 0;
        boolean down = true;

        for(int i = 0; i < s.length(); i++){

            arr[currentRow] += s.charAt(i);

            // Change direction
            if(currentRow == row - 1){
                down = false;
            }
            else if(currentRow == 0){
                down = true;
            }

            // Move to next row
            if(down){
                currentRow++;
            }
            else{
                currentRow--;
            }
        }

        String ans = "";

        for(int i = 0; i < row; i++){
            ans += arr[i];
        }

        return ans;
    }
}