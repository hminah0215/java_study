/*
6) �Ǽ��� �迭�� �Ű������� ���޹޾� �������� �����ϴ� �޼ҵ带 
	�����ڷ� ���� ���� �� �ֵ��� �ڽ��� �ڵ�� ���弼��.
*/
class  Cc
{
	public static void sil( double b[]){
		for( int i = 0 ; i < b.length; i++){ 
			for( int j = i+1; j < b.length ; j++){
				if(b[i] > b[j]){
				 double temp;
				 temp = b[i];
				 b[i] = b[j];
				 b[j] = temp;
				
				}
			} System.out.println(b[i]);
		}
	}
	public static void main(String[] args) 
	{
		double a[] = {1.3, 4.9, 18.7, 19.1, 2.3 };
		sil (a);
	}
}
