class MethodTest11 
{
	//정수형 변수n을 매개변수로 전달받아 n의 약수를 모두 출력하는 메소드를 만들어 봅니다. 
public static void printDivisor(int a){
			System.out.println(a + "의 약수는 다음과 같습니다.");

		for ( int i = 1; i <=a ; i++ ){
			if ( a %i == 0 ){
				
				System.out.print(i+" ");
			}
				
		}
			System.out.println();
}



	public static void main(String[] args) 
	{
	
	printDivisor(8);
	printDivisor(10);
	}
}
