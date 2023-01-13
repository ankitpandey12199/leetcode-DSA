//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
      int max=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
      for(int a:arr)//loop to iterate
      {
          if(a>max)//if curr element is greater than max
          {
              secondMax=max;//update secondmax as current max
              max=a;//update max as curr element
          }
          else if(a>secondMax && a<max)//if curr number  is greater than second max and less than
          {
             secondMax=a;//update second max as curr element
          }
      }
      return secondMax==Integer.MIN_VALUE?-1:secondMax;//return secondMax
    }
}