class  Exercise503
{
	public static void main(String[] args) 
	{
	int i=0, sum=0;
	while( i < 10 )
	{
		i++;
		if( i % 3 ==0 ) continue;
		System.out.println(i);
		sum += i;
		if( sum > 20 ) break;
	}
		System.out.println("i가 "+i+ " 일때 작업종료");
		System.out.println("sum이 "+sum+ " 일때 작업종료");
	}
}
