package lab1;

import java.util.Scanner;
	
public class Exe3 {
	void fibonacci(int n)
	{
		int f1=0;
		int f2 =1;
		int f3;
		if(n==1)
		{
			System.out.println("last element is 1");
		}
		for(int i=1;i<n;i++)
		{
			f3=f1+f2;
			if(i==n-1)
			{
				System.out.println("last element is "+f3);
			}
			f1=f2;
			f2=f3;	
		}
		
	}
	int reFib(int n)
    {
    if (n <= 1)
       return n;
    return reFib(n-1) + reFib(n-2);
    }    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe3 ob=new Exe3();
		System.out.println("enter the number");
		int n=sc.nextInt();
		ob.fibonacci(n);
		System.out.println("last fib number using recursion is "+ob.reFib(n));
		sc.close();

	}

}
