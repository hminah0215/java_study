class ArrayTest02 
{
	public static void main(String[] args) 
	{
		int []lotto; //lotto는 참조변수.
		lotto = new int[6]; //int의 개수라 6개.

		lotto[0] =32; //0부터 시작이라 0~5까지 6개. 정수형 변수
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
	//반복문을 이용하여 배열의 모든 요소를 출력해 봅니다. 

	for(int i=0 ; i < lotto.length ; i++)  //배열의 데이터 개수보다 작을때까지로 해야함. 
		System.out.println(lotto[i]);

	}
}
