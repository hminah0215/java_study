/*
	사용자한테 주민번호를 입력받아 
	성별을 파악하여 출력하는 프로그램을 작성
*/
import java.util.Scanner;
class  Testjumin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String jumin;

		System.out.print("주민번호를(하이픈 - 을 포함하여) 입력하세요");
		jumin = sc.next();
		System.out.println("입력한 주민번호는 " + jumin + " 입니다.");

		if(jumin.length() != 14){
			System.out.println("주민번호가 올바르지 않습니다. 다시 확인해주세요.");
			return;
		} 
		
		if(jumin.length() == 14){
			int n = jumin.indexOf("-")+1;
			String a = jumin.substring(n,n+1);
		
		if(a.equals ("1") || a.equals ("3") || a.equals ("5") ||  a.equals ("7") ||  a.equals ("9")){
			System.out.println("남자입니다.");
		}else{
			System.out.println("여자입니다.");
			}
		}
	}
}
