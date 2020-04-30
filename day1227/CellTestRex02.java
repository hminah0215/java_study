//정규표현식 
import java.util.Scanner;
class  CellTestRex02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.print("전화번호를 입력하세요==>");
		phone = sc.next();
		
							//0~9까지의 1자리 숫자가 {3}번 입력되어있는거 와...! 
		if( phone.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}") ){ 
			System.out.println("올바른 전화번호입니다.");
		}else{
			System.out.println("올바른 전화번호가 아닙니다.");
		}

	
	}	
}
