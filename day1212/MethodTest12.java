class MethodTest12 
{
	public static void printArr(int []n){
		for( int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println();

	}
	public static void sortArr( int s[]){
		for( int i = 0 ; i < s.length; i++){
			for( int j = i+1 ; j < s.length ; j++){
				if(s[i] > s[j]){
					int temp;
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}	
			}
			
		} 
			
			System.out.println();
	}

	public static void main(String[] args) 
	{
		int []a = { 8,5,2,9,3 };
		printArr(a); //������ �迭�� �Ű������� ���޹޾� ��� ����ϴ� �޼ҵ�
		sortArr(a);  //������ �迭�� �Ű������� ���޹޾� ���� �����ͺ��� ������(��������) ����
		printArr(a);
 	}
}
