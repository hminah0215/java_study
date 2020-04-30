class TypeTest
{
	public static void main(String[] args) 
	{
		
	short i = 56;//기본적으로 int인데 short의 범위내에 있으면 됨
	float j = 56.7f;//근데 이건 안됨. 숫자뒤에 f를 붙이면 됨
	//float j = (flaot)56.7; 이렇게 해도 됨. 두가지방법이있음

	System.out.println(i);
	System.out.println(j);


	}
}
