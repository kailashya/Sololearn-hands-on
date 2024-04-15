package com.sololearn.handson;

import java.util.Scanner;

public class CMYKtoRGB {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double c=sc.nextDouble();
		double m=sc.nextDouble();
		double y=sc.nextDouble();
		double k=sc.nextDouble();
		
		String res="";
		
		double r= 255*(1-c)*(1-k);
		double g= 255*(1-m)*(1-k);
		double b= 255*(1-y)*(1-k);
		int R =(int) Math.round(r);
		int G =(int) Math.round(g);
		int B =(int) Math.round(b);
		
		res+=Integer.toString(R)+","+Integer.toString(G)+","+Integer.toString(B);
		
		System.out.println(res);
	}

}
