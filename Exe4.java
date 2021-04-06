package lab1;

import java.util.Scanner;

public class Exe4 {
	void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			count=0;
			for(int j=2;j<n/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1 || count==0)
			{
				System.out.print(i+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe4 ob=new Exe4();
		System.out.println("enter the number");
		int n=sc.nextInt();
		ob.prime(n);
		sc.close();

	}

}
