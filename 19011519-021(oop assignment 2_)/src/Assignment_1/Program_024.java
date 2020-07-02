package Assignment_1;
import java.util.Scanner;

public class Program_024 {

	public static void main(String[] args) {
		
			System.out.println("Please enter an alphabet : ");
			Scanner a = new Scanner(System.in);
			char ch = a.next().charAt(0);
			
		    switch(ch)
		    {
		        case 'a':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'e': 
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'i':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'o':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'u':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'A':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'E':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'I':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'O':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        case 'U':
		            System.out.println("Entered Alphabet is Vowel");
		            break;
		        default:
		            System.out.println("Entered Alphabet is Consonant");
		    }
		    
		    a.close();
	}

}
