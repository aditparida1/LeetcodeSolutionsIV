/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolutionsiv;
import java.util.*;
/**
 *
 * @author aditp
 */
public class LongestFiboSubSeq873
{
//    public int lenLongestFibSubseq(int[] arr) 
//    {
//        int len = 0;
//        HashMap<Integer, Integer>[] map = new HashMap[arr.length];
//        for (int i = 0; i < arr.length; i++)
//        {
//            map[i] = new HashMap<>();
//        }
//        for(int i = 1; i < arr.length; ++i)
//        {
//            for(int j = i - 1; j >= 0; j--)
//            {
//                if(arr[i] < arr[j])
//                    continue;
//                map[i].put(arr[i] + arr[j], 2);
//                if(map[j].containsKey(arr[i]))
//                {
//                    map[i].put(arr[i] + arr[j], map[j].get(arr[i]) + 1);
//                    len = Math.max(len, map[i].get(arr[i] + arr[j]));
//                }
//            }
//        }
//        
//        return len;
//    }
    public int lenLongestFibSubseq(int[] arr) {
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++){
map.put(arr[i],i);
}
int n=arr.length;
int[][] dp=new int[n][n];
for(int[] ar:dp){
Arrays.fill(ar,-1);
}
int ans=-1;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
int a=arr[j]-arr[i];
int b=arr[i];

//            if(a>=b) dp[i][j]=2;
//            else{
                if(map.containsKey(a) && map.containsKey(b)){
                    int i1=map.get(a);
                    int j1=map.get(b);
                    dp[i][j]=1+dp[i1][j1];
                }
                else{
                    dp[i][j]=2;
                }
            
            ans=Math.max(ans,dp[i][j]);
        }            
    }/*
    for(int[] a:dp){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }*/
    if(ans==2) return 0;
    return ans;
}

}
