class  MethodTest04
{
	// n�� �Ű������� ���޹޾� 1���� n ������ ���� �����Ͽ� ����ϴ� �޼ҵ带 
	//�����ϰ� ȣ���غ�����.
	
	public static void sum( int n ){
		
		int tot = 0;
		for( int i =1 ; i <= n; i++){
			tot = tot + i;
		}
			System.out.println("1���� "+ n + "������ ���� " + tot );
			//return;  �����Ǿ�����. �Ʒ� main�� �ִ� ȣ�⹮���� �ǵ��ư�!
 	}

	public static void gugudan( int dan ){
		System.out.println( dan +"��\n");
		for(int i=1; i<= 9; i++){
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}
   //�ΰ��� ������ �Ű������� ���޹޾� ���ϱ� �� ����� ����ϴ� �޼ҵ带 ���� 
	public static void plus( int a, int b ){
			int r = a+b;
			System.out.println("\n���ϱ� ��� "+ r);
	}



	public static void main(String[] args) 
	{
		sum(5);
		sum(100);
		gugudan(2);
		gugudan(7);
		plus( 2,3 );
		
	}
}
