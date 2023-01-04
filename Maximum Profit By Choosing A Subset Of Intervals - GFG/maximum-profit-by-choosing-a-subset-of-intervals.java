//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[][] intervals = IntMatrix.input(br, n, 3);

            Solution obj = new Solution();
            int res = obj.maximum_profit(n, intervals);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
  
    public static int maximum_profit(int n, int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

    // DP array to store the maximum profit for each interval
    int[] dp = new int[intervals.length];

    // The maximum profit for the first interval is the profit itself
    dp[0] = intervals[0][2];

    // Iterate over the intervals and find the maximum profit for each
    for (int i = 1; i < intervals.length; i++) {
      // The maximum profit for the current interval is the maximum of:
      // 1. The profit for the current interval + the maximum profit of all previous non-overlapping intervals
      // 2. The maximum profit for the previous interval
      int maxProfit = intervals[i][2];
      for (int j = 0; j < i; j++) {
        if (intervals[j][1] <= intervals[i][0]) {
          maxProfit = Math.max(maxProfit, dp[j] + intervals[i][2]);
        }
      }
      dp[i] = Math.max(dp[i - 1], maxProfit);
    }

    // The maximum profit is stored in the last element of the DP array
    return dp[intervals.length - 1];
    }
}
