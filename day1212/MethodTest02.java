class MethodTest02
{
	//�޼ҵ��� ���� 
	//�޼ҵ带 ���鶧 ==>  public static void �޼ҵ��̸� (){ �� �޼ҵ尡 �ؾ������� �������  }  
	//�޼ҵ��̸� ( ) ==> ( )�� �ȿ� �Ʒ� ������ �μ��� �ڷ����� �Է��Ѵ�. 
	public static void sayHello( String irum ){
				
				for(int i = 1 ; i<= 3; i++){   
				System.out.println(irum+  "��(��), �ȳ�!");	
				}
	}
	

	public static void main(String[] args) 
	{

	//�޼ҵ带 ȣ��� �޼ҵ� ���࿡ �ʿ��� �μ��� ����!
		sayHello("����");  
		
		System.out.println("������ ������Դϴ�.");
		
		sayHello("����"); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello("����"); 


	}
}
