package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n[] = new int[50];
        double p[] = new double[50];
        String s[] = new String[50];
        int num=0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            int i=0;
            while ((s[i] = br.readLine()) != null) {
                System.out.println(s[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
