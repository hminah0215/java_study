/*
	다음과 같이 동작하는 프로그램을 while 문을 이용하여 작성하세요.

	<실행 예>
	줄 수를 입력하세요.==> 3
	칸 수를 입력하세요. ==> 4

	****
	****
	****

*/
import java.util.Scanner;
class WhileTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		int a,b;
		System.out.print("줄 수를 입력하세요 == >");
		a=sc.nextInt();
		System.out.print("칸 수를 입력하세요 == >");
		b=sc.nextInt();
	
		int i=1; 
		while( i <=a){
			i++;  
		
				int j=1; 
				while( j <=b){
				System.out.print("*"); 
				j++;
		}
			System.out.println();
	} 
	
    }
}
