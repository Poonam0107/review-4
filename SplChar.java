package com.review4;

import java.util.Scanner;

public class SplChar {

	public static void main(String[] args) {
		//String spl = "Poonam@Mane#0107&";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String spl = sc.next();
		spl = spl.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(spl);

	}

}
