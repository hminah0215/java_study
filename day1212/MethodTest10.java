class MethodTest10
{
	// ������ �迭�� �Ű������� ���޹޾� �迭�� ���հ� ����� ���Ͽ�
	//����ϴ� �޼ҵ带 ���弼��. 

public static void printSumerise( int a[]){
	
	int tot = 0;
	double avg =0;

	for( int i = 0 ; i < a.length; i++){
		tot += a[i]; 
		avg = tot  / (double)a.length;	
	}
	System.out.println("***�迭�� �������***");
	System.out.println("�� ���� : " + tot);
	System.out.printf("����� :  %.2f\n" , avg);
	System.out.println();

}
	


	public static void main(String[] args) 
	{

	int []age = { 28,31,20,30,18,24,25 };
	int []kor = { 100,60,70 };

	printSumerise(age);
	printSumerise(kor);


	}
}
