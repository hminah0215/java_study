class  CallByValueTest
{
	//매개변수 n을 전달받아 n의 값을 1증가하여 출력하는 메소드를 정의 

	public static void plus( int n ){
		n = n + 1;
		//return ; 생략되어있음. 다시 호출된 곳으로 돌아가서 메소드로 복사된 값이 소멸됨. 
	}


	public static void main(String[] args) 
	{
		int n = 31;	
		plus( n );  //여기서 호출할때 가지고있던 값을 메소드안의 n에 복사해서 전달함. 
		System.out.println(n);  //원래 n의 결과 출력, 값에 의한 호출
	}
}
