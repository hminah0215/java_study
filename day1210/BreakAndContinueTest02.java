class BreakAndContinueTest02
{
	public static void main(String[] args) 
	{
		int i;
		for(  i=1 ; i<=10 ; i++){
			if(  i %3 == 0 ){
					continue; //�� ��Ȳ�� ���ܾ� ���� �ݺ����� �����! �ݺ��������� ���!
		}			//�ݺ��� �ӿ� �ִ� �� ������ ������ ������ ����. 
					System.out.println(i); 
		}
		System.out.println("�۾�����");
		System.out.println(i); //for�� ������ �� ���⶧���� 11�� ��µ�. 
	}
}
