/*키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램을 작성하여보자.
switch문을 사용하여 문자를 구분한다.인데 이걸 if로 해봄.*/
import java.util.Scanner;
class  Alpa02
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String eng;
		
	
		System.out.print("영문자 하나를 입력하세요===>");
		eng = sc.next();
		
	
		if(eng.equals ("a") || eng.equals ("e") || eng.equals ("i")|| eng.equals ("o") ||eng.equals ("u") ){
			System.out.println(eng + " 는 모음입니다.");
				
			}else {
				System.out.println(eng + " 는 자음입니다.");
		
		}
					
	}
}

