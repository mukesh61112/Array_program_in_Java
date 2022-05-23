// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().nextGreatest(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java




class Solution {
    void nextGreatest(int arr[], int n) {
        // code here
       /* for(int i=0;i<n;i++)
        {
            if(i==n-1){
               arr[i]=-1;
               break;
            }
            if(i==n-2)
              arr[i]=arr[i+1];
            int max=arr[i+1];
            for(int j=i+2;j<n;j++)
            {
                if(max<arr[j])
                   max=arr[j];
            }
            arr[i]=max;  
        }*/
        
        int max=Integer.MIN_VALUE;
        int k=arr[n-1];
        for(int i=n-1;i>=1;i--)
        {
            if(k>max)
               max=k;
            k=arr[i-1];
            arr[i-1]=max;
        }
        arr[n-1]=-1;
    }
}
