

class  ExceptionTest04
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //��Ʈ���� ������ �ٲ��ִ� ��� ���
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("���: " + r);
			
		
		//�ش� ĳġ���� �����ϰ� ���ᰡ �ȴ�.�׷��� �ݵ�� ������ �ؾ��Ѵٰ� finally ���
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("������ �� �μ��� ������ �ּ���.");
		}catch(NumberFormatException n){
			System.out.println("���ڸ� �����ؾ��մϴ�.");
		}catch(ArithmeticException a){
			System.out.println("0���� ���� ���� �����.");
		}finally{
			System.out.println("�۾�����");
		}


	}
}