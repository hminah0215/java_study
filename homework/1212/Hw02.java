/*
2) �Ǽ��� �迭�� �Ű������� ���޹޾� �������� �����ϴ� �޼ҵ带 
	�����ڷ� ���� ���� �� �ֵ��� �ڽ��� �ڵ�� ���弼��.
*/

class Hw02 
{
	public static void up ( double s[] ){
		for( int i = 0 ; i < s.length ; i++){
			for( int j = i+1 ; j < s.length ; j++ ){
				if ( s[i] > s[j] ){
					double temp;
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;

				}
			}	System.out.println( s[i]);
		}
		
	}




	public static void main(String[] args) 
	{
		double a[] = {10.1, 23.4 , 3.6, 3.24, 2.15};
		up( a );
	}
}