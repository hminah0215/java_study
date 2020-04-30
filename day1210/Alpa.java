/*키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램을 작성하여보자.
switch문을 사용하여 문자를 구분한다.*/
import java.util.Scanner;
class  Alpa
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String eng;
		//String a=0;
		System.out.print("영문자 하나를 입력하세요===>");
		eng = sc.next();
		
		if( !eng.equals("a")  && !eng.equals("b") && !eng.equals("c") &&
			!eng.equals("d")  && !eng.equals("e") && !eng.equals("f") &&
			!eng.equals("g")  && !eng.equals("h") && !eng.equals("i") &&
			!eng.equals("j")  && !eng.equals("k") && !eng.equals("l") &&
			!eng.equals("m")  && !eng.equals("n") && !eng.equals("o") &&
			!eng.equals("p")  && !eng.equals("q") && !eng.equals("r") &&
			!eng.equals("s")  && !eng.equals("t") && !eng.equals("u") &&
			!eng.equals("v")  && !eng.equals("w") && !eng.equals("x") &&
			!eng.equals("y")  && !eng.equals("z") ){
			System.out.println("올바른 입력값을 확인하세요.");
				return;
		}
		
	
		switch(eng){
			
			case "a": case "e" : case "i": case "o": case "u":{
				System.out.println(eng + " 는 모음입니다.");
				break;
			}
					default:
					System.out.println(eng + " 는 자음입니다.");

		}

		
	}
}
