package  weekendnew4pm;
import java.util.Scanner;
public class ifelse{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%18==0)
			System.out.println("eligible for voting");
		else
		{
			System.out.println("not eligible for voting");
		}
		
	

	}

}
