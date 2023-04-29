//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                a[i][0]=Integer.parseInt(s[0]);
                a[i][1]=Integer.parseInt(s[1]);
            }
            int k=Integer.parseInt(in.readLine().trim());
            Solution ob=new Solution();
            out.println(ob.powerfullInteger(n,a,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
class Solution{
    
    public static int powerfullInteger(int n,int interval[][],int k)
    {
        int ma = max(interval);
        int[] temp = new int[ma+2];
        for (int[] range : interval){
            temp[range[0]] ++;
            temp[range[1] + 1] --;
        }
        
        for (int i = 0; i <= ma ;i++){
            temp[i+1] += temp[i];
        }
        
        int ans = -1;
        for (int i = 0; i <= ma ;i++){
            // System.out.println(temp[i]);
            if (temp[i] >= k){
                ans = i;
            }
        }
        
        return ans;
    }
    public static int max(int[][] arr){
        int max = 0;
        for (int[] i : arr){
            max = Math.max(max , i[0]);
            max = Math.max(max , i[1]);
        }
        return max;
    }
}