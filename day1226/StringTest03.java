class StringTest03 
{
	public static void main(String[] args) 
	{
		String data ="hello korea hello java";
		//�� ���ڿ��ȿ� k��� ���ڰ� ��� �ִ���? 6��°, 0���� ����. indexOf
		//int n = data.indexOf("k");
		//System.out.println(n);

		//int n = data.indexOf("s");
		//System.out.println(n); //ã�� ���ڰ� ������ -1 �� ����Ѵ�.  

		//int n = data.indexOf("hello");
		//System.out.println(n); // �ܾ ã�°͵� ����. 0��°��� ���´�.

		int n = data.lastIndexOf("hello");
		System.out.println(n);	// �ڿ������� ã�Ƽ� 12��� ��µ�.


	}
}
