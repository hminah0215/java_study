//java AddTest 2 4 
//2�� 4�� ���ϱ� �ش޶�� ���α׷��� ������� �Ѵ�. ����ÿ�. 

class  AddTest
{
	public static void main(String[] args)//�ڹ��� ������ ��Ʈ��! � �����͵� ���� �� �ְ�.  
	{
		int a = Integer.parseInt( args[0] ); 
		// Integer.parseInt( "1000"  ) ���ڸ� ���ڷ� ����� �ּ���. 
		int b =  Integer.parseInt( args[1] );
		 int r = a+ b;
		 System.out.println("���ϱ� ��� : "+ r);
	}
}
