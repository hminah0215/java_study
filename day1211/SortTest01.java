//���� ������������ �����غ�
class SortTest01
{
	public static void main(String[] args) 
	{
		int []a ={ 8,36,14, 33,38,41 };
		
		for( int i=0 ; i <a.length ; i++ ){
			for (int j = i+1 ; j < a.length ; j++ ){
				if( a[j] > a[i] ){ //���� ��ȣ�� �ٲٸ� ���������� ������������ ����. 
					int temp ;  
					temp = a[i];
				     a[i] = a[j];
					 a[j] = temp;
			}
		}
	}
		
	for( int i=0 ; i < a.length ; i++ ){
		System.out.print( a[i] +" ");
	}
		
	}
}
