/*학생 10명의 이름과 점수를 입력받아  총합과 평균 구하기
*/
import java.util.Scanner;
class  StudentTest02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String []name = new String[5];
		int []score=new int[5];
		int tot=0, avg=0;
		for( int i =0 ; i < name.length ; i++){
			System.out.print(  (i+1)+ " 번째 학생의 이름은 ===>");
			name[i]= sc.next();
			System.out.print(  (i+1)+ " 번째 학생의 점수 ===>");
			score[i]= sc.nextInt();
		

			tot += score[i];
		}
			avg = tot / score.length;
			System.out.println( " ** 학생별 점수 ** " );
			for( int i=0 ; i < name.length ; i++){
					System.out.println( name[i] + "	\t" + score[i]); 
					//\t 역슬래쉬가 탭거리가 띠어진다는 의미
					//\n 한줄 띠어진다는 의미.
				
			}

				System.out.println( "전체총점 :" + tot);
				System.out.println( "전체평균 :" + avg);
				
			
	}
}
