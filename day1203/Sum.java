import java.util.Scanner;

class Sum{
	public static void main(String []args){
	
	int one;
	int two;
Scanner sc = new Scanner (System.in);
	
System.out.println("첫번째 숫자를 입력하세요.");
one = sc.nextInt();

System.out.println("두번째 숫자를 입력하세요.");
two = sc.nextInt();

System.out.println("총 합은" +(one+two)+ "입니다.");



	}
}