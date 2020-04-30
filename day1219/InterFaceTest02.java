abstract class A
{
	abstract public void pro();
}

abstract class B
{
	abstract public void info();
}

class C extends A,B
{ /*
InterFaceTest02.java:11: error: '{' expected
class C extends A,B
1번파일과 같은오류. 

자바에서는 클래스의 다중상속을 할 수 없어요!
다중상속의 효과를 기대하기 위해서는 인터페이스를 사용해요!
*/
	public void pro(){
		System.out.println("pro입니다.");
	}
	public void info(){
		System.out.println("info입니다.");
	}
}



class InterFaceTest02
{
	public static void main(String[] args) 
	{
		C pob = new C();
		ob.info();
		ob.pro();
	}
}
