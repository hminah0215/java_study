//����
class SortTest 
{
	public static void main(String[] args) 
	{
		int []a ={ 8,36,14, 33,38,41 };
		
		for( int i=0 ; i < a.length ; i++ ){
			for (int j = i+1 ; j < a.length ; j++ ){
				if( a[j] < a[i] ){ //��������.���ϴ� j�� ��(i)���� ������
					int temp ;  //�����ϱ� �ӽú����� �־� �ڸ��� �ٲ���. 
					temp = a[i];
				     a[i] = a[j];
					 a[j] = temp;
			}   
		}
	}
		
	for( int i=0 ; i < a.length ; i++ ){
		System.out.print( a[i] +" ");
	}
		//8, 14, 33, 36, 38, 41 ���������� ������� (Ȥ�� �ݴ��)������ �ϴ°� ����.
	}
}
