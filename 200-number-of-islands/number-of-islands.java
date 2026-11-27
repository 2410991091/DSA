class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    dfs(grid,i,j,n,m);
                }
            }
        
        }
        return  islands;

        
    }
    public void dfs(char[][] grid,int i,int j,int n,int m){
        if(i<0 || j<0||i>=n||j>=m){
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }

        // Mark as visited
        grid[i][j] = '0';

        // Visit all 4 directions
        dfs(grid, i + 1, j, n, m); // Down
        dfs(grid, i - 1, j, n, m); // Up
        dfs(grid, i, j + 1, n, m); // Right
        dfs(grid, i, j - 1, n, m); // Left

    }
}