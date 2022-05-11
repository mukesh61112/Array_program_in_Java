// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int arr[], int n, int x, int y) {
      /*  int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if ((x == arr[i] && y == arr[j]
                     || y == arr[i] && x == arr[j])
                    && min_dist > Math.abs(i - j))
                    min_dist = Math.abs(i - j);
            }
        }
        if (min_dist > n) {
            return -1;
        }
        return min_dist;
        */
          int i=0,p=-1, min_dist=Integer.MAX_VALUE;
     
    for(i=0 ; i<n ; i++)
    {
        if(arr[i] ==x || arr[i] == y)
        {
            //we will check if p is not equal to -1 and
            //If the element at current index matches with
            //the element at index p , If yes then update
            //the minimum distance if needed
            if(p != -1 && arr[i] != arr[p])
                min_dist = Math.min(min_dist,i-p);
              
            //update the previous index
            p=i;
        }
    }
    //If distance is equal to int max
    if(min_dist==Integer.MAX_VALUE)
       return -1;
    return min_dist;
    }
}
