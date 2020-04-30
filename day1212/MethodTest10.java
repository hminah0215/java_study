class MethodTest10
{
	// 정수형 배열을 매개변수로 전달받아 배열의 총합과 평균을 구하여
	//출력하는 메소드를 만드세요. 

public static void printSumerise( int a[]){
	
	int tot = 0;
	double avg =0;

	for( int i = 0 ; i < a.length; i++){
		tot += a[i]; 
		avg = tot  / (double)a.length;	
	}
	System.out.println("***배열의 요약정보***");
	System.out.println("총 합은 : " + tot);
	System.out.printf("평균은 :  %.2f\n" , avg);
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
