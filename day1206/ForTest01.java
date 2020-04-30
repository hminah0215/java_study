//화이팅을 5섯번 출력하게 만들자.

class ForTest01 
{
	public static void main(String[] args) 
	{
		int b;
		//for(int b=1 ; b<=5 ; b++ )
		// for(int b=100;b<=500;b=b+100)
		for(b=5 ; b>=1 ; b-- )
		{
			System.out.println("화이팅!");
		}
		System.out.println("작업종료");
		System.out.println(b); 
		//중괄호 밖에서 b값을 확인하고 싶다면 for 괄호안이 아니라 위에서 변수 선언.
		
	}
}
