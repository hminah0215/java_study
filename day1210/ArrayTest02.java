class ArrayTest02 
{
	public static void main(String[] args) 
	{
		int []lotto; //lotto�� ��������.
		lotto = new int[6]; //int�� ������ 6��.

		lotto[0] =32; //0���� �����̶� 0~5���� 6��. ������ ����
		lotto[1] = 44;
		lotto[2] = 27;
		lotto[3] = 1;
		lotto[4] = 13;
		lotto[5] = 26;

	//System.out.println(lotto[0]);
	//System.out.println(lotto[1]);
	//System.out.println(lotto[2]);
	//System.out.println(lotto[3]);
	//System.out.println(lotto[4]);
	//System.out.println(lotto[5]);
	//�ݺ����� �̿��Ͽ� �迭�� ��� ��Ҹ� ����� ���ϴ�. 

	for(int i=0 ; i < lotto.length ; i++)  //�迭�� ������ �������� ������������ �ؾ���. 
		System.out.println(lotto[i]);

	}
}