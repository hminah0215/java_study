//숙제3번 선생님 문제풀이 
/*3) 사용자로 부터 N을 입력받아 1에서 N까지의 짝수의합, 홀수의 합, 짝수의 개수, 
	홀수의 개수를 각각 구하여 출력하세요. 
*/
import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n, sumEven=0, sumOdd=0, cntEven=0, cntOdd=0;
     //입력받을값, 짝수의합, 홀수의합, 짝수의개수, 홀수의 개수

		System.out.print("N을 입력하세요 ==>");
		n=sc.nextInt();
		//i : 1,2,3,4,5,....,n

		for(int i = 1; i <= n ; i++) //i++는 i=i+1과 같음.
		{
			if( i % 2 == 0 ) //짝수 인지 물음
			{
				sumEven = sumEven + i; //sumEven += i 와 같음.
				cntEven = cntEven+1; //개수를 구해야해서 +1, cntEven++, cntEven+=1 다 같음.
		
			}else{
				sumOdd+=i;
				cntOdd++;
				}
			
		}
		
		System.out.println("짝수의 합:" +sumEven);
		System.out.println("짝수의 개수:" +cntEven);
		System.out.println("홀수의 합:" +sumOdd);
		System.out.println("홀수의 개수:" +cntOdd);
	}
}
