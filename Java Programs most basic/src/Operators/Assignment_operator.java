package Operators;

public class Assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);
		short e=10;  
		short b=10;  
		//a+=b;//a=a+b internally so fine  
		e=(short) (e+b);//Compile time error because 10+10=20 now int  
		System.out.println(e); 
	}

}
