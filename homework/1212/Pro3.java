//pdf 배열의 programming  3번문제. 

import java.util.Scanner;
class  Pro3
{
	//1차원 정수 배열을 입력으로 받아서 다음과 같은 계산을 하는 메소드를 작성 

	public static void getTotal( int a [] ){   //1차원 배열 원소의 합계를 구한다.
		
		int tot = 0;

		for( int i = 0 ; i < a.length ; i++ ){
			tot += a[i];
		}
			System.out.println("원소의 합계는 : " + tot);
	}


		public static void getAverage( double a [] ){   // 1차원 배열 원소의 평균을 구한다. 

		double avg =0;
		int tot = 0;
		for( int i = 0 ; i < a.length; i++){
		 tot += a[i];
		avg =  tot  / (double)a.length;	

		}
		System.out.printf("평균은 :  %.2f\n" , avg);
	}

	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받을 정수의 개수를 입력하세요 ==>");
		int a = sc.nextInt();
		int []n = new int[a];
			for( int i=0 ; i < n.length; i++){

				System.out.print( (i+1)+"번째 정수를 입력하세요 ===>");
					n[i] = sc.nextInt();
			}
		
		
		
		getTotal( 2  );   //1차원 배열 원소의 합계를 구한다.
 
		getAverage( 5.0  );  // 1차원 배열 원소의 평균을 구한다. 

		//getMaximum();  // 1차원 배열 원소중에서 가장 높은 값을 반환한다. 

		//get Minimum();  //1차원 배열 원소중에서 가장 낮은 값을 반환한다. 
	}
}
