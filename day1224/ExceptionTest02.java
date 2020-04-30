class ExceptionTest02
{
	public static void div(int a, int b) throws ArithmeticException {
										//예외 처리를 메소드안에서 하지않고 메인안에서 하도록할때 사용하는 throws 키워드! 
		int r = a/b;
		System.out.println("결과는 :" + r);
	}
	

	public static void main(String[] args) 
	{
	try{
		div(4,0);
	}catch(ArithmeticException e){
		System.out.println("0으로 나눌수없어요.");
		}
	}
}
