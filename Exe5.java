package lab1;
import java.util.*;
public class Exe5 {
	int calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0  ||  i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe5 ob=new Exe5();
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("Required sum is "+ob.calculateSum(n));
		sc.close();
	}

}
