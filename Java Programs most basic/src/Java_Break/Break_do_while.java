package Java_Break;

public class Break_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //declaring variable  
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	           //using break statement  
	           i++;  
	           break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);  

	}

}
