package Assignment_1;

public class Program_015 {

	public static void main(String[] args) {
		
		int a = 20, b = 15, c = 25;
		
		//Logical AND
		System.out.println(a<b && a--<c);
		System.out.println(a);
		
		//Bitwise AND
		System.out.println(a<b & a--<c);
		System.out.println(a);
		
	}

}
