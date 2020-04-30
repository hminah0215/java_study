class  StringTest03
{
	public static void main(String[] args) 
	{
		String str ="hello";
		str = str+ " korea";
		System.out.println(str);
		//결과물은 바뀐것 같지만, 더이상 쓰지않는 hello같은 것들이 쌓여서 비효율적.
		//계속 다른 메모리를 생성한다. 오류가안나고 동작은 하지만 변하는 문자를 빈번하게 만들어야 한다면 
		//버퍼나, 빌더를 쓰자.
	}
}
