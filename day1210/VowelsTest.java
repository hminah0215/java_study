//4�� ������ Ǯ��
import java.util.Scanner;

class  VowelsTest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input;
		System.out.println("*** ����, ���� ���� ���α׷� ***");
		System.out.print("���ĺ� �ϳ��� �Է��ϼ��� ===>");
		input = sc.next();
		
		input=input.toLowerCase(); //�Է��� �빮�ڸ� �ҹ��ڷ� �ٲ��ּ���. 
		//��,�ҹ��� ��ɷ� �Է��ص� �ذ��
		
		//���ڿ��� 1�ڸ� �Է��ϵ���
		if(input.length() != 1){
		System.out.println("���ĺ��� �ϳ��� �Է��ϼ���.");
		return;
		}
		
		char ch=input.charAt(0); //���ڳ� �ѱ� �� ���ĺ��� �ƴѰ� �Է��ϸ�...!
			if( ch < 'a' || ch > 'z'){
				System.out.println("���ĺ��� �Է��ϼ���.");
				return;

			}
	
		
		/*
		Character ch = input.charAt(0);
		if(!Character.isAlphabetic(ch)){//static�� �پ��ִ� ��ƿ�� ��ü�� ���� �������� �ʾƵ� ��. 
			System.out.println("���ĺ��� �Է��ϼ���.");
			return;
			�ѱ۷� �Է��ص� �����̴� �����̴� �׷��� ��������. */
		

		switch (input){
			case "a": case "e" : case "i": case "o": case "u":
					System.out.print("�Է¹��ڴ� �����Դϴ�.");
					break;
			default:
					System.out.println("�Է¹��ڴ� �����Դϴ�.");
		}
	}
}
