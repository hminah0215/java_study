//���� �ΰ��� �Ű������� ������ ���ϱ� ���.

class BitUtil
{
	public void add( double a, double b){ 
		double r = a+b;
		System.out.println("���ϱ� ���: "+ r);
	}
	
}

class  MethodOverLoading02
{
	public static void main(String[] args) 
	{
		 BitUtil bu = new  BitUtil();
		 bu.add( 2.5 , 2.5);
		 bu.add( 2,2  ); 
	}
}