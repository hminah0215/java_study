//사용자한테 이름과 나이를 물어보고 화면에 이름과 나이를 다시 출력하는 프로그램작성
import java.util.*;
class InputTest2 
{
	public static void main(String[] args) 
	{
		String name;
			int age;
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름이 뭡니까? ");
		name = in.nextLine();
	    System.out.println(name);
		
		System.out.println("나이는 어떻게 되나요? ");
		age = in.nextInt();
			System.out.println(age);

		System.out.println("이름은 " +name + "이고 나이는" +age + " 살 입니다");
		

	}
}
