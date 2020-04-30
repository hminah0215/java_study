//4번 선생님 풀이
import java.util.Scanner;

class  VowelsTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("*** 모음, 자음 구분 프로그램 ***");
		System.out.print("알파벳 하나를 입력하세요 ===>");
		input = sc.next();
		
		input=input.toLowerCase(); //입력한 대문자를 소문자로 바꿔주세요. 
		//대,소문자 어떤걸로 입력해도 해결됨
		
		//문자열을 1자만 입력하도록
		if(input.length() != 1){
		System.out.println("알파벳을 하나만 입력하세요.");
		return;
		}
		
		char ch=input.charAt(0); //숫자나 한글 등 알파벳이 아닌거 입력하면...!
			if( ch < 'a' || ch > 'z'){
				System.out.println("알파벳을 입력하세요.");
				return;

			}
	
		
		/*
		Character ch = input.charAt(0);
		if(!Character.isAlphabetic(ch)){//static이 붙어있는 유틸은 객체를 따로 생성하지 않아도 됨. 
			System.out.println("알파벳을 입력하세요.");
			return;
			한글로 입력해도 자음이다 모음이다 그래서 못쓰겠음. */
		

		switch (input){
			case "a": case "e" : case "i": case "o": case "u":
					System.out.print("입력문자는 모음입니다.");
					break;
			default:
					System.out.println("입력문자는 자음입니다.");
		}
	}
}
