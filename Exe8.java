package lab1;

import java.util.Scanner;

public class Exe8 {
	void checkNumber(int n)
	{
		if (n == 0)
		{
			System.out.println("it is not a power of 2");
            return;
		}
         
        while (n != 1)
        {
            if (n % 2 != 0)
            {
            	System.out.println("it is not a power of 2");
                return;
            }
            n = n / 2;
        }
        System.out.println("it is a power of 2");
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe8 ob=new Exe8();
		System.out.println("enter the number");
		int n=sc.nextInt();
		ob.checkNumber(n);
		sc.close();

	}

}
