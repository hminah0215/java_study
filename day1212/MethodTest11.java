class MethodTest11 
{
	//������ ����n�� �Ű������� ���޹޾� n�� ����� ��� ����ϴ� �޼ҵ带 ����� ���ϴ�. 
public static void printDivisor(int a){
			System.out.println(a + "�� ����� ������ �����ϴ�.");

		for ( int i = 1; i <=a ; i++ ){
			if ( a %i == 0 ){
				
				System.out.print(i+" ");
			}
				
		}
			System.out.println();
}



	public static void main(String[] args) 
	{
	
	printDivisor(8);
	printDivisor(10);
	}
}
