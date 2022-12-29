//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] arr) {
         Stack<Integer>stack=new Stack<>();
            for(int a:arr)
                    {
                            int b=Math.abs(a);
                            if(stack.isEmpty() || a>=0)
                                    stack.push(a);
                            else if(b>= stack.peek())
                            {
                               while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<b)
                                       {
                                               stack.pop();
                                       }
                                    if(stack.isEmpty())stack.push(a);
                                    else if(stack.peek()==b)stack.pop();
                                   else if(stack.peek()<0)stack.push(a);
                            }
                    }
             arr=new int [stack.size()];
            for(int i=arr.length-1;i>=0;i--)
                    arr[i]=stack.pop();
            return arr;
    }
}
