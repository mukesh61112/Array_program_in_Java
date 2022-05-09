package com.company;

import java.util.Scanner;

public class Array_rotedByOne {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();
        RotetedByOne obj=new RotetedByOne();
        obj.rotetedByOne(arr,n);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);

    }
}
class RotetedByOne{
     void rotetedByOne(int arr[],int n)
     {
         int temp=0;
         for(int i=0;i<n;i++)
         {

             if(i==0)
             {
                 temp=arr[0];
                 arr[0]=arr[n-1];
             }
             else if(i==n-1)
                 arr[i]=temp;
             else{
                 temp=temp+arr[i];
                 arr[i]=temp-arr[i];
                 temp=temp-arr[i];
             }


         }
     }

}
