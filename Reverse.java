package CoreJAva;
import java.util.Scanner;


public class Reverse {
	//Creating main method
	public static void main(String[]args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		//Appling while loop
		
		int n1=0;
			while(n>0)
			{
				int r=n%10;
				n=n/10;
				n1=n1*10+r;
				{
					System.out.println("Reverse no:"+n1);
				}
			}
	}

}
