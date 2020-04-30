class StringTest03 
{
	public static void main(String[] args) 
	{
		String data ="hello korea hello java";
		//이 문자열안에 k라는 문자가 어디에 있는지? 6번째, 0부터 센다. indexOf
		//int n = data.indexOf("k");
		//System.out.println(n);

		//int n = data.indexOf("s");
		//System.out.println(n); //찾는 문자가 없으면 -1 을 출력한다.  

		//int n = data.indexOf("hello");
		//System.out.println(n); // 단어를 찾는것도 가능. 0번째라고 나온다.

		int n = data.lastIndexOf("hello");
		System.out.println(n);	// 뒤에서부터 찾아서 12라고 출력됨.


	}
}
