package Assignment_1;
import java.util.Scanner;
public class Program_029 {

	public static void main(String[] args) {
	
		int m=0,flag=0;
		
		System.out.println("Enter a number to check whether it is prime or not : ");
		Scanner a = new Scanner(System.in);
		int number = a.nextInt();
		
		m=number/2;
		if(number==0||number==1){
		System.out.println(number+" is not a prime number");
		}else{
		for(int i=2;i<=m;i++){
		if(number%i==0){
		System.out.println(number+" is not a prime number");
		flag=1;
		break;
		}
		}
		if(flag==0)  { System.out.println(number+" is a prime number"); }
		}
		a.close();
	}

}
