//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int arr[], int n)
    {
          int max=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE,thirdMax=Integer.MIN_VALUE;
      for(int a:arr)//loop to iterate
      {
          if(a>max)//if curr element is greater than max
          {   thirdMax=secondMax;
              secondMax=max;//update secondmax as current max
              max=a;//update max as curr element
          }
          else if(a>secondMax && a<max)//if curr number  is greater than second max and less than
          {  thirdMax=secondMax;
             secondMax=a;//update second max as curr element
          }
          else if(a>thirdMax && a<secondMax)
          {
              thirdMax=a;
          }
      }
      return thirdMax==Integer.MIN_VALUE?-1:thirdMax;//return secondMax
    }
}
