import java.util.Scanner;

class Introduce{
	public static void main(String []args)
	{
		String name;
		int age;

		
  		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ���ϱ�?");
		name = sc.next();

		System.out.println("����Դϱ�?");
		age = sc.nextInt();

     		
		System.out.println("�̸��� "+name+ "���̴� "+age+ "��");
	}
}