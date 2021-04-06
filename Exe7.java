package lab1;

import java.util.Scanner;

public class Exe7 {
	void checkNumber(int n)
	{
		int rem1=10,rem2=0;
		while(n>0)
		{
			rem2=n%10;
			if(rem1<rem2)
			{
				System.out.println("It is not an increasing number");
				return;
			}
			rem1=rem2;
			n=n/10;
		}
		System.out.println("It is an increasing number");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Exe7 ob=new Exe7();
		System.out.println("enter the number");
		int n=sc.nextInt();
		ob.checkNumber(n);
		sc.close();
	}

}
