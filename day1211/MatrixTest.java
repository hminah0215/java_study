// 5�� 5���� 2���� �迭�� �����, ���� �迭�� ��ҿ� 1���� 1�� ������ ���� 
//���ʷ� ������ �� ����ϴ� ���α׷� �ۼ� 

class MatrixTest 
{
	public static void main(String[] args) 
	{
		int [][]a = new int[5][5];  //���� ��(��), �ڿ��� ĭ (��)
		int n = 1;	//1�� �����ϴ� ��?�� ���� ����?
		for( int i = 0;  i < a.length ; i++	){ //2���� �迭���� a���� �ϸ� ���Ǽ��� �˷���.
			for( int j = 0 ; j < a[i].length ; j++){  // j�� ĭ����ŭ ����. 
				a[i][j] = n++; // n������ �ְ� ���߿� ������. 
				
			}
		}
		for (	 int i=0; i < a.length ; i++ ){
			for(int j=0 ; j< 5; j++){
				System.out.print(a[i][j]+ " \t");
			}
				System.out.println();
		}
		
	}
}