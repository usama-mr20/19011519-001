package Assignment_1;

public class Program_022 {

	public static void main(String[] args) {
		
		 float marks=87;  
	      
		    if(marks>=0 && marks<50){
		        System.out.println("Fail");
		    }
		    else if(marks>=50 && marks<60){
		        System.out.println("D Grade");
		    }
		    else if(marks>=60 && marks<70){
		        System.out.println("C Grade");
		    }
		    else if(marks>=70 && marks<75){
		        System.out.println("B- Grade");
		    }
		    else if(marks>=75 && marks<80){
		        System.out.println("B+ Grade");
		    }
		    else if(marks>=80 && marks<84.5){
		        System.out.println("A Grade");
		    }
		    else if(marks>=84.5 && marks<=100){
		        System.out.println("A+ Grade");
		    }
		    else{
		        System.out.println("Invalid Marks!");
		    }

	}

}
