/*1) ������ �迭�� �Ű������� ���޹޾� �� �߿� ū���� ã�� �޼ҵ带 
	�����ڷ� ���� ���� �� �ֵ��� �ڽ��� �ڵ�� ���弼��. */


class  Hw01
{
	public static void ken( int a[] ){
		int max = a[0];

		for( int i = 1 ; i < a.length ; i++ ){
			if ( max < a [i]){
				max = a[i];
			}	
		}
			System.out.print("���� ū ����: " + max);
	}
	
	
	public static void main(String[] args) 
	{
		int ken []= { 6,1,8,13,4  };
		ken(  ken );
	}
}