package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n[] = new int[50];
        double p[] = new double[50];
        String s[] = new String[50];
        for(int i=0;sc.next()!=null;i++)
        {
            n[i]= sc.nextInt();
            s[i]= sc.next();
            p[i]=sc.nextDouble();
        }

    }
}
