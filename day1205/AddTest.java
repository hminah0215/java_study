class AddTest
{
	public static void main(String[] args) 
	{

		//�빮�� 'A'�� �ҹ���'a'�� ���̸� Ȯ���ϼ���. 
		
		//������ ���
		//char A = 'A';
		//char a = 'a';
		//System.out.println(A-a); //���̴� 32
		//System.out.println((int)(A+32));//�ҹ���a���� 97
		//�������� �����ֽ� ���	
		int a = (int)'A';
		int b = (int)'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(b-a);

		
		//char ch = 'A';
		//System.out.println((char)(ch+1));//�빮�� B�� ��µ�.
		//System.out.println('A'+1); //�̷��� �ϸ� 66�� ��µ�. 65+1
		//System.out.println('A'+"1"); //�̰� A �� 1 �̷��� ���
		//System.out.println(ch);
		//System.out.println((int)ch); //�ѱ��ڴ������� ������
		//�빮�� A���� �ڵ带 Ȯ���� �� ����. 65����.

		//int a = 7+3;
		//String b="7"+"3";//���ڳ�������. ���ڿ��� ��Ʈ��. 
		//String c="7" +3; //�̰� 7 3 �̷��� ����.
		//7+3+"" <--10���� ���.����� ����� ��Ʈ������ ����. ��������ϰ� �� �ڿ�! 

		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//System.out.println(7+3);  //10
		//System.out.println("7 "+" 3"); //7 3
		//System.out.println("7 "+ 3); //  7 3


	}
}
