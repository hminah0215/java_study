//배열 LAB1번 -3 ,  역순으로 출력해라.
import java.util.Scanner;
class  TestArray03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//10개의 정수를 저장할 수 있는 배열을 선언하고 생성하라. 
		int []arr =  new int[10];

		//사용자로부터 정수를 받아서 배열에 저장하는 반복 루프
		for( int i = 0; i < arr.length ; i++ ){
			System.out.print( ( i+1) +"번째 수를 입력하세요 ==>");
			arr[i] = sc.nextInt();
			
			}
			
			for ( int i = arr.length-1   ; i  >=0  ;  i-- ){
				System.out.print( arr[i]+" ");	
			}

	}
}
