class  CallByValueTest
{
	//�Ű����� n�� ���޹޾� n�� ���� 1�����Ͽ� ����ϴ� �޼ҵ带 ���� 

	public static void plus( int n ){
		n = n + 1;
		//return ; �����Ǿ�����. �ٽ� ȣ��� ������ ���ư��� �޼ҵ�� ����� ���� �Ҹ��. 
	}


	public static void main(String[] args) 
	{
		int n = 31;	
		plus( n );  //���⼭ ȣ���Ҷ� �������ִ� ���� �޼ҵ���� n�� �����ؼ� ������. 
		System.out.println(n);  //���� n�� ��� ���, ���� ���� ȣ��
	}
}
