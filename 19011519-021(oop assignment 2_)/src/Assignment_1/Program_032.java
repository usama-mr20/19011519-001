package Assignment_1;

public class Program_032 {
	
	  public static int search(int[] searchArray, int key){    
	        for(int i=0;i<searchArray.length;i++){    
	            if(searchArray[i] == key){    
	                return i;    
	            }    
	        }    
	        return -1;    
	    }
	  
	  
	  public static void main(String[] args) {
			
			{
		        int[] array1= {5,10,15,20,25,30,35,40,45,50};    
		        int key = 35;    
		        System.out.println(key+" is found at index: "+search(array1, key)); 
			}
	}

}
