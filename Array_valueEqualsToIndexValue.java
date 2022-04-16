package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_valueEqualsToIndexValue {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        ValueEqualToIndexValue obj=new ValueEqualToIndexValue();
        ArrayList<Integer> ans=obj.valueEqualToIndexValue(arr,n);
        for(int i=0;i<ans.size();i++)
             System.out.print(ans.get(i)+" ");
    }
}
class ValueEqualToIndexValue
{
    ArrayList<Integer> valueEqualToIndexValue(int[] arr, int n){
        ArrayList<Integer> newArray=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i+1)
                newArray.add(i+1);

        }
        return newArray;
    }
}
