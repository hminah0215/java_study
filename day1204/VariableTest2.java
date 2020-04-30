
class  VariableTest2
{
	public static void main(String[] args) 
	{
		//String name; //변수를 선언한다. 자바에선 반드시 변수 선언 후 사용해야함.
		int age;
		String name = "곽아름"; //위에서 선언안하고 이렇게도 사용가능함.
		age = 26;
		System.out.println(name);
		System.out.println(age); //26으로 출력됨

		age = 50; //변수의 값을 다른값으로 변경 26에서 50으로. 원래있던 26은 사라짐.
		System.out.println(name);
		System.out.println(age); // 여기선 50으로 출력됨
	} 
}
