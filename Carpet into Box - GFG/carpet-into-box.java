//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java




//User function Template for Java

class Solution{

    int carpetBox(int A, int B, int C, int D) { 

        

        //Store the original length and breadth of the carpet and the box

 

        int lenC = A;

        int bdtC = B;

        int lenB = C;

        int bdtB = D;

        

        int count1 = 0;

        int count2 = 0;

        

        //reduce the length and breadth of the carpet if it is greater than box

        

        while(A > C){

            A = A/2;

            count1++;

        }

        

        while(B > D){

            B = B/2;

            count1++;

        }

        

        // This is after rotating the carpet 90 degree now length is breadth abd vice versa

        

        //reduce the breadth and lenght if it is greater than breadth

        

        while(bdtC > lenB){

            bdtC = bdtC/2;

            count2++;

        }

        

        while(lenC > bdtB){

            lenC = lenC/2;

            count2++;

        }e

        int ans = Math.min(count1,count2);

        

        return ans;

        

    }

 

}
