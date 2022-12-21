class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int ans[]=new int [n];
        int left[]=new int [n];
        int right[]=new int [n];
        int a=1,b=1;
        for(int i=0;i<n;i++)
        {
            left[i]=a;
            right[n-1-i]=b;
            a*=arr[i];
            b*=arr[n-1-i];
        }
        a=1;
      
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}