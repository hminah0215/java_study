//정수 두개를 매개변수로 가지고 더하기 결과.

class BitUtil
{
	public void add( double a, double b){ 
		double r = a+b;
		System.out.println("더하기 결과: "+ r);
	}
	
}

class  MethodOverLoading02
{
	public static void main(String[] args) 
	{
		 BitUtil bu = new  BitUtil();
		 bu.add( 2.5 , 2.5);
		 bu.add( 2,2  ); 
	}
}
