//�迭�߿� ū��ã��

class	MaxofArray03
{
	public static void main(String[] args) 
	{
		int []a = { 10, 31, 10, 11, 100 };
		
		int max = a[0];
		int position = 0;
		for( int i=1 ; i < a.length ; i++ ){
			if( a[i] > max){
				max = a[i];
				position = i;
				
		}
				
			}
				
				
			System.out.println("����ū�� : " +  max);
			System.out.println("����ū���� ��ġ�� �ڸ�  : " + position ); 
	}
}
