/*
3) 사용자 한테 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성합니다.
어제 숙제 풀이 StringBuffer / reverse 사용 
*/
import java.util.Scanner;
class StringReverseTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("문자열을 입력하세요 ===>");
		str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str); //스트링버퍼는 변하는 문자열에 사용하기 좋음
		System.out.println( sb.reverse() );
		System.out.println(sb); //스트링버퍼를 썻기때문에 뒤집어진 문자열이 출력된다.
		
	}
}
