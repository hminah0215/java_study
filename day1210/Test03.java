class Test03 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int i =1;
		
		while( i <=10 ){
			i++;	// 반복문안에 문장에 따라 증감식의 위치에 따라 결과가 다를수 있어요! 
			sum=sum+i;
			

		}
		System.out.println("sum:" + sum);
		System.out.println("i:" + i);
	}
}
