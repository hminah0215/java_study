class  TypeTest2
{
	public static void main(String[] args) 
	{
		int a = 2+3;
		//double b = 2+3.0;
		int b = (int)(2+3.0) // 원하는 타입으로 형 변환하는 방법
		//int b = 2+3.0; 이거 실행하면 더블이니 인트에 못넣겠다.
		//인트를 더블로 바꾸거나 원하는 타입으로 형 변환
		
		System.out.println(a);
		System.out.println(b);
	}
}
