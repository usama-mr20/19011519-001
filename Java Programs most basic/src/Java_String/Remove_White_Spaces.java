package Java_String;

public class Remove_White_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Remove white spaces";    
        
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
	}

}
