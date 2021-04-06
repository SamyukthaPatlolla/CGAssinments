package lab1;
import java.util.*;
public class Exe6 {
	int calculateDifference(int n)
	{
		int difference=0;
		int sum1=0,sum2=0;
		
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+i;
			sum2=sum2+(i*i);
		}
		sum1=sum1*sum1;
		difference=sum1-sum2;
		return difference;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Exe6 ob=new Exe6();
		System.out.println("Enter the number");
		int n =s.nextInt();
		System.out.println("Required difference is "+ob.calculateDifference(n));
		s.close();
	}

}
