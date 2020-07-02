package Java_continue;

public class Continue_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //declaring variable  
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	                //using continue statement  
	                 i++;  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);
	}

}
