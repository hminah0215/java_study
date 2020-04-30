class ReturnMethodTest02 
{
	//void는 반환하는 값이 없을때! 여긴 반환되므로 리턴값의 자료형을 입력한다.
	public static int plus( int a, int b){ 
		
		int r = a + b;
		return r;  //r을 가지고 되돌아가. 리턴값이 있을때는 메소드앞에 리턴값의 타입을 적어줌. 
	}


	public static void main(String[] args)  
	{
		int r = plus(2,3);
		System.out.println("결과 " + r);

	}
}
