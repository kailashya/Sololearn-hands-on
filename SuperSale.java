package com.sololearn;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SuperSale {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a= sc.nextLine();
		String []b=a.split(",");
		List c=new ArrayList();
		double f=0;
		for(int i=0;i<b.length;i++)
		{
			double d=Double.parseDouble(b[i]);
			c.add(d);
		}
		Collections.sort(c);
		for(int i=0;i<c.size()-1;i++)
		{
			double e=(double)c.get(i)*0.3;
			f+=e;
		}
		double g=f*1.07;
		int h=(int)g;
		System.out.println(h);
	}

}
