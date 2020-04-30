class  OverflowTest
{
	public static void main(String[] args) 
	{
		byte a;
		a = 127;
		a = (byte)(a + 1); //형 변환. 자료형을 변환해서 넣고싶어
		
		System.out.println(a);
	}
}
