package Variables;
public class Adding_and_declarations {

	int a =50;// instant variable 
	static int b = 100 ;// static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		// Addition
		int c = 10;
		int d = 5;
		int sum;
		sum = c+d;
		System.out.println("sum ="+sum);
		int a=10;  
		float f=a;  
		System.out.println(a);  
		System.out.println(f);
		
	}

	public static void method() {
		int n = 90;//local variable
		System.out.println(n);
	}
}
