package Variables;

public class Adding_Lower_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;  
		byte b=10;  
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte c=(byte)(a+b);  
		System.out.println(c); 
	}

}
