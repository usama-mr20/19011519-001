package Assignment_1;

public class Program_028 {

	public static void main(String[] args) {
		
		int number_1=0,number_2=1,number_3;
		System.out.print(number_1+" "+number_2);
		for(int i=1;i<10;++i)
		 {
		  number_3=number_1+number_2;
		  System.out.print(" "+number_3);
		  number_1=number_2;
		  number_2=number_3;
		 }    

	}

}
