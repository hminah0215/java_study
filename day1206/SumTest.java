//어제 숙제,exercise 6번


class  SumTest
{
	public static void main(String[] args) 
	{	
		//int i; 여기서 선언하거나 아래 for()괄호안에서 선언해도 됨.
		
		int a = 0; //결과를 담을 변수, 더하기해도 아무 영향이없는 0을 값으로 준다.
		
		for(int i=1  ; i <= 3  ; i=i+1  ) 
		//맨왼쪽은 출발값 ,가운데 최종(만족할)값, 오른쪽은 증감식 i가 얼마씩 증감해야하는지
		//i=i+1 을 i++라고 입력해도 됨.
		{
			a = a+i*i+1;
		}
		//1+1 2
		//4+1 5 7
		//9+1 10 17


		System.out.println(a);
	}
}
