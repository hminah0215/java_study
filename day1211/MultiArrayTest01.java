class  MultiArrayTest01
{
	public static void main(String[] args) 
	{
		int a[][] = new int[3][];
		// �ึ�� ���� ����� �� �� �����. ���Ǳ��̸� ����������.
		// �ڹٿ��� �ึ�� ���ǻ���� �ٸ������ִ�.

		a[0] = new int[10];
		a[1] = new int[2];
		a[2] = new int[5];    //�ึ�� ���Ǽ��� �ٸ����־ length��� �Ӽ��� ����. 

		//���迭�� ��ҿ� 1���� 1�� ������ ���� �����Ͽ� ���
		int n =1;
		for( int i=0	;	i < a.length	;	i++ ){  //3�����!
			for( int j=0 ; j < a[i].length ; j++){ //i�� 1�̶�� 2, i�� 0�̶�� 10ĭ���� 
				a[i][j] =n++;
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		/* �̷��� �Ʒ��� �Ⱦ��� ���� �ٷ� ����ص� ��� ���� 
			for(	int i=0 ; i< a.length; i++){
			//for( int j=0 ; j < a[i].length ; j++){
				//System.out.print(a[i][j]+ " ");
			//}
				//System.out.println();
		}*/
	}
}