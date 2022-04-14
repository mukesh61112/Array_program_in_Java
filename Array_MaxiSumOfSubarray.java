package com.company;
import java.util.Scanner;
public class Array_MaxiSumOfSubarray {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
               arr[i]=sc.nextInt();
            Solution obj=new Solution();
            int ans=obj.maxSubArraySum(arr,n);
            System.out.print(ans);



            --t;
        }
    }
}
class Solution{
    static  int maxSubArraySum(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum>max)
                     max=sum;

            }
        }
        return max;
    }
}
