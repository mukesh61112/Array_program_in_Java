package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_subArrayGivenSum {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n,s;
            n=sc.nextInt();
            s=sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n;i++)
                 arr[i]=sc.nextInt();

            SubarrayWithGivenSum obj=new SubarrayWithGivenSum();
            ArrayList<Integer> res=obj.subarraysum(arr,n,s);
            System.out.println();
            for(int i=0;i<res.size();i++)
                 System.out.print(res.get(i)+" ");

            --t;
        }
    }
}
class SubarrayWithGivenSum
{
    static ArrayList<Integer> subarraysum(int arr[] ,int n,int s)
    {
         ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
            a.add(-1);
         for(int i=0;i<n;i++)
         {
             int sum=0;

             for( int j=i;j<n;j++)
             {
                 sum=sum+arr[j];

                 if(sum>s)
                     break;
                 if(sum==s)
                 {
                     ans.add(i+1);
                     ans.add(j+1);
                     return ans;
                 }

             }

         }
        return a;
    }
}

