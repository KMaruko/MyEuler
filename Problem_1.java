
public class Problem_1 {

	public void multilples3and5(){
		
		int i, sum=0;
		
		for(i=0; i<1000; i++){
			
			if((i%3)==0 || (i%5)==0){
				sum+=i;
			}
			
		}
		
		System.out.println(sum);
		
	}
	
}
