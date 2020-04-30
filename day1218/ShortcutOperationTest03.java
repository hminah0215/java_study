class ShortcutOperationTest03
{
	public static void main(String[] args) 
	{
		int age1 = 28;
		int age2 = 31;

		if(	++age1 >= 30  &&  ++age2 >= 30	){ 
			//&& 두개짜리는 앞의 age1이 만족하지 않으니까 뒤에것을 판단하지 않음
			System.out.println("두사람 모두 30살이 넘었어요");
		}else{
			System.out.println("조건을 만족하지 않습니다.");
		}
		System.out.println(age1); //29출력,앞에것은 확인해서 판단을 내렸으니.
		System.out.println(age2);	//31출력, 뒤에것은 앞에것이 만족하지 않아 동작하지 않음. 
	}
	
}
