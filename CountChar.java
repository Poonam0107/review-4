package com.review4;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		String str;
		int i,length;
		int counter[] = new int[1000];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String :");
		str = scanner.nextLine();
		 length = str.length();
		 for(i=0;i<length;i++)
		 {
			 counter[(int)str.charAt(i)]++;
		 }
		 for(i=0;i<1000;i++)
		 {
			 if(counter[i]!=0)
			 {
				 System.out.println((char) i + "="+ counter[i]);
			 }
		 }
	}

}
