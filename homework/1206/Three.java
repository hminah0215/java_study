/*3) 사용자로 부터 N을 입력받아 1에서 N까지의 짝수의합, 홀수의 합, 짝수의 개수, 
	홀수의 개수를 각각 구하여 출력하세요. 
	
	못풀었음.
	
	*/
import java.util.Scanner;
class Three 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n; //입력받는 값
		int k=0;
		int q=0;
		int l=0;
		int div;
		System.out.print("임의의 수 N을 입력하세요==>");
		n = sc.nextInt();

			for (int i=1 ;i <= n ; i++ )
		{
				l=i %2; q=i %2;
			if(l==0){
				l=i;k++;
			}
			else if (q!=0)
				q=i;

			
		}
			System.out.println("짝수의개수는 " +k +" 홀수는" + q);
	}
}
