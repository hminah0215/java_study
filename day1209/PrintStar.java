/*
	연습) 다음과 같이 동작하는 프로그램을 작성하세요.
	<<실행 예>>
	줄수를 입력하세요 ==> 3
	칸수를 입력하세요 ==> 4
	****
	****
	****
*/
import java.util.Scanner;
class  PrintStar
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n,x;

	 System.out.print("줄수를 입력하세요 ==>");
    	n=sc.nextInt();
	 System.out.print("칸수를 입력하세요 ==>");
    	x=sc.nextInt();

	 for(int  i= 1  ; i <=n ; i++ ){
	 
			for(int j = 1 ; j <=x ; j++){
				System.out.print("*");
		   	}
				
			System.out.println();
     }
		

 }
}
