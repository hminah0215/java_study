class ShortcutOperationTest03
{
	public static void main(String[] args) 
	{
		int age1 = 28;
		int age2 = 31;

		if(	++age1 >= 30  &&  ++age2 >= 30	){ 
			//&& �ΰ�¥���� ���� age1�� �������� �����ϱ� �ڿ����� �Ǵ����� ����
			System.out.println("�λ�� ��� 30���� �Ѿ����");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		System.out.println(age1); //29���,�տ����� Ȯ���ؼ� �Ǵ��� ��������.
		System.out.println(age2);	//31���, �ڿ����� �տ����� �������� �ʾ� �������� ����. 
	}
	
}