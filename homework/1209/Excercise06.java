class Excercise06 
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		for ( int i=10 ; i <=30  ; i++ ){			//21번
		
			for( int j=0 ; j <=5 ; j++){				//6번
			
			sum += i * j;		//이 문장은 총 (21*6번)= 126번 동작해요.
			//sum= sum+(i*j) 와 같은결과.
			
			}
			
			
		}
		System.out.println("결과:" +sum);
	}
}
