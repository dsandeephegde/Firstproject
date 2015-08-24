package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n[] = new int[50];
        double p[] = new double[50];
        String s[] = new String[50];
        int num=0;
        for(int i=0;sc.next()!=null;i++)
        {
            n[i]= sc.nextInt();
            s[i]= sc.nextLine();
            p[i]=sc.nextDouble();
            num=i;
        }

        for(int i=0;i<num;i++)
        {
            System.out.print(n[i]);
            System.out.print(s[i]);
            System.out.print(p[i]);
        }
    }
}
