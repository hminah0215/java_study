class ExceptionTest02
{
	public static void div(int a, int b) throws ArithmeticException {
										//���� ó���� �޼ҵ�ȿ��� �����ʰ� ���ξȿ��� �ϵ����Ҷ� ����ϴ� throws Ű����! 
		int r = a/b;
		System.out.println("����� :" + r);
	}
	

	public static void main(String[] args) 
	{
	try{
		div(4,0);
	}catch(ArithmeticException e){
		System.out.println("0���� �����������.");
		}
	}
}