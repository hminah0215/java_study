/*학생 10명의 이름과 점수를 입력받아  총합과 평균 구하기
++ 가장 높은 점수를 받은 학생과 가장 낮은 점수를 받은 학생 출력기능 추가 */
import java.util.Scanner;
class  StudentTest04
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String []name = new String[5];
		int []score=new int[5];
		int tot=0, avg=0;
		int max = score[0]; //max가 0을 제일 크다고 보는 상황. 양수중에서 큰값을 찾는거라면 괜찮지만
		//음수가 나오면 이 경우는 가장 큰값을 못찾음.
		int idx = 0;
		
		for( int i =0 ; i < name.length ; i++){
			System.out.print(  (i+1)+ " 번째 학생의 이름은 ===>");
			name[i]= sc.next();
			System.out.print(  (i+1)+ " 번째 학생의 점수 ===>");
			score[i]= sc.nextInt();
			
			tot += score[i];
			
			//3번파일과 달리 for문 새로 안하고 원래있던 for문에 추가하는 경우
			if( score[i] > max ){
						max= score[i];
						idx = i;
				} 
		}
			avg = tot / score.length;
			System.out.println( " ** 학생별 점수 ** " );
			for( int i=0 ; i < name.length ; i++){
					System.out.println( name[i] + "	\t" + score[i]); 
				
			}
			
				System.out.println( "전체총점 :" + tot);
				System.out.println( "전체평균 :" + avg);
				System.out.println( "최고득점자: " +name[idx] );
				System.out.println( "최고점수: " +max );
				
	}
}

