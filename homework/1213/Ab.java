/*5) ������ �迭�� �Ű������� ���޹޾� �� �߿� ū���� ã�� �޼ҵ带 
	�����ڷ� ���� ���� �� �ֵ��� �ڽ��� �ڵ�� ���弼��. */


class  Ab
{
 public static void ken(int a[]){
	int b = a[0];
	for( int i = 1 ; i < a.length ; i++){
		if( b < a[i]){
			b = a[i];
		}	
	}
	System.out.print("���� ū ����: " + b);
 }


	public static void main(String[] args) 
	{
		int max[] = { 4,7,9,16,3,24};
		ken(max);

	}
}
