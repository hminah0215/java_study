class MethodTest03
{
	//�޼ҵ带 ���鶧 ==>  public static void �޼ҵ��̸� (){ �� �޼ҵ尡 �ؾ������� �������  }  
	
	//�޼ҵ��̸� ( �Ű����� ) ==> ( )�� �ȿ� �Ʒ� ������ �μ��� �ڷ����� �Է��Ѵ�. 
	//										 ==> �μ��� �ڷ���, �۵���Ű�� ���� Ƚ���� �ڷ����� �Է� 
	
	public static void sayHello( String irum, int n ){
				
				//���Ƚ���� �ٲٰ� ������ �Ű������� �Է��� �����̸�������!
				for(int i = 1 ; i <= n; i++){   
				System.out.println(irum+  "��(��), �ȳ�!");	
				}
	} //��������� �޼ҵ��� ����
	

	public static void main(String[] args) 
	{

	//�޼ҵ带 ȣ��� �޼ҵ� ���࿡ �ʿ��� �μ��� ����!
	//
		sayHello("����",2);   // 2�� �λ��ϰ� �ʹ�. 
		
		System.out.println("������ ������Դϴ�.");
		
		sayHello("����",10); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello("����",5); 


	}
}