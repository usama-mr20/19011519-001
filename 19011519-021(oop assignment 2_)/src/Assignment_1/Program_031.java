package Assignment_1;

public class Program_031 {
	       
	    public static void main(String a[]){  
	        int[] array = {8,4,49,23,12,87,2,34};  
	        System.out.println("Before Selection Sorting");  
	        for(int x:array){
	            System.out.print(x+" ");
	        }
	        System.out.println("\n");
	        
	        
	        
	        for (int i = 0; i < array.length - 1; i++){
	            int count = i;  
	            for (int j = i + 1; j < array.length; j++){  
	                if (array[j] < array[count]){  
	                    count = j;
	                }  
	            }  
	            int smallerNumber = array[count];   
	            array[count] = array[i];  
	            array[i] = smallerNumber;  
	        }   
	        
	        System.out.println("After Selection Sorting");  
	        for(int k:array){
	            System.out.print(k+" ");
	        }
	  }

}
