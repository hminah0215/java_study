//pdf �迭�� programming  3������. 

import java.util.Scanner;
class  Pro3
{
	//1���� ���� �迭�� �Է����� �޾Ƽ� ������ ���� ����� �ϴ� �޼ҵ带 �ۼ� 

	public static void getTotal( int a [] ){   //1���� �迭 ������ �հ踦 ���Ѵ�.
		
		int tot = 0;

		for( int i = 0 ; i < a.length ; i++ ){
			tot += a[i];
		}
			System.out.println("������ �հ�� : " + tot);
	}


		public static void getAverage( double a [] ){   // 1���� �迭 ������ ����� ���Ѵ�. 

		double avg =0;
		int tot = 0;
		for( int i = 0 ; i < a.length; i++){
		 tot += a[i];
		avg =  tot  / (double)a.length;	

		}
		System.out.printf("����� :  %.2f\n" , avg);
	}

	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է¹��� ������ ������ �Է��ϼ��� ==>");
		int a = sc.nextInt();
		int []n = new int[a];
			for( int i=0 ; i < n.length; i++){

				System.out.print( (i+1)+"��° ������ �Է��ϼ��� ===>");
					n[i] = sc.nextInt();
			}
		
		
		
		getTotal( 2  );   //1���� �迭 ������ �հ踦 ���Ѵ�.
 
		getAverage( 5.0  );  // 1���� �迭 ������ ����� ���Ѵ�. 

		//getMaximum();  // 1���� �迭 �����߿��� ���� ���� ���� ��ȯ�Ѵ�. 

		//get Minimum();  //1���� �迭 �����߿��� ���� ���� ���� ��ȯ�Ѵ�. 
	}
}
