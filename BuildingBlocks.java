package com.sololearn;

import java.util.Scanner;
//BuildingBlocks
public class BuildingBlocks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[] =new int[4];
		int b=0;
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			if(a[i]%15==0)
			{
				continue;
			}
			else
			{
				b+=a[i]%15;
			}
		}
		System.out.println(b);
	}

}
