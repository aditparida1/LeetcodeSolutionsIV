/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;

/**
 *
 * @author aditp
 */
public class MinFallingPathSum931
{
    public int minFallingPathSum(int[][] matrix) 
    {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int result = Integer.MAX_VALUE;
        int[][] dirs = new int[][]{{1, 0}, {1, -1}, {1, 1}};
        
        for(int i = matrix.length - 2; i >= 0; --i)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                boolean changed = false;
                int temp = matrix[i][j];
                for(int[] dir: dirs)
                {
                    int newi = i + dir[0];
                    int newj = j + dir[1];
                    if(isValid(newi, newj, matrix))
                    {
                        int res = temp + matrix[newi][newj];
                        if(!changed)
                        {
                            matrix[i][j] = res;
                            changed = true;
                        }
                        else
                        {
                            matrix[i][j] = Math.min(matrix[i][j], res);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrix[0].length; i++)
        {
            result = Math.min(result, matrix[0][i]);
        }
        return  result;
    }
    private boolean isValid(int i, int j, int[][] matrix)
    {
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length)
            return false;
        return true;
    }
}
