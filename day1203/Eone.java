

class Eone{
	public static void main(String []args){
	
	int x;
	int y;
	int z;
	int a;

	Scanner sc = new Scanner (System.in);
	System.out.println("x���� �Է��ϼ���.");
	x = sc.nextInt();
	System.out.println("y���� �Է��ϼ���.");
	y = sc.nextInt();
	System.out.println("z���� �Է��ϼ���.");	
	z = sc.nextInt();

	int a = (x/y)+z;
	System.out.println(+a+ "�� x�� y�� ���� �������� z�� ���� ��");

	}
}