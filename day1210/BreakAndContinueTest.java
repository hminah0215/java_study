class BreakAndContinueTest 
{
	public static void main(String[] args) 
	{
		int i;
		for(  i=1 ; i<=10 ; i++){
			if(  i %3 == 0 ){
					break; //반복문을 그만하고 탈출해 for를 탈출. 반복문과 스위치에서 사용됨
		}
					System.out.println(i); 
		}
		System.out.println("작업종료");
		System.out.println(i);
	}
}
