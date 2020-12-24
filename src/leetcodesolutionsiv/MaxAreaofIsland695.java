
package leetcodesolutionsiv;
import java.util.*;

public class MaxAreaofIsland695
{
    public int maxAreaOfIsland(int[][] grid) 
    {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int maxLen = 0;
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                    maxLen = Math.max(maxLen, traverse(i, j, grid));
            }
        }
        return maxLen;
    }
    public int traverse(int i, int j, int[][] grid)
    {
        if(i <0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2)
        {
            return 0;
        }
        grid[i][j] = 2;
        int left = traverse(i, j - 1, grid);
        int right = traverse(i, j + 1, grid);
        int up = traverse(i - 1, j, grid);
        int down = traverse(i + 1, j, grid);
        return 1 + left + right + up + down;
    }
    
}
