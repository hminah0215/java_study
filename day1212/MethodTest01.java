class MethodTest01 
{
	//�޼ҵ��� ���� 
	//�޼ҵ带 ���鶧 ==>  public static void �޼ҵ��̸� (){ �� �޼ҵ尡 �ؾ������� �������  }  
	public static void sayHello(){
				
				for(int i = 1 ; i<= 3; i++){   //������, �ȳ�!�� 3������ϴ� �޼ҵ�. for�� ���� ����.
				System.out.println("������, �ȳ�!");	
				}
	}
	

	public static void main(String[] args) 
	{

		sayHello();  //�޼ҵ带 ȣ��
		
		System.out.println("������ ������Դϴ�.");
		
		sayHello(); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello(); 

		/*  �̷��� �������� ���Ͱ��� �޼ҵ带 �̿�!
		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");

		System.out.println("������ ������Դϴ�.");

		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");

		int year = 2019;
		System.out.println(year);

		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");
		System.out.println("������, �ȳ�!");
		*/
	}
}