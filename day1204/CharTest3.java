class CharTest3 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		String data = "hello java hello korea";
		int n = data.length();

		System.out.println("문자열의 길이" +n);

		//data = "홍길동"; 위에데이터 내용을 바꿈 

//data의 캐릭터 charat 사용해서 0부터 n까지 할필요없이 for문 사용

	for(int i=0 ; i < n ; i=i+1)
		{
	char ch = data.charAt(i);
//데이터 문장의 첫번째 자리부터 n번째 자리까지가야하니까 i가n보다 작을때까지
	if( ch == 'a' )
	//== 쓰면 ~인가요? 묻는거임.

			cnt = cnt +1;
		}
		
	System.out.println("소문자 a의 수는 " +cnt);
	}
}
