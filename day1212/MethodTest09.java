class MethodTest09 
{
	//������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū ���� ã�� ����ϴ� �޼ҵ� ����

	public static void maxArr( int []a ){  
		int mm=a[0];
		
		for(int i = 1; i < a.length; i++ ){
				if( mm < a[i]  ){
				 mm = a[i];	
				}		
		}
		System.out.println("���� ū ����: " + mm);	
	}

	public static void main(String[] args) 
	{

	int []age = { 28,31,20,30,18,24,25 };
	int []kor = { 100,60,70 };

	maxArr(age);
	maxArr(kor);


	}
}
