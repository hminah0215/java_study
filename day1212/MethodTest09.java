class MethodTest09 
{
	//정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 출력하는 메소드 정의

	public static void maxArr( int []a ){  
		int mm=a[0];
		
		for(int i = 1; i < a.length; i++ ){
				if( mm < a[i]  ){
				 mm = a[i];	
				}		
		}
		System.out.println("가장 큰 수는: " + mm);	
	}

	public static void main(String[] args) 
	{

	int []age = { 28,31,20,30,18,24,25 };
	int []kor = { 100,60,70 };

	maxArr(age);
	maxArr(kor);


	}
}
