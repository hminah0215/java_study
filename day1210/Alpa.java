/*Ű���忡�� ������ �ϳ��� �о ������ ������ �����ϴ� ���α׷��� �ۼ��Ͽ�����.
switch���� ����Ͽ� ���ڸ� �����Ѵ�.*/
import java.util.Scanner;
class  Alpa
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String eng;
		//String a=0;
		System.out.print("������ �ϳ��� �Է��ϼ���===>");
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
			System.out.println("�ùٸ� �Է°��� Ȯ���ϼ���.");
				return;
		}
		
	
		switch(eng){
			
			case "a": case "e" : case "i": case "o": case "u":{
				System.out.println(eng + " �� �����Դϴ�.");
				break;
			}
					default:
					System.out.println(eng + " �� �����Դϴ�.");

		}

		
	}
}
