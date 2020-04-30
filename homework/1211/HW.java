/*
	숙제) 5명 학생의 이름, 국어, 영어, 수학을 입력받아 총점과 평균을 구한 다음 성적이 높은순으로 정렬하여 출력합니다. 

	<실행 예>
1번째 학생의 이름==> 유관순
1번째 학생의 국어==> 40
1번째 학생의 영어==> 70
1번째 학생의 수학==> 80


*** 성적 처리 결과 ***
이름	국어	영어	수학	총점	평균
이수인	100	100	100	300	100
이순신	90	90	90	270	90
...

*/

import java.util.Scanner;
class   HW
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];  //이름
		int []korean = new int[5];  //국어점수
		int []eng = new int[5];	//영어점수
		int []math = new int[5];	//수학점수
		int []tot = new int[5]; //총점
		double []avg = new double[5]; //평균
		
		for( int i=0; i < name.length; i++ ){
		
			System.out.print( (i+1) + "번 학생의 이름을 입력하세요==>");
			name[i] = sc.next();

			System.out.print( (i+1)+ "번 학생의 국어 성적을 입력하세요==>");
			korean[i] = sc.nextInt();

			System.out.print( (i+1)+ "번 학생의 영어 성적을 입력하세요==>");
			eng[i] = sc.nextInt();

			System.out.print( (i+1)+ "번 학생의 수학 성적을 입력하세요==>");
			math[i] = sc.nextInt();
		
			tot[i] = korean[i] + eng[i] + math[i]; //총점
			avg[i] = tot[i] /3;  // 평균
							
		}
		System.out.println("***성적순 정렬***");
		
		for( int i=0 ; i < 4 ; i++ ){
				for( int j= i+1 ; j < 5 ; j++ ){
					if(	avg[j] > avg[i]){ //성적이 높은순으로
						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
						
						int temp2 = korean[i];
						korean[i] = korean[j];
						korean[j] = temp2;
						
						temp2 = eng[i];
						eng[i] = eng[j];
						eng[j] = temp2;
						
						temp2 = math[i];
						math[i] = math[j];
						math[j] = temp2;
						
						temp2 = tot[i];
						tot[i] = tot[j];
						tot[j] = temp2;
						
						double temp3 = avg[i];
						avg[i] = avg[j];
						avg[j] = temp3;
					
				} 	
			}   		
		}	
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for (int i =0 ; i < name.length ; i++ ){
			System.out.println(name[i]+"\t"+korean[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
			System.out.println();
	}
}
