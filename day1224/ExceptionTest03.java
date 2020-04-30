//Runtime Exception의 후손이기때문에 throws로 던지고 메인에 트라이,캐치 예외처리 안해도 자바에서 예외처리 해줌.
class ExceptionTest03
{
	public static void div(int a, int b) throws ArithmeticException {
										
		int r = a/b;
		System.out.println("결과는 :" + r);
	}
	

	public static void main(String[] args) 
	{

		div(4,0);

	}
}

