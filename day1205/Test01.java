//증감연산자 연습 ++ --
class Test01 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;
		
		// i++;  //++i 로 써도 됨.

		i++; //i=i+1 대신 증감연산자를 쓸수있음.
		sum=sum+i;

		i++; 
		sum=sum+i;

		++i; 
		sum=sum+i; 
		System.out.println(i);//3
		System.out.println(sum);//6

		
	}
}
