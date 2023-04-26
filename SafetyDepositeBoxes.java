package com.sololearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SafetyDepositeBoxes {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		List c=new ArrayList();
		String d[]=a.split(",");
		for(int i=0;i<d.length;i++)
		{
			c.add(d[i]);
		}
		int j=c.indexOf(b);
		int k=(j+1)*5;
		System.out.println(k);
	}
}
