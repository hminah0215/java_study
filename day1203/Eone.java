

class Eone{
	public static void main(String []args){
	
	int x;
	int y;
	int z;
	int a;

	Scanner sc = new Scanner (System.in);
	System.out.println("x값을 입력하세요.");
	x = sc.nextInt();
	System.out.println("y값을 입력하세요.");
	y = sc.nextInt();
	System.out.println("z값을 입력하세요.");	
	z = sc.nextInt();

	int a = (x/y)+z;
	System.out.println(+a+ "는 x를 y로 나눈 나머지를 z에 더한 값");

	}
}