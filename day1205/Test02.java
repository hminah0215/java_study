class Test02 
{
	public static void main(String[] args) 
	{
		int i = 3;
		int j = 3;
	
		int a = i++;//변수명 뒤에 있으면 나중에 증가해. =이 1번, ++가 2번
		//int a=i; i=i+1; 를 줄여놓은 것
		//i의 값은 a에 대입한 후 나중에 증가해요

		int b= ++j;//변수명 앞에 있으면 ++이 1번, =이 2번
		//j=j+1; int b =j; 를 줄여놓은 것
		//j의 값을 먼저 증가한 후 증가된 값이b에 대입된다.
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
	}
}
