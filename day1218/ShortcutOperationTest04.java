class ShortcutOperationTest04
{
	public static void main(String[] args) 
	{
		int age1 = 28;
		int age2 = 31;

		if(	++age1 >= 30  &  ++age2 >= 30	){ 
			//& 하나짜리는 앞에게 만족하지 않아도 뒤에것도 확인하고 판단함. 
			System.out.println("두사람 모두 30살이 넘었어요");
		}else{
			System.out.println("조건을 만족하지 않습니다.");
		}
		System.out.println(age1); //29출력.
		System.out.println(age2);	//32출력.  
	}
	
}
/*
|| 두개짜리는 앞에가 트루면 뒤에걸 볼필요도 없이 참이라 확인안함
| 한개짜리는 앞에가 트루여도 뒤에것까지 굳이 확인함. 
*/