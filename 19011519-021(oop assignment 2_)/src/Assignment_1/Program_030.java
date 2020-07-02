package Assignment_1;
import java.util.Scanner;

public class Program_030 {

	public static void main(String[] args) {
		
		int remainder,sum=0,temp;
		
		System.out.println("Enter a number to check whether it is plaindrome or not : ");
		Scanner a = new Scanner(System.in);
		int number = a.nextInt();
		  
		  temp=number;
		  while(number>0){
		   remainder=number%10;
		   sum=(sum*10)+remainder;
		   number=number/10;
		  }
		  if(temp==sum)
		   System.out.println("Entered Number is Palindrome");
		  else
		   System.out.println("Entered Number is not Palindrome");
		  
		  a.close();
	}

}
