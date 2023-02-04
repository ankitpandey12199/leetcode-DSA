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
            int [][]points=new int[N][3];
            for(int i=0;i<N;i++){
                for(int j=0;j<3;j++){
                    points[i][j]=sc.nextInt();
                }
            }
            Solution obj=new Solution();
            int res=obj.maximumPoints(points,N);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int maximumPoints(int points[][],int N){
          int ans[][]=new int [N][3];
          for(int i=0;i<3;i++)
          {
              ans[0][i]=points[0][i];
          }
          for(int i=1;i<N;i++)
          {
              ans[i][0]=Math.max(ans[i-1][1],ans[i-1][2])+points[i][0];
              ans[i][1]=Math.max(ans[i-1][0],ans[i-1][2])+points[i][1];
              ans[i][2]=Math.max(ans[i-1][1],ans[i-1][0])+points[i][2];
          }
          return Math.max(Math.max(ans[N-1][0],ans[N-1][1]),ans[N-1][2]);
    }
}