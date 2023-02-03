//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        char dir = 'R';
        int i=0,j=0;
        while(!boundary(i,j,m,n)){
            if(arr[i][j]==0){
                if(dir=='R') j++;
                else if(dir=='U') i--;
                else if(dir=='L') j--;
                else i++;
            }else{
                arr[i][j]=0;
                if(dir=='R'){
                    dir='D';
                    i++;
                }else if(dir=='U'){
                    dir='R';
                    j++;
                }else if(dir=='L'){
                    i--;
                    dir='U';
                }else{
                    j--;
                    dir='L';
                }
            }
        }
        // when go out of the cell , but we have to tell or return from where we gone out or boundary cell!
        if (i>=m) i=m-1;
        else if (i<=0) i=0;
        if(j>=n) j=n-1;
        else if(j<=0) j=0;
        
        return new int[]{i,j};
    }
    static boolean boundary(int i , int j , int m , int n){
        return (i<0||j<0||i>=m||j>=n);
    }
}