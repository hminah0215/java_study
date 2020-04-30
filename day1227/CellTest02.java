//어제했던거 오늘다른방법으로 풀이.
import java.util.Scanner;
class  CellTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("전화번호를 입력하세요==>");
		phone = sc.next();
		
		int n1 = phone.indexOf("-");
		int n2 = phone.lastIndexOf("-");
		if(n1 != 3 || n2 != 8 || phone.length() != 13 ){
			System.out.println("올바른 전화번호 형식이 아닙니다. ");
			return;
		}
		for( int i = 0; i < phone.length(); i++){ //숫자 각자리가 0부터 9인지 체크
			if( i !=3 && i !=8 ){ //하이픈 있는 자리가 아니라면
				char ch = phone,chatAt(i);
				if( ch < '0' || ch >'9' ) //숫자의 범위가 아닌데 있는지를 물음
					System.out.println("올바른 전화번호 형식이 아닙니다. ");
					return;
			}
		}
		System.out.println("올바른 전화번호 형식 입니다.");
	}	
}
