class Test02 
{
	public static void main(String[] args) 
	{
		int i = 3;
		int j = 3;
	
		int a = i++;//������ �ڿ� ������ ���߿� ������. =�� 1��, ++�� 2��
		//int a=i; i=i+1; �� �ٿ����� ��
		//i�� ���� a�� ������ �� ���߿� �����ؿ�

		int b= ++j;//������ �տ� ������ ++�� 1��, =�� 2��
		//j=j+1; int b =j; �� �ٿ����� ��
		//j�� ���� ���� ������ �� ������ ����b�� ���Եȴ�.
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
	}
}
