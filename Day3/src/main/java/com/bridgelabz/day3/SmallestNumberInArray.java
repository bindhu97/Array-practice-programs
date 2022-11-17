package com.bridgelabz.day3;

import java.util.Scanner;

public class SmallestNumberInArray {
   public static void main(String[] args)
   {
      int tot, i, small;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      tot = sc.nextInt();
      int[] arr = new int[tot];
      System.out.print("Enter " +tot+ " Numbers: ");
      for(i=0; i<tot; i++)
         arr[i] = sc.nextInt();
      
      small = arr[0];
      for(i=1; i<tot; i++)
      {
         if(small>arr[i])
            small = arr[i];
      }
      
      System.out.println("\nSmallest Number = " +small);
   }
}