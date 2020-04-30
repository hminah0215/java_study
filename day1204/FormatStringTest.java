class FormatStringTest 
{
	public static void main(String[] args) 
	{
		String name = "유관순";
		int age = 16;
		double height = 150.8;
		System.out.printf("내 이름은 %s이고 나이는 %d살이고 키는 %.2f입니다" ,name,age,height);
												//소수점2째자리까지 나오게 .2!!
	}
}
