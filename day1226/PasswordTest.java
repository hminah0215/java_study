import java.util.Scanner;
class PasswordTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pass,pass2;

		System.out.print("암호를 입력하세요(6~10자이하)==>");
		pass = sc.next();
		System.out.print("암호를 다시 입력해주세요==>");
		pass2 = sc.next();

		if(! pass.equals(pass2)){
				System.out.println("암호가 일치하지 않습니다. 다시 확인해주세요!");
				return;
		}
		int n = pass.length();
		if(n >= 6 && n <=10){
			System.out.println("올바른 암호입니다.");
		}else{
			System.out.println("올바른 암호가 아닙니다.");
		}
	}
}
