class ReturnMethodTest02 
{
	//void�� ��ȯ�ϴ� ���� ������! ���� ��ȯ�ǹǷ� ���ϰ��� �ڷ����� �Է��Ѵ�.
	public static int plus( int a, int b){ 
		
		int r = a + b;
		return r;  //r�� ������ �ǵ��ư�. ���ϰ��� �������� �޼ҵ�տ� ���ϰ��� Ÿ���� ������. 
	}


	public static void main(String[] args)  
	{
		int r = plus(2,3);
		System.out.println("��� " + r);

	}
}