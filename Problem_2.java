public class Problem_2 {

	public void evenFibonacciNumbers (){
		
		int limit=4000000,a=1,b=1,c=a+b, sum=0;
		
		while(c<limit){
			sum = sum + c;
			a=b+c;
			b=c+a;
			c=a+b;
		}
		
		System.out.print(sum);
		
	}
		
//		int febCount = 1000000, sum=0;
//        int[] feb = new int[febCount];
//        feb[0] = 1;
//        feb[1] = 2;
//        
//        for(int i=2; i < febCount; i++){
//    	
//        	feb[i] = feb[i-1] + feb[i-2];
//        	if(feb[i]>4000000){
//                break;
//            	}
//        }
//
//        for(int i=0; i< feb.length; i++){
//                if((feb[i]%2)==0){
//                	sum += feb[i];
//                }
//        }
//		System.out.print(sum);
	}
