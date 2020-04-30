class SwapTest 
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=7;
		System.out.println("a="+a);
		System.out.println("b="+b);

		//a와 b에 저장된 값을 서로 맞바꾸어 보세요. 
		
		int q;//보통 임시공간은 temp로 많이 한다고 함. 
		q=a;
		a=b;
		b=q;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
