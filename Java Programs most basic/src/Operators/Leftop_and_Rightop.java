package Operators;

public class Leftop_and_Rightop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);
	}

}
