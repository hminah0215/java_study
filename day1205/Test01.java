//���������� ���� ++ --
class Test01 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;
		
		// i++;  //++i �� �ᵵ ��.

		i++; //i=i+1 ��� ���������ڸ� ��������.
		sum=sum+i;

		i++; 
		sum=sum+i;

		++i; 
		sum=sum+i; 
		System.out.println(i);//3
		System.out.println(sum);//6

		
	}
}
