public class Problem_4 {

	public void largestPalindromeProduct(){
		
		int n, a=100, b=100, mai = 0;
		Problem_4_Extension p4e = new Problem_4_Extension();
		
		while(a<1000){
			
			while(b<1000){
				n = a*b;
				
				if(p4e.check(n)){
					if(n>mai){
						mai = n;
					}
				}
				
				b++;
			}
			
			b=100;
			
			a++;
			
		}
		
		System.out.print(mai);
	}
}
