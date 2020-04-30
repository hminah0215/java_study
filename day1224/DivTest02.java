//프로그램 실행시에 두개의 정수를 전달받아 나누기 한 결과를 출력 
//java DivTest 4 2
//결과 : 2 

//예외처리 -세분화해서 처리해야할때 

class  DivTest02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);  //스트링을 정수로 바꿔주는 기능 사용
			int b = Integer.parseInt(args[1]);
			int r = a/b;
			System.out.println("결과: " + r);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("나누기 할 두수를 전달해 주세요.");
		}catch(NumberFormatException n){
			System.out.println("숫자를 전달해야합니다.");
		}catch(ArithmeticException a){
			System.out.println("0으로 나눌 수는 없어요.");
		}


	}
}
