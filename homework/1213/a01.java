/*5) ������ �迭�� �Ű������� ���޹޾� �� �߿� ū���� ã�� �޼ҵ带 
	�����ڷ� ���� ���� �� �ֵ��� �ڽ��� �ڵ�� ���弼��. */


class  A01
{
	public static void maxx( int n[] ){
		int max = n[0];

		for( int i =1 ; i < n.length; i++){
			if( max < n[i]   ){
				max = n[i];
			}
		}
		System.out.print("���� ū ����: " + max);
	}


	public static void main(String[] args) 
	{
		int maxx [] = { 40,2,1,9,8 };
		maxx( maxx );
	}
}
