//프로그램 실행시에 두개의 정수를 전달받아 나누기 한 결과를 출력 
//java DivTest 4 2
//결과 : 2 

//예외처리 -세분화할 필요없이 예외처리만 하면 될때. 캐치(조상인 익셉션을 넣어버리면 됨)

class  DivTest03
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //스트링을 정수로 바꿔주는 기능 사용
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("결과: " + r);
		}catch(Exception e){
			System.out.println("나누기 할 두개의 정수를 확인하세요.");
		}


	}
}
