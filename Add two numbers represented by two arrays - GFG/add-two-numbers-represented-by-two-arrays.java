//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
  
    String calc_Sum(int a[], int n, int b[], int m)
    {
      String ans="";
      int carry=0;
      n--;
      m--;
      while(n>=0 && m>=0)
      {
          int sum=carry+a[n]+b[m];
          ans+=sum%10;
          carry=sum/10;
          n--;
          m--;
      }
     while(n>=0)
     {
         int sum=carry+a[n];
          ans+=sum%10;
          carry=sum/10;
          n--;
     }
     while(m>=0)
     {
         int sum=carry+b[m];
          ans+=sum%10;
          carry=sum/10;
          m--;
     }
     if(carry!=0)
     {
         ans+=carry;
     }
     return reverse(ans);
    }
  public static String reverse(String str)
  {
      String ans="";
      for(int i=str.length()-1;i>=0;i--)
      {
          ans+=str.charAt(i);
      }
      while(ans.length()>0 && ans.charAt(0)=='0')
      ans=ans.substring(1);
      return ans;
  }
    
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray_N = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray_N];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_N;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    String line2 = br.readLine();
		    String[] ele = line2.trim().split("\\s+");
		    int sizeOfArray_M = Integer.parseInt(ele[0]);
		    
		    int brr [] = new int[sizeOfArray_M];
		    
		    line2 = br.readLine();
		    String[] elements2 = line2.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] = Integer.parseInt(elements2[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    String res = obj.calc_Sum(arr, sizeOfArray_N, brr, sizeOfArray_M);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


            


// } Driver Code Ends