class SwapTest 
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=7;
		System.out.println("a="+a);
		System.out.println("b="+b);

		//a�� b�� ����� ���� ���� �¹ٲپ� ������. 
		
		int q;//���� �ӽð����� temp�� ���� �Ѵٰ� ��. 
		q=a;
		a=b;
		b=q;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}