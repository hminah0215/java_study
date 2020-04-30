/* 사용자한테 소문자로 된 문자열을 입력받아 대문자로 변환하는 프로그램 작성  */

import java.util.Scanner;

class  ToUpper
{
	public static void main(String[] args) 
	{
		char ch = ' ';
		System.out.println("|"+ch+"|");
		System.out.println("|"+(int)ch+"|");//공백의 코드값을 알아보자는거 

		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("***소문자를 대문자로 변환 ***");
		System.out.println("소문자 단어를 입력하세요==>");
		str = sc.nextLine();//공백도 입력받을 수 있음.
		//str = sc.next(); 
		//next는 하나의 단어만 입력할수있음. 문장은 nextLine.

		for(int i=0;i<str.length();i=i+1)
		//임으로 i=0으로둠. 첫번째자리를 0부터라고 셈.
		//i가 0부터 시작해서 문자열의 길이보다 작을때까지 
		//세번째는 증감식을 적어줌 
		{
			//중괄호 하고 for내용? 하고 싶은걸 적어야함.
			char a = str.charAt(i);
			System.out.print((char) (a-32) );//소문자를 대문자로 바꾸려먼 -32
		}
	}
}
