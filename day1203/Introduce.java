import java.util.Scanner;

class Introduce{
	public static void main(String []args)
	{
		String name;
		int age;

		
  		Scanner sc = new Scanner(System.in);
		System.out.println("이름이 뭡니까?");
		name = sc.next();

		System.out.println("몇살입니까?");
		age = sc.nextInt();

     		
		System.out.println("이름은 "+name+ "나이는 "+age+ "살");
	}
}