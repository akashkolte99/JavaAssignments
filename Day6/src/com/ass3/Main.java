package com.ass3;

import java.util.Arrays;

public class Main{
	
	public boolean checkprime(int num) {
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return  false;
			}
		}
		return true;
	}
 public int[] findAndReturnPrimeNumbers(int[] arr){
//write the logic to iterate through the supplied inputArray and
//determine each element whether it is prime or not
//create a second array of int
//if any number is prime inside the inputArray then add that number inside the second
//array
//and return the second array
//if no prime number is found then return the empty array.
	 int x =7;
	 int primearr[]= new int[x]; 
	 
	 for(int i=0;i<arr.length;i++) {
		 if(checkprime(arr[i])==true) {
			 primearr[i]=arr[i];
		 }
	 }

	return primearr;
 }
  public static void main(String[] args){
//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
	  Main m = new Main();
  int[] arr = {10,12,5,50,11,14,15};
 int[] x = m.findAndReturnPrimeNumbers(arr);
// System.out.println(Arrays.toString(x));
 String bag="";
	 for(int i=0;i<x.length;i++) {
		 if(x[i]!=0) {
			 bag+=x[i]+" ";
		 }
	 }
	 
	 if(bag.length()>0) {
		 System.out.println(bag);
 }else {
	 System.out.println("No Prime Number Is Found");
 }
//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following
//message:
// 
  }
}