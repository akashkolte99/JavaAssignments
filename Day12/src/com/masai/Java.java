package com.masai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public  class Java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Para = input.nextLine();
		int count = 0;
		Pattern pattern = Pattern.compile("Java");
		Matcher m = pattern.matcher(Para);
		while(m.find()) {
			count++;
			System.out.println(m.start() + "-------" + m.end() + "-------" + m.group());
		}
		
		System.out.println("Total number of occurencies of Java - " + count);
	}
}
