
package leetcodesolutionsiv;
import java.util.*;

public class KnightDialier935
{
    int[][] map =  new int[4][3];
    public int knightDialer(int n) 
    {
        long result = 0;
        HashMap<Integer, Integer>[][] dp = new HashMap[4][3];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                dp[i][j] = new HashMap<>();
            }
        }
        
        map[3][0] = -1;
        map[3][2] = -1;
        
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[0].length; j++)
            {
                if(isValid(i, j))
                {
                    result += getRes(dp, i, j, n - 1);
                }
            }
        }
        
        
        return (int) (result % 1000000007);
    }
    public int getRes(HashMap<Integer, Integer>[][] dp, int i, int j, int jumpsRemaining)
    {
        if(jumpsRemaining == 0)
        {
            return 1;
        }
        if(dp[i][j].containsKey(jumpsRemaining))
        {
            return dp[i][j].get(jumpsRemaining);
        }
        int res = 0;
        int[][] dirs = new int[][]{{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
        
        for(int[] dir: dirs)
        {
            int newi = i + dir[0];
            int newj = j + dir[1];
            if(isValid(newi, newj))
            {
                res = (res + getRes(dp, newi, newj, jumpsRemaining - 1)) % 1000000007;
            }
        }
        dp[i][j].put(jumpsRemaining, res);
        return res;
    }
    private boolean isValid(int i , int j)
    {
        if(i < 0 || j < 0 || i>= 4 || j >= 3 || map[i][j] == -1)
            return false;
        return true;
    }
}
