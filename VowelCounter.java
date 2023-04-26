package com.sololearn;

import java.util.Scanner;


public class VowelCounter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
		String c=a.toLowerCase();
		
		//System.out.println(a);
		int b=0;
		for(int i=0;i<c.length();i++)
		{
			if(c.charAt(i) =='a' ||c.charAt(i) =='e' || c.charAt(i) =='i' ||c.charAt(i) =='o' ||c.charAt(i) =='u' )
			{
				b+=1;
			}
		}
		System.out.println(b);
    }
}
