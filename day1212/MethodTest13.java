class MethodTest13 
{
	public static void printFactorial( int a ){
		int mul = 1;
		for( int i=a ; i >= 1; i--){							//5*4*3*2*1
			mul *= i;
		} 
		
		System.out.println(a+ " ���丮����: "+ mul);		

	}
	public static int getFactorial( int a ){
		int r = 1;
			for(int i = 1 ; i <= a ; i++){					//1*2*3*4*5
				r *= i;
			} 
			return r;
		}


	public static void main(String[] args) 
	{
		printFactorial(5);		//n�� �Ű������� ���޹޾� n!�� ���
		
		int r = getFactorial(5); // n�� �Ű������� ���޹޾� n!�� ���Ͽ� ��ȯ
		System.out.println(r);
	}
}