//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            
            int [][]grid=new int[N][M];
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    grid[i][j]=sc.nextInt();
                    
                }
            }
            
            Solution obj=new Solution();
            long res=obj.solve(N, M, grid);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int solve(int n, int m, int grid[][]){
      return traverse(grid,0,0,m-1,new int [n][m][m]);
    }
    public int traverse(int [][]grid,int i,int j1,int j2)
    {
        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length )return 0;
        if(i==grid.length-1)
        {
            if(j1==j2)return grid[i][j2];
            return grid[i][j1]+grid[i][j2];
        }
       
        int max=0;
        for(int x=-1;x<=1;x++)
        {
            for(int y=-1;y<=1;y++)
            { int value=0;
                if(j1==j2)
                {
                    value=grid[i][j1];
                }
                else value=grid[i][j1]+grid[i][j2];
                value+=traverse(grid,i+1,j1+x,j2+y);
                max=Math.max(max,value);
            }
        }
        return max;
    }
     public int traverse(int [][]grid,int i,int j1,int j2,int dp[][][])
    {
        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length )return 0;
        if(dp[i][j1][j2]!=0)return dp[i][j1][j2];
        if(i==grid.length-1)
        {
            if(j1==j2)return dp[i][j1][j2]=grid[i][j2];
            return dp[i][j1][j2]=grid[i][j1]+grid[i][j2];
        }
        int max=0;
        for(int x=-1;x<=1;x++)
        {
            for(int y=-1;y<=1;y++)
            { int value=0;
                if(j1==j2)
                {
                    value=grid[i][j1];
                }
                else value=grid[i][j1]+grid[i][j2];
                value+=traverse(grid,i+1,j1+x,j2+y,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }
}