//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
      
        int tl = T.length();

        int sl = S.length();

        

        

        String ans = "";

        

        int k = 0;

        int i = 0;

        while(i < tl ){

            if(T.charAt(i) >= 'A' && T.charAt(i) <=  'Z'){

                ans += S.charAt(k);

                k++;

            }

            else{

                int j = i;

                int num = 0;

                while(j<tl && Character.isDigit(T.charAt(j))){

                    if(num == 0){

                        num += Character.getNumericValue(T.charAt(j));

                     

                    }

                    else{

                        num = num *10 + Character.getNumericValue(T.charAt(j));

                    }

                    j++;

                }

                ans += Integer.toString(num);

                i = j-1;

                if(k+num-1 >= sl){

                    return 0;

                }

                k = k + num ;

            }

          i++;

        }

        

        while(i< tl){

            ans += S.charAt(k);

            k++;

            i++;

        }

 

        if(ans.equals(T)){

            return 1;

        }

        return 0;
    }
}