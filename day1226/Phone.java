/*
	사용자한테 전화번호를 입력받아 올바른 전화번호 형식인지
	판별하는 프로그램 
	0123456789
	000-0000-0000
	1) 하이픈 2개를 포함하여 13자리 문자이어야합니다.
	2) 첫번째 하이픈이 오기전에는 3자리 숫자여야합니다.
	3) 첫번째 하이픈과 두번째 하이픈 뒤에는 4자리 숫자여야 합니다. 
*/
import java.util.Scanner;
class  Phone
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String num="";

		System.out.print("전화번호를(하이픈 - 을 포함한) 입력하세요 ==>");
		num = sc.next();

		if(num.length()  !=  13){ 
			System.out.println("잘못된 전화번호 입니다. 확인해주세요.");
			return;
		}

		if(num.length() == 13){
			
			int n = num.indexOf("-"); //첫번째 하이픈을 찾아야함. 그 앞은 3자리여야함.
			String a = num.substring(4,8);  // 두번째 하이픈 앞은 4자리
			String b = num.substring(9); // 두번째 하이픈 뒤도 4자리 

			if(n != 3 || a.length() != 4 || b.length() != 4){
				System.out.println("잘못된 전화번호 입니다. 확인해주세요.");
			}else{
			System.out.println("올바른 전화번호 입니다.");	
			}
			
		}
	}
}
