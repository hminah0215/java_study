class SwapTest2 
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=7;
		System.out.println("a="+a);
		System.out.println("b="+b);

		//a와 b에 저장된 값을 서로 맞바꾸어 보세요. 비트차연산을 활용해서.

		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
