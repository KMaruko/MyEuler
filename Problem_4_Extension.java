
public class Problem_4_Extension {

	public boolean check (int n){
		
	int r,sum=0,temp ;    
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10; 
	   sum=(sum*10)+r;    
	   n=n/10;    

	  }    
	   
	   if(temp==sum){
		   
		return true;
		   
		  }
	  return false;
	}  
	
}

