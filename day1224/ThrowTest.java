class ThrowTest 
{
	public static void main(String[] args) 
	{
		int a = 4/2;
		System.out.println(a);
		
		throw new ArithmeticException(); // 필요하다면 내가 직접 예외를 발생시킬수 있음.	
		
	}
}
