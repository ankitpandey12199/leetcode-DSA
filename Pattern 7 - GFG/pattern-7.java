//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
         
         print(1,1,1,n);   
    }
    public void print(int i,int j,int spc,int n)
    {
        if(i>n)return;
        if(spc<n)
        {
            System.out.print(" ");
            print(i,j,spc+1,n);
        }
        else
        {
            if(j<=i*2-1)
            {
                System.out.print("*");
                print(i,j+1,spc,n);
            }
            else
            {
                System.out.println();
                print(i+1,1,i+1,n);
            }
        }
    }
  
}