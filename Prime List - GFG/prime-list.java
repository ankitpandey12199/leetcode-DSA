//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
    
    Node primeList(Node head){
    Node temp=head;
    
    while(temp!=null)
    {
         int i=temp.val,j=i;
         while(i>=1)
         {
             if(isPrime(i))
             {
                 temp.val=i;
                 break;
             }
             else if(isPrime(j))
             {
                 temp.val=j;
                 break;
             }
             if(i>1)i--;
             j++;
         }
         temp=temp.next;
    }
    return head;
  }
    public boolean isPrime(int  n)
    {
        if(n==1)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        if(n%i==0)return false;
        return true;
    }
}