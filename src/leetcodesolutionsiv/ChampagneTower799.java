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
public class ChampagneTower799
{
    public double champagneTower(int poured, int query_row, int query_glass) 
    {
        double[][] tower = new double[101][];
        for (int i = 0; i < 101; i++)
        {
            tower[i] = new double[i + 1];
        }
        tower[0][0] = poured;
        if(poured <= 1)
        {
            return tower[query_row][query_glass];
        }
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if(tower[i][j] > 1)
                {
                    double rem = tower[i][j] - 1;
                    tower[i + 1][j] += rem / 2;
                    tower[i + 1][j + 1] += rem / 2;
                    tower[i][j] = 1;
                }
            }
        }
        return tower[query_row][query_glass];
    }
}
