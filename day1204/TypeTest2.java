class  TypeTest2
{
	public static void main(String[] args) 
	{
		int a = 2+3;
		//double b = 2+3.0;
		int b = (int)(2+3.0) // ���ϴ� Ÿ������ �� ��ȯ�ϴ� ���
		//int b = 2+3.0; �̰� �����ϸ� �����̴� ��Ʈ�� ���ְڴ�.
		//��Ʈ�� ����� �ٲٰų� ���ϴ� Ÿ������ �� ��ȯ
		
		System.out.println(a);
		System.out.println(b);
	}
}
