//Runtime Exception�� �ļ��̱⶧���� throws�� ������ ���ο� Ʈ����,ĳġ ����ó�� ���ص� �ڹٿ��� ����ó�� ����.
class ExceptionTest03
{
	public static void div(int a, int b) throws ArithmeticException {
										
		int r = a/b;
		System.out.println("����� :" + r);
	}
	

	public static void main(String[] args) 
	{

		div(4,0);

	}
}

