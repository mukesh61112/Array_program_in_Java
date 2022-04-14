package com.company;

import java.util.Scanner;

public class Array_frequencyOfEachEle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            int count=0;
            int value=arr[i];
            if(value!=-1)
            {
                for(int j=0;j<size;j++)
                {
                    if(arr[j]==value)
                    {
                        arr[j]=-1;

                        count++;
                    }
                }
            }
            if(value!=-1)
                System.out.println("digit:"+value+","+"comes:"+count);

        }
    }
}
