class ReturnMethodTest01
{
	public static void plus( int a, int b){

		if( a == 0 && b == 0){
			return;
		}
		int r = a+b;
		System.out.println("���ϱ� ��� : " +r);
		return; //�����Ǿ��ִ�.
	}


	public static void main(String[] args) 
	{
		//plus(2,3);
		plus(0,0);
		int year = 2019;
		System.out.println(year);
	}
}
