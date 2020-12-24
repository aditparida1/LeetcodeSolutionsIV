
package leetcodesolutionsiv;
import java.util.*;

public class NumberofDistinctIsland694
{
    public int numDistinctIslands(int[][] grid) {
        if(grid.length == 0 || grid == null){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        Set<String> set = new HashSet();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1){
                    StringBuilder sb = new StringBuilder();
                    calculatePath(i, j, m, n, "X", grid, sb);
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
    public void calculatePath(int i, int j, int m, int n, String direction, int[][] grid, StringBuilder sb){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j] == 0){
            sb.append("O");
            return;
        }
        sb.append(direction);
        grid[i][j] = 0;
        calculatePath(i, j-1, m, n, "L", grid, sb);
        calculatePath(i, j+1, m, n, "R", grid, sb);
        calculatePath(i-1, j, m, n, "U", grid, sb);
        calculatePath(i+1, j, m, n, "D", grid, sb);
    }
}
