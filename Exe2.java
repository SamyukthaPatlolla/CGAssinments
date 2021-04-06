package lab1;
import java.util.*;
public class Exe2 {
	void trafficLights(String light)
	{
		switch(light)
		{
			case "red":System.out.println("STOP");
					break;
			case "yellow":System.out.println("READY");
			break;
			case "green":System.out.println("GO");
			break;
			default:System.out.println("wrong input");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exe2 ob = new Exe2();
		System.out.println("Select the red or yellow or green light ");
		String light=sc.next();		
		ob.trafficLights(light);
		sc.close();
	}

}
