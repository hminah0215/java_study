//���α׷� ����ÿ� �ΰ��� ������ ���޹޾� ������ �� ����� ��� 
//java DivTest 4 2
//��� : 2 

//����ó�� -����ȭ�ؼ� ó���ؾ��Ҷ� 

class  DivTest02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //��Ʈ���� ������ �ٲ��ִ� ��� ���
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("���: " + r);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("������ �� �μ��� ������ �ּ���.");
		}catch(NumberFormatException n){
			System.out.println("���ڸ� �����ؾ��մϴ�.");
		}catch(ArithmeticException a){
			System.out.println("0���� ���� ���� �����.");
		}


	}
}