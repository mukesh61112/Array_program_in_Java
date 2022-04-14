package com.company;

import java.util.Scanner;

public class Array_leftRoted {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();

        int k=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(i<(n-k))
               arr[i]=arr[i+k];
            else
            {
                int p=n-(i+k);
                if(p<0)
                {
                    p=-p;
                }
            }

        }

    }

}
