package CoreJAva;

import java.util.Scanner;

public class Leapyear {
	//Creating main method
	public static void main(String[]args)
	{
		//creating scabber object class
		Scanner sc=new Scanner(System.in);
		//taking input from the user
		System.out.println("Enter the year");
		int year=sc.nextInt();
		//Appling conditions
		
		if((year%400==0)||(year%4==0 &&year%100!=0))
		{
			System.out.println(year+" This is a leap " );
		}
		else 
		{
			System.out.println(year+"not leap year");
		}
	}
}
