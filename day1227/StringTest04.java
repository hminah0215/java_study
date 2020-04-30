class StringTest04 
{
	public static void main(String[] args) 
	{
		String data ="안녕, 홍길동";
		String r  =data.replace("안녕","hello");
		System.out.println(r);	//hello,홍길동	출력
		System.out.println(data);	//안녕,홍길동 출력==변동없음. 스트링은 불변!

	}
}
