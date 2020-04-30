class BreakAndContinueTest02
{
	public static void main(String[] args) 
	{
		int i;
		for(  i=1 ; i<=10 ; i++){
			if(  i %3 == 0 ){
					continue; //이 상황은 예외야 다음 반복문을 계속해! 반복문에서만 사용!
		}			//반복문 속에 있는 그 이후의 문장을 만나지 않음. 
					System.out.println(i); 
		}
		System.out.println("작업종료");
		System.out.println(i); //for를 끝까지 다 돌기때문에 11로 출력됨. 
	}
}
