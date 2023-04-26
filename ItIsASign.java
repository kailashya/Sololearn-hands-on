package com.sololearn;
import java.util.Scanner;

public class ItIsASign {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String a=sc.next();
		int f=0;
		//String[] ar= {"MaM","HIhk"};
		String ar[]=new String[4];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.next();
		}
		for(int i=0;i<ar.length;i++)
		{
			StringBuffer b=new StringBuffer(ar[i]);
			b.reverse();
			
			
			String c=b.toString();
			if(ar[i].equalsIgnoreCase(c))
			{
				f++;
				//System.out.println(f);
				//System.out.println("It is a palindrome");
			}
			else {
				//System.out.println("It is not a palanindrome");
			}
		}
		if(f>=1)
		{
			System.out.println("Open");
		}
		else
		{
			System.out.println("Trash");
		}
	}

}
