//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
         Stack<Character>stack=new Stack<>();
         for(char c:s.toCharArray())
         {
             if(stack.isEmpty())
             {
                 stack.push(c);
             }
             else if(stack.peek()==c)
             {
                 stack.pop();
             }
             else stack.push(c);
         }
         if(stack.size()==0)return "-1";
         s="";
         while(!stack.isEmpty())
         {
             s=stack.pop()+s;
         }
         return s;
    }
}
        
