class ShortcutOperationTest04
{
	public static void main(String[] args) 
	{
		int age1 = 28;
		int age2 = 31;

		if(	++age1 >= 30  &  ++age2 >= 30	){ 
			//& �ϳ�¥���� �տ��� �������� �ʾƵ� �ڿ��͵� Ȯ���ϰ� �Ǵ���. 
			System.out.println("�λ�� ��� 30���� �Ѿ����");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		System.out.println(age1); //29���.
		System.out.println(age2);	//32���.  
	}
	
}
/*
|| �ΰ�¥���� �տ��� Ʈ��� �ڿ��� ���ʿ䵵 ���� ���̶� Ȯ�ξ���
| �Ѱ�¥���� �տ��� Ʈ�翩�� �ڿ��ͱ��� ���� Ȯ����. 
*/