package weekendnew4pm;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
	   for(int i=1;i<n;i++)
	   {
		   if(n%i==0)
			   sum=sum+i;
	   }
	   if(sum==n)
	   
		   System.out.println("perfect number");
	   
	   else
	   
		   System.out.println("not a perfect number");
	   
	    
	  
	    	}


}

