//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String str) {
        int arr[]=new int[26];
        for(char c:str.toCharArray())
        arr[c-'a']++;
        String temp="balon";
        int min=Integer.MAX_VALUE;
        for(char a='a';a<='z';a++)
        {
            if(a=='b' || a=='a' ||a=='n')
            {
               min=Math.min(arr[a-'a'],min);
            }
            if(a=='o' || a=='l')
            {
                min=Math.min(arr[a-'a']/2,min);
            }
            
        }
        return min;
    }
}