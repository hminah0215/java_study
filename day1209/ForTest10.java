class  ForTest10
{
	public static void main(String[] args) 
	{
		int i =1;
		for(  ;  ;  ){          //늘 언제라도 참입니다. 라는 뜻. 
			System.out.println("hello");           //이렇게해도 문장성립. 헬로우가 끊임없이 나옴.
			if (i >= 3)
				break;        //이렇게 하면 헬로우 3번만 나옴.
				i= i+1;
		}
		
	}
}
