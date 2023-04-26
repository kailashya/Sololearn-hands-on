package com.sololearn;

import java.util.Scanner;

public class TextDecompressor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="";
		String e="";
		for(int i=0;i<a.length();i++)
		{
			char d=a.charAt(i);
			if(Character.isDigit(d))
			{
				int c=Character.getNumericValue(d);
				//b+=Integer.toString(a.charAt(i-1)*c);
				
				for(int j=0;j<c;j++)
				{
					e+=a.charAt(i-1);
				}
				b+=e;
				
			}
		}
		System.out.println(b);

	}

}
