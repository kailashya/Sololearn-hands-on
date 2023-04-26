package com.sololearn;
import java.util.*;
public class SecretMessage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		a.toLowerCase();
		String b="";
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if( c!= ' ')
			{
				if(Character.isUpperCase(c))
				{
					int d= c-65;
					int e= 91;
					int f=e-d;
					char g= (char)(f-1);
					char h=Character.toLowerCase(g);
					b+=h;
				}
				else
				{
					int d= c-97;
					int e= 122;
					int f=e-d;
					char g= (char)f;
					b+=g;
				}
				
			}
			else
			{
				b+=' ';
			}
		}
		System.out.println(b);
		
		/*
		char a='a';
		int c=a-97;
		System.out.println(c);
		int d=122;
		System.out.println(d);
		int e=d-c;
		System.out.println(e);
		char f=(char) (e);
		System.out.println(f);
		*/
	}
}
