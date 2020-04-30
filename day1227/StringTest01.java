/*
3) 사용자 한테 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성합니다.
어제 숙제 풀이
*/
import java.util.Scanner;
class StringTest01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("문자열을 입력하세요 ===>");
		str = sc.nextLine();

		for( int i = str.length()-1 ; i >= 0 ; i--){
			System.out.print(str.charAt(i));
		}
	}
}
