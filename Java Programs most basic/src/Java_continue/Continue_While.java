package Java_continue;

public class Continue_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //while loop  
		    int i=1;  
		    while(i<=10){  
		        if(i==5){  
		            //using continue statement  
		            i++;  
		            continue;//it will skip the rest statement  
		        }  
		        System.out.println(i);  
		        i++;  
		    }
	}

}
