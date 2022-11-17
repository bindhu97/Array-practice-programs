package com.bridgelabz.day3;

import java.util.Scanner;

public class PrintArray {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int i, Number;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Number = sc.nextInt();	
		
		int [] Array = new int[Number];
		
		System.out.print(" Please Enter " + Number + " elements of an Array  : ");
		for (i = 0; i < Number; i++)
		{
			Array[i] = sc.nextInt();
		}     
	 
		System.out.println("\n **** Elements in this Array are  **** ");
		for (i = 0; i < Number; i++)
		{
			System.out.print(Array[i] + "\t");
		}
	}
}