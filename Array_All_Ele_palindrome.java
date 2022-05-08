package com.company;

import java.util.Scanner;

public class Array_All_Ele_palindrome {
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
       PalinArray obj=new PalinArray();
        System.out.println(obj.palinArray(array,size));
    }
}
class PalinArray
{
        int palinArray(int[] a, int n)
    {
        int temp=1;

        for(int i=0;i<n;i++)
        {
            int digit=a[i];
            int newDigit=0;
            while(digit!=0)
            {
                int rem=digit%10;
                digit/=10;
                newDigit=newDigit*10+rem;
            }
            if(newDigit!=a[i])
                return 0;
        }
        return 1;
    }
}
