class CharTest3 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		String data = "hello java hello korea";
		int n = data.length();

		System.out.println("���ڿ��� ����" +n);

		//data = "ȫ�浿"; ���������� ������ �ٲ� 

//data�� ĳ���� charat ����ؼ� 0���� n���� ���ʿ���� for�� ���

	for(int i=0 ; i < n ; i=i+1)
		{
	char ch = data.charAt(i);
//������ ������ ù��° �ڸ����� n��° �ڸ����������ϴϱ� i��n���� ����������
	if( ch == 'a' )
	//== ���� ~�ΰ���? ���°���.

			cnt = cnt +1;
		}
		
	System.out.println("�ҹ��� a�� ���� " +cnt);
	}
}
