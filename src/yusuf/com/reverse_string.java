package yusuf.com;

import java.util.Scanner;

public class reverse_string
{
   public static void main(String[] args)
   {
   System.out.println("Enter a string : ");
 
   Scanner read = new Scanner(System.in);
   String orginal = read.nextLine();
   String reversed = "";
   int k = orginal.length()-1;
 
     for(int i = k; i >= 0; i--)
     {
     reversed = reversed + orginal.charAt(i);
     }
 
   System.out.println("Reversed string:");
   System.out.println(reversed);
 }
}