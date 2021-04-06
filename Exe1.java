package lab1;

import java.util.Scanner;

public class Exe1 {
	int sumOfCubes(int n)
	{
		int sum=0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe1 ob=new Exe1();
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of cubes is "+ob.sumOfCubes(n));
		sc.close();
	}

}
