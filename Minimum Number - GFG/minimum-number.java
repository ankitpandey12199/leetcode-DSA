//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minimumNumber(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




class Solution {
    public static int minimumNumber(int n, int[] arr) {
      
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)mn=Math.min(arr[i],mn);
        int gcd = mn;
        for(int i=0;i<n;i++){
            int a = gcd, b = arr[i];
            while(a>0 && b>0){
                if(a<b)b=b%a;
                else a=a%b;
            }
            if(a==0)gcd=b;
            else gcd=a;
        }
        return gcd;
    }
}
        