package com.Day3;

public class VowelsConsonants {

	char a;
	
	void fun1() {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			System.out.println("vowel");
		}
		else   if(a=='b'||a=='c'||a=='d'||a=='f'||a=='g'||a=='h'||a=='j'||a=='k'||a=='l'||a=='m'||a=='n'||a=='p'||a=='q'||a=='r'||a=='s'||a=='t'||a=='v'||a=='w'||a=='x'||a=='y'||a=='z') {
			System.out.println("consonant");
		}
	 else {
		System.out.println("invalid character");
	}
  }
	
	public static void main (String[] args) {
		VowelsConsonants VC1 = new VowelsConsonants();
		
		VC1.a='@';
		
		VC1.fun1();
		
	}
}


//VOWEL AND CONSONANT
//Write a java application with a non-static method that will accept a character (a-z or A-Z) and print if that character is vowel or consonant, if we supply other than (a-z or A-Z) then that method should print the error message.
//
//Call the above method from the main method of the same class 3 times,
//
//first time by supplying a vowel
//
//the second time by supplying a consonant
//
//third time by supplying an invalid character