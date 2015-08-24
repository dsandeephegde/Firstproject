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
        String s[] = new String[150];
        String st[] =new String[50];
        double tax[] = new double[50];
        double t[] =new double[50];
        int num=0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/Users/sandeeph/IdeaProjects/Firstproject/src/com/company/input.txt"));
            int i=0,j=0,k=0,l=0;
            while ((s[i] = br.readLine()) != null) {
                if(i%3==0)n[j++] = Integer.valueOf(s[i]);
                if(i%3==1)st[k++] = s[i];
                if(i%3==2)p[l++] = Double.valueOf(s[i]);
                //System.out.println(s[i]);
                i++;
            }
            num=i/3;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0;i<num;i++)
        {
            tax[i]=0;
            if(st[i].contains("import"))
                tax[i]+=0.05;
            if(!(st[i].contains("book")||st[i].contains("food")||st[i].contains("chocolate")||st[i].contains("pills")||st[i].contains("tablet")))
                tax[i]+=0.1;
            t[i] = p[i]*tax[i];
            p[i] += t[i];
        }
        for(int i=0;i<num;i++)
        {
            System.out.println(n[i]);
            System.out.println(st[i]);
            System.out.println(p[i]);
            System.out.println(t[i]);
        }

    }
}
