package stepDefinition;

import java.math.BigInteger;
import java.util.Scanner;

public class divideClass {

	
	public void main(String[] args) {
	    String int1, int2;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Enter the first number");
	    int1 = in.nextLine();
	 
	    System.out.println("Enter the second number");
	    int2 = in.nextLine();
	 
	    BigInteger first  = new BigInteger(int1);
	    BigInteger second = new BigInteger(int2);
	    BigInteger sum;
	   
	    sum = first.divide(second);
	       
	    System.out.println("Your Total is = " + sum);
	    in.close();
	  }
	
}
