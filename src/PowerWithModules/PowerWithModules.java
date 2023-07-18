package PowerWithModules;

import java.util.*;

public class PowerWithModules {
	
	public static int value(int number,int power,int p)
	{
		int result =1;
		for(int i =1;i <= power;i++)
		{
			result *= number;
		}
		return result % p;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int power = scan.nextInt();
		int  p = scan.nextInt();
		int print = value(number,power,p); 
		System.out.println(print);

	}

}
