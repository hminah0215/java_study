//���α׷� ����ÿ� �ΰ��� ������ ���޹޾� ������ �� ����� ��� 
//java DivTest 4 2
//��� : 2 


class  DivTest04
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //��Ʈ���� ������ �ٲ��ִ� ��� ���
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("���: " + r);
		}catch(ArithmeticException e){
			System.out.println("0���δ� ������ �����.");
		}catch(Exception e){
			System.out.println("������ �� �ΰ��� ������ Ȯ���ϼ���.");
		}


	}
}
