package Java_continue;

public class Continue_Ex3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using continue statement with label  
                            continue aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }  
	}

}
