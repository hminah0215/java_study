class BreakAndContinueTest 
{
	public static void main(String[] args) 
	{
		int i;
		for(  i=1 ; i<=10 ; i++){
			if(  i %3 == 0 ){
					break; //�ݺ����� �׸��ϰ� Ż���� for�� Ż��. �ݺ����� ����ġ���� ����
		}
					System.out.println(i); 
		}
		System.out.println("�۾�����");
		System.out.println(i);
	}
}
