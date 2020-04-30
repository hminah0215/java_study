//어제숙제 exercise6의 두번째문제 

class  SumTest02
{
	public static void main(String[] args) 
	{	
		//int i; 여기서 선언하거나 아래 for()괄호안에서 선언해도 됨.
		
		int a = 0; //결과를 담을 변수, 더하기해도 아무 영향이없는 0을 값으로 준다.
		
		for(int i=10  ; i <= 30  ; i=i+1  ) 
		//맨왼쪽은 출발값 ,가운데 최종(만족할)값, 오른쪽은 증감식 i가 얼마씩 증감해야하는지
		//i=i+1 을 i++라고 입력해도 됨.
		{
			a = a+i+1;
		}
		


		System.out.println(a);
	}
}