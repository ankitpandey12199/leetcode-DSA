//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
      public static String caseSort(String str)
    {
        String arr[]=getLower(str);
        char up[]=arr[0].toCharArray();
        char low[]=arr[1].toCharArray();
        Arrays.sort(up);
        Arrays.sort(low);
        int l=0,h=0;
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);
            if(Character.isUpperCase(c))
            {
                ans.append(up[h++]);
            }
            else {
                ans.append(low[l++]);
            }

        }
        return ans.toString();
    }
 
    public static  String[] getLower(String s)
    {
        StringBuilder up=new StringBuilder();
        StringBuilder low=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isLowerCase(c))
              low.append(c);
              else up.append(c);
        }
        return new String[]{up.toString(),low.toString()};
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends