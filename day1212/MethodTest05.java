import java.util.Scanner; 
class  MethodTest05
{ 
	public static void max( int a, int b){
		int q;
		if ( a < b ){
			
			q = b;
		
		}else{
			
			q = a;
		}
		System.out.println("ū����  :" + q);
	}

//�ΰ��� ������ �Ű������� ���޹޾� ���߿� ū���� ã�� ����ϴ� �޼ҵ带 ���� 

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s,d;
		System.out.print("ù��° ������ �Է��ϼ���==>");
		s = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���==>");
		d = sc.nextInt();

		max(s,d);
		max(7,5);
	}
}
