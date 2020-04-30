/*학생 10명의 점수를 입력받아  총합과 평균 구하기*/
import java.util.Scanner;
class  StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int []score=new int[10];
		int tot=0; //합계를 누적할 변수
		int avg;

		for (	int i=0	; i < score.length ; i++ ){
			System.out.println( (i+1)+ "번째 학생의 점수를 입력하세요===>");
			score[i] =sc.nextInt();
			tot += score[i];  //tot= tot+ score[i];
		}
			avg= tot / score.length;
			System.out.println("전체합계: " + tot);
			System.out.println("전체평균: " + avg);
	}
}
