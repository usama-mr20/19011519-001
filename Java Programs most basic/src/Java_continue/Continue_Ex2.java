package Java_continue;

public class Continue_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //outer loop  
        for(int i=1;i<=3;i++){    
                //inner loop  
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2){    
                        //using continue statement inside inner loop  
                        continue;    
                    }    
                    System.out.println(i+" "+j);    
                }    
        }
	}

}
