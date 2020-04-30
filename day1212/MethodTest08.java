class MethodTest08 
{
	public static void writeArr( int []a ){  //매개변수이름은 같아도 달라도 노상관.
		for( int i = 0 ; i < a.length; i++ ){
			System.out.print( a[i] +" ");
		}
			System.out.println();
	}

	public static void main(String[] args) 
	{

	int []age = { 28,31,20,30,18,24,25 };
	writeArr( age );

	int []kor = { 100,60,70 };
	writeArr( kor );

	}
}
